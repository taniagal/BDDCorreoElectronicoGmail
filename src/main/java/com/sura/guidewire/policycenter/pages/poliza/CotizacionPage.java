package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.pages.GuidewirePage;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesInformacionPolizaMrcPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;

// TODO: 15/06/2016 Pendiente refactor
public class CotizacionPage extends GuidewirePage {
    OpcionesInformacionPolizaMrcPage opcionesInformacionPolizaMrcPage;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:DefaultPPEffDate-inputEl']")

    public static final String TITULO_PAGINA = "//span[@id='NewSubmission:NewSubmissionScreen:ttlBar']";
    public static final String TITULO_PAGINA_SIGUIENTE = "//span[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:ttlBar']";
    public static final String TXT_NUMERO_CUENTA = "//input[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:Account-inputEl']";
    public static final String LINK_NOMBRE_PERSONA = "//div[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:AccountName-inputEl']";
    public static final String LABEL_NOMBRE_PERSONA = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:AccountName-labelCell']";
    public static final String LABEL_FECHA_POR_DEFECTO = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:DefaultPPEffDate-inputEl']";
    public static final String TXT_NOMBRE_AGENTE = ".//input[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']";
    public static final String TXT_CODIGO_AGENTE = ".//input[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerCode-inputEl']";
    public static final String CBO_NOMBRE_AGENTE = ".//li[@role='option']";
    public static final String PRODUCTOS = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV-body']/div/table/tbody/tr";
    public static final String MENSAJE_EMERGENTE_DE_INFORMACION = "//div[contains(@id,'messagebox') and contains(@id,'displayfield') and contains(@id,'inputEl')]";
    public static final String MENSAJES_DE_INFORMACION = ".//*[@id='NewSubmission:NewSubmissionScreen:_msgs']/div";
    public static final String BTNS_DE_MENSAJE_EMERGENTE_DE_INFORMACION = "//div[contains(@id,'messagebox') and contains(@id,'toolbar') and contains(@id,'targetEl')]/a";
    public static final String LBL_OPCIONES_MENU_INICIAL = ".//span[contains(@id,'SubmissionWizard') and contains(.,'";
    public static final String LBL_OPCIONES_MENU_FINAL = "')]";
    @FindBy(xpath = ".//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_PolicyDV:HaveCoinsurance-inputEl']")
    WebElementFacade buscarInputHabilitadoEnElementoResumen;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:CoinsuranceInputSet:coinsuranceTypeQuestion-labelEl']")
    WebElementFacade buscarInputHabilitadoEnElementoInformacionPoliza;
    public static final String TRACE = "\nTRACE: \n";
    protected static final int TIEMPO_15 = 15;
    protected static final int TIEMPO_2000 = 2000;


    // TODO: 13/06/2016 Sacar este metodo y hacerlo reusable
    public Boolean buscarInputHabilitadoEnElemento(String xpath) {
        WebElementFacade input = null;
        Boolean elementoEncontrado;
        try {
            input = elemento(xpath).findBy(By.tagName("input"));
            input.shouldBeEnabled();
            elementoEncontrado = Boolean.TRUE;
        } catch (NoSuchElementException nosee) {
            LOGGER.info("Elemento input no encontrado: " + nosee);
            elementoEncontrado = Boolean.FALSE;
        } catch (StaleElementReferenceException sere) {
            LOGGER.info("StaleElementReferenceException : " + sere);
            elementoEncontrado = Boolean.FALSE;
        } catch (AssertionError ae) {
            LOGGER.info("StaleElementReferenceException : " + ae);
            elementoEncontrado = Boolean.FALSE;
        }

        return elementoEncontrado;
    }

    public WebElementFacade elemento(String xpath) {
        WebElementFacade elemento = null;

        try {
            waitFor($(xpath)).shouldBeVisible();
            elemento = element(find(By.xpath(xpath)));

        } catch (NoSuchElementException e) {
            LOGGER.info("\nERROR050: Elemento de NuevaCotizacionPage no encontrado \nElemento: " + xpath + TRACE + e);
        } catch (StaleElementReferenceException sere) {
            LOGGER.info("\nERROR051: Elemento de NuevaCotizacionPage no existe en el DOM \nElemento: " + xpath + TRACE + sere);
        } catch (Exception e) {
            LOGGER.info("\nERROR: Error desconocido en: NuevaCotizacionPage.elemento \nElemento: " + xpath + TRACE + e);
        }

        return elemento;
    }


    public void validarCamposOpcionCotizacionDePoliza(String estadouno, String estadodos, ExamplesTable menusesperados) {
        opcionesInformacionPolizaMrcPage.validarCampos(estadouno, estadodos, menusesperados, LBL_OPCIONES_MENU_INICIAL, LBL_OPCIONES_MENU_FINAL);
    }

    public void esCamposAseguradorasCoasegurosEditables() {
      if(buscarInputHabilitadoEnElementoResumen.isPresent()){
          MatcherAssert.assertThat(buscarInputHabilitadoEnElemento("//div[@id='PolicyFile_Summary:Policy_SummaryScreen:insuranceLV-body']/div"), Is.is(false));
      }
    }
}
