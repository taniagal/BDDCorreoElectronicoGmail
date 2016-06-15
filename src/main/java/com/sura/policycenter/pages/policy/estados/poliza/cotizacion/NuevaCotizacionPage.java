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
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

// TODO: 15/06/2016 Pendiente refactor
public class NuevaCotizacionPage extends PageObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);
    private static Map<Integer, String> constantNames = null;

    // TODO: 08/06/2016 Validar con Liliana este formato
    private DateTimeFormatter formatter = DateTimeFormat.forPattern("MM/dd/yyyy");
    private List<AgenteModel> listaAgentesModel = null;
    private String nombreAgente;
    private List<WebElementFacade> listaDeProductosElement;

    public static final String TITULO_PAGINA = "//span[@id='NewSubmission:NewSubmissionScreen:ttlBar']";
    public static final String TITULO_PAGINA_SIGUIENTE = "//span[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:ttlBar']";
    public static final String TXT_NUMERO_CUENTA = "//input[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:Account-inputEl']";
    public static final String LINK_NOMBRE_PERSONA = "//div[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:AccountName-inputEl']";
    public static final String LABEL_NOMBRE_PERSONA = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:AccountName-labelCell']";
    public static final String LABEL_FECHA_POR_DEFECTO = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:DefaultPPEffDate-bodyEl']";
    public static final String TXT_NOMBRE_AGENTE = ".//input[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']";
    public static final String TXT_CODIGO_AGENTE = ".//input[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerCode-inputEl']";
    public static final String CBO_NOMBRE_AGENTE = ".//li[@role='option']";
    public static final String PRODUCTOS = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body']/div/table/tbody/tr";
    public static final String MENSAJE_EMERGENTE_DE_INFORMACION = "//div[contains(@id,'messagebox') and contains(@id,'displayfield') and contains(@id,'inputEl')]";
    public static final String MENSAJES_DE_INFORMACION = ".//*[@id='NewSubmission:NewSubmissionScreen:_msgs']/div";
    public static final String BTNS_DE_MENSAJE_EMERGENTE_DE_INFORMACION = "//div[contains(@id,'messagebox') and contains(@id,'toolbar') and contains(@id,'targetEl')]/a";

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
        }catch (AssertionError ae) {
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
            LOGGER.error("\nERROR050: Elemento de NuevaCotizacionPage no encontrado \nElemento: " + xpath + "\nTRACE: \n" + e);
        } catch (StaleElementReferenceException sere) {
            LOGGER.error("\nERROR051: Elemento de NuevaCotizacionPage no existe en el DOM \nElemento: " + xpath + "\nTRACE: \n" + sere);
        } catch (Exception e) {
            LOGGER.error("\nERROR: Error desconocido en: NuevaCotizacionPage.elemento \nElemento: " + xpath + "\nTRACE: \n" + e);
        }

        return elemento;
    }

    // TODO: 13/06/2016 Sacar este metodo y hacerlo reusable 
    public List<WebElementFacade> elementos(String xpath) {
        List<WebElementFacade> elementos = null;

        try {
            waitFor($(xpath)).shouldBeVisible();
            elementos = findAll(By.xpath(xpath));

        } catch (NoSuchElementException e) {
            LOGGER.error("\nERROR050: Elemento de NuevaCotizacionPage no encontrado \nElemento: " + xpath + "\nTRACE: \n" + e);
        } catch (StaleElementReferenceException sere) {
            LOGGER.error("\nERROR051: Elemento de NuevaCotizacionPage no existe en el DOM \nElemento: " + xpath + "\nTRACE: \n" + sere);
        } catch (Exception e) {
            LOGGER.error("\nERROR: Error desconocido en: NuevaCotizacionPage.elemento \nElemento: " + xpath + "\nTRACE: \n" + e);
        }

        return elementos;
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
        waitFor(1).second();
        setNombreAgente(nombreAgente);
        validarAutocompletarNombreAgente();
        seleccionarAgente();
        Boolean esFechaVisible = elemento(LABEL_FECHA_POR_DEFECTO).isVisible();
        System.out.println("NuevaCotizacionPage.seleccionarAgente -> FECHA VISIBLE : " + esFechaVisible);
    }

    // TODO: 13/06/2016 Sacar este metodo y hacerlo reusable
    public void seleccionarAgente() {
        /*elemento(TXT_NOMBRE_AGENTE).selectByVisibleText(getNombreAgente());
        System.out.println("NuevaCotizacionPage.seleccionarAgente");*/
        try {

            List<WebElementFacade> listaNombresAgentesElement = findAll(By.xpath(CBO_NOMBRE_AGENTE));
            //assertThat(listaNombresAgentesElement.size(), greaterThan(0));
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
        waitFor(1).second();
        //waitForTextToAppear($(TXT_NOMBRE_AGENTE), caracteresDigitados);
        //waitFor(ExpectedConditions.attributeContains($(TXT_NOMBRE_AGENTE),"value",caracteresDigitados));
        //waitForTextToAppear(caracteresDigitados);
        // TODO: 08/06/2016 COmo usar el de el impl bien??? para hacer el assertion si esta vacio el combo
        Integer tamanio = findAll(By.xpath(CBO_NOMBRE_AGENTE)).size();
        $(TXT_NOMBRE_AGENTE).clear();
        return tamanio;
    }

    // TODO: 13/06/2016 Sacar este metodo y hacerlo reusable
    public void validarExistenciaDeTodosLosProductosOrdenadosAlfabeticamente(ExamplesTable productosET) {

        List<String> listaProductos = new ArrayList<>(obtenerListaDeProductos());

        List<String> listaProductosOrdenados = new ArrayList<>(listaProductos);
        Collections.sort(listaProductosOrdenados);

        Boolean estaEnOrden = listaProductosOrdenados.equals(listaProductos);
        assertThat(estaEnOrden, equalTo(true));
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
        assertThat(listaDeProductosElement.size(), greaterThan(0));
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

        if (!listaNombresAgentesElement.isEmpty()) {
            for (WebElementFacade agenteElemento : listaNombresAgentesElement) {
                String[] agenteArray = agenteElemento.getText().split(">");
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

        seleccionarAgente();
        waitFor(1).second();

        // TODO: 10/06/2016 ACTIVAR
        //assertThat(elemento(TXT_CODIGO_AGENTE).getValue(), containsString("5676"));
    }


    public WebElementFacade obtenerFechaCotizacionElemento() {
        return elemento(LABEL_FECHA_POR_DEFECTO);
    }

    public List<AgenteModel> getListaAgentesModel() {
        return listaAgentesModel;
    }

    public String obtenerTextoTituloPaginaWEF(String pagina) {
        waitForPresenceOf(TITULO_PAGINA);
        waitForTextToAppear(pagina);
        String titulo;
        if (elemento(TITULO_PAGINA) == null ){
            titulo = elemento(TITULO_PAGINA_SIGUIENTE).getText();
        } else {
            titulo = elemento(TITULO_PAGINA).getText();
        }


        return titulo;
    }

    public String obtenerTextoLinkNombrePersonaWEF(String nombre2) {
        waitForRenderedElementsToBePresent(By.xpath(LINK_NOMBRE_PERSONA));
        waitForTextToAppear(nombre2);
        String nombre = this.getRenderedView().find(LINK_NOMBRE_PERSONA).getText();
        return nombre;
    }

    public String obtenerTextoLabelNombrePersonaWEF() {
        waitForRenderedElementsToBePresent(By.xpath(LABEL_NOMBRE_PERSONA));
        shouldBeVisible(elemento(LABEL_NOMBRE_PERSONA));
        String label = this.getRenderedView().find(LABEL_NOMBRE_PERSONA).getText();
        return label;
    }

    public String getNombreAgente() {
        return nombreAgente;
    }

    public void setNombreAgente(String nombreAgente) {
        this.nombreAgente = nombreAgente;
    }

    public String obtenerMensajeEmergenteDeInformacion(String mensaje) {
        //waitForTextToAppear("Nueva cotización");
        //waitForTextToAppear(mensaje);
        waitFor(1).second();
        return elemento(MENSAJE_EMERGENTE_DE_INFORMACION).getText();
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

    public Boolean validarOcurrenciaDeMensajeDeAplicacion(String mensajesApp){
        Boolean existeOcurrencia = Boolean.FALSE;
        String mensajeMostrado="";
        List<WebElementFacade> divsMensajes = elementos(MENSAJES_DE_INFORMACION);
        for (WebElementFacade div : divsMensajes) {
            mensajeMostrado = div.getText();
            if (mensajeMostrado.toLowerCase().contains(mensajesApp.toLowerCase())) {
                existeOcurrencia = Boolean.TRUE;
                break;
            }
        }

        return existeOcurrencia;
    }

}
