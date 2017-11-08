package com.test.correoelectronico.steps;

import com.test.correoelectronico.page.CorreoElectronicoGmailPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class CorreoElectronicoGmailSteps extends ScenarioSteps {
    @Page
    CorreoElectronicoGmailPage correoElectronicoGmailPage;
    private ExamplesTable informacion;

    @Step
    public void ingresarACorreoElectronico(ExamplesTable informacion) {
        correoElectronicoGmailPage.createInstanceOfWebDriver();
        correoElectronicoGmailPage.ingresarACorreoElectronico(informacion);
    }
    @Step
    public void ingresarAGmail() {
        correoElectronicoGmailPage.ingresarAGmail();
    }
    @Step
    public void enviarMensajeCorreoElectronico(ExamplesTable datosMensajeCorreoElectronico) {
        correoElectronicoGmailPage.enviarMensajeCorreoElectronico(datosMensajeCorreoElectronico);
    }
    @Step
    public void salirEIngresarACorreoElectronico() {
        correoElectronicoGmailPage.salirEIngresarACorreoElectronico();
    }
    @Step
    public void ingresarAOpcionRecibidosCorreoElectronico(ExamplesTable informacionMensajeRecibido) {
        ExamplesTable validarCorreoElectronico=correoElectronicoGmailPage.ingresarAOpcionRecibidosCorreoElectronico(informacionMensajeRecibido);


    }
}
