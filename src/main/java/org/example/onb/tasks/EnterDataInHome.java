package org.example.onb.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.onb.interactions.HomePage;
import org.example.onb.models.Person;

public class EnterDataInHome implements Interaction {

    private Person person;
    public EnterDataInHome(Person person) {
        this.person = person;
    }
    public static EnterDataInHome withData(Person person) {
        return Tasks.instrumented(EnterDataInHome.class, person);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(person.getCedula()).into(HomePage.INPUT_CEDULA),
                Enter.theValue(person.getCodigoDactilar()).into(HomePage.INPUT_CODIGO_DACTILAR),
                Click.on(HomePage.CHECK_TERMS),
                Click.on(HomePage.BUTTON_CONTINUAR)
        );
    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Interaction.super.then(nextPerformable);
    }
}
