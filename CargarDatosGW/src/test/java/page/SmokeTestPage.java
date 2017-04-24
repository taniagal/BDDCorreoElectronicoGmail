package page;

import core.sura.resources.MetodosComunes;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmokeTestPage extends MetodosComunes {
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab-btnWrap']")
    private WebElement menuPoliza;
    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElement campoTxtBuscar;
    @FindBy(xpath = ".//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_PolicyDV:PolicyNumber-inputEl']")
    private WebElement campoNumeroDePoliza;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-inputEl']")
    private WebElement campoNumeroDeCuenta;
    @FindBy(xpath = ".//*[@id='AdminUserSearchPage:UserSearchScreen:UserSearchDV:Username-inputEl']")
    private WebElement campoNombreUsuario;
    @FindBy(xpath = ".//*[@id='AdminUserSearchPage:UserSearchScreen:UserSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElement botonBuscarUsuario;
    @FindBy(xpath = ".//*[@id='AdminUserSearchPage:UserSearchScreen:UserSearchResultsLV-body']/div/table/tbody/tr/td[3]")
    private WebElement tablaDeResultadosUsuarios;

    public void buscarPoliza(String numPoliza) {
        campoTxtBuscar.sendKeys("Policy " + numPoliza);
        campoTxtBuscar.sendKeys(Keys.ENTER);
    }

    public void buscarCuenta(String numCuenta) {
        campoTxtBuscar.sendKeys("Account " + numCuenta);
        campoTxtBuscar.sendKeys(Keys.ENTER);
    }

    public Boolean verificarResumenDePoliza(String numPoliza) {
        return campoNumeroDePoliza.getText().contains(numPoliza);
    }

    public Boolean verificarResumenDeCuenta(String numPoliza) {
        return campoNumeroDeCuenta.getText().contains(numPoliza);
    }

    public void buscarUsuario(String nombreUsuario, WebDriver driver) {
        campoTxtBuscar.sendKeys("Admin");
        campoTxtBuscar.sendKeys(Keys.ENTER);
        waitUntilVisible(campoNombreUsuario, driver);
        campoNombreUsuario.sendKeys(nombreUsuario);
        botonBuscarUsuario.click();
    }

    public Boolean verificarBusquedaDeUsuario(String nombreUsuario, WebDriver driver) {
        waitUntilVisible(tablaDeResultadosUsuarios, driver);
        return tablaDeResultadosUsuarios.getText().contains(nombreUsuario);
    }
}
