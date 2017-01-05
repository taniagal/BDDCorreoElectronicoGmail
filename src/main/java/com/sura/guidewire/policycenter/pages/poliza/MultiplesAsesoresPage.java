package com.sura.guidewire.policycenter.pages.poliza;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MultiplesAsesoresPage extends PageUtil {

    public MultiplesAsesoresPage (WebDriver driver) {
        super(driver);
    }
    private static final String PATHENCABEZADOINFORMACIONDEINTEMEDIACION = ".//*[@id='ProducerCodeInfo_ExtPopup:ttlBar']";
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:ProducersLink']")
    private WebElementFacade linkVerDetalles;
    @FindBy(xpath = ".//*[@id='ProducerCodeInfo_ExtPopup:Edit']")
    private WebElementFacade btnEditar;
    @FindBy(xpath = " .//*[@id='ProducerCodeInfo_ExtPopup:ProducerCodeInformationDV:ProducerInformationLV_tb:Add']")
    private WebElementFacade btnAgregarAgente;
    @FindBy(xpath = ".//*[@id='ProducerCodeInfo_ExtPopup:ProducerCodeInformationDV:ProducerInformationLV_tb:Remove']")
    private WebElementFacade btnQuitarAgente;
    private static final String PATHTABLAAGENTE =".//*[@id='ProducerCodeInfo_ExtPopup:ProducerCodeInformationDV:ProducerInformationLV-body']/*/table/tbody/tr";


    public void verDetalleMultipleAsesores() {
        linkVerDetalles.waitUntilPresent().click();
        esperarObjetoClikeableServidor(PATHENCABEZADOINFORMACIONDEINTEMEDIACION);
    }

    public void ingresarAsesores(List<String> listaAgentes,List<String> listaPorcentaje) {
        clicObjeto(btnEditar);




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
    public void clicFilaTabla(String path, int indice) {
        WebElementFacade elemento = getElemento(path + "[" + indice + "]");
        this.clicObjeto(elemento);
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
}
