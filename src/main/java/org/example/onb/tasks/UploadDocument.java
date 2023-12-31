package org.example.onb.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.actions.UploadToField;
import org.example.onb.interactions.UploadDocumentsPage;
import org.example.onb.models.Person;

import java.nio.file.Path;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class UploadDocument implements Interaction {
    Person person;
    public UploadDocument(Person person) {
        this.person=person;
    }
    public static UploadDocument upload() {
        return Tasks.instrumented(UploadDocument.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {


        String resource = this.getClass().getResource("/").getPath() + "images/PDF_PRUEBA.pdf";


        actor.attemptsTo(
                Upload.theFile(
                        //test resource
                        Path.of(
                                "C:\\Users\\User\\Documents\\bb\\test_bolivariano_serenity\\src\\test\\resources\\images\\PDF_PRUEBA.pdf"
                        )
                ).to(
                        UploadDocumentsPage.CEDULA_DROPZONE
                )
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //sleep 5 seconds
        actor.attemptsTo(

                Upload.theFile(
                        Path.of("C:\\Users\\User\\Downloads\\1646187507427.jpg")
                ).to(
                        UploadDocumentsPage.SERVICIOS_BASICOS_DROPZONE
                )
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
