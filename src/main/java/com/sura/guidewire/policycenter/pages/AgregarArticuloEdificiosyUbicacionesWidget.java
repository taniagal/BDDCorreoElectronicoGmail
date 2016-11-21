package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.LoggerFactory;

public class AgregarArticuloEdificiosyUbicacionesWidget extends PageUtil {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    private static String CHECK_EDIFICIO = ".//*[@id='CPBuildingSuraPopup:HasEdificio-inputEl']";
    private static String CHECK_EDIFICIO_DANOS_MATERIALES = "//input[contains(@id,'CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox')]";
    private static String TXT_VALOR_RECONSTRUCCION = "//input[contains(@id,'CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:AmountSubjectReconstruction_Input-inputEl')]";
    private static String TXT_VALOR_ASEGURADO_DANOS_MATERIALES = "//input[contains(@id,'CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:DirectTermInput-inputEl')]";
    private static String TXT_VALOR_SUBLIMITE_TRANSLADO = "//input[contains(@id,'CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:') and contains(@id,'0:CoverageInputSet:CovPatternInputGroup:7:CovTermInputSet:DirectTermInput-inputEl')]";
    private static String TXT_VALOR_SUBLIMITE_COMBUSTION = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:0:CoverageInputSet:CovPatternInputGroup:8:CovTermInputSet:DirectTermInput-inputEl']";
    private static String LINK_ACEPTAR_AGREGAR_ARTICULO = ".//a[@id='CPBuildingSuraPopup:Update']";
    private static String LISTA_TIPO_BENEFICIARIO = "//div[contains(.,'<ninguno>') and contains(@class,'x-grid-cell-inner')]";


    public AgregarArticuloEdificiosyUbicacionesWidget(WebDriver driver) {
        super(driver);
    }

    public void seleccionarCheck(String xpath){
        WebElementFacade chk = null;
        chk = findBy(xpath).waitUntilVisible().waitUntilClickable();
        chk.shouldBeCurrentlyVisible();
        chk.click();
    }

    public void ingresarValorAInput(String xpath, String valor) {
        WebElement txt = null;
        txt =  getDriver().findElement(By.xpath(xpath));
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
            findBy(LINK_ACEPTAR_AGREGAR_ARTICULO).waitUntilVisible().waitUntilClickable();
            findBy(LINK_ACEPTAR_AGREGAR_ARTICULO).click();
        }catch (Exception e) {
            LOGGER.info("ELEMENTO NO CLICKLEABLE" + e);
        }
    }
    public void desplegarListaTipoBeneficiario(){
        WebElementFacade listaTipoBeneficiario = findBy(LISTA_TIPO_BENEFICIARIO);
        desplegarElementoDeLista(listaTipoBeneficiario);
    }
}
