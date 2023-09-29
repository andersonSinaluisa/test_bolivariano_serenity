package org.example.onb.tasks;

import org.example.onb.interactions.OtpPage;
import org.example.onb.models.Person;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.core.Serenity.getDriver;

public class EnterOTPCode  implements Interaction{

    Person person;

    public EnterOTPCode(Person person) {
        this.person = person;
    }

    public static EnterOTPCode withData(Person person) {
        return Tasks.instrumented(EnterOTPCode.class, person);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        
        actor.attemptsTo(
            Click.on(OtpPage.EMAIL_MEDIO)
        );

        //wait implicit
        getDriver().manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);

        actor.attemptsTo(
            Click.on(OtpPage.START_OTP)
        );


        actor.attemptsTo(
            Enter.theValue(person.getCodigoOtp()).into(OtpPage.START_OTP)
        );

        actor.attemptsTo(
            Click.on(OtpPage.BUTTON_CVONTINUE_1)
        );
        getDriver().manage().timeouts().implicitlyWait(15, java.util.concurrent.TimeUnit.SECONDS);

    }


    
}
