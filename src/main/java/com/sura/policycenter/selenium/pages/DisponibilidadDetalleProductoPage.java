package com.sura.policycenter.selenium.pages;

import com.google.common.base.Function;
import com.sura.guidewire.selenium.Guidewire;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.sura.serenitybdd.util.GwNavegacionUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class DisponibilidadDetalleProductoPage extends Guidewire {

    @FindBy(xpath=".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ChannelType-inputEl']")
    private WebElementFacade listaTipoCanalDeVenta;
    @FindBy(xpath=".//*[@id='AccountFile:AccountFileMenuActions']")
    private WebElementFacade btnAccionesCuenta;
    @FindBy(xpath=".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission']")
    private WebElementFacade opcionNuevoEnvio;
    @FindBy(xpath=".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:7:addSubmission']")
    private WebElementFacade btnElegirAutoPersonal;
    @FindBy(xpath=".//*[@id='SubmissionWizard:PolicyInfo']")
    private WebElementFacade opcionVerInformacionPoliza;
    @FindBy(xpath=".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:SalesOrganizationType-inputEl']")
    private WebElementFacade listaOrganizacionDeVentas;
    @FindBy(xpath=".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PAPolicyType-inputEl']")
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
        opcionNuevoEnvio.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent().click();
        this.irAVerInformacionDePoliza();
    }

    public void verInformacionDePoliza() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(opcionVerInformacionPoliza).waitUntilPresent().click();
    }

    public void seleccionarOrganizacionDeVentas(String organizacion) {
        int intentos = 0;
        while(intentos < 2) {
            withTimeoutOf(15, TimeUnit.SECONDS).waitFor(listaOrganizacionDeVentas).waitUntilPresent();
            listaOrganizacionDeVentas.clear();
            listaOrganizacionDeVentas.sendKeys(organizacion);
            listaOrganizacionDeVentas.sendKeys(Keys.ENTER);
            if (listaOrganizacionDeVentas.getValue().equals("<ninguno>")) {
                intentos++;
                waitUntil(2000);
            }else {
                break;
            }
        }
    }

    public void validarTipoCanalVentas(ExamplesTable tipoCanal) throws Exception {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(listaTipoCanalDeVenta).waitUntilPresent();
        listaTipoCanalDeVenta.sendKeys(Keys.ARROW_DOWN);
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
        int intentos = 0;
        while(intentos < 2) {
            withTimeoutOf(15, TimeUnit.SECONDS).waitFor(listaTipoCanalDeVenta).waitUntilPresent();
            listaTipoCanalDeVenta.clear();
            listaTipoCanalDeVenta.sendKeys(tipoCanal);
            listaTipoCanalDeVenta.sendKeys(Keys.ENTER);
            if (listaTipoCanalDeVenta.getValue().equals("<ninguno>")) {
                intentos++;
                waitUntil(2000);
            }else {
                break;
            }
        }
    }

    public void validarPATipoPoliza(ExamplesTable paTipoPoliza) throws Exception {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(listaPATipoPoliza).waitUntilPresent();
        listaPATipoPoliza.sendKeys(Keys.ARROW_DOWN);
        this.validarDatosDeLaLista(paTipoPoliza);
    }

    public void seleccionarPATipoPoliza(String tipoPoliza) {
        int intentos = 0;
        while(intentos < 2) {
            withTimeoutOf(15, TimeUnit.SECONDS).waitFor(listaPATipoPoliza).waitUntilPresent();
            listaPATipoPoliza.clear();
            listaPATipoPoliza.sendKeys(tipoPoliza);
            listaPATipoPoliza.sendKeys(Keys.ENTER);
            if (listaPATipoPoliza.getValue().equals("<ninguno>")) {
                intentos++;
                waitUntil(2000);
            }else {
                break;
            }
        }
    }

    public void validarActualizacionDeListaTipoCanal() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(listaTipoCanalDeVenta).waitUntilPresent();
        MatcherAssert.assertThat(listaTipoCanalDeVenta.getText(), containsText(""));
    }

    public void validarActualizacionDeListaPATipoPoliza() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(listaPATipoPoliza).waitUntilPresent();
        MatcherAssert.assertThat(listaPATipoPoliza.getText(), containsText(""));
    }

    public void irAVerInformacionDePoliza() {
        this.seleccionarAgente("DIRECTO");
        waitForTextToAppear("Productos ofrecidos", 30000);
        String xpathBotonElegirProducto = BTN_ELEGIR_PRODUCTO_ + this.encontrarProducto().toString() + ":addSubmission']";
        WebElementFacade botonElegirProducto = esperarElemento(xpathBotonElegirProducto);
        botonElegirProducto.click();
    }

    public void seleccionarAgente(String nombreAgente) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(campoNombreAgente).waitUntilPresent();
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(campoNombreAgente).waitUntilClickable();
        campoNombreAgente.click();
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
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(tablaProductos).waitUntilVisible();
        Integer filaBoton = 0;
        List<WebElement> filas = tablaProductos.findElements(By.tagName("tr"));
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if ("Autos".equals(columna.get(1).getText())){
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

    public void waitUntil(int millis) {
        Integer i = 0;
        Wait<Integer> wait = new FluentWait<Integer>(i).withTimeout(millis,
                TimeUnit.MILLISECONDS).pollingEvery(millis,
                TimeUnit.MILLISECONDS);
        try {
            wait.until(new Function<Integer, Boolean>() {
                public Boolean apply(Integer i) {

                    return false;
                }
            });
        } catch (TimeoutException e) {}
    }
}
