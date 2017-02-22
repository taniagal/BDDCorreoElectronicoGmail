package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ValidacionesInformacionFacturacionPage extends PageUtil{

    @FindBy(xpath = ".//*[@id='PolicyFile:MenuLinks:PolicyFile_PolicyFile_Billing']/div")
    private WebElementFacade menuFacturacion;
    @FindBy(xpath = ".//*[@id='PolicyFile_Billing:Policy_BillingScreen:ViewInBC-btnInnerEl']")
    private WebElementFacade botonBillingCenter;
    @FindBy(xpath = ".//*[@id='PolicyFile_Billing:Policy_BillingScreen:BilledOutstandingInputGroup:PastDue-labelEl']")
    private WebElementFacade campoValorVencido;
    @FindBy(xpath = ".//*[@id='PolicyFile_Billing:Policy_BillingScreen:Unbilled-labelEl']")
    private WebElementFacade campoValorPlaneado;

    public ValidacionesInformacionFacturacionPage(WebDriver driver){
        super (driver);
    }

    public void ingresarMenuAccionesFacturacion(){
        menuFacturacion.waitUntilPresent();
        clickearElemento(menuFacturacion);
    }

    public void validarInformacionFacturacion(){
        botonBillingCenter.waitUntilVisible();
        campoValorVencido.waitUntilVisible();
        campoValorPlaneado.waitUntilVisible();
    }
}