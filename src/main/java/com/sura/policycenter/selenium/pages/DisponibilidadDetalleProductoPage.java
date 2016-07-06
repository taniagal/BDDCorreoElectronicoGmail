package com.sura.policycenter.selenium.pages;

import com.google.common.base.Function;
import com.sura.guidewire.selenium.Guidewire;
import com.sura.serinitybdd.util.GwNavegacionUtil;
import java.util.List;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class DisponibilidadDetalleProductoPage extends Guidewire {

    @FindBy(xpath=".//input[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ChannelType-inputEl']")
    private WebElementFacade listaTipoCanalDeVenta;
    @FindBy(xpath=".//*[@id='AccountFile:AccountFileMenuActions']")
    private WebElementFacade btnAccionesCuenta;
    @FindBy(xpath=".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission']")
    private WebElementFacade opcionNuevoEnvio;
    @FindBy(xpath=".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:7:addSubmission']")
    private WebElementFacade btnElegirAutoPersonal;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:PolicyInfo']/div")
    private WebElementFacade opcionVerInformacionPoliza;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:SalesOrganizationType-inputEl']")
    private WebElementFacade listaOrganizacionDeVentas;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PAPolicyType-inputEl']")
    private WebElementFacade listaPATipoPoliza;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body']")
    WebElementFacade tablaProductos;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']")
    WebElementFacade campoNombreAgente;

    private static String BTN_ELEGIR_PRODUCTO_ = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:";

    public DisponibilidadDetalleProductoPage(WebDriver driver) {
        super(driver);
    }

    public void accionarNuevoEnvio() {
        btnAccionesCuenta.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent().click();
//        btnAccionesCuenta.click();
        opcionNuevoEnvio.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent().click();
//        waitABit(1000);
        this.irAVerInformacionDePoliza();
//        btnElegirAutoPersonal.click();
    }

    public void verInformacionDePoliza() {
//        waitABit(1000);
        WebElementFacade opcionVerInformacionPoliza = esperarElemento(".//*[@id='SubmissionWizard:LOBWizardStepGroup:PolicyInfo']/div");
        opcionVerInformacionPoliza.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent().click();
    }

    public void seleccionarOrganizacionDeVentas(String organizacion) {
//        espera(listaOrganizacionDeVentas, 2);
        WebElementFacade listaOrganizacionDeVentas = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:SalesOrganizationType-inputEl']");
        listaOrganizacionDeVentas.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent().clear();
        listaOrganizacionDeVentas.sendKeys(organizacion);
//        waitABit(2000);
        listaOrganizacionDeVentas.sendKeys(Keys.ENTER);
//        waitABit(2000);
    }

    public void validarTipoCanalVentas(ExamplesTable tipoCanal) throws Exception {
        listaTipoCanalDeVenta.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent().click();
        this.validarDatosDeLaLista(tipoCanal);
    }

    private  void validarDatosDeLaLista(ExamplesTable tipoCanal) throws Exception {
        List<WebElementFacade> elementosTipoCanalVentas;
        List<String> elementosRequeridos = GwNavegacionUtil.obtenerTablaDeEjemplosDeUnaColumna(tipoCanal);
        for (String tipo : elementosRequeridos) {
            elementosTipoCanalVentas = withTimeoutOf(10, TimeUnit.SECONDS).findAll("//li[contains(.,'"+tipo+"')]");
            for (WebElementFacade lista : elementosTipoCanalVentas){
                MatcherAssert.assertThat(tipo, Matchers.containsString(lista.getText()));
            }
        }
    }


    public void seleccionarTipoCanalDeVentas(String tipoCanal) {
        listaTipoCanalDeVenta.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent().clear();
        listaTipoCanalDeVenta.sendKeys(tipoCanal);
        listaTipoCanalDeVenta.sendKeys(Keys.ENTER);
//        waitABit(2000);
    }

    public void validarPATipoPoliza(ExamplesTable paTipoPoliza) throws Exception {
        listaPATipoPoliza.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent().click();
        this.validarDatosDeLaLista(paTipoPoliza);
    }

    public void seleccionarPATipoPoliza(String tipoPoliza) {
        listaPATipoPoliza.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent().clear();
        listaPATipoPoliza.sendKeys(tipoPoliza);
        listaPATipoPoliza.sendKeys(Keys.ENTER);
//        waitABit(2000);
    }

    public void validarActualizacionDeListaTipoCanal() {
        listaTipoCanalDeVenta.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent();
        MatcherAssert.assertThat(listaTipoCanalDeVenta.getText(), containsText(""));
    }

    public void validarActualizacionDeListaPATipoPoliza() {
        listaPATipoPoliza.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent();
        MatcherAssert.assertThat(listaPATipoPoliza.getText(), containsText(""));
    }

    public void irAVerInformacionDePoliza() {
//        waitABit(2000);
        this.seleccionarAgente("DIRECTO");
        waitForTextToAppear("Productos ofrecidos", 30000);
        String xpathBotonElegirProducto = BTN_ELEGIR_PRODUCTO_ + this.encontrarProducto().toString() + ":addSubmission']";
        WebElementFacade botonElegirProducto = esperarElemento(xpathBotonElegirProducto);
        botonElegirProducto.click();
        /*waitFor(botonAsegurados);
        botonAsegurados.click();*/
    }

    public void seleccionarAgente(String nombreAgente) {
        element(campoNombreAgente).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent();
        element(campoNombreAgente).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilClickable();
        element(campoNombreAgente).click();
        List<WebElementFacade> listaNombresAgentesElement = findAll(By.xpath(".//li[@role='option']"));
        if (!listaNombresAgentesElement.isEmpty()) {
            for (WebElementFacade agenteElemento : listaNombresAgentesElement) {
                if (agenteElemento.containsText(nombreAgente)){
                    agenteElemento.click();
                    break;
                }
            }
        }
    }

    public Integer encontrarProducto(){
        tablaProductos.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilVisible();
        Integer filaBoton = 0;
        List<WebElement> filas = tablaProductos.findElements(By.tagName("tr"));
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if ("Auto personal".equals(columna.get(1).getText())){
                return filaBoton;
            }
            filaBoton++;
        }
        return filaBoton;
    }

    public WebElementFacade esperarElemento(final String xpath) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElementFacade elemento = wait.until(new Function<WebDriver, WebElementFacade>() {
            public WebElementFacade apply(WebDriver driver) {
                return findBy(xpath);
            }
        });

        return  elemento;
    }
}
