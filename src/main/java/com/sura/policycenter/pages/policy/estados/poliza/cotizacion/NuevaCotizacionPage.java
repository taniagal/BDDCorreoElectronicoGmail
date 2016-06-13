package com.sura.policycenter.pages.policy.estados.poliza.cotizacion;

import com.sura.policycenter.model.AgenteModel;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.jbehave.core.model.ExamplesTable;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class NuevaCotizacionPage extends PageObject implements Serializable {
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
    public static final String PRODUCTOS = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body']/div/table/tbody/tr";

    public NuevaCotizacionPage() {

    }

    public Boolean buscarInputHabilitadoEnElemento(String xpath) {
        WebElementFacade input = null;
        Boolean elementoEncontrado;
        try {
            input = elemento(xpath).findBy(By.tagName("input"));
            input.shouldBeEnabled();
            elementoEncontrado = Boolean.TRUE;
        } catch (NoSuchElementException nosee) {
            LOGGER.info("Elemento input no encontrado: " + nosee);
            elementoEncontrado = Boolean.FALSE;
        } catch (StaleElementReferenceException sere) {
            LOGGER.info("StaleElementReferenceException : " + sere);
            elementoEncontrado = Boolean.FALSE;
        }

        return elementoEncontrado;
    }

    public WebElementFacade elemento(String xpath) {
        WebElementFacade elemento = null;

        try {
            waitFor($(xpath)).shouldBeVisible();
            elemento = element(find(By.xpath(xpath)));

        } catch (NoSuchElementException e) {
            throw new NoSuchElementException(" \nERROR050: Elemento de NuevaCotizacionPage no encontrado \nElemento: " + xpath + "\nTRACE: \n" + e);
        } catch (StaleElementReferenceException sere){
            throw new StaleElementReferenceException(" \nERROR051: Elemento de NuevaCotizacionPage no existe en el DOM \nElemento: " + xpath + "\nTRACE: \n" + sere);
        } catch (Exception e) {
            LOGGER.error("\nERROR: Error desconocido en: NuevaCotizacionPage.elemento \nElemento: " + xpath + "\nTRACE: \n" + e);
        }

        return elemento;
    }

    public Boolean esFechaCotizacionHOY() {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LABEL_FECHA_POR_DEFECTO)));
        //waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LABEL_FECHA_POR_DEFECTO)));
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
        Boolean esFechaVisible = elemento(LABEL_FECHA_POR_DEFECTO).isVisible();
        System.out.println("NuevaCotizacionPage.seleccionarAgente -> FECHA VISIBLE : " + esFechaVisible);
    }

    public void seleccionarAgente() {
        /*elemento(TXT_NOMBRE_AGENTE).selectByVisibleText(getNombreAgente());
        System.out.println("NuevaCotizacionPage.seleccionarAgente");*/
       try {

            List<WebElementFacade> listaNombresAgentesElement = findAll(By.xpath(CBO_NOMBRE_AGENTE));
            if (!listaNombresAgentesElement.isEmpty()) {
                for (WebElementFacade agenteElemento : listaNombresAgentesElement) {
                    if (agenteElemento.containsText(getNombreAgente())) {
                        agenteElemento.click();
                        break;
                    }
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Integer tamanioListaAgentesPorFiltro(String caracteresDigitados) {
        waitFor($(TXT_NOMBRE_AGENTE)).shouldBeCurrentlyVisible();
        waitFor($(TXT_NOMBRE_AGENTE)).shouldBeEnabled();
        enter(caracteresDigitados).into($(TXT_NOMBRE_AGENTE));
        // TODO: 08/06/2016 COmo usar el de el impl bien??? para hacer el assertion si esta vacio el combo
        Integer tamanio = findAll(By.xpath(CBO_NOMBRE_AGENTE)).size();
        $(TXT_NOMBRE_AGENTE).clear();
        return tamanio;
    }

    public void validarExistenciaDeTodosLosProductosOrdenadosAlfabeticamente(ExamplesTable productosET) {
        // TODO: 08/06/2016 COmo usar el de el impl bien??? para hacer el assertion si esta vacio el combo
        List<WebElementFacade> listaDeProductosElement = findAll(By.xpath(PRODUCTOS));
        assertThat(listaDeProductosElement.size(), greaterThan(0));
        listaAgentesModel = new ArrayList<>();
        List<String> listaProductos = new ArrayList<>();

        for (WebElementFacade producto : listaDeProductosElement) {
            String productoString = producto.findBy("td[2]").getText();
            listaProductos.add(productoString);
        }
        List<String> listaProductosOrdenados = new ArrayList<>(listaProductos);
        Collections.sort(listaProductosOrdenados);

        Boolean estaEnOrden = listaProductosOrdenados.equals(listaProductos);
        assertThat(estaEnOrden, equalTo(true));
    }


    public void validarAutocompletarSeMuestreNombreYCodigoRespectivamente() {
        elemento(TXT_NOMBRE_AGENTE).click();
        // TODO: 08/06/2016 COmo usar el de el impl bien??? para hacer el assertion si esta vacio el combo
        List<WebElementFacade> listaNombresAgentesElement = findAll(By.xpath(CBO_NOMBRE_AGENTE));

        if (!listaNombresAgentesElement.isEmpty()) {
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
        assertThat(listaNombresAgentesElement.size(), is(equalTo(listaAgentesModel.size())));

        LOGGER.info("NuevaCotizacionPage.validarAutocompletarSeMuestreNombreYCodigoRespectivamente");
    }


    public void validarAutocompletarNombreAgente() {
        waitFor(elemento(TXT_NOMBRE_AGENTE)).shouldBeCurrentlyVisible();
        waitFor(elemento(TXT_NOMBRE_AGENTE)).shouldBeEnabled();
        elemento(TXT_NOMBRE_AGENTE).type(getNombreAgente());

        waitForTextToAppear("DELIMA MEDELLIN - 5676");
        shouldContainText("DELIMA MEDELLIN - 5676");

        seleccionarAgente();

        waitForTextToAppear("Fecha efectiva de cotización");
        shouldContainText("Fecha efectiva de cotización");

        // TODO: 10/06/2016 ACTIVAR
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
