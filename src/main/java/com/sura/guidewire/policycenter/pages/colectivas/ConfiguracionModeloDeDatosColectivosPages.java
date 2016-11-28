package com.sura.guidewire.policycenter.pages.colectivas;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

public class ConfiguracionModeloDeDatosColectivosPages extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:PolicyInfo']/div")
    private WebElementFacade menuItemInformacionDePoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-inputEl']")
    private WebElementFacade comboCobFechaDeInicioDeVigencia;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:BillingDay-inputEl']")
    private WebElementFacade campoDiaDeFacturacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:CollectiveTermType-inputEl']")
    private WebElementFacade campoTipoDeVigencia;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:BillingType-inputEl']")
    private WebElementFacade campoTipoDeFacturacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:RefundType-inputEl']")
    private WebElementFacade campoTipoDeDevolucion;

    public ConfiguracionModeloDeDatosColectivosPages(WebDriver driver) {
        super(driver);
    }

    public void ingresarAPolicyInfo() {
        menuItemInformacionDePoliza.waitUntilPresent();
        clickElement(menuItemInformacionDePoliza);
    }

    public void verificarEstadosDeCamposNuevos(String tipoFacturacion) {
        campoDiaDeFacturacion.waitUntilPresent();
        int diaFacturacion = Integer.parseInt(campoDiaDeFacturacion.getText());
        int diaInicioVigencia = Integer.parseInt(comboCobFechaDeInicioDeVigencia.getValue().substring(0, 2));
        MatcherAssert.assertThat("Error: el día de facturacion no es igual al dia de inicio de vigencia de la poliza" +
                " Expected: " + diaInicioVigencia + " but was: " + diaFacturacion, diaFacturacion == diaInicioVigencia);
        MatcherAssert.assertThat("Error: el tipo de vigencia por defecto no es Cerrada", campoTipoDeVigencia.containsText("Cerrada"));
        MatcherAssert.assertThat("Error: el tipo de facturacion por defecto no es Grupal", campoTipoDeFacturacion.containsText(tipoFacturacion));
        MatcherAssert.assertThat("Error: el tipo de devolucion por defecto no es Grupal", campoTipoDeDevolucion.containsText(tipoFacturacion));
        MatcherAssert.assertThat("Error: el campo dia de facturacion no debe ser editable", !campoDiaDeFacturacion.getAttribute("class").contains("x-form-text"));
        MatcherAssert.assertThat("Error: el valor del tipo de devolucion debe ser igual al del tipo de facturacion",
                campoTipoDeDevolucion.getText().equals(campoTipoDeFacturacion.getText()));
    }

    public void verificarEstadosCamposEnFacturacionPorRiesgo(String tipoFacturacion) {
        MatcherAssert.assertThat("Error: esta cotizacion debe tener tipo de facturacion Por riesgo", campoTipoDeFacturacion.containsText(tipoFacturacion));
        MatcherAssert.assertThat("Error: el campo dia de facturacion debe ser editable", campoDiaDeFacturacion.getAttribute("class").contains("x-form-text"));
    }
}
