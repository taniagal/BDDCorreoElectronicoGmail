package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.menu.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class EscritorioPage extends Guidewire {

    Guidewire gw = new Guidewire(getDriver());
    BarraNavegacion barraNavegacion;

    public EscritorioPage(WebDriver driver) {
        super(driver);
        barraNavegacion = new BarraNavegacion(driver);
    }

    Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']")
    WebElementFacade labelIngreso;

    @FindBy(xpath = ".//*[@id='TabBar:ContactTab-btnWrap']")
    WebElementFacade mnuContact;

    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact-arrowEl']")
    WebElementFacade mnuNewContact;

    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact:NewPerson-itemEl']")
    WebElementFacade mnuNewPerson;

    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact:NewCompany-textEl']")
    WebElementFacade mnuNewCompany;



    // TODO: 18/04/2016 Revision escritura de excepciones en log
    @WhenPageOpens
    public void waitUntilMainElementsAppears() {
        try {
            element(labelIngreso).waitUntilVisible();
            element(mnuContact).waitUntilVisible();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // TODO: 18/04/2016 Revision escritura de excepciones en log
    public void assertion(String element) {
        try {
            assertThat(labelIngreso.getText().toString(), containsString(element));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // TODO: 18/04/2016 Revision escritura de excepciones en log
    public void nuevoContactoPersona() {

        try {
            Thread.sleep(3000);
            mnuContact.click();
            Thread.sleep(3000);
            mnuContact.click();
            Thread.sleep(3000);
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.moveToElement(mnuNewContact).click().build().perform();
            act.moveToElement(mnuNewPerson).click().build().perform();

            Thread.sleep(3000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }

    }

    public void nuevoContactoPersonaJuridica() {

        try {
            Thread.sleep(3000);
            mnuContact.click();
            Thread.sleep(3000);
            mnuContact.click();
            Thread.sleep(3000);
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.moveToElement(mnuNewContact).click().build().perform();
            act.moveToElement(mnuNewCompany).click().build().perform();

            Thread.sleep(3000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public MisActividadesPage irAMisActividades() {
        return barraNavegacion.irAMisActividades();
    }

    public MisCuentasPage irAMisCuentas() {
        return barraNavegacion.irAMisCuentas();
    }

    public MisEnviosPage irAMisEnvios() {
        return barraNavegacion.irAMisEnvios();
    }

    public MisRenovacionesPage irAMisRenovaciones() {
        return barraNavegacion.irAMisRenovaciones();
    }

    public MisOtrasTransacPage irAMisOtrasTransacciones() {
        return barraNavegacion.irAMisOtrasTransacciones();
    }

    public MisColasPage irAMisColas() {
        return barraNavegacion.irAMisColas();
    }

    public NuevaCuentaPage irANuevaCuenta() {
        return barraNavegacion.irANuevaCuenta();
    }

    public NuevoEnvioPage irANuevoEnvio() {
        return barraNavegacion.irANuevoEnvio();
    }

    public NuevaCompaniaPage irANuevaCompania() {
        return barraNavegacion.irANuevaCompania();
    }

    public NuevaPersonaPage irANuevaPersona() {
        return barraNavegacion.irANuevaPersona();
    }

    public BuscarContactoPage irABuscarContacto() {
        return barraNavegacion.irABuscarContacto();
    }

    public BuscarPolizasPage irABuscarPolizas() {
        return barraNavegacion.irABuscarPolizas();
    }

    public BuscarCuentasPage irABuscarCuentas() {
        return barraNavegacion.irABuscarCuentas();
    }

    public BuscarCodAgentePage irABuscarCodAgente() {
        return barraNavegacion.irABuscarCodAgente();
    }

    public BuscarActividadesPage irABuscarActividades() {
        return barraNavegacion.irABuscarActividades();
    }

    public BuscarContactosPage irABuscarContactos() {
        return barraNavegacion.irABuscarContactos();
    }
}