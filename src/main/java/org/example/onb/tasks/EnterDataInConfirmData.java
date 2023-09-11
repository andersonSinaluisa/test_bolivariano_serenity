package org.example.onb.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ui.Select;
import org.example.onb.interactions.ConfirmDataPage;
import org.example.onb.models.Person;

public class EnterDataInConfirmData  implements Interaction {

    private Person person;
    public EnterDataInConfirmData(Person person) {
        this.person = person;
    }
    public static EnterDataInConfirmData withData(Person person) {
        return Tasks.instrumented(EnterDataInConfirmData.class, person);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {



        actor.attemptsTo(
                //enter ctrl + a + del in INPUT_CELULAR
                Clear.field(ConfirmDataPage.INPUT_CELULAR),
                Enter.theValue(person.getCelular()).into(ConfirmDataPage.INPUT_CELULAR),
                Clear.field(ConfirmDataPage.INPUT_EMAIL),
                Enter.theValue(person.getCorreo()).into(ConfirmDataPage.INPUT_EMAIL),
                Click.on(ConfirmDataPage.SELECT_CIUDAD),
                Click.on(ConfirmDataPage.SELECT_CIUDAD_OPTION),
                Click.on(ConfirmDataPage.SELECT_OFICINA),
                Click.on(ConfirmDataPage.SELECT_CIUDAD_OPTION)
        );


    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Interaction.super.then(nextPerformable);
    }
}
