package com.sura.guidewire.policycenter.pages.poliza;


import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.Parametros;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MultiplesAsesoresPage extends PageUtil {
    private static final int CONSTANTE_UNO = 1;
    private static final int CONSTANTE_DOS = 2;
    private static final int CONSTANTE_CINCO = 5;
    private static final String PATH_ENCABEZADO_INFORMACIONPOLIZA = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:ttlBar']";
    private static final String PATH_ENCABEZADO_INFORMACION_DE_INTEMEDIACION = ".//*[@id='ProducerCodeInfo_ExtPopup:ttlBar']";
    private static final String PATH_TABLA_AGENTE = ".//*[@id='ProducerCodeInfo_ExtPopup:ProducerCodeInformationDV:ProducerInformationLV-body']/*/table/tbody/tr";
    private static final String PATH_CELDA = ".//*[@class='x-form-field x-form-text x-form-focus x-field-form-focus x-field-default-form-focus']";

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:ProducersLink']")
    private WebElementFacade botonAdicionarAsesores;
    @FindBy(xpath = ".//*[@id='ProducerCodeInfo_ExtPopup:Edit']")
    private WebElementFacade botonEditar;
    @FindBy(xpath = " .//*[@id='ProducerCodeInfo_ExtPopup:ProducerCodeInformationDV:ProducerInformationLV_tb:Add']")
    private WebElementFacade botonAgregar;
    @FindBy(xpath = ".//*[@id='ProducerCodeInfo_ExtPopup:Update']")
    private WebElementFacade botonAceptar;
    @FindBy(xpath = ".//*[@id='ProducerCodeInfo_ExtPopup:ProducerCodeInformationDV:ProducerInformationLV_tb:Remove']")
    private WebElementFacade botonQuitar;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    private WebElementFacade labelMensajeDeValidacion;

    public MultiplesAsesoresPage(WebDriver driver) {
        super(driver);
    }

    public void adicionarAsesoresDeComision() {
        esperarObjetoClikeableServidor(PATH_ENCABEZADO_INFORMACIONPOLIZA);
        clickearElemento(botonAdicionarAsesores);
        esperarObjetoClikeableServidor(PATH_ENCABEZADO_INFORMACION_DE_INTEMEDIACION);
    }

    public void ingresarInformacionDelAsesor(ExamplesTable parametros) {
        botonEditar.waitUntilPresent();
        clickearElemento(botonEditar);
        esperarObjetoClikeableServidor(PATH_ENCABEZADO_INFORMACION_DE_INTEMEDIACION);
        ingresarCodigoAsesor(parametros);
    }

    public void ingresarCodigoAsesor(ExamplesTable parametros) {
        WebElementFacade checkBoxIntermediarioUno = $(PATH_TABLA_AGENTE + "[1]/td[1]");
        clickearElemento(checkBoxIntermediarioUno);
        clickearElemento(botonQuitar);
        int i = 1;
        for (Map<String, String> dato : parametros.getRows()) {
            clickearElemento(botonAgregar);
            WebElementFacade checkBoxIntermediario = $(PATH_TABLA_AGENTE + "[" + i + "]/td[1]");
            WebElementFacade celdaRol = $(PATH_CELDA);
            checkBoxIntermediario.click();
            actions.sendKeys(Keys.TAB).build().perform();
            actions.sendKeys(Keys.ENTER).build().perform();
            esperarHasta(TIEMPO_300);
            actions.sendKeys(dato.get("codigoAsesor")).build().perform();
            esperarHasta(TIEMPO_200);
            actions.sendKeys(Keys.ENTER).build().perform();
            actions.sendKeys(Keys.TAB).build().perform();
            esperarHasta(TIEMPO_300);
            actions.sendKeys(dato.get("porcentaje")).build().perform();
            actions.sendKeys(Keys.TAB).build().perform();
            esperarHasta(TIEMPO_300);
            celdaRol.clear();
            actions.sendKeys(dato.get("rol")).build().perform();
            esperarHasta(TIEMPO_500);
            actions.sendKeys(Keys.TAB).build().perform();
            i++;
        }
        clickearElemento(botonAceptar);
    }
    public void validacionMensaje(Parametros parametros) {
        esperarObjetoClikeableServidor(PATH_ENCABEZADO_INFORMACION_DE_INTEMEDIACION);
        verificarMensaje(labelMensajeDeValidacion, parametros.getMensaje());
    }

    //TODO Metodos que pueden agregar a utileria de comando
    public void esperarObjetoClikeableServidor(String pathElemento) {
        WebElementFacade elemento;
        boolean ejecuto = false;
        int maximoEjecuciones = CONSTANTE_MAXIMO_EJECUCIONES;
        int ejecuciones = CONSTANTE_CUENTA_EJECUCIONES;
        while (ejecuciones < maximoEjecuciones && !ejecuto) {
            esperarHasta(TIEMPO_500);
            try {
                elemento = this.getElemento(pathElemento);
                this.clickearElemento(elemento);
                ejecuto = true;
            } catch (Exception ex) {
                LOGGER.info("Exception " + ex);
            }
            ejecuciones = ejecuciones + TIEMPO_1;
        }
        if (!ejecuto) {
            MatcherAssert.assertThat("No se pudo dar click a botón", false);
        }
    }

    public WebElementFacade getElemento(String locator) {
        return withTimeoutOf(1, TimeUnit.SECONDS).find(locator);
    }

    public int consultarNumeroElementosTabla(String pathTabla) {
        List<WebElementFacade> listaFacturas = this.getList(pathTabla);
        return listaFacturas.size();
    }

    public List<WebElementFacade> getList(String locator) {
        return withTimeoutOf(TIEMPO_30, TimeUnit.SECONDS).findAll(locator);
    }

    public String consultarTextoCeldaTabla(String path, int indiceFila, int indiceColumna) {
        WebElementFacade elemento = getElemento(path + "[" + indiceFila + "]" + "/td[" + indiceColumna + "]");
        return elemento.getText();
    }
    public void validarDatosDelAsesor(Parametros parametros) {
        if (parametros.getValidarDato().equals(Parametros.CODIGO_ASESOR)) {
            esperarObjetoClikeableServidor(PATH_ENCABEZADO_INFORMACION_DE_INTEMEDIACION);
            validarCodigoAsesor(parametros);
        } else if (parametros.getValidarDato().equals(Parametros.ROL)) {
            esperarObjetoClikeableServidor(PATH_ENCABEZADO_INFORMACION_DE_INTEMEDIACION);
            validarRolAsesor(parametros);
        }
    }

    public void validarRolAsesor(Parametros parametros) {
        int cantidaRol = consultarNumeroElementosTabla(PATH_TABLA_AGENTE);
        for (int i = 1; i <= cantidaRol; i++) {
            if (!consultarTextoCeldaTabla(PATH_TABLA_AGENTE, CONSTANTE_UNO, CONSTANTE_CINCO).equals(parametros.getRol())) {
                MatcherAssert.assertThat("No se encontro el rol", false);
            }
        }
    }

    public void validarCodigoAsesor(Parametros parametros) {
        int cantidaCodigo = validarExistenciaCodigoAsesor(parametros);
        if (cantidaCodigo > 1) {
            MatcherAssert.assertThat("Se encontraron varios codigo asesor:" + parametros.getCodigoAsesor(), false);
        }
    }

    public int validarExistenciaCodigoAsesor(Parametros parametros) {
        int codigoAsesorRepetido = 0;
        int cantidaCodigoAsesor = consultarNumeroElementosTabla(PATH_TABLA_AGENTE);
        for (int i = 1; i <= cantidaCodigoAsesor; i++) {
            if (consultarTextoCeldaTabla(PATH_TABLA_AGENTE, CONSTANTE_UNO, CONSTANTE_DOS).equals(parametros.getCodigoAsesor())) {
                codigoAsesorRepetido++;
            }
        }
        return codigoAsesorRepetido;
    }
}