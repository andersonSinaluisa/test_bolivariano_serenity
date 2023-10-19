package org.example.onb.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.example.onb.interactions.ContractPage;

import static net.serenitybdd.core.Serenity.getDriver;

public class AcceptContracts implements Interaction{

    public static AcceptContracts check() {
        return Tasks.instrumented(AcceptContracts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        getDriver().manage().timeouts().implicitlyWait(35, java.util.concurrent.TimeUnit.SECONDS);

        actor.attemptsTo(
                Click.on(ContractPage.TITLE_CONTRATO)
        );


        actor.attemptsTo(
                Click.on(
                        ContractPage.TITLE_CONTRATO_FIRMA
                )
        );


        actor.attemptsTo(
                Click.on(
                        ContractPage.CHECK_TERMINOS
                )
        );
        actor.attemptsTo(
                Click.on(
                        ContractPage.CHECK_TERMINOS
                )
        );

        actor.attemptsTo(
                Click.on(ContractPage.BOTON_CONTINUAR)
        );
    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Interaction.super.then(nextPerformable);
    }
}
