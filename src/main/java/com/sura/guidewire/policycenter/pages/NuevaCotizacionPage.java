package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.util.PageUtil;
import com.sura.guidewire.policycenter.util.model.AgenteModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.slf4j.LoggerFactory;

// TODO: 15/06/2016 Pendiente refactor
public class NuevaCotizacionPage extends PageObject {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    private static final DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy");
    private List<AgenteModel> listaAgentesModel = null;
    private String nombreAgente;
    private List<WebElementFacade> listaDeProductosElement;

    @FindBy (xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:DefaultPPEffDate-inputEl']")
    WebElementFacade labelFecha;

    public static final String TITULO_PAGINA = "//span[@id='NewSubmission:NewSubmissionScreen:ttlBar']";
    public static final String TITULO_PAGINA_SIGUIENTE = "//span[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:ttlBar']";
    public static final String TXT_NUMERO_CUENTA = "//input[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:Account-inputEl']";
    public static final String LINK_NOMBRE_PERSONA = "//div[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:AccountName-inputEl']";
    public static final String LABEL_NOMBRE_PERSONA = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:AccountName-labelCell']";
    public static final String LABEL_FECHA_POR_DEFECTO = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:DefaultPPEffDate-inputEl']";
    public static final String TXT_NOMBRE_AGENTE = ".//input[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']";
    public static final String TXT_CODIGO_AGENTE = ".//input[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerCode-inputEl']";
    public static final String CBO_NOMBRE_AGENTE = ".//li[@role='option']";
    public static final String PRODUCTOS = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV-body']/div/table/tbody/tr";
    public static final String MENSAJE_EMERGENTE_DE_INFORMACION = "//div[contains(@id,'messagebox') and contains(@id,'displayfield') and contains(@id,'inputEl')]";
    public static final String MENSAJES_DE_INFORMACION = ".//*[@id='NewSubmission:NewSubmissionScreen:_msgs']/div";
    public static final String BTNS_DE_MENSAJE_EMERGENTE_DE_INFORMACION = "//div[contains(@id,'messagebox') and contains(@id,'toolbar') and contains(@id,'targetEl')]/a";
    public static final String TRACE = "\nTRACE: \n";
    protected static final int WAIT_TIME_15 = 15;
    protected static final int WAIT_TIME_2000 = 2000;


    // TODO: 13/06/2016 Sacar este metodo y hacerlo reusable
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
        } catch (AssertionError ae) {
            LOGGER.info("StaleElementReferenceException : " + ae);
            elementoEncontrado = Boolean.FALSE;
        }

