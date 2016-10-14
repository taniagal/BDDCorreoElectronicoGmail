package com.sura.guidewire.policycenter.pages.menu.opciones.cuenta;


import com.sura.guidewire.policycenter.util.Commons;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class ValidacionDelNegocioCoberturaPage extends Commons{

    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:CPBuildings']/div")
    private WebElementFacade btnEdificiosYUbicaciones;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:ttlBar']")
    private WebElementFacade lblEdificioYUbicaciones;
    @FindBy(xpath=".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:_msgs']")
    private WebElementFacade mensajePantalla;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBlanketScreen:ttlBar']")
    private WebElementFacade lblCorbeturasGlobales;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnInnerEl']")
    private WebElementFacade btnInicio;

    Actions actions = new Actions(getDriver());

    OpcionesInformacionPolizaMrcPage opcionesInformacionPolizaMrcPage = new OpcionesInformacionPolizaMrcPage(getDriver());
    public ValidacionDelNegocioCoberturaPage(WebDriver driver) {
        super(driver);
    }

    public void irAEdificiosYUbicaciones(){
       withTimeoutOf(20, TimeUnit.SECONDS).waitFor(btnEdificiosYUbicaciones).waitUntilPresent().click();
       opcionesInformacionPolizaMrcPage.waitInfoPoliza(lblEdificioYUbicaciones);
    }

    public void validaMensajeEnPantalla(String mensaje) {
        botonSiguiente.click();
        opcionesInformacionPolizaMrcPage.waitInfoPoliza(mensajePantalla);
        MatcherAssert.assertThat("El mensaje en pantalla no es el esperado",mensajePantalla.getText(), Matchers.containsString(mensaje));
        botonSiguiente.click();
        opcionesInformacionPolizaMrcPage.waitInfoPoliza(lblCorbeturasGlobales);
        MatcherAssert.assertThat("Error: este esenario debe pasar a la siguinete" +
                "pantalla",lblCorbeturasGlobales.isVisible());
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(btnInicio).waitUntilPresent().click();
    }

    public void validaPasoPantallaSiguinete() {
        botonSiguiente.click();
        opcionesInformacionPolizaMrcPage.waitInfoPoliza(lblCorbeturasGlobales);
        MatcherAssert.assertThat("Error: este esenario debe pasar a la siguinete" +
                "pantalla",lblCorbeturasGlobales.isVisible());
    }
}
