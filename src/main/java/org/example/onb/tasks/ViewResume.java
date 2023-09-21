package org.example.onb.tasks;

import org.example.onb.interactions.ResumePage;
import org.example.onb.models.Person;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ViewResume implements Interaction{

    Person person;

    public ViewResume(Person person) {
        this.person = person;
    }

    public static ViewResume withData(Person person) {
        return Tasks.instrumented(ViewResume.class, person);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // TODO Auto-generated method stub

        actor.attemptsTo(Click.on(ResumePage.BTN_CLOSE_MODAL));


        //get text from ResumePage.TXT_ACCOUNT_NUMBER

        String account = ResumePage.TXT_ACCOUNT_NUMBER.resolveFor(actor).getText();

        person.setNumeroCuentaGenerada(account);

    }
    
}
