package com.sura.policycenter.selenium.pages.colectivas;


import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.steps.StepInterceptor;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BusquedaDeRiesgosPolizaColectivaPage extends PageObject {
    @FindBy(xpath = ".//*[@id='AccountFile_CollectivePolicy_Ext:ttlBar']")
    WebElementFacade lblTransacPolizaColectiva;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:AddRisksButton']")
    WebElementFacade btnRiesgos;
    @FindBy(xpath = ".//*[@id='CollectivePolicyPARisksPopup:search_Button']")
    WebElementFacade btnBuscaPlaca;
    @FindBy(xpath = ".//*[@id='CollectivePolicyPARisksPopup:search-inputEl']")
    WebElementFacade txtPlaca;
    @FindBy(xpath = ".//*[@id='CollectivePolicyPARisksPopup:_msgs']")
    WebElementFacade lblMensaje;
    @FindBy(xpath = ".//*[@id='CollectivePolicyPARisksPopup:ListRisksButton-btnInnerEl']")
    WebElementFacade btnListarRiesgos;


    Commons cmm = new Commons(getDriver());

    private static final String TABLAXPATH = ".//*[@id='AccountFile_CollectivePolicy_Ext:";
    private static final String TABLAXPATHFILTRO = ".//*[@id='CollectivePolicyPARisksPopup:RisksLV-body']/div/table/tbody/tr/td[";
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    public BusquedaDeRiesgosPolizaColectivaPage(WebDriver driver) {
        super(driver);
    }

    private List<WebElementFacade> getListaPoliza() {
        List<WebElementFacade> numerosPoliza;
        numerosPoliza = withTimeoutOf(1, TimeUnit.SECONDS).findAll(".//*[@id='AccountFile_CollectivePolicy_Ext:1-body']/div/table/tbody/tr/td[2]");
        return numerosPoliza;
    }

    public void buscaPolizaColectivaEnTabla(String numPolizaColectiva) {
        int i = 0;
        waitFor(lblTransacPolizaColectiva).waitUntilVisible();
        if (!getListaPoliza().isEmpty()) {
            for (WebElementFacade numPolizaTabla : getListaPoliza()) {
                if (numPolizaColectiva.equals(numPolizaTabla.getText())) {
                    WebElementFacade poliza = findBy(TABLAXPATH + i + ":PolicyNumber']");
                    poliza.click();
                    break;
                }
                i++;
            }
        }
    }

    private List<WebElementFacade> getResultadoPlaca() {
        List<WebElementFacade> listaPlaca;
        listaPlaca = withTimeoutOf(1, TimeUnit.SECONDS).findAll(".//*[@id='CollectivePolicyPARisksPopup:RisksLV-body']/div/table/tbody/tr/td");
        return listaPlaca;
    }

    private List<WebElementFacade> getListaFiltroPlaca() {
        List<WebElementFacade> listaPlaca;
        listaPlaca = withTimeoutOf(10, TimeUnit.SECONDS).findAll(".//*[@id='CollectivePolicyPARisksPopup:RisksLV-body']/div/table/tbody/tr/td[1]");
        return listaPlaca;
    }

    public void validaResultadoRiesgos(ExamplesTable infoRiesgo) {
        Map<String, String> datoRiesgo = infoRiesgo.getRow(0);
        int i = 0;
        if (!getListaFiltroPlaca().isEmpty()) {
            for (WebElementFacade numPolizaTabla : getListaFiltroPlaca()) {
                if (datoRiesgo.get("placa").equals(numPolizaTabla.getText())) {
                    MatcherAssert.assertThat("la clase de vehiculo no pertenece al consultado", datoRiesgo.get("claseVehiculo").equals(getResultadoPlaca().get(1).getText()));
                    MatcherAssert.assertThat("El modelo no pertenece al consultado", datoRiesgo.get("modelo").equals(getResultadoPlaca().get(2).getText()));
                    MatcherAssert.assertThat("La marca no pertenece a la consultada", datoRiesgo.get("marca").equals(getResultadoPlaca().get(3).getText()));
                    MatcherAssert.assertThat("La linea no pertenece a la consultada", datoRiesgo.get("linea").equals(getResultadoPlaca().get(4).getText()));
                    break;
                }
                i++;
            }
        }
    }

    public void validaBotonListarRiesgos() {
        cmm.waitUntil(2000);
        MatcherAssert.assertThat("No contiene los 5 registros", getListaFiltroPlaca().size() == 5);
    }

    public void ValidaMensaje(String mensaje){
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(lblMensaje).waitUntilPresent();
        MatcherAssert.assertThat("Error: No aparecio mensaje de advertencia en el filtro", lblMensaje.getText().contains(mensaje));
    }

    public void clicRiesgos() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnRiesgos).waitUntilPresent();
        btnRiesgos.click();
    }

    public void ingresePlaca(String placa) {
        txtPlaca.sendKeys(placa);
        btnBuscaPlaca.click();
        cmm.waitUntil(1000);
    }

    public void listarRiesgos(){
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnListarRiesgos).waitUntilEnabled();
        btnListarRiesgos.click();
    }


}
