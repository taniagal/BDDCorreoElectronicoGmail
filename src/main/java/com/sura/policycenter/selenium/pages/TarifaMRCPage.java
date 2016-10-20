package com.sura.policycenter.selenium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

public class TarifaMRCPage extends PageObject{
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:JobWizardToolbarButtonSet:QuoteOrReview']")
    private WebElementFacade botonCotizar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalCost-inputEl']")
    private WebElementFacade labelCostoTotal;

    public TarifaMRCPage(WebDriver driver){
        super(driver);
    }

    public void verificarTarifacion(String prima) {
        botonCotizar.waitUntilPresent().click();
        labelCostoTotal.waitUntilPresent();
        MatcherAssert.assertThat("Error en el valor de la prima. Esperaba: "+prima+" pero fue: "+labelCostoTotal.getText(),
                labelCostoTotal.containsText(prima));
    }
}
