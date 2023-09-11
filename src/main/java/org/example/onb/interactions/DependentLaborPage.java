package org.example.onb.interactions;

import net.serenitybdd.screenplay.targets.Target;

public class DependentLaborPage {

    public static final Target TEXT_TITLE = Target.the("Text Title").locatedBy("//h5[starts-with(text(),' Información laboral')]");
    public static final Target INPUT_NOMBRE_EMPRESA = Target.the("Input Nombre Empresa").locatedBy("#onboarding_nombre_empresa");

    public static final Target INPUT_ANTIGUEDAD = Target.the("Input Antiguedad").locatedBy("#dependiente-antiguedad");

    //onboarding_ingresos_mensuales
    public static final Target INPUT_INGRESOS_MENSUALES = Target.the("Input Ingresos Mensuales").locatedBy("#onboarding_ingresos_mensuales");

    public static final Target INPUT_EGRESOS = Target.the("Input Ingresos Mensuales").locatedBy("#onboarding_gastos_mensuales");

    public static final Target SELECT_CIUDAD = Target.the("Select Ciudad").locatedBy("#paddingSelected");

    public static final Target SELECT_CIUDAD_OPTION = Target.the("Select Ciudad Option").locatedBy(".ng-option  .ng-option-label");

    public static final Target SELECT_PARROQUIA = Target.the("Select Parroquia").locatedBy("#idDropDownParroquia");

    public static final Target SELECT_PARROQUIA_OPTION = Target.the("Select Parroquia Option").locatedBy(".ng-star-inserted .ui-dropdown-item");

    public static final Target INPUT_DIRECCION_TRABAJO = Target.the("Input Direccion Trabajo").locatedBy("#direccion_completa");

    public static final Target INPUT_REFERENCIA = Target.the("Input Referencia").locatedBy("#onboarding_referencia");

    //onboarding_numero_domicilio
    public static final Target INPUT_TELEFONO = Target.the("Input Telefono").locatedBy("#onboarding_numero_domicilio");

    //botonContinuar
    public static final Target BOTON_CONTINUAR = Target.the("Boton Continuar").locatedBy("#botonContinuar");

}
