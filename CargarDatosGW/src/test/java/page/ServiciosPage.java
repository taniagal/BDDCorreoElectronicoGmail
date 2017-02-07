package page;

import core.sura.resources.MetodosComunes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ServiciosPage extends MetodosComunes {
    @FindBy(xpath = ".//*[contains(@id,'gmenuitem') and contains(.,'Administración')]")
    private WebElement menuAdministracion;
    @FindBy(xpath = ".//*[@id=':tabs-menu-trigger-btnEl']")
    private WebElement tabMenu;
    @FindBy(xpath = ".//*[@id='Admin:MenuLinks:Admin_Utilities']/div")
    private WebElement menuItemUtilidades;
    @FindBy(xpath = ".//*[@id='Admin:MenuLinks:Admin_Utilities:Utilities_AdminWservices']/div")
    private WebElement menuItemAdministracionDeServicios;
    @FindBy(xpath = ".//*[@id='ImportWizard:Cancel']")
    private WebElement botonCancelar;
    @FindBy(xpath = ".//*[@id='AdminWservices:Edit']")
    private WebElement botonEditar;
    @FindBy(xpath = ".//*[@id='AdminWservices:mocksButton']")
    private WebElement botonActivarMocks;
    @FindBy(xpath = ".//*[@id='AdminWservices:mocksButtonD']")
    private WebElement botonDesactivarMocks;

    public void activarMocks(WebDriver driver) {
        irAServicios(driver);
        botonActivarMocks.click();
        waitUntil(1500);
    }

    public void desactivarMocks(WebDriver driver) {
        irAServicios(driver);
        botonDesactivarMocks.click();
        waitUntil(1500);
    }

    public void irAServicios(WebDriver driver) {
        waitUntilVisible(tabMenu, driver);
        tabMenu.click();
        waitUntilVisible(menuAdministracion, driver);
        menuAdministracion.click();
        waitUntilVisible(menuItemUtilidades, driver);
        menuItemUtilidades.click();
        waitUntilVisible(botonCancelar, driver);
        menuItemAdministracionDeServicios.click();
        waitUntilVisible(botonEditar, driver);
    }
}
