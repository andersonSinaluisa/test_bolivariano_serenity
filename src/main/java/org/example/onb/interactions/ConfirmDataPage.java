package org.example.onb.interactions;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmDataPage {


    public static final Target TEXT_TITILE = Target.the("Text Title").locatedBy("//h2[contains(text(),'Confirma tus datos')]");
    public static final Target INPUT_NOMBRE = Target.the("Input Nombre").located(By.cssSelector("#confirmaDatos1 > div > div > div:nth-child(1) > div > h1 > span:nth-child(2)"));

    public static final Target INPUT_FECHA_NACIMIENTTO = Target.the("Input Fecha de Nacimiento").located(By.cssSelector("#confirmaDatos1 > div > div > div:nth-child(2) > div > h1 > span:nth-child(2)"));

    public static final Target INPUT_ESTADO_CIVIL = Target.the("Input Estado Civil").located(By.cssSelector("#confirmaDatos1 > div > div > div:nth-child(3) > div > h1 > span:nth-child(2)"));


    public static final Target INPUT_NACIONALIDAD = Target.the("Input Nacionalidad").located(By.cssSelector("#confirmaDatos1 > div > div > div:nth-child(4) > div > h1 > span:nth-child(2)"));

    public static final Target INPUT_CELULAR = Target.the("Input Celular").located(By.cssSelector("#celular"));
    //*[@class="ng-option-label" and contains(text(), "La Troncal")]
    public static final Target INPUT_EMAIL = Target.the("Input Email").located(By.cssSelector("#onboarding_mail"));

    public static final Target SELECT_CIUDAD = Target.the("Select Ciudad").located(By.cssSelector("#idCiudadesSelect"));

    public static final Target SELECT_CIUDAD_OPTION = Target.the("Select Ciudad Option").locatedBy("//span[@class=\"ng-option-label ng-star-inserted\" and contains(text(),\"{0}\")]");

    public static final Target SELECT_OFICINA = Target.the("Select Oficina").located(By.cssSelector("#idAgenciasSelect"));

    public static final Target SELECT_OFICINA_OPTION  = Target.the("Select Oficina Option").locatedBy("//span[@class=\"ng-option-label ng-star-inserted\" and contains(text(),\"{0}\")]");

    public static final Target TEXT_TERMINOS_Y_CONDICIONES = Target.the("Text Terminos y Condiciones").located(By.cssSelector("#divCheckTratDatosTermCond > div > span"));

    public static final Target CHECK_TERMINOS_Y_CONDICIONES = Target.the("Check Terminos y Condiciones").located(By.cssSelector("#divCheckTratDatosTermCond > div > p-checkbox"));

    public static final Target CLOSE_CHECK_TERMINOS_Y_CONDICIONES = Target.the("Close Check Terminos y Condiciones").located(By.className("close"));
    public static final Target BUTTON_CONTINUAR = Target.the("Button Continuar").located(By.cssSelector("#botonContinuar"));
    public static final Target LOADER = Target.the("Loader").locatedBy("body > div > div > div > img");

}
