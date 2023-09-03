package org.example.onb.tasks;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import org.example.onb.interactions.HomePage;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.URL;
import java.net.MalformedURLException;

public class OpenChromeOnAndroid implements Interaction {
    private final String emulatorName;
    private  HomePage homePage = new HomePage();

    public OpenChromeOnAndroid(String emulatorName) {
        this.emulatorName = emulatorName;
    }

    @Override
    @Step("{0} opens Chrome on Android emulator #emulatorName")
    public <T extends Actor> void performAs(T actor) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, emulatorName);
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability("automationName", "UiAutomator2");

        AppiumDriver driver;
        try {
            driver = new AndroidDriver(new URL("http://localhost:4723/"), capabilities);
            actor.whoCan(BrowseTheWeb.with(driver));

            actor.wasAbleTo(Open.browserOn(homePage));

        } catch (MalformedURLException e) {
            throw new IllegalStateException("Failed to create AndroidDriver", e);
        }
    }

    public static OpenChromeOnAndroid onEmulator(String emulatorName) {
        return Tasks.instrumented(OpenChromeOnAndroid.class, emulatorName);
    }

}
