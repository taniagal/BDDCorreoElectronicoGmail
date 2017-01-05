package com.sura.guidewire.policycenter.pages.poliza;


import com.sura.guidewire.policycenter.resources.PageUtil;
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
    private static final String PATHTABLAENCABEZADOAGENTE= ".//*[@id='ProducerCodeInfo_ExtPopup:ProducerCodeInformationDV:ProducerInformationLV-body']";
    private static final String PATHENCABEZADOINFORMACIONDEINTEMEDIACION = ".//*[@id='ProducerCodeInfo_ExtPopup:ttlBar']";
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:ProducersLink']")
    private WebElementFacade linkVerDetalles;
    @FindBy(xpath = ".//*[@id='ProducerCodeInfo_ExtPopup:Edit']")
    private WebElementFacade btnEditar;
    @FindBy(xpath = " .//*[@id='ProducerCodeInfo_ExtPopup:ProducerCodeInformationDV:ProducerInformationLV_tb:Add']")
    private WebElementFacade btnAgregar;
    @FindBy(xpath = ".//*[@id='ProducerCodeInfo_ExtPopup:ProducerCodeInformationDV:ProducerInformationLV_tb:Remove']")
    private WebElementFacade btnQuitar;
    private static final String PATHTABLAAGENTE =".//*[@id='ProducerCodeInfo_ExtPopup:ProducerCodeInformationDV:ProducerInformationLV-body']/*/table/tbody/tr";


    public void verDetalleMultipleAsesores() {
        linkVerDetalles.waitUntilPresent().click();
        esperarObjetoClikeableServidor(PATHENCABEZADOINFORMACIONDEINTEMEDIACION);
    }

    public void ingresarAsesores(List<String> listaCodigAsesor,List<String> listaPorcentaje, List<String> listaRol) {
        clicObjeto(btnEditar);
        esperarObjetoClikeableServidor(PATHENCABEZADOINFORMACIONDEINTEMEDIACION);
        ingresarCodigoAsesor(listaCodigAsesor,listaPorcentaje,listaRol);
    }
    public  void ingresarCodigoAsesor(List<String> listaCodigAsesor,List<String> listaPorcentaje, List<String> listaRol){
        String porcentaje = listaPorcentaje.get(0);
        escribirTextoCeldaTabla(PATHTABLAAGENTE,1,3,porcentaje);
        escribirTextoCeldaTabla(PATHTABLAAGENTE, 1, 4, listaRol.get(0));
        for (int i = 2; i<=listaCodigAsesor.size()-1; i++) {
            clicObjeto(btnAgregar);
            escribirTextoCeldaTabla(PATHTABLAAGENTE,i,2,listaCodigAsesor.get(i-1));
            escribirTextoCeldaTabla(PATHTABLAAGENTE, i, 3, listaPorcentaje.get(i-1));
            escribirTextoCeldaTabla(PATHTABLAAGENTE, i, 4, listaRol.get(1));

        }
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
    public void escribirTextoCeldaTabla(String path, int indiceFila, int indiceColumna,String texto) {
        WebElementFacade elemento = getElemento(path + "[" + indiceFila + "]" + "/td[" + indiceColumna + "]");
        clicObjeto(elemento);
        borrarRegistroDatos(15);
        actions.sendKeys(texto).build().perform();
        esperarObjetoClikeableServidor(PATHTABLAENCABEZADOAGENTE);

    }
    public void  borrarRegistroDatos(int cantidad){
        for(int i=0; i<cantidad;i++)
        {
            actions.sendKeys(Keys.BACK_SPACE).build().perform();
        }
    }

}
