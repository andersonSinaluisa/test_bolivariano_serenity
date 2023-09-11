package org.example.onb.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.onb.interactions.DomicilePage;
import org.example.onb.models.Person;

import static net.serenitybdd.core.Serenity.getDriver;

public class EnterDataInDomicile  implements Interaction {

    private Person person;
    public EnterDataInDomicile(Person person) {
        this.person = person;
    }
    public static EnterDataInDomicile withData(Person person) {
        return Tasks.instrumented(EnterDataInDomicile.class, person);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DomicilePage.SELECT_CIUDAD)
        );

        //esperar implicito
        getDriver().manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);

        actor.attemptsTo(
                Click.on(DomicilePage.SELECT_CIUDAD_OPTION)
        );

        actor.attemptsTo(
                Click.on(DomicilePage.SELECT_PARROQUIA)
        );
        getDriver().manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);

        actor.attemptsTo(
                Click.on(DomicilePage.SELECT_PARROQUIA_OPTION)
        );

        getDriver().manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);

        actor.attemptsTo(
                Enter.theValue(person.getDireccionCompleta()).into(DomicilePage.INPUT_DIRECCION_COMPLETA),
                Enter.theValue(person.getDescripcionCasa()).into(DomicilePage.INPUT_DESCRIPCION_CASA),
                Enter.theValue(person.getReferenciaCasa()).into(DomicilePage.INPUT_REFERENCIA),
                Enter.theValue(person.getNumeroDomicilio()).into(DomicilePage.INPUT_TELEFONO)
        );

        actor.attemptsTo(
                Click.on(DomicilePage.SELECT_SITUACION_LABORAL)
        );

        getDriver().manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);
        actor.attemptsTo(
                Click.on(DomicilePage.SELECT_SITUACION_LABORAL_OPTION.of(person.getSituacionLaboral()))
        );





        if(person.getSituacionLaboral().equals("Dependiente")){
            getDriver().manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);
            actor.attemptsTo(
                    Click.on(DomicilePage.SELECT_TIPO_TRABAJO)

            );

            getDriver().manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);
            actor.attemptsTo(
                    Click.on(DomicilePage.SELECT_TIPO_TRABAJO_OPTION.of(person.getDependienteLaboral()))
            );
        }

        if(person.getSituacionLaboral().contains("Estudiante")){
            actor.attemptsTo(
                    Enter.theValue(person.getIngresoMensual()).into(DomicilePage.INPUT_INGRESOS),
                    Enter.theValue(person.getEgresoMensual()).into(DomicilePage.INPUT_EGRESOS)
            );
        }
        actor.attemptsTo(
                Click.on(DomicilePage.BUTTON_CONTINUAR)
        );
    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Interaction.super.then(nextPerformable);
    }
}
