package org.example.onb.interactions;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {

    //#pregunta6 > div > div > div.content-info > div.row.center-prod > div:nth-child(1) > div > p-checkbox
    public static final Target CHECKBOX_1 = Target.the("Checkbox 1").locatedBy("#pregunta6 > div > div > div.content-info > div.row.center-prod > div:nth-child(1) > div > p-checkbox");

    //#pregunta6 > div > div > div.content-info > div.row.center-prod > div:nth-child(2) > div > p-checkbox
    public static final Target CHECKBOX_2 = Target.the("Checkbox 2").locatedBy("#pregunta6 > div > div > div.content-info > div.row.center-prod > div:nth-child(2) > div > p-checkbox");

    public static final Target BOTON_CONTINUAR = Target.the("Boton Continuar").locatedBy("(//*[@id=\"botonContinuar\"])[2]");

}
