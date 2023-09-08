package org.example.onb.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.onb.interactions.DomicilePage;
import org.example.onb.models.Person;

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
                Click.on(DomicilePage.SELECT_CIUDAD),
                Click.on(DomicilePage.SELECT_CIUDAD_OPTION),
                Click.on(DomicilePage.SELECT_PARROQUIA),
                Click.on(DomicilePage.SELECT_PARROQUIA_OPTION)
        );

        actor.attemptsTo(
                Enter.theValue(person.getDireccion()).into(DomicilePage.INPUT_DIRECCION_COMPLETA),
                Enter.theValue(person.getDescripcionCasa()).into(DomicilePage.INPUT_DESCRIPCION_CASA),
                Enter.theValue(person.getReferencia()).into(DomicilePage.INPUT_REFERENCIA),
                Enter.theValue(person.getTelefonoTrabajo()).into(DomicilePage.INPUT_TELEFONO),
                Click.on(DomicilePage.SELECT_SITUACION_LABORAL),
                Click.on(DomicilePage.SELECT_SITUACION_LABORAL_OPTION),
                Click.on(DomicilePage.SELECT_TIPO_TRABAJO),
                Click.on(DomicilePage.SELECT_TIPO_TRABAJO_OPTION)

        );

        if(person.getTipoTrabajo().equals("Estudiante")){
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
