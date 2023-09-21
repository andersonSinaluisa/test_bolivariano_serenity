package org.example.onb.interactions;

import net.serenitybdd.screenplay.targets.Target;

public class ContractPage {
    public static final Target TITLE_TEXT = Target.the("Title Text").locatedBy("//*[contains(text(),\"Revisa cada documento\")]");
    public static final Target TITLE_CONTRATO = Target.the("Title Contrato").locatedBy("//*[contains(text(),\"Contrato de cuenta de ahorros\")]");

    public static final Target TITLE_CONTRATO_FIRMA =  Target.the("Title Contrato Firma").locatedBy("//*[contains(text(),\"Contrato de servicio de firma electrónica\")]");


    public static final Target CHECK_TERMINOS = Target.the("Check Terminos").locatedBy("//*[@class=\"check top\"]");

    public static final Target BOTON_CONTINUAR = Target.the("Boton Continuar").locatedBy("#botonContinuar");

}
