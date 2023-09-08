package org.example.onb.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.example.onb.interactions.ConfirmDataPage;
import org.example.onb.models.Person;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;

import static net.serenitybdd.core.Serenity.getDriver;

public class CheckTermsInConfirmData implements Interaction {


    public static CheckTermsInConfirmData check() {
        return Tasks.instrumented(CheckTermsInConfirmData.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ConfirmDataPage.CHECK_TERMINOS_Y_CONDICIONES)


        );
        ((JavascriptExecutor) getDriver()).executeScript(
                "arguments[0].click();", ConfirmDataPage.CHECK_TERMINOS_Y_CONDICIONES
        );
    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Interaction.super.then(nextPerformable);
    }
}
