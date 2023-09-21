package org.example.onb.tasks;

import com.google.common.reflect.ClassPath;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.example.onb.interactions.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import os path java
import java.io.IOException;
import java.nio.file.Paths;
public class OpenChromeOnWeb implements Interaction {
    private HomePage homePage = new HomePage();
    @Managed(driver = "chrome")
    private WebDriver theBrowser;
    private Actor actor = Actor.named("Anderson");
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Especifica la ubicación del chromedriver.exe en tu sistema Windows

        actor.whoCan(BrowseTheWeb.with(theBrowser));

        actor.wasAbleTo(Open.browserOn(homePage));
    }

    public static OpenChromeOnWeb onWindows() {
        return Tasks.instrumented(OpenChromeOnWeb.class);
    }
}

