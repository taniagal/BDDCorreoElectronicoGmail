package com.sura.guidewire.policycenter.pages.renovacion;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ExpedicionRenovacionPaValidacionesPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Engine_DV-inputEl']")
    WebElementFacade motor;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:chasisl_DV-inputEl']")
    WebElementFacade chasis;

    public ExpedicionRenovacionPaValidacionesPage(WebDriver driver) {
        super(driver);
    }

    public void validarExpedicionDeRenovacion() {
        WebElementFacade botonAceptarPopup = findBy(".//span[contains(.,'Aceptar')]");
        botonAceptarPopup.waitUntilPresent().click();
    }

    public void validarAsuntosQueBloqueanExpedicion(ExamplesTable mensaje) {
        waitForTextToAppear("Asuntos que bloquean la expedición");
        WebElementFacade grupoAsuntosBloqueantes = findBy(".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:ApproveDV']");
        Map<String, String> asuntosBloquantes;
        grupoAsuntosBloqueantes.waitUntilPresent().waitUntilVisible();
        for (int i = 0; i < mensaje.getRowCount(); i++) {
            asuntosBloquantes = mensaje.getRows().get(i);
            MatcherAssert.assertThat(grupoAsuntosBloqueantes.getText(), Matchers.containsString(asuntosBloquantes.get("mensaje")));
        }
    }

    public void editarInformacionVehiculoRenovacion(ExamplesTable infoVehiculo) {
        WebElementFacade validacionRetroactividad = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:_msgs']/div");
        WebElementFacade itemVehiculos = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:PersonalVehicles']/div/span");
        setImplicitTimeout(TIEMPO_5, TimeUnit.SECONDS);
        clickearElemento(itemVehiculos);
        if (validacionRetroactividad.isPresent()) {
            clickearElemento(itemVehiculos);
        }
        resetImplicitTimeout();
        WebElementFacade labelVehiculos = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:ttlBar']");
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(labelVehiculos).shouldBePresent();
        WebElementFacade botonEditarTransaccion = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:JobWizardToolbarButtonSet:EditPolicy-btnInnerEl']");
        setImplicitTimeout(TIEMPO_5, TimeUnit.SECONDS);
        if (botonEditarTransaccion.isPresent()) {
            botonEditarTransaccion.click();
            waitForTextToAppear("Si se edita esta transacción de la póliza, se invalida la cotización actual y podría ser necesaria una nueva aprobación de la aseguranza. ¿Está seguro de que desea continuar?");
            actions.sendKeys(Keys.ENTER).build().perform();
        }
        resetImplicitTimeout();
        Map<String, String> datosVehiculo = infoVehiculo.getRows().get(0);
        if ("null".equals(datosVehiculo.get("motor")) && "null".equals(datosVehiculo.get("chasis"))) {
            withTimeoutOf(TIEMPO_5, TimeUnit.SECONDS).waitFor(motor).clear();
            clickearElemento(chasis);
            esperarHasta(TIEMPO_2000);
            withTimeoutOf(TIEMPO_5, TimeUnit.SECONDS).waitFor(chasis).clear();
        } else {
            motor.sendKeys(datosVehiculo.get("motor"));
            chasis.sendKeys(datosVehiculo.get("chasis"));
        }
    }

    public void aceptarRenovacion() {
        waitForTextToAppear("¿Está seguro de que desea emitir la renovación de la póliza?");
        actions.sendKeys(Keys.ENTER).build().perform();
    }
}
