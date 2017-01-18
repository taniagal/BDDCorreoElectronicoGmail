package com.sura.guidewire.policycenter.pages.poliza;


import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.Parametros;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MultiplesAsesoresPage extends PageUtil {
    private static final int CONSTANTE_UNO = 1;
    private static final int CONSTANTE_DOS = 2;
    private static final int CONSTANTE_TRES = 3;
    private static final int CONSTANTE_CUATRO = 4;
    protected static final int CONSTANTE_VEINTE = 20;
    private static final String PATH_ENCABEZADO_INFORMACIONPOLIZA = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:ttlBar']";
    private static final String PATH_ENCABEZADO_INFORMACION_DE_INTEMEDIACION = ".//*[@id='ProducerCodeInfo_ExtPopup:ttlBar']";
    private static final String PATH_TABLA_ENCABEZADO_AGENTE = ".//*[@id='ProducerCodeInfo_ExtPopup:ProducerCodeInformationDV:ProducerInformationLV-body']";
    private static final String PATH_TABLA_AGENTE = ".//*[@id='ProducerCodeInfo_ExtPopup:ProducerCodeInformationDV:ProducerInformationLV-body']/*/table/tbody/tr";

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:ProducersLink']")
    private WebElementFacade btnAdicionarAsesores;
    @FindBy(xpath = ".//*[@id='ProducerCodeInfo_ExtPopup:Edit']")
    private WebElementFacade btnEditar;
    @FindBy(xpath = " .//*[@id='ProducerCodeInfo_ExtPopup:ProducerCodeInformationDV:ProducerInformationLV_tb:Add']")
    private WebElementFacade btnAgregar;
    @FindBy(xpath = ".//*[@id='ProducerCodeInfo_ExtPopup:Update']")
    private WebElementFacade btnAceptar;
    @FindBy(xpath = ".//*[@id='ProducerCodeInfo_ExtPopup:ProducerCodeInformationDV:ProducerInformationLV_tb:Remove']")
    private WebElementFacade btnQuitar;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    private WebElementFacade labelmensajeDeValidacion;

    public MultiplesAsesoresPage(WebDriver driver) {
        super(driver);
    }

    public void adicionarAsesoresDeComision() {
        esperarObjetoClikeableServidor(PATH_ENCABEZADO_INFORMACIONPOLIZA);
        clicObjeto(btnAdicionarAsesores);
        esperarObjetoClikeableServidor(PATH_ENCABEZADO_INFORMACION_DE_INTEMEDIACION);
    }

    public void ingresarInformacionDelAsesor(Parametros parametros) {
        clicObjeto(btnEditar);
        esperarObjetoClikeableServidor(PATH_ENCABEZADO_INFORMACION_DE_INTEMEDIACION);
        ingresarCodigoAsesor(parametros);
    }

    public void ingresarCodigoAsesor(Parametros parametros) {

        for (int i = 1; i <= parametros.getListaAgentes().size(); i++) {
            esperarObjetoClikeableServidor(PATH_TABLA_ENCABEZADO_AGENTE);
            escribirTextoCeldaTabla(PATH_TABLA_AGENTE, i, CONSTANTE_DOS, parametros.getListaAgentes().get(i - CONSTANTE_UNO));
            escribirTextoCeldaTabla(PATH_TABLA_AGENTE, i, CONSTANTE_TRES, parametros.getListaPorcentaje().get(i - CONSTANTE_UNO));
            escribirTextoCeldaTabla(PATH_TABLA_AGENTE, i, CONSTANTE_CUATRO, parametros.getListaroles().get(i - CONSTANTE_UNO));

            if (i < parametros.getListaAgentes().size()) {
                clicObjeto(btnAgregar);
            }
        }
        clicObjeto(btnAceptar);
    }

    public void validacionMensaje(Parametros parametros) {
        esperarObjetoClikeableServidor(PATH_ENCABEZADO_INFORMACION_DE_INTEMEDIACION);
        verificarMensaje(labelmensajeDeValidacion, parametros.getMensaje());
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
                this.clicObjeto(elemento);
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

    //TODO Metodos que pueden agregar a utileria de comando
    public WebElementFacade getElemento(String locator) {
        return withTimeoutOf(1, TimeUnit.SECONDS).find(locator);
    }

    //TODO Metodos que pueden agregar a utileria de comando
    public void clicObjeto(WebElementFacade objeto) {
        objeto.waitUntilClickable().click();
    }

    //TODO Metodos que pueden agregar a utileria de comando
    public int consultarNumeroElementosTabla(String pathTabla) {
        List<WebElementFacade> listaFacturas = this.getList(pathTabla);
        return listaFacturas.size();
    }

    //TODO Metodos que pueden agregar a utileria de comando
    public List<WebElementFacade> getList(String locator) {
        return withTimeoutOf(TIEMPO_30, TimeUnit.SECONDS).findAll(locator);
    }

    //TODO Metodos que pueden agregar a utileria de comando
    public String consultarTextoCeldaTabla(String path, int indiceFila, int indiceColumna) {
        WebElementFacade elemento = getElemento(path + "[" + indiceFila + "]" + "/td[" + indiceColumna + "]");
        return elemento.getText();
    }

    //TODO Metodos que pueden agregar a utileria de comando
    public void escribirTextoCeldaTabla(String path, int indiceFila, int indiceColumna, String texto) {

        WebElementFacade elemento = consultarElementoFilaColumna(path, indiceFila, indiceColumna);
        clicObjeto(elemento);
        borrarRegistroDatos(CONSTANTE_VEINTE);
        actions.sendKeys(texto).build().perform();
        esperarObjetoClikeableServidor(PATH_TABLA_ENCABEZADO_AGENTE);

    }

    //TODO Metodos que pueden agregar a utileria de comando
    public WebElementFacade consultarElementoFilaColumna(String path, int indiceFila, int indiceColumna) {
        return getElemento(path + "[" + indiceFila + "]" + "/td[" + indiceColumna + "]");
    }

    public void borrarRegistroDatos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            actions.sendKeys(Keys.BACK_SPACE).build().perform();
        }
    }

    public void validarDatosDelAsesor(Parametros parametros) {

        if (parametros.getValidarDato().equals(Parametros.CODIGOASESOR)) {
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
            if (!consultarTextoCeldaTabla(PATH_TABLA_AGENTE, CONSTANTE_UNO, CONSTANTE_CUATRO).equals(parametros.getRol())) {
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
