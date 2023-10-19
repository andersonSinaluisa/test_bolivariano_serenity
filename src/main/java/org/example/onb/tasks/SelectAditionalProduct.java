package org.example.onb.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.onb.interactions.ProductPage;
import org.example.onb.models.Person;

import static net.serenitybdd.core.Serenity.getDriver;

public class SelectAditionalProduct implements Interaction {


    Person person;
    public SelectAditionalProduct(Person p){
        this.person = p;
    }
    public static SelectAditionalProduct withData(Person person) {
        return Tasks.instrumented(SelectAditionalProduct.class, person);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        getDriver().manage().timeouts().implicitlyWait(15, java.util.concurrent.TimeUnit.SECONDS);

        if(person.getCuenta_mas().equals("Si")){
            getDriver().manage().timeouts().implicitlyWait(15, java.util.concurrent.TimeUnit.SECONDS);

            actor.attemptsTo(
                    Click.on(
                            ProductPage.CUENTA_MAS_BTN
                    )
            );
            getDriver().manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);

            actor.attemptsTo(
                    Enter.theValue(person.getValor_cta_mas()).into(
                            ProductPage.INPUT_CUENTA_MAS
                    )
            );


        }

        if(person.getAvisos_24().equals("Si")){
            getDriver().manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);

            actor.attemptsTo(
                    Click.on(
                            ProductPage.AVISOS_24_BTN
                    )
            );
        }

        getDriver().manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);


        //verificar el
        if(ProductPage.BOTON_CONTINUAR.of("1").resolveFor(actor).isPresent()){
            actor.attemptsTo(
                    Click.on(ProductPage.BOTON_CONTINUAR.of("1"))
            );
        }

        if(ProductPage.BOTON_CONTINUAR.of("2").resolveFor(actor).isPresent()){
            actor.attemptsTo(
                    Click.on(ProductPage.BOTON_CONTINUAR.of("2"))
            );
        }

        getDriver().manage().timeouts().implicitlyWait(35, java.util.concurrent.TimeUnit.SECONDS);

    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Interaction.super.then(nextPerformable);
    }
}
