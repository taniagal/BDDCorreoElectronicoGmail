package com.test.correoelectronico.steps;

import com.test.correoelectronico.page.CorreoElectronicoGmailPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class CorreoElectronicoGmailSteps extends ScenarioSteps {
    @Page
     CorreoElectronicoGmailPage correoElectronicoGmailPage;

    @Step
    public void ingresarACorreoElectronico(ExamplesTable informacion) throws InterruptedException {
        correoElectronicoGmailPage.createInstanceOfWebDriver();
        correoElectronicoGmailPage.ingresarACorreoElectronico(informacion);
    }
    @Step
    public void ingresarAGmail() {
        correoElectronicoGmailPage.ingresarAGmail();
    }
    @Step
    public void enviarMensajeCorreoElectronico(ExamplesTable datosMensajeCorreoElectronico) throws InterruptedException {
        correoElectronicoGmailPage.enviarMensajeCorreoElectronico(datosMensajeCorreoElectronico);
    }
    @Step
    public void salirEIngresarACorreoElectronico() throws InterruptedException {
        correoElectronicoGmailPage.salirEIngresarACorreoElectronico();
    }
    @Step
    public void ingresarAOpcionRecibidosCorreoElectronico(ExamplesTable informacionMensajeRecibido) {
        Map<String,String> informacionRecibida=informacionMensajeRecibido.getRow(0);
        String usuarioEnvioCorreo=informacionRecibida.get("correoElectronicoONumeroTelefonico");
        String asuntoMensajeEnviado=informacionRecibida.get("asunto");
        String mensajeEnviado=informacionRecibida.get("mensaje");
        MatcherAssert.assertThat(usuarioEnvioCorreo, Matchers.not(Matchers.isEmptyString()));
        MatcherAssert.assertThat(mensajeEnviado, Matchers.not(Matchers.isEmptyString()));
        MatcherAssert.assertThat(asuntoMensajeEnviado, Matchers.not(Matchers.isEmptyString()));
        correoElectronicoGmailPage.ingresarAOpcionRecibidos();
        ArrayList<String[]> datosCorreoElectronico = correoElectronicoGmailPage.obtenerDatosCorreoElectronico();
        MatcherAssert.assertThat(datosCorreoElectronico.size(), Matchers.greaterThan(0));
        Iterator<String[]> iterator = datosCorreoElectronico.iterator();
        while(iterator.hasNext()){
            String[] datos = iterator.next();
            MatcherAssert.assertThat(datos[0], Matchers.containsString(usuarioEnvioCorreo));
            MatcherAssert.assertThat(datos[1], Matchers.containsString(asuntoMensajeEnviado));
            MatcherAssert.assertThat(datos[2], Matchers.containsString(mensajeEnviado));
        }
    }
}
