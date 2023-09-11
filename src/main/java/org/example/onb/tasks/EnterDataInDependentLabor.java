package org.example.onb.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.onb.interactions.DependentLaborPage;
import org.example.onb.models.Person;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class EnterDataInDependentLabor  implements Interaction {

    private Person person;
    public EnterDataInDependentLabor(Person person) {
        this.person = person;
    }
    public static EnterDataInDependentLabor withData(Person person) {
        return Tasks.instrumented(EnterDataInDependentLabor.class, person);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(person.getNombreEmpresa()).into(DependentLaborPage.INPUT_NOMBRE_EMPRESA)
        );

        if(person.getDependienteLaboral().equals("Dependiente")){
            actor.attemptsTo(
                    Enter.theValue(person.getAntiguedad()).into(DependentLaborPage.INPUT_ANTIGUEDAD)
            );
        }

        actor.attemptsTo(
                Enter.theValue(person.getIngresoMensual()).into(DependentLaborPage.INPUT_INGRESOS_MENSUALES),
                Enter.theValue(person.getEgresoMensual()).into(DependentLaborPage.INPUT_EGRESOS)
        );

        //esperar implicito
        getDriver().manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);

        actor.attemptsTo(
                Click.on(DependentLaborPage.SELECT_CIUDAD)
        );

        getDriver().manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);

        actor.attemptsTo(
                Click.on(DependentLaborPage.SELECT_CIUDAD_OPTION)
        );

        getDriver().manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);

        actor.attemptsTo(
                Click.on(DependentLaborPage.SELECT_PARROQUIA)
        );

        getDriver().manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);

        actor.attemptsTo(
                Click.on(DependentLaborPage.SELECT_PARROQUIA_OPTION)
        );

        actor.attemptsTo(
                Enter.theValue(person.getDireccionTrabajo()).into(DependentLaborPage.INPUT_DIRECCION_TRABAJO),
                Enter.theValue(person.getReferencia()).into(DependentLaborPage.INPUT_REFERENCIA),
                Enter.theValue(person.getTelefonoTrabajo()).into(DependentLaborPage.INPUT_TELEFONO),
                Click.on(DependentLaborPage.BOTON_CONTINUAR)
        );
    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Interaction.super.then(nextPerformable);
    }
}
