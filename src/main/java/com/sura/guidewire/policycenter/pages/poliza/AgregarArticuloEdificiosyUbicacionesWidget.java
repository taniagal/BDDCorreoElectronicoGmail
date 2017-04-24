package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AgregarArticuloEdificiosyUbicacionesWidget extends PageUtil {
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:Update-btnInnerEl']")
    private WebElementFacade botonActualizar;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:CPBuildingInteresAdicional:CPAdditionalInteresInputSet:AdditionalInterestLV-body']/*/table/tbody/tr[1]/td[6]/div")
    WebElementFacade campoInteresAdicionalNumeroDeContratoMRC;
    @FindBy(xpath = ".//*[@name = 'ContractNumber']")
    WebElementFacade campoInteresAdicionalNumeroDeContratoMRC2;

    private static final String CHECK_EDIFICIO = ".//*[@id='CPBuildingSuraPopup:HasEdificio-inputEl']";
    private static final String CHECK_EDIFICIO_DANOS_MATERIALES = "//input[contains(@id,'CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox')]";
    private static final String TXT_VALOR_RECONSTRUCCION = "//input[contains(@id,'CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:AmountSubjectReconstruction_Input-inputEl')]";
    private static final String TXT_VALOR_ASEGURADO_DANOS_MATERIALES = "//input[contains(@id,'CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:DirectTermInput-inputEl')]";
    private static final String TXT_VALOR_SUBLIMITE_TRANSLADO = "//input[contains(@id,'CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:') and contains(@id,'0:CoverageInputSet:CovPatternInputGroup:7:CovTermInputSet:DirectTermInput-inputEl')]";
    private static final String TXT_VALOR_SUBLIMITE_COMBUSTION = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:0:CoverageInputSet:CovPatternInputGroup:8:CovTermInputSet:DirectTermInput-inputEl']";
    private static final String LISTA_TIPO_BENEFICIARIO = "//div[contains(.,'<ninguno>') and contains(@class,'x-grid-cell-inner')]";


    public AgregarArticuloEdificiosyUbicacionesWidget(WebDriver driver) {
        super(driver);
    }

    public void seleccionarCheck(String xpath) {
        WebElementFacade chk = findBy(xpath).waitUntilVisible().waitUntilClickable();
        chk.shouldBeCurrentlyVisible();
        chk.click();
    }

    public void ingresarValorAInput(String xpath, String valor) {
        WebElement txt = getDriver().findElement(By.xpath(xpath));
        $(txt).shouldBeCurrentlyVisible();
        $(txt).shouldBeEnabled();
        enter(valor).into(txt);
    }

    public void seleccionarArticuloEdificio() {
        seleccionarCheck(CHECK_EDIFICIO);
    }

    public void seleccionarDanosMaterialesDeArticuloEdificio() {
        seleccionarCheck(CHECK_EDIFICIO_DANOS_MATERIALES);
    }

    public void ingresarValorReconstruccion(String valorReconstruccion) {
        ingresarValorAInput(TXT_VALOR_RECONSTRUCCION, valorReconstruccion);
    }

    public void ingresarValorAseguradoDanosMateriales(String valorAseguradoDanosMateriales) {
        ingresarValorAInput(TXT_VALOR_ASEGURADO_DANOS_MATERIALES, valorAseguradoDanosMateriales);
    }

    public void ingresarValorSublimiteTranslado(String valorSublimiteTranslado) {
        ingresarValorAInput(TXT_VALOR_SUBLIMITE_TRANSLADO, valorSublimiteTranslado);
    }

    public void ingresarValorSublimiteCombustion(String valorCombustion) {
        ingresarValorAInput(TXT_VALOR_SUBLIMITE_COMBUSTION, valorCombustion);
    }

    public void seleccionarBotonAceptarParteSuperiorIzquierda() {
        try {
            withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonActualizar);
            clickearElemento(botonActualizar);
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
            esperarHasta(TIEMPO_2000);
            botonActualizar.waitUntilPresent();
            clickearElemento(botonActualizar);
        }
    }

    public void desplegarListaTipoBeneficiario() {
        WebElementFacade listaTipoBeneficiario = findBy(LISTA_TIPO_BENEFICIARIO);
        desplegarElementoDeLista(listaTipoBeneficiario);
    }

    public void ingresarNumeroDeContratoMRC(String numeroContrato){
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(campoInteresAdicionalNumeroDeContratoMRC);
        clickearElemento(campoInteresAdicionalNumeroDeContratoMRC);
        try{
            campoInteresAdicionalNumeroDeContratoMRC2.sendKeys(numeroContrato);
        }catch (Exception unk){
            LOGGER.info("Exception " + unk);
            clickearElemento(campoInteresAdicionalNumeroDeContratoMRC);
            campoInteresAdicionalNumeroDeContratoMRC2.sendKeys(numeroContrato);
        }
    }
}