        return elementoEncontrado;
    }

    // TODO: 13/06/2016 Sacar este metodo y hacerlo reusable
    public WebElementFacade elemento(String xpath) {
        WebElementFacade elemento = null;

        try {
            waitFor($(xpath)).shouldBeVisible();
            elemento = element(find(By.xpath(xpath)));

        } catch (NoSuchElementException e) {
            LOGGER.info("\nERROR050: Elemento de NuevaCotizacionPage no encontrado \nElemento: " + xpath + TRACE + e);
        } catch (StaleElementReferenceException sere) {
            LOGGER.info("\nERROR051: Elemento de NuevaCotizacionPage no existe en el DOM \nElemento: " + xpath + TRACE + sere);
        } catch (Exception e) {
            LOGGER.info("\nERROR: Error desconocido en: NuevaCotizacionPage.elemento \nElemento: " + xpath + TRACE + e);
        }

        return elemento;
    }

    // TODO: 13/06/2016 Sacar este metodo y hacerlo reusable 
    public List<WebElementFacade> elementos(String xpath) {
        List<WebElementFacade> elementos = null;
        try {
            waitFor($(xpath)).shouldBeVisible();
            elementos = withTimeoutOf(WAIT_TIME_15, TimeUnit.SECONDS).findAll(By.xpath(xpath));

        } catch (NoSuchElementException e) {
            LOGGER.info("\nERROR050: Elemento de NuevaCotizacionPage no encontrado \nElemento: " + xpath + TRACE + e);
        } catch (StaleElementReferenceException sere) {
            LOGGER.info("\nERROR051: Elemento de NuevaCotizacionPage no existe en el DOM \nElemento: " + xpath + TRACE + sere);
        } catch (Exception e) {
            LOGGER.info("\nERROR: Error desconocido en: NuevaCotizacionPage.elemento \nElemento: " + xpath + TRACE + e);
        }

        return elementos;
    }

    public Boolean esFechaCotizacionHOY() {
        labelFecha.waitUntilPresent();
        return esFechaPorDefectoHOY(labelFecha);
    }

    public Boolean esFechaPorDefectoHOY(WebElementFacade fecha) {
        try {
            if (LocalDate.now().isEqual(formatter.parseDateTime(fecha.getText()).toLocalDate())) {
                return Boolean.TRUE;
            }
        }catch (StaleElementReferenceException e){
            LOGGER.info("StaleElementReferenceException " + e);
            PageUtil.waitUntil(WAIT_TIME_2000);
            if (LocalDate.now().isEqual(formatter.parseDateTime(fecha.getText()).toLocalDate())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public Boolean esFechaEditable() {
        return buscarInputHabilitadoEnElemento(LABEL_FECHA_POR_DEFECTO);
    }

    public void seleccionarAgente(String nombreAgente) {
        waitFor(1).second();
        setNombreAgente(nombreAgente);
        validarAutocompletarNombreAgente();
        seleccionarAgente();
        Boolean esFechaVisible = elemento(LABEL_FECHA_POR_DEFECTO).isVisible();
        LOGGER.info("NuevaCotizacionPage.seleccionarAgente -> FECHA VISIBLE : " + esFechaVisible);
    }

    // TODO: 13/06/2016 Sacar este metodo y hacerlo reusable
    public void seleccionarAgente() {
        try {

            List<WebElementFacade> listaNombresAgentesElement = findAll(By.xpath(CBO_NOMBRE_AGENTE));
            for (WebElementFacade agenteElemento : listaNombresAgentesElement) {
                if (agenteElemento.containsText(getNombreAgente())) {
                    agenteElemento.click();
                    break;
                }
            }


        } catch (Exception e) {
            LOGGER.error("ERROR EN NUEVACOTIZACIONPAGE TRAZA:" +e);
        }
    }

    public Integer tamanioListaAgentesPorFiltro(String caracteresDigitados) {

        waitFor($(TXT_NOMBRE_AGENTE)).shouldBeCurrentlyVisible();
        waitFor($(TXT_NOMBRE_AGENTE)).shouldBeEnabled();
        enter(caracteresDigitados).into($(TXT_NOMBRE_AGENTE));
        waitFor(1).second();

        // TODO: 08/06/2016 COmo usar el de el impl bien??? para hacer el assertion si esta vacio el combo
        Integer tamanio = findAll(By.xpath(CBO_NOMBRE_AGENTE)).size();
        $(TXT_NOMBRE_AGENTE).clear();
        return tamanio;
    }

    // TODO: 13/06/2016 Sacar este metodo y hacerlo reusable
    public void validarLosProductosOrdenadosAlfabeticamente() {

        List<String> listaProductos = new ArrayList<>(obtenerListaDeProductos());

        List<String> listaProductosOrdenados = new ArrayList<>(listaProductos);
        Collections.sort(listaProductosOrdenados);

        Boolean estaEnOrden = listaProductosOrdenados.equals(listaProductos);
        MatcherAssert.assertThat(estaEnOrden, CoreMatchers.equalTo(true));
    }

    public void seleccionarProducto(String nombreDeProducto) {
        List<String> listaProductos = new ArrayList<>(obtenerListaDeProductos());
        Integer indiceDelProducto = listaProductos.indexOf(nombreDeProducto);
        WebElementFacade producto = listaDeProductosElement.get(indiceDelProducto);
        WebElementFacade btnSeleccionar = producto.findBy("td/div/a");
        btnSeleccionar.click();
    }


    // TODO: 13/06/2016 Sacar este metodo y hacerlo reusable
    public List<String> obtenerListaDeProductos() {
        // TODO: 08/06/2016 COmo usar el de el impl bien??? para hacer el assertion si esta vacio el combo
        listaDeProductosElement = elementos(PRODUCTOS);
        MatcherAssert.assertThat(listaDeProductosElement.size(), Matchers.greaterThan(0));
        listaAgentesModel = new ArrayList<>();
        List<String> listaProductos = new ArrayList<>();

        for (WebElementFacade producto : listaDeProductosElement) {
            String productoString = producto.findBy("td[2]").getText();
            listaProductos.add(productoString);
        }
        return listaProductos;
    }


    // TODO: 13/06/2016 Sacar este metodo y hacerlo reusable
    public void validarAutocompletarSeMuestreNombreYCodigoRespectivamente() {
        elemento(TXT_NOMBRE_AGENTE).click();
        // TODO: 08/06/2016 COmo usar el de el impl bien??? para hacer el assertion si esta vacio el combo
        List<WebElementFacade> listaNombresAgentesElement = findAll(By.xpath(CBO_NOMBRE_AGENTE));
        listaAgentesModel = new ArrayList<AgenteModel>();

        if (!listaNombresAgentesElement.isEmpty()) {
            for (WebElementFacade agenteElemento : listaNombresAgentesElement) {
                String[] agenteArray = agenteElemento.getText().split(">");
                String codigo = agenteArray[1];
                String nombre = agenteArray[0];

                if (agenteArray.length == 2) {
                    AgenteModel agente = new AgenteModel(nombre, codigo);
                    listaAgentesModel.add(agente);
                }
            }
        }
        MatcherAssert.assertThat(listaNombresAgentesElement.size(), CoreMatchers.is(CoreMatchers.equalTo(listaAgentesModel.size())));

        LOGGER.info("NuevaCotizacionPage.validarAutocompletarSeMuestreNombreYCodigoRespectivamente");
    }


    public void validarAutocompletarNombreAgente() {
        waitFor(elemento(TXT_NOMBRE_AGENTE)).shouldBeCurrentlyVisible();
        waitFor(elemento(TXT_NOMBRE_AGENTE)).shouldBeEnabled();
        elemento(TXT_NOMBRE_AGENTE).type(getNombreAgente());

        seleccionarAgente();
        waitFor(1).second();
    }


    public WebElementFacade obtenerFechaCotizacionElemento() {
        fluent().await().atMost(waitForTimeoutInMilliseconds(), TimeUnit.MILLISECONDS);
        return elemento(LABEL_FECHA_POR_DEFECTO);
    }

    public String obtenerTextoTituloPaginaWEF(String pagina) {
        waitForPresenceOf(TITULO_PAGINA);
        waitForTextToAppear(pagina);
        String titulo;
        if (elemento(TITULO_PAGINA) == null) {
            titulo = elemento(TITULO_PAGINA_SIGUIENTE).getText();
        } else {
            titulo = elemento(TITULO_PAGINA).getText();
        }


        return titulo;
    }

    public String obtenerTextoLinkNombrePersonaWEF(String nombre2) {
        waitForRenderedElementsToBePresent(By.xpath(LINK_NOMBRE_PERSONA));
        waitForTextToAppear(nombre2);
        return this.getRenderedView().find(LINK_NOMBRE_PERSONA).getText();
    }

    public String obtenerTextoLabelNombrePersonaWEF() {
        waitForRenderedElementsToBePresent(By.xpath(LABEL_NOMBRE_PERSONA));
        shouldBeVisible(elemento(LABEL_NOMBRE_PERSONA));
        return this.getRenderedView().find(LABEL_NOMBRE_PERSONA).getText();
    }

    public String getNombreAgente() {
        return nombreAgente;
    }

    public void setNombreAgente(String nombreAgente) {
        this.nombreAgente = nombreAgente;
    }

    public String obtenerMensajeEmergenteDeInformacion() {
        waitFor(1).second();
        WebElementFacade mensaje = elemento(MENSAJE_EMERGENTE_DE_INFORMACION).waitUntilVisible();
        mensaje.shouldBeVisible();
        return mensaje.getText();
    }

    public void seleccionarBtn(String nombreBtn) {
        List<WebElementFacade> botonesListElement = elementos(BTNS_DE_MENSAJE_EMERGENTE_DE_INFORMACION);

        for (WebElementFacade btnElement : botonesListElement) {
            if (btnElement.isVisible() && btnElement.getText().equals(nombreBtn)) {
                btnElement.click();
            }
        }

    }

    public Boolean validarExistenciaDeLosBotonesVisibles(String[] arrayBtns) {
        List<WebElementFacade> botonesListElement = elementos(BTNS_DE_MENSAJE_EMERGENTE_DE_INFORMACION);
        Integer contador = 0;
        for (String btnValue : arrayBtns) {
            for (WebElementFacade btnElement : botonesListElement) {
                if (btnElement.isVisible() && btnElement.getText().equals(btnValue)) {
                    contador++;
                }
            }
        }
        if (arrayBtns.length == contador) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public Boolean validarOcurrenciaDeMensajeDeAplicacion(String mensajesApp) {

        Boolean existeOcurrencia = Boolean.FALSE;
        String mensajeMostrado;
        try {
            List<WebElementFacade> divsMensajes = elementos(MENSAJES_DE_INFORMACION);

            for (WebElementFacade div : divsMensajes) {
                mensajeMostrado = div.getText();
                for (String etiqueta : mensajesApp.split("-")) {
                    if (mensajeMostrado.toLowerCase().contains(etiqueta)) {
                        existeOcurrencia = Boolean.TRUE;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error("NO EXISTE MENSAJE DE ERROR " + e);
        }


        return existeOcurrencia;
    }

}
