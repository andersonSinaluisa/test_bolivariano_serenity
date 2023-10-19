package org.example.onb.interactions;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {

    //#pregunta6 > div > div > div.content-info > div.row.center-prod > div:nth-child(1) > div > p-checkbox
    public static final Target CUENTA_MAS_BTN = Target.the("Checkbox 1").locatedBy("//button[contains(text(),\"Ingresa tu ahorro\")]");

    public static final Target INPUT_CUENTA_MAS = Target.the("Input 1").locatedBy("//input[@placeholder=\"$ 20.00\"]");

    //#pregunta6 > div > div > div.content-info > div.row.center-prod > div:nth-child(2) > div > p-checkbox
    public static final Target AVISOS_24_BTN = Target.the("Checkbox 2").locatedBy("//button[contains(text(),\"Adquirir producto\")]");

    public static final Target BOTON_CONTINUAR = Target.the("Boton Continuar").locatedBy("(//*[@id=\"botonContinuar\"])[{0}]");

}
