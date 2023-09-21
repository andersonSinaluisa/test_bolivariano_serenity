package org.example.onb.interactions;

import net.serenitybdd.screenplay.targets.Target;

public class DomicilePage {


    public static final Target TEXT_TITILE = Target.the("Text Title").locatedBy("//h5[contains(text(),'Ingresa tus datos de contacto')]");

    public static final Target SELECT_CIUDAD = Target.the("Select Ciudad").locatedBy("#paddingSelected");

    public static final Target SELECT_CIUDAD_OPTION = Target.the("Select Ciudad Option").locatedBy(".ng-dropdown-panel-items .ng-option-label");


    public static final Target SELECT_PARROQUIA = Target.the("Select Parroquia").locatedBy("#idParroquia");
    public static final Target SELECT_PARROQUIA_OPTION = Target.the("Select Parroquia Option").locatedBy(".ng-star-inserted .ui-dropdown-item");

    public static final Target INPUT_DIRECCION_COMPLETA = Target.the("Input Direccion Completa").locatedBy("#direccion_completa");

    public static final Target INPUT_DESCRIPCION_CASA = Target.the("Input Descripcion Casa").locatedBy("#descripcion_casa");

    public static final Target INPUT_REFERENCIA = Target.the("Input Referencia").locatedBy("#onboarding_referencia");


    public static final Target INPUT_TELEFONO = Target.the("Input Telefono").locatedBy("#onboarding_numero_domicilio");


    public static final Target SELECT_SITUACION_LABORAL = Target.the("Select Situacion Laboral").locatedBy("#onb_select_situacion_laboral");

    public static final Target SELECT_SITUACION_LABORAL_OPTION = Target.the("Select Situacion Laboral Option").locatedBy("//span[starts-with(text(),\"{0}\")]");


    public static final Target SELECT_TIPO_TRABAJO =    Target.the("Select Tipo Trabajo").locatedBy("/html/body/app-root/div/div[2]/app-ingresa-domicilio/section[2]/div[2]/div[3]/div/div[2]/ng-select");

    public static final Target SELECT_TIPO_TRABAJO_OPTION = Target.the("Select Tipo Trabajo Option").locatedBy("//span[normalize-space()=\"{0}\" and contains(@class, 'ng-option-label')]");

    public static final Target INPUT_INGRESOS = Target.the("Input Ingresos").locatedBy("#onboarding_campo_ingresos");

    public static final Target INPUT_EGRESOS = Target.the("Input Egresos").locatedBy("#onboarding_campo_egresos");

    public static final Target BUTTON_CONTINUAR = Target.the("Button Continuar").locatedBy("#botonContinuar");


}


