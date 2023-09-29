package org.example.onb.interactions;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://cuentas.cuentafuturo.com/")
public class HomePage extends PageObject {

    public HomePage() {
        super();
    }
    public HomePage(AppiumDriver driver) {
        super(driver);
    }
    public static final Target INPUT_CEDULA = Target.the("Cedula").locatedBy("//input[@id='onboarding_cedula']");
    public static final Target INPUT_CODIGO_DACTILAR = Target.the("Codigo Dactilar").locatedBy("//input[@id='onboarding_codigo_dactilar']");

    public static final Target CHECK_TERMS = Target.the("Check Terms").locatedBy("#pregunta1 > div.homebg > div.bx-home > div.form-content-home > div.form-field-cta > div > div.campos-segundos.campo-terminos > onb-section-lpd > div > div > p-checkbox");

    public static final Target BUTTON_CONTINUAR = Target.the("Button Continuar").locatedBy("//button[starts-with(text(),'Continuar Sin FacePhi')]");

    public static final Target ALERT_MESSAGE_ERROR = Target.the("Alert Message Error").locatedBy("#pregunta1 > app-error-message > div");

    public static final Target LOADER = Target.the("Loader").locatedBy("body > div > div > div > img");

    public static final Target BUTTON_OFI_CONTINUE = Target.the("Button Ofi Continue").locatedBy("(//button[contains(text(),'Continuar')])[2]");
}
