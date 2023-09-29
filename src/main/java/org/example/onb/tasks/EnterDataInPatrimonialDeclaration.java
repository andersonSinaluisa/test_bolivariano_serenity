package org.example.onb.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.onb.interactions.AssetDeclaration;
import org.example.onb.models.Person;

import static net.serenitybdd.core.Serenity.getDriver;

public class EnterDataInPatrimonialDeclaration implements Interaction {

    private Person person;

    public EnterDataInPatrimonialDeclaration(Person person) {
        this.person = person;
    }
    public static EnterDataInPatrimonialDeclaration withData(Person person) {
        return Tasks.instrumented(EnterDataInPatrimonialDeclaration.class, person);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        getDriver().manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);

        if(person.isPoseeActivosniPasivos()) {

            boolean check = AssetDeclaration.CHECK_VERIFY.resolveFor(actor).getAttribute("aria-checked").equals("true");
            if(!check){
                actor.attemptsTo(
                        Click.on(AssetDeclaration.CHECK_POSSE_ACTIVOS)
                );
            }

        }else{
            actor.attemptsTo(
                    Enter.theValue(person.getActivos()).into(AssetDeclaration.INPUT_VALOR_ACTIVOS),
                    Enter.theValue(person.getPasivos()).into(AssetDeclaration.INPUT_PASIVOS)
            );
        }

        actor.attemptsTo(
                Click.on(AssetDeclaration.BOTON_AGREGAR_NACIONALIDAD.of(person.getTieneOtraNacionalidad().toUpperCase()))
        );

        actor.attemptsTo(
                Click.on(AssetDeclaration.BOTON_AGREGAR_RESIDENCIA.of(person.getTieneOtraNacionalidad().toUpperCase()))
        );

        actor.attemptsTo(
                Click.on(AssetDeclaration.BOTON_AGREGAR_OTRA_RESIDENCIA.of(person.getTieneResidenciaEEUU().toUpperCase()))
        );


        actor.attemptsTo(
                Click.on(AssetDeclaration.BOTON_CONTINUAR)
        );
    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Interaction.super.then(nextPerformable);
    }
}
