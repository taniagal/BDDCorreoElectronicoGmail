package com.sura.policycenter.pages.policy.estados.poliza.cotizacion;

import com.sura.policycenter.model.AgenteModel;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.NoSuchElementException;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NuevaCotizacionPage extends PageObject implements Serializable{
    private static final long serialVersionUID = 1L;
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);
    // TODO: 08/06/2016 Validar con Liliana este formato
    private DateTimeFormatter formatter = DateTimeFormat.forPattern("MM/dd/yyyy");
    private List<AgenteModel> listaAgentesModel = null;
    private String nombreAgente;

    public static final String TITULO_PAGINA = "//span[@id='NewSubmission:NewSubmissionScreen:ttlBar']";
    public static final String TXT_NUMERO_CUENTA = "//input[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:Account-inputEl']";
    public static final String LINK_NOMBRE_PERSONA = "//div[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:AccountName-inputEl']";
    public static final String LABEL_NOMBRE_PERSONA = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:AccountName-labelCell']";
    public static final String LABEL_FECHA_POR_DEFECTO = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:DefaultPPEffDate-bodyEl']";
    public static final String TXT_NOMBRE_AGENTE = ".//input[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']";
    public static final String TXT_CODIGO_AGENTE = ".//input[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerCode-inputEl']";
    public static final String CBO_NOMBRE_AGENTE = ".//li[@role='option']";
    public static final String LINK_BOTONES_ELEGIR_PRODUCTO = ".//a[contains(@id,'addSubmission')]";

    public NuevaCotizacionPage() {
        listaAgentesModel = new ArrayList<>();
    }

    public Boolean buscarInputHabilitadoEnElemento(String xpath) {
        WebElementFacade input = null;
        Boolean elementoEncontrado;
        try {
            input = elemento(xpath).findBy(By.tagName("input"));
            input.shouldBeEnabled();
            elementoEncontrado = Boolean.TRUE;
        } catch (NoSuchElementException nosee){
            LOGGER.info("Elemento input no encontrado: " + nosee);
            elementoEncontrado = Boolean.FALSE;
        }

        return elementoEncontrado;
    }

    public WebElementFacade elemento(String xpath) {
        WebElementFacade elemento = null;

        try {
            $(xpath).shouldBeCurrentlyVisible();
            elemento = element(find(By.xpath(xpath)));

        } catch (NoSuchElementException e) {
            throw new NoSuchElementException(" \nERROR050: Elemento de NuevaCotizacionPage no encontrado \nElemento: " + xpath + "\nTRACE: \n" + e);
        } catch (Exception e) {
            LOGGER.error("\nERROR: Error desconocido en: NuevaCotizacionPage.elemento \nElemento: " + xpath + "\nTRACE: \n" + e);
        }

        return elemento;
    }

    public Boolean esFechaCotizacionHOY() {
        return esFechaPorDefectoHOY(obtenerFechaCotizacionElemento());
    }

    public Boolean esFechaPorDefectoHOY(WebElementFacade fecha) {
        if (LocalDate.now().isEqual(formatter.parseDateTime(fecha.getText()).toLocalDate())) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean esFechaEditable() {
        return buscarInputHabilitadoEnElemento(LABEL_FECHA_POR_DEFECTO);
    }

    public void seleccionarAgente(String nombreAgente) {
        setNombreAgente(nombreAgente);
        validarAutocompletarNombreAgente();
        seleccionarAgente();
    }

    public void seleccionarAgente() {
        List<WebElementFacade> listaNombresAgentesElement = findAll(By.xpath(CBO_NOMBRE_AGENTE));
        if (!listaNombresAgentesElement.isEmpty()) {
            for (WebElementFacade agenteElemento : listaNombresAgentesElement) {
                if (agenteElemento.containsText(getNombreAgente())){
                    agenteElemento.click();
                    break;
                }
            }
        }
    }

    public Integer tamanioListaAgentesPorFiltro(String caracteresDigitados) {
        waitFor($(TXT_NOMBRE_AGENTE)).shouldBeCurrentlyVisible();
        waitFor($(TXT_NOMBRE_AGENTE)).shouldBeEnabled();
        enter(caracteresDigitados).into($(TXT_NOMBRE_AGENTE));
        $(TXT_NOMBRE_AGENTE).clear();

        // TODO: 08/06/2016 COmo usar el de el impl bien??? para hacer el assertion si esta vacio el combo
        //WebElementFacadeImpl pp = WebElementFacadeImpl()
        //then().shouldContainElements(CBO_NOMBRE_AGENTE);
        return findAll(By.xpath(CBO_NOMBRE_AGENTE)).size();
    }



    public void validarAutocompletarSeMuestreNombreYCodigoRespectivamente() {
        elemento(TXT_NOMBRE_AGENTE).click();
        // TODO: 08/06/2016 COmo usar el de el impl bien??? para hacer el assertion si esta vacio el combo
        List<WebElementFacade> listaNombresAgentesElement = findAll(By.xpath(CBO_NOMBRE_AGENTE));

        if (listaNombresAgentesElement.isEmpty()) {
            for (WebElementFacade agenteElemento : listaNombresAgentesElement) {
                String[] agenteArray = agenteElemento.getText().split("-");
                Integer codigo = Integer.parseInt(agenteArray[1].trim());
                String nombre = agenteArray[0];

                if (agenteArray.length == 2) {
                    AgenteModel agente = new AgenteModel(nombre, codigo);
                    listaAgentesModel.add(agente);
                }
            }
        }
        assertThat(listaNombresAgentesElement.size() , is(equalTo(listaAgentesModel.size())));

        LOGGER.info("NuevaCotizacionPage.validarAutocompletarSeMuestreNombreYCodigoRespectivamente");
    }

    public void validarAutocompletarNombreAgente() {
        waitFor($(TXT_NOMBRE_AGENTE)).shouldBeCurrentlyVisible();
        waitFor($(TXT_NOMBRE_AGENTE)).shouldBeEnabled();
        enter(getNombreAgente()).into($(TXT_NOMBRE_AGENTE));

        // TODO: 08/06/2016 COmo usar el de el impl bien??? para hacer el assertion si esta vacio el combo
        //WebElementFacadeImpl p = new WebElementFacadeImpl(getDriver(), null , getWaitForTimeout().in(TimeUnit.MILLISECONDS));
        //p.shouldContainElements(CBO_NOMBRE_AGENTE);

        elemento(CBO_NOMBRE_AGENTE).shouldContainText(getNombreAgente());
        seleccionarAgente();
        assertThat(elemento(TXT_NOMBRE_AGENTE).getValue(), containsString(getNombreAgente()));
        //assertThat(elemento(TXT_CODIGO_AGENTE).getValue(), containsString("5676"));
    }



    public WebElementFacade obtenerFechaCotizacionElemento() {
        return elemento(LABEL_FECHA_POR_DEFECTO);
    }

    public List<AgenteModel> getListaAgentesModel() {
        return listaAgentesModel;
    }

    public String obtenerTextoTituloPaginaWEF() {
        return elemento(TITULO_PAGINA).getText();
    }

    public String obtenerTextoLinkNombrePersonaWEF() {
        return elemento(LINK_NOMBRE_PERSONA).getText();
    }

    public String obtenerTextoLabelNombrePersonaWEF() {
        return elemento(LABEL_NOMBRE_PERSONA).getText();
    }

    public String getNombreAgente() {
        return nombreAgente;
    }

    public void setNombreAgente(String nombreAgente) {
        this.nombreAgente = nombreAgente;
    }
}
