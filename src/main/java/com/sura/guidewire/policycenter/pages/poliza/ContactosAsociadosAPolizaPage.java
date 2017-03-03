package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class ContactosAsociadosAPolizaPage extends PageUtil {

    String pathInicialCamposTablaContactos = "//*[contains(@id,'gridcolum') and contains(.,'";
    String pathInicialPestañasDeContactos = "//span[contains(.,'";
    String pathFinal = "')]";

    public ContactosAsociadosAPolizaPage(WebDriver driver) {
        super(driver);
    }

    public void validarOpcionesDeTablaContactos(ExamplesTable opciones) {
        validarOpcion(opciones, pathInicialCamposTablaContactos, pathFinal);
    }

    public void validarPestanasDeOpcionContactos(ExamplesTable opciones) {
        validarOpcion(opciones, pathInicialPestañasDeContactos, pathFinal);
    }

}