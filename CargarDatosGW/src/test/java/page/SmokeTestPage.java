package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmokeTestPage {
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab-btnWrap']")
    private WebElement menuPoliza;
    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElement campoTxtBuscar;
    @FindBy(xpath = ".//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_PolicyDV:PolicyNumber-inputEl']")
    private WebElement campoNumeroDePoliza;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-inputEl']")
    private WebElement campoNumeroDeCuenta;


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
}
