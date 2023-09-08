package org.example.onb.tasks;

import com.google.common.reflect.ClassPath;
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

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Especifica la ubicación del chromedriver.exe en tu sistema Windows
        String directorioBase = Paths.get("").toAbsolutePath().toString();

        //join src/test/resources/windows/chromedriver.exe
        directorioBase = Paths.get(directorioBase, "src", "test", "resources", "windows").toAbsolutePath().toString();



        String rutaControlador = directorioBase ;

        //System.setProperty("webdriver.chrome.driver", rutaControlador);

        // Configura las opciones de Chrome, si es necesario
        ChromeOptions chromeOptions = new ChromeOptions();
        // chromeOptions.addArguments("--start-maximized"); // Por ejemplo, para iniciar Chrome maximizado

        WebDriver driver = new ChromeDriver(chromeOptions);
        actor.whoCan(BrowseTheWeb.with(driver));

        actor.wasAbleTo(Open.browserOn(homePage));
    }

    public static OpenChromeOnWeb onWindows() {
        return Tasks.instrumented(OpenChromeOnWeb.class);
    }
}

