package org.example.onb.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.example.onb.interactions.*;
import org.example.onb.models.Person;
import org.example.onb.tasks.*;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
public class DependentLaborStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver theBrowser;
    private HomePage homePage = new HomePage();
    private String platform;

    private Person person;

    private Actor actor = Actor.named("Anderson");

    @Given("que el usuario ingresa a la pagina de inicio")
    public void que_el_usuario_ingresa_a_la_pagina_de_inicio(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        platform = dataTable.cell(0,0);
        person = new Person();
        switch (platform){
            case "android":
                actor.attemptsTo(OpenChromeOnAndroid.onEmulator("0912515344007452"));
                return;
            case "web":
                actor.attemptsTo(OpenChromeOnWeb.onWindows());
                return;
        }


    }

    @When("el usuario ingresa sus datos y hace click en el boton de continuar")
    public void el_usuario_ingresa_sus_datos_y_hace_click_en_el_boton_de_continuar(io.cucumber.datatable.DataTable dataTable) {
        person.setCedula(dataTable.cell(0,0));
        person.setCodigoDactilar(dataTable.cell(0,1));

        actor.wasAbleTo(EnterDataInHome.withData(person));

    }
    @Then("el usuario es redirigido a la pagina de confirmacion de datos")
    public void el_usuario_es_redirigido_a_la_pagina_de_confirmacion_de_datos() {
        // Write code here that turns the phrase above into concrete actions
        //esperar a que el loader desaparezca y que el input de nombre este presente
        SerenityWebdriverManager.inThisTestThread().getCurrentDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Espera implícita de 10 segundos


        actor.should(seeThat(
                the(ConfirmDataPage.TEXT_TITILE),
                isPresent()
        ));
    }
    @When("el usuario confirma sus datos e ingresa sus datos faltantes")
    public void el_usuario_confirma_sus_datos_e_ingresa_sus_datos_faltantes(io.cucumber.datatable.DataTable dataTable) {
        //  | <celular> | <correo> | <ciudad> | <direccion> |
        person.setCelular(dataTable.cell(0,0));
        person.setCorreo(dataTable.cell(0,1));
        person.setCiudad(dataTable.cell(0,2));
        person.setDireccion(dataTable.cell(0,3));
        person.setOficina(dataTable.cell(0,4));


        actor.wasAbleTo(EnterDataInConfirmData.withData(person));

    }
    @When("acepta los terminos y condiciones")
    public void acepta_los_terminos_y_condiciones() {
        // Write code here that turns the phrase above into concrete actions
        actor.wasAbleTo(CheckTermsInConfirmData.check());
    }
    @When("hace click en el boton de continuar")
    public void hace_click_en_el_boton_de_continuar() {
        // Write code here that turns the phrase above into concrete actions
        actor.wasAbleTo(ClickButtonContinue.check());
    }
    @Then("el usuario es redirigido a la pagina de ingresar domicilio")
    public void el_usuario_es_redirigido_a_la_pagina_de_ingresar_domicilio() {
        // Write code here that turns the phrase above into concrete actions
        actor.should(seeThat(
                the(DomicilePage.TEXT_TITILE),
                isPresent()
        ));
    }
    @When("el usuario ingresa sus datos de domicilio")
    public void el_usuario_ingresa_sus_datos_de_domicilio(io.cucumber.datatable.DataTable dataTable) {
        //   | <ciudad> | <parroquia> | <direccionCompleta> | <descripcionCasa> | <referenciaCasa> | <numeroDomicilio> | <situacionLaboral> | <dependienteLaboral> |
        person.setCiudad(dataTable.cell(0,0));
        person.setParroquia(dataTable.cell(0,1));
        person.setDireccionCompleta(dataTable.cell(0,2));
        person.setDescripcionCasa(dataTable.cell(0,3));
        person.setReferenciaCasa(dataTable.cell(0,4));
        person.setNumeroDomicilio(dataTable.cell(0,5));
        person.setSituacionLaboral(dataTable.cell(0,6));
        person.setDependienteLaboral(dataTable.cell(0,7));

        actor.wasAbleTo(EnterDataInDomicile.withData(person));

    }
    @Then("el usuario es redirigido a la pagina de ingresar datos laborales")
    public void el_usuario_es_redirigido_a_la_pagina_de_ingresar_datos_laborales() {
        /*actor.should(seeThat(
                the(SelfEmployedPage.TEXT_TITLE),
                isPresent()
        ));*/
    }
    @When("el usuario ingresa sus datos laborales")
    public void el_usuario_ingresa_sus_datos_laborales(io.cucumber.datatable.DataTable dataTable) {
        //      | <nombreEmpresa> | <antiguedad> | <ingresoMensual> | <gastoMensual> | <direccion_trabajo> | <referencia> | <telefonoTrabajo> |
        person.setNombreEmpresa(dataTable.cell(0,0));
        person.setAntiguedad(dataTable.cell(0,1));
        person.setIngresoMensual(dataTable.cell(0,2));
        person.setEgresoMensual(dataTable.cell(0,3));
        person.setDireccionTrabajo(dataTable.cell(0,4));
        person.setReferencia(dataTable.cell(0,5));
        person.setTelefonoTrabajo(dataTable.cell(0,6));


        actor.wasAbleTo(EnterDataInDependentLabor.withData(person));
    }
    @Then("el usuario es redirigido a la pagina de ingresar datos de declaracion patrimonial")
    public void el_usuario_es_redirigido_a_la_pagina_de_ingresar_datos_de_declaracion_patrimonial() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("el usuario ingresa sus datos de declaracion patrimonial")
    public void el_usuario_ingresa_sus_datos_de_declaracion_patrimonial(io.cucumber.datatable.DataTable dataTable) {
        // | <posee_activos_ni_pasivos> | <activos> | <pasivos> | <tiene_otra_nacionalidad> | <tiene_residencia_eeuu> | <tiene_efectos_tributarios> |
        boolean poseeActivosniPasivos = dataTable.cell(0,0).equals("Si")?true:false;
        person.setPoseeActivosniPasivos(poseeActivosniPasivos);
        person.setActivos(dataTable.cell(0,1));
        person.setPasivos(dataTable.cell(0,2));
        person.setTieneOtraNacionalidad(dataTable.cell(0,3));
        person.setTieneResidenciaEEUU(dataTable.cell(0,4));
        person.setTieneEfectosTributarios(dataTable.cell(0,5));


        actor.wasAbleTo(EnterDataInPatrimonialDeclaration.withData(person));

    }
    @Then("el usuario es redirigido a la pagina venta cruzada")
    public void el_usuario_es_redirigido_a_la_pagina_venta_cruzada() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("el usuario selecciona el producto de venta cruzada si lo desea")
    public void el_usuario_selecciona_el_producto_de_venta_cruzada_si_lo_desea(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        //| <cuenta_mas> | <valor_cta_mas> | <avisos24> |
        person.setCuenta_mas(dataTable.cell(0,0));
        person.setValor_cta_mas(dataTable.cell(0,1));
        person.setAvisos_24(dataTable.cell(0,2));
        actor.wasAbleTo(SelectAditionalProduct.withData(person));
        getDriver().manage().timeouts().implicitlyWait(700, java.util.concurrent.TimeUnit.SECONDS);


    }
    @Then("el usuario es redirigido a la pagina de contrato")
    public void el_usuario_es_redirigido_a_la_pagina_de_contrato() {
        // Write code here that turns the phrase above into concrete actions
        actor.should(
                seeThat(
                        the(ContractPage.TITLE_TEXT),
                        isPresent()
                )
        );
    }
    @When("el usuario acepta los terminos y condiciones y contratos")
    public void el_usuario_acepta_los_terminos_y_condiciones_y_contratos() {
        // Write code here that turns the phrase above into concrete actions
        actor.attemptsTo(AcceptContracts.check());
    }
    @Then("el usuario es redirigido a la pagina de otp")
    public void el_usuario_es_redirigido_a_la_pagina_de_otp() {
        // Write code here that turns the phrase above into concrete actions
        actor.should(
                seeThat(
                        the(OtpPage.EMAIL_MEDIO),
                        isPresent()
                )
        );
    }
    @When("el usuario ingresa el codigo otp")
    public void el_usuario_ingresa_el_codigo_otp(io.cucumber.datatable.DataTable dataTable) {

        person.setCodigoOtp(dataTable.cell(0,0));
        
        actor.wasAbleTo(
            EnterOTPCode.withData(person)
        );

    }
    @Then("el usuario es redirigido a la pagina de resumen")
    public void el_usuario_es_redirigido_a_la_pagina_de_resumen() {
        // Write code here that turns the phrase above into concrete actions
        actor.should(
                seeThat(
                        the(ResumePage.TITLE_MODAL),
                        isPresent()
                )
        );
    }
    @Then("debe ver el numero de cuenta generada")
    public void debe_ver_el_numero_de_cuenta_generada() {
        // Write code here that turns the phrase above into concrete actions
        actor.wasAbleTo(ViewResume.withData(person));
        actor.wasAbleTo(GenerateReportCSV.withData(person));
    }



}
