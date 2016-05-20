package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class DetalleRegistrosSuscripcionPage extends Guidewire{

    @FindBy(xpath=".//*[@id='AccountFile:MenuLinks:AccountFile_UnderwritingFiles']/div/span")
    WebElementFacade mnuRegistrosSuscripcion;

    @FindBy(xpath=".//*[@id='UnderwritingFiles:RenewalManagerScreen:RenewalManagerLV:0:GroupName']")
    WebElementFacade lblTransaccion;

    @FindBy(xpath=".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:NumJobs-inputEl']")
    WebElementFacade lblNroCotizaciones;

    @FindBy(xpath=".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:TotalCost-inputEl']")
    WebElementFacade lblCostoTotal;

    public DetalleRegistrosSuscripcionPage(WebDriver driver) {
        super(driver);
    }

    public void buscarRegistrosDeSucripcion(){
        mnuRegistrosSuscripcion.waitUntilClickable();
        mnuRegistrosSuscripcion.click();
        lblTransaccion.waitUntilClickable();
        lblTransaccion.click();
    }
}
