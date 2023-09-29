package org.example.onb.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.example.onb.interactions.ProductPage;
import org.example.onb.models.Person;

import static net.serenitybdd.core.Serenity.getDriver;

public class SelectAditionalProduct implements Interaction {


    Person person;
    public static SelectAditionalProduct withData(Person person) {
        return Tasks.instrumented(SelectAditionalProduct.class, person);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ProductPage.BOTON_CONTINUAR)
        );

        getDriver().manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);

    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Interaction.super.then(nextPerformable);
    }
}
