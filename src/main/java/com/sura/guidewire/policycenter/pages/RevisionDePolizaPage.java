package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

/**
 * Created by juanzaag on 25/11/2016.
 */
public class RevisionDePolizaPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='SubmissionWizard:PolicyReview']/div/span")
    private WebElementFacade itemRevisionPoliza;

    public RevisionDePolizaPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarALaOpcionRevisionPoliza() {
        waitForTextToAppear("Revisión de póliza");
        itemRevisionPoliza.click();
    }
}
