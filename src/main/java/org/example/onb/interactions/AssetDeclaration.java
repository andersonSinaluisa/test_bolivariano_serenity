package org.example.onb.interactions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AssetDeclaration {

    public static final Target CHECK_POSSE_ACTIVOS = Target.the("Check Posse Activos").located(By.name("group1"));

    //currency-field
    public static final Target INPUT_VALOR_ACTIVOS = Target.the("Input Valor Activos").locatedBy("#currency-field");

    //pasivosFormControlInput1
    public static final Target INPUT_PASIVOS = Target.the("Input Pasivos").locatedBy("#pasivosFormControlInput1");


    ////*[@id="custom-panel-otraNacionalidad-header"]/div/div/span/button[1]
    public static final Target BOTON_AGREGAR_NACIONALIDAD = Target.the("Boton Agregar Nacionalidad").locatedBy("//*[@id=\"custom-panel-otraNacionalidad-header\"]/div/div/span/button[contains(span, '{0}')]");

    //paddingSelectedPais
    public static final Target SELECT_PAIS = Target.the("Select Pais").locatedBy("#paddingSelectedPais");

    //paddingSelectedPais
    public static final Target SELECT_PAIS_OPTION = Target.the("Select Pais Option").locatedBy(".ng-option  .ng-option-label");

    //*[@id="custom-panel-residenciaUSA-header"]/div/div/span/button[1]

    public static final Target BOTON_AGREGAR_RESIDENCIA = Target.the("Boton Agregar Residencia").locatedBy("//*[@id=\"custom-panel-residenciaUSA-header\"]/div/div/span/button[contains(span, '{0}')]");

    //usaId
    public static final Target INPUT_USA_ID = Target.the("Input USA ID").locatedBy("#usaId");

    //usaFiscal
    public static final Target INPUT_USA_FISCAL = Target.the("Input USA Fiscal").locatedBy("#usaFiscal");


    ////*[@id="custom-panel-otraResidenciaFiscal-header"]/div/div/span/button[1]
    public static final Target BOTON_AGREGAR_OTRA_RESIDENCIA = Target.the("Boton Agregar Otra Residencia").locatedBy("//*[@id=\"custom-panel-otraResidenciaFiscal-header\"]/div/div/span/button[contains(span, '{0}')]");

    //paddingSelectedPais2
    public static final Target SELECT_PAIS2 = Target.the("Select Pais2").locatedBy("#paddingSelectedPais2");

    //paddingSelectedPais2
    public static final Target SELECT_PAIS_OPTION2 = Target.the("Select Pais Option2").locatedBy(".ng-option  .ng-option-label");


    //otraId
    public static final Target INPUT_OTRA_ID = Target.the("Input Otra ID").locatedBy("#otraId");


    //otraFiscal
    public static final Target INPUT_OTRA_FISCAL = Target.the("Input Otra Fiscal").locatedBy("#otraFiscal");

    //botonContinuar
    public static final Target BOTON_CONTINUAR = Target.the("Boton Continuar").locatedBy("#botonContinuar");

}
