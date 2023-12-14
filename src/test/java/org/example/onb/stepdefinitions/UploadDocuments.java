package org.example.onb.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import org.example.onb.tasks.UploadDocument;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class UploadDocuments {
    @Managed(driver = "chrome")
    private WebDriver theBrowser;

    private Actor actor = Actor.named("Anderson");

    @Given("el usuario ingresa a la pantalla de carga de documentos")
    public void el_usuario_ingresa_a_la_pantalla_de_carga_de_documentos() {
        // Write code here that turns the phrase above into concrete actions
        actor.whoCan(
                BrowseTheWeb.with(theBrowser)
        );

        actor.wasAbleTo(
                Open.url("https://cuentas.cuentafuturo.com/carga-documentos")
        );
    }

    @When("el usuario carga un documento")
    public void elUsuarioCargaUnDocumento() {
        actor.wasAbleTo(UploadDocument.upload());
    }

    @Then("el documento se carga correctamente")
    public void elDocumentoSeCargaCorrectamente() {
    }
}
