package com.sura.guidewire.policycenter.pages.reaseguro;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CesionDePrimaPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV:CededPremiumsButton']")
    WebElementFacade btnVerPrimasCedidas;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab-btnInnerEl']")
    WebElementFacade btnPoliza;
    @FindBy(xpath = ".//*[@id='RICededPremiumsPopup:0:AllTransactions']")
    WebElementFacade linkIngresaATodasTransacciones;
    @FindBy(xpath = ".//*[@id='BatchProcessInfo:BatchProcessScreen:ttlBar']")
    private WebElementFacade lblInformacionPorLotes;

    public CesionDePrimaPage(WebDriver driver) {
        super(driver);
    }

    public void clicEnBotonPrimasCedidas() {
        esperarYClickearBoton(btnVerPrimasCedidas);
    }

    public void irAResumenDePoliza() {
        esperarYClickearBoton(btnPoliza);
    }

    public void ingresaATodasTransacciones() {
        esperarYClickearBoton(linkIngresaATodasTransacciones);
    }

    public void ejecutarTareaPrimasCedidas() {
        linkIngresaATodasTransacciones.sendKeys(Keys.ALT, Keys.SHIFT, "t");
        validaEstado("PremiumCeding");
    }

    private List<WebElementFacade> getListaNombreProcesoPorLotes() {
        List<WebElementFacade> numerosCotizacion;
        numerosCotizacion = withTimeoutOf(TIEMPO_1, TimeUnit.SECONDS).findAll(".//*[@id='BatchProcessInfo:BatchProcessScreen:BatchProcessesLV-body']/div/table/tbody/tr/td[1]");
        return numerosCotizacion;
    }

    public void validaEstado(String nombreTarea) {
        int i = 0;
        String XPATH1 = "";
        String XPATH2 = "";
        if (!getListaNombreProcesoPorLotes().isEmpty()) {
            for (WebElementFacade nombreDeTarea : getListaNombreProcesoPorLotes()) {
                if (nombreTarea.equals(nombreDeTarea.getText())) {
                    getListaNombreProcesoPorLotes().get(i);
                    System.out.println("impreme index" + i);
                    break;
                }
                i++;
            }

        }
    }


}
