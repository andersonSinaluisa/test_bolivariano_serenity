package org.example.onb.interactions;

import net.serenitybdd.screenplay.targets.Target;

public class UploadDocumentsPage {

    public static final Target CEDULA_DROPZONE = Target.the("Cedula Dropzone").locatedBy("//input[@id=\"Documentos0\"]");

    public static final Target SERVICIOS_BASICOS_DROPZONE = Target.the("Servicios Basicos Dropzone").locatedBy("//input[@id=\"Documentos1\"]");

    public static final Target RUC_DROPZONE = Target.the("Ruc Dropzone").locatedBy("(//div[@class=\"preview-default-imagen\"])[3]");

    public static final Target IMPUESTO_RENTA_DROPZONE = Target.the("Impuesto Renta Dropzone").locatedBy("(//div[@class=\"preview-default-imagen\"])[4]");

    public static final Target MECANIZADO_IESS_DROPZONE = Target.the("Mecanizado Iess Dropzone").locatedBy("(//div[@class=\"preview-default-imagen\"])[3]");
}
