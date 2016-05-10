package com.sura.policycenter.selenium.pages;
import com.sura.claims.selenium.pages.menu.PaginaMiCalendario;
import com.sura.claims.selenium.pages.menu.PaginaPanel;
import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.menu.*;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by jonamele on 06/05/2016.
 */
public class BarraNavegacion extends Guidewire {

    public BarraNavegacion(WebDriver driver) {
        super(driver);
    }

    Guidewire gw = new Guidewire(getDriver());
    Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnWrap']")
    WebElementFacade menuEscritorio;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopActivities-itemEl']")
    WebElementFacade itemMisActividades;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopAccounts-itemEl']")
    WebElementFacade mnuItemMisCuentas;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopSubmissions-itemEl']")
    WebElementFacade mnuItemMisEnvios;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopRenewals-itemEl']")
    WebElementFacade mnuItemMisRenovaciones;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopOtherWorkOrders-itemEl']")
    WebElementFacade mnuItemMisOtrasTrans;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopAssignableQueues-itemEl']")
    WebElementFacade mnuItemMisColas;
    @FindBy(xpath = ".//*[@id='TabBar:AccountTab-btnWrap']")
    WebElementFacade mnuCuenta;
    @FindBy(xpath = ".//*[@id='TabBar:AccountTab:AccountTab_NewAccount-itemEl']")
    WebElementFacade mnuItemNuevaCuenta;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab-btnWrap']")
    WebElementFacade mnuPoliza;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab:PolicyTab_NewSubmission-itemEl']")
    WebElementFacade mnuItemNuevoEnvio;
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab-btnWrap']")
    WebElementFacade mnuContact;
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact-arrowEl']")
    WebElementFacade mnuItemNuevoContacto;
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact:NewCompany']")
    WebElementFacade mnuItemNuevaCompania;
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact:NewPerson']")
    WebElementFacade mnuItemNuevaPersona;
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:Search-itemEl']")
    WebElementFacade mnuItemContactoBusqueda;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab-btnWrap']")
    WebElementFacade mnuBuscar;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:Search_PolicySearch']")
    WebElementFacade mnuItemBuscarPoliza;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:Search_AccountSearch']")
    WebElementFacade mnuItemBuscarCuenta;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:Search_ProducerCodeSearch']")
    WebElementFacade mnuItemBuscarCodAgente;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:Search_ActivitySearch']")
    WebElementFacade mnuItemBuscarAct;
    @FindBy(xpath = "//*[@id='TabBar:SearchTab:Search_ContactSearch']")
    WebElementFacade mnuItemBusquedaContacto;

    public MisActividadesPage irAMisActividades()  {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(itemMisActividades).release(itemMisActividades).click().build().perform();
        return new MisActividadesPage(getDriver());
    }

    public MisCuentasPage irAMisCuentas()  {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisCuentas).release(mnuItemMisCuentas).click().build().perform();
        return new MisCuentasPage(getDriver());
    }

    public MisEnviosPage irAMisEnvios()  {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisEnvios).release(mnuItemMisEnvios).click().build().perform();
        return new MisEnviosPage(getDriver());
    }

    public MisRenovacionesPage irAMisRenovaciones()  {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisRenovaciones).release(mnuItemMisRenovaciones).click().build().perform();
        return new MisRenovacionesPage(getDriver());
    }

    public MisOtrasTransacPage irAMisOtrasTransacciones()  {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisOtrasTrans).release(mnuItemMisOtrasTrans).click().build().perform();
        return new MisOtrasTransacPage(getDriver());
    }

    public MisColasPage irAMisColas()  {
        gw.deployMenu(menuEscritorio);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemMisColas).release(mnuItemMisColas).click().build().perform();
        return new MisColasPage(getDriver());
    }

    public NuevaCuentaPage irANuevaCuenta()  {
        gw.deployMenu(mnuCuenta);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevaCuenta).release(mnuItemNuevaCuenta).click().build().perform();
        return new NuevaCuentaPage(getDriver());
    }

    public NuevoEnvioPage irANuevoEnvio()  {
        gw.deployMenu(mnuPoliza);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoEnvio).release(mnuItemNuevoEnvio).click().build().perform();
        return new NuevoEnvioPage(getDriver());
    }

    public NuevaCompaniaPage irANuevaCompania()  {
        gw.deployMenu(mnuContact);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoContacto).release(mnuItemNuevoContacto).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemNuevaCompania).release(mnuItemNuevaCompania).click().build().perform();
        return new NuevaCompaniaPage(getDriver());
    }

    public NuevaPersonaPage irANuevaPersona()  {
        gw.deployMenu(mnuContact);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemNuevoContacto).release(mnuItemNuevoContacto).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.moveToElement(mnuItemNuevaPersona).release(mnuItemNuevaPersona).click().build().perform();
        return new NuevaPersonaPage(getDriver());
    }

    public BuscarContactoPage irABuscarContacto()  {
        gw.deployMenu(mnuContact);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemContactoBusqueda).release(mnuItemContactoBusqueda).click().build().perform();
        return new BuscarContactoPage(getDriver());
    }

    public BuscarPolizasPage irABuscarPolizas()  {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemBuscarPoliza).release(mnuItemBuscarPoliza).click().build().perform();
        return new BuscarPolizasPage(getDriver());
    }

    public BuscarCuentasPage irABuscarCuentas()  {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemBuscarCuenta).release(mnuItemBuscarCuenta).click().build().perform();
        return new BuscarCuentasPage(getDriver());
    }

    public BuscarCodAgentePage irABuscarCodAgente()  {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemBuscarCodAgente).release(mnuItemBuscarCodAgente).click().build().perform();
        return new BuscarCodAgentePage(getDriver());
    }

    public BuscarActividadesPage irABuscarActividades()  {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemBuscarAct).release(mnuItemBuscarAct).click().build().perform();
        return new BuscarActividadesPage(getDriver());
    }

    public BuscarContactosPage irABuscarContactos()  {
        gw.deployMenu(mnuBuscar);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuItemBusquedaContacto).release(mnuItemBusquedaContacto).click().build().perform();
        return new BuscarContactosPage(getDriver());
    }


}
