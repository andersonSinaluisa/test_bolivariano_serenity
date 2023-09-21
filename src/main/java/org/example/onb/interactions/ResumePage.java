package org.example.onb.interactions;

import net.serenitybdd.screenplay.targets.Target;

public class ResumePage {

    public static final Target TITLE_MODAL = Target.the("title modal")
            .locatedBy("//*[contains(text(), ' ¡Tu cuenta de ahorros está lista! ')]");

    ////*[@class="close"]
    public static final Target BTN_CLOSE_MODAL = Target.the("button close modal")
            .locatedBy("//*[@class='close']");

        
    ////*[@class="numeroCuenta-onb"]
    public static final Target TXT_ACCOUNT_NUMBER = Target.the("text account number")
            .locatedBy("//*[@class='numeroCuenta-onb']");

}
