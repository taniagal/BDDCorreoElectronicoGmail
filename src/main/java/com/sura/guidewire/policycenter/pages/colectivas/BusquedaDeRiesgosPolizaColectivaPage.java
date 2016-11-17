package com.sura.guidewire.policycenter.pages.colectivas;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BusquedaDeRiesgosPolizaColectivaPage extends PageUtil {
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

    private static final String TABLAXPATH = ".//*[@id='AccountFile_CollectivePolicy_Ext:";
    protected static final int CONSTANTE_5 = 5;
    protected static final int CONSTANTE_4 = 4;
    protected static final int CONSTANTE_3 = 3;
    protected static final int CONSTANTE_2 = 2;
    protected static final int CONSTANTE_1 = 1;

    public BusquedaDeRiesgosPolizaColectivaPage(WebDriver driver) {
        super(driver);
    }

    private List<WebElementFacade> getListaPoliza() {
        List<WebElementFacade> numerosPoliza;
        numerosPoliza = withTimeoutOf(WAIT_TIME_1, TimeUnit.SECONDS).findAll(".//*[@id='AccountFile_CollectivePolicy_Ext:1-body']/div/table/tbody/tr/td[2]");
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
        listaPlaca = withTimeoutOf(WAIT_TIME_1, TimeUnit.SECONDS).findAll(".//*[@id='CollectivePolicyPARisksPopup:RisksLV-body']/div/table/tbody/tr/td");
        return listaPlaca;
    }

    private List<WebElementFacade> getListaFiltroPlaca() {
        List<WebElementFacade> listaPlaca;
        listaPlaca = withTimeoutOf(WAIT_TIME_10, TimeUnit.SECONDS).findAll(".//*[@id='CollectivePolicyPARisksPopup:RisksLV-body']/div/table/tbody/tr/td[1]");
        return listaPlaca;
    }

    public void validaResultadoRiesgos(ExamplesTable infoRiesgo) {
        Map<String, String> datoRiesgo = infoRiesgo.getRow(0);
        int i = 0;
        if (!getListaFiltroPlaca().isEmpty()) {
            for (WebElementFacade numPolizaTabla : getListaFiltroPlaca()) {
                if (datoRiesgo.get("placa").equals(numPolizaTabla.getText())) {
                    MatcherAssert.assertThat("la clase de vehiculo no pertenece al consultado", datoRiesgo.get("claseVehiculo").equals(getResultadoPlaca().get(CONSTANTE_1).getText()));
                    MatcherAssert.assertThat("El modelo no pertenece al consultado", datoRiesgo.get("modelo").equals(getResultadoPlaca().get(CONSTANTE_2).getText()));
                    MatcherAssert.assertThat("La marca no pertenece a la consultada", datoRiesgo.get("marca").equals(getResultadoPlaca().get(CONSTANTE_3).getText()));
                    MatcherAssert.assertThat("La linea no pertenece a la consultada", datoRiesgo.get("linea").equals(getResultadoPlaca().get(CONSTANTE_4).getText()));
                    break;
                }
                i++;
            }
        }
    }

    public void validaBotonListarRiesgos() {
        waitUntil(WAIT_TIME_2000);
        MatcherAssert.assertThat("No contiene los 5 registros", getListaFiltroPlaca().size() == CONSTANTE_5);
    }

    public void ValidaMensaje(String mensaje){
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(lblMensaje).waitUntilPresent();
        MatcherAssert.assertThat("Error: No aparecio mensaje de advertencia en el filtro", lblMensaje.getText().contains(mensaje));
    }

    public void clicRiesgos() {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(btnRiesgos).waitUntilPresent();
        btnRiesgos.click();
    }

    public void ingresePlaca(String placa) {
        txtPlaca.sendKeys(placa);
        btnBuscaPlaca.click();
        waitUntil(WAIT_TIME_1000);
    }

    public void listarRiesgos(){
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(btnListarRiesgos).waitUntilEnabled();
        btnListarRiesgos.click();
    }


}
