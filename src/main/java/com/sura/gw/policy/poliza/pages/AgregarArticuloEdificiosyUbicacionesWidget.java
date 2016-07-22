package com.sura.gw.policy.poliza.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class AgregarArticuloEdificiosyUbicacionesWidget extends PageObject {

    private static String CHECK_EDIFICIO = ".//*[@id='CPBuildingSuraPopup:HasEdificio-inputEl']";
    private static String CHECK_EDIFICIO_DANOS_MATERIALES = "//input[contains(@id,'CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV') and contains(@id,'CoverageInputSet:CovPatternInputGroup:_checkbox')]";
    private static String TXT_VALOR_RECONSTRUCCION = "//input[contains(@id,'CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:AmountSubjectReconstruction_Input-inputEl')]";
    private static String TXT_VALOR_ASEGURADO_DANOS_MATERIALES = "//input[contains(@id,'CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV') and contains(@id,'CoverageInputSet:CovPatternInputGroup') and contains(@id,'CovTermInputSet:DirectTermInput-inputEl')]";
    private static String TXT_VALOR_SUBLIMITE_TRANSLADO = "//input[contains(@id,'CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:') and contains(@id,'CoverageInputSet:CovPatternInputGroup:') and contains(@id,'CovTermInputSet:DirectTermInput-inputEl')]";
    private static String TXT_VALOR_SUBLIMITE_COMBUSTION = "//input[contains(@id,'CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:') and contains(@id,'CoverageInputSet:CovPatternInputGroup') and contains(@id,'CovTermInputSet:DirectTermInput-inputEl')]";
    private static String LINK_ACEPTAR_AGREGAR_ARTICULO = ".//*[@id='CPBuildingSuraPopup:Update']";


    public void seleccionarCheck(String xpath){
        WebElement chk = getDriver().findElement(By.xpath(xpath));
        $(chk).shouldBeCurrentlyVisible();
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

    public void seleccionarBotonAceptarParaAgregarArticulo() {
        findBy(LINK_ACEPTAR_AGREGAR_ARTICULO).shouldBeVisible();
        findBy(LINK_ACEPTAR_AGREGAR_ARTICULO).shouldBeEnabled();
        findBy(LINK_ACEPTAR_AGREGAR_ARTICULO).click();
    }
}
