package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.util.PageUtil;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DisponibilidadDetalleProductoPage extends PageObject {

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:ChannelType-inputEl']")
    private WebElementFacade listaTipoCanalDeVenta;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions']")
    private WebElementFacade btnAccionesCuenta;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission']")
    private WebElementFacade opcionNuevoEnvio;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:PolicyInfo']")
    private WebElementFacade opcionVerInformacionPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:SalesOrganizationType-inputEl']")
    private WebElementFacade listaOrganizacionDeVentas;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:PAPolicyType-inputEl']")
    private WebElementFacade listaPATipoPoliza;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body']")
    WebElementFacade tablaProductos;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']")
    WebElementFacade campoNombreAgente;

    PageUtil pageUtil = new PageUtil(getDriver());


    public DisponibilidadDetalleProductoPage(WebDriver driver) {
        super(driver);
    }

    public void accionarNuevoEnvio() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(btnAccionesCuenta).waitUntilPresent().click();
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(opcionNuevoEnvio).waitUntilPresent().click();
    }

    public void verInformacionDePoliza() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(opcionVerInformacionPoliza).waitUntilPresent().click();
    }


    public void seleccionarAgente(String agente) {
        this.seleccionarAgentePorNombre(agente);
        waitForTextToAppear("Productos ofrecidos", 30000);
    }

    public void seleccionarAgentePorNombre(String nombreAgente) {
        waitFor(campoNombreAgente).waitUntilPresent();
        pageUtil.waitUntil(3000);
        campoNombreAgente.click();
        List<WebElementFacade> listaNombresAgentesElement = findAll(By.xpath(".//li[@role='option']"));
        if (!listaNombresAgentesElement.isEmpty()) {
            for (WebElementFacade agenteElemento : listaNombresAgentesElement) {
                if (agenteElemento.containsText(nombreAgente)) {
                    agenteElemento.click();
                    break;
                }
            }
        }
    }

    public void validarLaOrganizacion(String organizacion) {
        waitFor(listaOrganizacionDeVentas);
        MatcherAssert.assertThat(listaOrganizacionDeVentas.getText(), Is.is(Matchers.equalTo(organizacion)));
    }

    public void validarElCanal(String canal) {
        waitFor(listaTipoCanalDeVenta);
        MatcherAssert.assertThat(listaTipoCanalDeVenta.getText(), Is.is(Matchers.equalTo(canal)));
    }

    public void validarElProducto(String tipoPoliza) {
        waitFor(listaPATipoPoliza);
        MatcherAssert.assertThat(listaPATipoPoliza.getText(), Is.is(Matchers.equalTo(tipoPoliza)));
    }
}
