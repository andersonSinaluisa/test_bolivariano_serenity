package org.example.onb.tasks;

import com.google.gson.Gson;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import org.example.onb.models.Person;
import org.openqa.selenium.JavascriptExecutor;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import static net.serenitybdd.core.Serenity.getDriver;
public class GenerateReportCSV implements Interaction {
    Person person;
    Gson gson = new Gson();
    public GenerateReportCSV(Person person) {
        this.person = person;
    }

    public static GenerateReportCSV withData(Person person) {
        return Tasks.instrumented(GenerateReportCSV.class, person);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        String script = "return window.localStorage.getItem(arguments[0]);";
        //get data from local storage
        String solicitudId =  (String) jsExecutor.executeScript(script, "solicitudId");
        String path = makeFileTxt(person,solicitudId);
        String json_path = makeFileDataUse(person);
        System.out.println("path: "+path);


        actor.remember("path", path);

        //execute script
        // Execute JavaScript code to get the item from localStorage

    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Interaction.super.then(nextPerformable);
    }

    public String makeFileTxt(Person p,String solicitudId) {
        try {
            Date date = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yy");

            // Formatear la fecha en el formato deseado
            String fechaFormateada = formato.format(date);
            String downloadPath ="src/test/resources/data/aperturas-"+fechaFormateada+".csv";



            // Whatever the file path is.
            File statText = new File(downloadPath);
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);
            Writer w = new BufferedWriter(osw);

            w.write(p.getCedula()+","+solicitudId+","+p.getNumeroCuentaGenerada()+","+p.getCorreo());
            w.close();
            return downloadPath;
        } catch (IOException e) {
            System.err.println("Problem writing to the file " + e);
        }

        return "error";
    }

    public String makeFileDataUse(Person p) {
        try {
            String downloadPath ="src/test/resources/data/people/"+p.getCedula()+".json";

            String data = gson.toJson(p);



            // Whatever the file path is.
            File statText = new File(downloadPath);
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);
            Writer w = new BufferedWriter(osw);
            w.write(data);

            w.close();
            return downloadPath;
        } catch (IOException e) {
            System.err.println("Problem writing to the file " + e);
        }

        return "error";
    }
}
