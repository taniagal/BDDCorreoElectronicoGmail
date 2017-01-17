package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class CotizacionPADetallePage extends PageUtil {

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:ttlBar']")
    private WebElementFacade tituloDePagina;
    @FindBy(xpath = "//td[contains(@id, 'Wizard:LOBWizardStepGroup:PALine')]/div")
    private WebElementFacade botonCoberturasPA;
    @FindBy(xpath = "//td[2]/div/div[2]/div/table")
    private WebElementFacade tablaCoberturas;
    @FindBy(xpath = ".//*[contains(@id, 'Wizard:ViewQuote')]/div")
    private WebElementFacade botonCotizacion;

    public CotizacionPADetallePage(WebDriver driver) {
        super(driver);
    }

    public void verDetalleCotizacion() {
        withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).waitFor(tituloDePagina).shouldBePresent();
        MatcherAssert.assertThat(tituloDePagina.getText(), Is.is(Matchers.equalTo("Cotización")));
    }

    public void validarTerminoCobertura() {
        waitFor(tablaCoberturas).shouldBeVisible();
        List<WebElement> allRows = tablaCoberturas.findElements(By.tagName("tr"));
        esperarHasta(TIEMPO_1000);
        String validacion = null;
        Map<String, String> terminoCoberturas = new HashMap<>();
        try {

            int i = 0;
            for (WebElement row : allRows) {
                List<WebElement> cells = row.findElements(By.tagName("td"));
                String terminoCob = cells.get(1).getText();
                if (!"-".equals(terminoCob)) {
                    i++;
                    terminoCoberturas.put("dato" + i, terminoCob);
                }
            }

            waitFor(botonCoberturasPA).shouldBeVisible();
            botonCoberturasPA.click();
            waitForTextToAppear("Coberturas de auto personal", TIEMPO_1000);

            for (int j = 1; j <= i; j++) {
                WebElementFacade coberturaAuto = findBy(".//div[contains(.,'" + terminoCoberturas.get("dato" + j) + "')]");
                waitFor(coberturaAuto).shouldBeVisible();
                MatcherAssert.assertThat(coberturaAuto.getText(), Is.is(Matchers.notNullValue()));
            }

            waitFor(botonCotizacion).shouldBeVisible();
            botonCotizacion.click();
            waitForTextToAppear("Cotización", TIEMPO_1000);

        } catch (Exception e) {
            LOGGER.error("This is error", e);
            validacion = e.getMessage();
        }

        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(null)));
    }
}
