package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesInformacionPolizaMrcPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

/**
 * Created by juanzaag on 25/11/2016.
 */
public class RevisionDePolizaPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='SubmissionWizard:PolicyReview']/div/span")
    private WebElementFacade itemRevisionPoliza;
    OpcionesInformacionPolizaMrcPage opcionesInformacionPolizaMrcPage;


    private static String LBL_OPCIONES_MENU_INICIAL =  ".//span[contains(@id,'SubmissionWizard') and contains(.,'";
    private static String LBL_OPCIONES_MENU_FINAL =  "')]";

    public RevisionDePolizaPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarALaOpcionRevisionPoliza() {
        itemRevisionPoliza.waitUntilClickable().click();
    }
    public void validarCamposOpcionRevisionDePoliza(String estadouno,String estadodos,ExamplesTable menusesperados){
        opcionesInformacionPolizaMrcPage.validarCampos(estadouno,estadodos,menusesperados, LBL_OPCIONES_MENU_INICIAL, LBL_OPCIONES_MENU_FINAL);
    }
    public void validarCamposOpcionCotizacionDePoliza(String estadouno,String estadodos,ExamplesTable menusesperados){
        opcionesInformacionPolizaMrcPage.validarCampos(estadouno,estadodos,menusesperados, LBL_OPCIONES_MENU_INICIAL, LBL_OPCIONES_MENU_FINAL);
    }

}
