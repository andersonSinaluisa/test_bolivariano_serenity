package org.example.onb.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.example.onb.interactions.HomePage;
import org.example.onb.tasks.OpenChromeOnAndroid;
import org.openqa.selenium.WebDriver;

public class DependentLaborStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver theBrowser;
    private HomePage homePage = new HomePage();
    private String platform;

    private Actor actor = Actor.named("Anderson");

    @Given("que el usuario ingresa a la pagina de inicio")
    public void que_el_usuario_ingresa_a_la_pagina_de_inicio(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        platform = dataTable.cell(0,0);
        switch (platform){
            case "android":
                actor.attemptsTo(OpenChromeOnAndroid.onEmulator("0912515344007452"));
                return;
            case "web":
                actor.can(BrowseTheWeb.with(theBrowser));
                actor.wasAbleTo(Open.browserOn(homePage));
                return;
        }


    }

    @When("el usuario ingresa sus datos y hace click en el boton de continuar")
    public void el_usuario_ingresa_sus_datos_y_hace_click_en_el_boton_de_continuar(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
    }
    @Then("el usuario es redirigido a la pagina de confirmacion de datos")
    public void el_usuario_es_redirigido_a_la_pagina_de_confirmacion_de_datos() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("el usuario confirma sus datos e ingresa sus datos faltantes")
    public void el_usuario_confirma_sus_datos_e_ingresa_sus_datos_faltantes(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
    }
    @When("acepta los terminos y condiciones")
    public void acepta_los_terminos_y_condiciones() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("hace click en el boton de continuar")
    public void hace_click_en_el_boton_de_continuar() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("el usuario es redirigido a la pagina de ingresar domicilio")
    public void el_usuario_es_redirigido_a_la_pagina_de_ingresar_domicilio() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("el usuario ingresa sus datos de domicilio")
    public void el_usuario_ingresa_sus_datos_de_domicilio(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
    }
    @Then("el usuario es redirigido a la pagina de ingresar datos laborales")
    public void el_usuario_es_redirigido_a_la_pagina_de_ingresar_datos_laborales() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("el usuario ingresa sus datos laborales")
    public void el_usuario_ingresa_sus_datos_laborales(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
    }
    @Then("el usuario es redirigido a la pagina de ingresar datos de declaracion patrimonial")
    public void el_usuario_es_redirigido_a_la_pagina_de_ingresar_datos_de_declaracion_patrimonial() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("el usuario ingresa sus datos de declaracion patrimonial")
    public void el_usuario_ingresa_sus_datos_de_declaracion_patrimonial(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
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
    }
    @Then("el usuario es redirigido a la pagina de contrato")
    public void el_usuario_es_redirigido_a_la_pagina_de_contrato() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("el usuario acepta los terminos y condiciones y contratos")
    public void el_usuario_acepta_los_terminos_y_condiciones_y_contratos() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("el usuario es redirigido a la pagina de otp")
    public void el_usuario_es_redirigido_a_la_pagina_de_otp() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("el usuario ingresa el codigo otp")
    public void el_usuario_ingresa_el_codigo_otp(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
    }
    @Then("el usuario es redirigido a la pagina de resumen")
    public void el_usuario_es_redirigido_a_la_pagina_de_resumen() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("debe ver el numero de cuenta generada")
    public void debe_ver_el_numero_de_cuenta_generada() {
        // Write code here that turns the phrase above into concrete actions
    }



}
