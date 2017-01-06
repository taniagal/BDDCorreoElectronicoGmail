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

    public MultiplesAsesoresPage (WebDriver driver) {
        super(driver);
    }
    private static final String PATHENCABEZADO_INFORMACIONPOLIZA = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:ttlBar']";
    private static final String PATHENCABEZADOINFORMACIONDEINTEMEDIACION = ".//*[@id='ProducerCodeInfo_ExtPopup:ttlBar']";
    private static final String PATHTABLAENCABEZADOAGENTE= ".//*[@id='ProducerCodeInfo_ExtPopup:ProducerCodeInformationDV:ProducerInformationLV-body']";
    private static final String PATHTABLAAGENTE =".//*[@id='ProducerCodeInfo_ExtPopup:ProducerCodeInformationDV:ProducerInformationLV-body']/*/table/tbody/tr";

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


    @FindBy(xpath =".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    private WebElementFacade labelmensajeDeValidacion;

    public void adicionarAsesoresDeComision() {
        esperarObjetoClikeableServidor(PATHENCABEZADO_INFORMACIONPOLIZA);
        btnAdicionarAsesores.waitUntilPresent().click();
        esperarObjetoClikeableServidor(PATHENCABEZADOINFORMACIONDEINTEMEDIACION);
    }

    public void ingresarInformacionDelAsesor(Parametros parametros) {
        clicObjeto(btnEditar);
        esperarObjetoClikeableServidor(PATHENCABEZADOINFORMACIONDEINTEMEDIACION);
        ingresarCodigoAsesor(parametros);
    }
    public  void ingresarCodigoAsesor(Parametros parametros){

        for (int i = 1; i<=parametros.getListaAgentes().size(); i++) {
            esperarObjetoClikeableServidor(PATHTABLAENCABEZADOAGENTE);
            escribirTextoCeldaTabla(PATHTABLAAGENTE, i,2,parametros.getListaAgentes().get(i-1));
            escribirTextoCeldaTabla(PATHTABLAAGENTE, i,3, parametros.getListaPorcentaje().get(i-1));
            escribirTextoCeldaTabla(PATHTABLAAGENTE, i,4, parametros.getListaroles().get(i-1));

            if(i<parametros.getListaAgentes().size()){
                clicObjeto(btnAgregar);
            }
        }
        clicObjeto(btnAceptar);
        esperarObjetoClikeableServidor(PATHTABLAENCABEZADOAGENTE);
    }
    public void validacionMensaje(Parametros parametros){
        verificarMensaje(labelmensajeDeValidacion,parametros.getMensaje());
    }
    //TODO Metodos que pueden agregar a utileria de comando
    public void esperarObjetoClikeableServidor(String pathElemento) {

        WebElementFacade elemento;
        boolean ejecuto = false;
        int maximoEjecuciones = 120;
        int ejecuciones = 0;
        while(ejecuciones < maximoEjecuciones && !ejecuto) {
            this.waitUntil(500);
            try {
                elemento = this.getElemento(pathElemento);
                this.clicObjeto(elemento);
                ejecuto = true;
            }
            catch (Exception ex) {
            }
            ejecuciones = ejecuciones + 1;
        }

        if(!ejecuto) {
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
        return withTimeoutOf(55, TimeUnit.SECONDS).findAll(locator);
    }

    //TODO Metodos que pueden agregar a utileria de comando
    public String consultarTextoCeldaTabla(String path, int indiceFila, int indiceColumna) {
        WebElementFacade elemento = getElemento(path + "[" + indiceFila + "]" + "/td[" + indiceColumna + "]");
        return elemento.getText();
    }

    //TODO Metodos que pueden agregar a utileria de comando
    public void escribirTextoCeldaTabla(String path, int indiceFila, int indiceColumna,String texto) {

        WebElementFacade elemento = consultarElementoFilaColumna(path,indiceFila,indiceColumna);
        clicObjeto(elemento);
        borrarRegistroDatos(20);
        actions.sendKeys(texto).build().perform();
        esperarObjetoClikeableServidor(PATHTABLAENCABEZADOAGENTE);

    }
    //TODO Metodos que pueden agregar a utileria de comando
    public WebElementFacade consultarElementoFilaColumna(String path, int indiceFila, int indiceColumna) {
        return getElemento(path + "[" + indiceFila + "]" + "/td[" + indiceColumna + "]");
    }

    public void  borrarRegistroDatos(int cantidad){
        for(int i=0; i<cantidad;i++)
        {
            actions.sendKeys(Keys.BACK_SPACE).build().perform();
        }
    }

    public void validarRolAsesor(Parametros parametros) {
        int cantidaRol = consultarNumeroElementosTabla(PATHTABLAAGENTE);
        String rol = "";
        for(int i = 1; i <= cantidaRol; i ++){
           rol= consultarTextoCeldaTabla(PATHTABLAAGENTE,1,4);
           if(!rol.equals(parametros.getRol())){
               MatcherAssert.assertThat("No se encontro el rol", false);
           }
        }
    }
}
