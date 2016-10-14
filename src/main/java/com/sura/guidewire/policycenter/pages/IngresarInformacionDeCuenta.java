package com.sura.guidewire.policycenter.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class IngresarInformacionDeCuenta extends PageObject {

    @FindBy(xpath = ".//*[@id='NewAccountPopup:NewAccountScreen:NewAccountSearchDV:GlobalContactNameInputSet:Name-inputEl']")
    WebElementFacade consultaRazonSocial;
    @FindBy(xpath = ".//*[@id='NewAccountPopup:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade consultaPrimerNombre;
    @FindBy(xpath = ".//*[@id='NewAccountPopup:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade consultaPrimerApellido;
    @FindBy(xpath = ".//*[@id='NewAccountPopup:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade botonBuscarCuenta;
    @FindBy(xpath = ".//*[@id='NewAccountPopup:NewAccountScreen:NewAccountSearchResultsLV:0:CreateCollectiveRisk']")
    WebElementFacade botonSeleccionarContactoExistente;
    @FindBy(xpath = ".//*[@id='NewAccountPopup:NewAccountScreen:NewAccountButton']")
    WebElementFacade botonCrearCuenta;
    @FindBy(xpath = ".//*[@id='NewAccountPopup:NewAccountScreen:NewAccountButton:NewAccount_Person-textEl']")
    WebElementFacade opcionCrearCuentaPersonal;

    public IngresarInformacionDeCuenta(WebDriver driver) {
        super(driver);
    }

    public void ingresarRazonSocial(String razonSocial){
        waitFor(consultaRazonSocial);
        consultaRazonSocial.clear();
        consultaRazonSocial.sendKeys(razonSocial);
    }

    public void ingresarNombreYApellido(String nombre, String apellido){
        waitFor(consultaPrimerNombre);
        consultaPrimerApellido.clear();
        consultaPrimerNombre.sendKeys(nombre);
        consultaPrimerApellido.clear();
        consultaPrimerApellido.sendKeys(apellido);
    }

    public void clicEnBuscar(){
        botonBuscarCuenta.click();
    }

    public void crearCuentaNuevaPersonal(){
        waitFor(botonCrearCuenta);
        botonCrearCuenta.click();
        waitFor(opcionCrearCuentaPersonal);
        opcionCrearCuentaPersonal.click();
    }

    public void seleccionarContactoExistente(){
        waitFor(botonSeleccionarContactoExistente);
        botonSeleccionarContactoExistente.click();
    }
}
