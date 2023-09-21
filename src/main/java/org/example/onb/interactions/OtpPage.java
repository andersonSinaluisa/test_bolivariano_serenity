package org.example.onb.interactions;

import net.serenitybdd.screenplay.targets.Target;

public class OtpPage {
    public static final Target EMAIL_MEDIO = Target.the("Email Medio").locatedBy("//onb-select-otp");
    //*[@id="otp_0_piov4j5ugkllms7o17v"]

    public static final Target START_OTP = Target.the("Start OTP").locatedBy("(//*[contains(@class, 'tp-input-')])[1]");
    
    public static final Target BUTTON_CVONTINUE_1 = Target.the("Button Continue 1").locatedBy("(//button[contains(text(), 'Continuar')])[1]");

}
