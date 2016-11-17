package com.sura.guidewire.policycenter.pages.cuenta;

import com.sura.guidewire.policycenter.resources.PageUtil;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;



public class UbicacionesDeUnaCuentaPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElementFacade campoTxtIrA;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_AccountSearch']/div")
    private WebElementFacade menuItemCuentas;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl']")
    private WebElementFacade campoTxtNumeroDeCuenta;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade botonBuscar;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchResultsLV:0:AccountNumber']")
    private WebElementFacade linkNumeroDeCuenta;
    @FindBy(id = "AccountFile:MenuLinks:AccountFile_AccountFile_Locations")
    private WebElementFacade menuItemUbicaciones;
    @FindBy(xpath = ".//*[@id='AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:LocationName-inputEl']")
    private WebElementFacade campoTxtNombreUbicacion;
    @FindBy(xpath = ".//*[@id='AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade comboBoxDepartamento;
    @FindBy(xpath = ".//*[@id='AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Sura_City-inputEl']")
    private WebElementFacade comboBoxCiudad;
    @FindBy(xpath = ".//*[@id='AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressTypes-inputEl']")
    private WebElementFacade comboBoxTipoDireccion;
    @FindBy(xpath = ".//*[@id='AccountLocationPopup:LocationScreen:AccountLocationDetailInputSet:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade campoTxtDireccion;
    @FindBy(xpath = ".//*[@id='AccountLocationPopup:LocationScreen:Update-btnInnerEl']")
    private WebElementFacade botonActualizar;
    @FindBy(xpath = ".//*[@id='AccountFile_Locations:AccountFile_LocationsScreen:AccountFile_LocationsLV_tb:AddNewLocation-btnInnerEl']")
    private WebElementFacade botonAgregarUbicacionNueva;
    @FindBy(xpath = ".//*[@id='AccountFile_Locations:AccountFile_LocationsScreen:AccountLocationDetailInputSet:AddressTypes-labelEl']")
    private WebElementFacade labelTipoDeDireccion;

    public UbicacionesDeUnaCuentaPage(WebDriver driver){
        super(driver);
    }

    public void irAUbicacionesDeUnaCuenta(String cuenta) {
        withTimeoutOf(WAIT_TIME_10, TimeUnit.SECONDS).waitFor(campoTxtIrA).waitUntilPresent();
        campoTxtIrA.sendKeys("Search");
        campoTxtIrA.sendKeys(Keys.ENTER);
        menuItemCuentas.waitUntilPresent();
        menuItemCuentas.click();
        campoTxtNumeroDeCuenta.waitUntilPresent().sendKeys(cuenta);
        botonBuscar.click();
        linkNumeroDeCuenta.waitUntilPresent().click();
        menuItemUbicaciones.waitUntilPresent().click();
    }


    public void agregarUbicacion(String nombreUbicacion, String direccion){
        botonAgregarUbicacionNueva.waitUntilPresent().click();
        campoTxtNombreUbicacion.sendKeys(nombreUbicacion);
        campoTxtDireccion.sendKeys(direccion);
    }

    public void agregaDireccion(String departamento, String ciudad, String tipoDireccion){
        waitUntil(WAIT_TIME_1000);
        selectItem(comboBoxDepartamento,departamento);
        waitForComboValue(comboBoxDepartamento,departamento);
        selectItem(comboBoxCiudad,ciudad);
        waitForComboValue(comboBoxCiudad,ciudad);
        selectItem(comboBoxTipoDireccion, tipoDireccion);
        waitForComboValue(comboBoxTipoDireccion,tipoDireccion);
        botonActualizar.click();
    }

    public void verificarTipoDeDireccion(){
        waitUntil(WAIT_TIME_2000);
        labelTipoDeDireccion.waitUntilPresent();
        MatcherAssert.assertThat("No está el campo tipo de direccion", labelTipoDeDireccion.isPresent());
    }
}
