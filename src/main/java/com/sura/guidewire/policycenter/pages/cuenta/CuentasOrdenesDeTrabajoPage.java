package com.sura.guidewire.policycenter.pages.cuenta;

import com.sura.guidewire.policycenter.pages.commons.LoginPage;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class CuentasOrdenesDeTrabajoPage extends LoginPage {
    @FindBy(xpath=".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_WorkOrders']/div")
    private WebElementFacade mnuTransaccionesPoliza;
    @FindBy(xpath=".//td/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td/input")
    private WebElementFacade filtroEstado;
    @FindBy(xpath=".//*[@id='AccountFile_WorkOrders:AccountFile_WorkOrdersScreen:message:InfoMessage_ExtDV:message']")
    private WebElementFacade msjTransaccionNoEncontrada;
    @FindBy(xpath=".//table[2]/tbody/tr/td[2]/table/tbody/tr/td/input")
    private WebElementFacade filtroTipoTransaccion;
    @FindBy(xpath=".//table[3]/tbody/tr/td[2]/table/tbody/tr/td/input")
    private WebElementFacade filtroProducto;
    @FindBy(xpath=".//*[@id='AccountFile_WorkOrders:AccountFile_WorkOrdersScreen:AccountWorkOrdersLV-body']")
    private WebElementFacade tablaTransacciones;

    protected static final int CONSTANTE_3 = 3;
    protected static final int CONSTANTE_2 = 2;

    public CuentasOrdenesDeTrabajoPage(WebDriver driver) {
        super(driver);
    }

    public void seleccionarTransacciones(){
        waitFor(mnuTransaccionesPoliza);
        this.mnuTransaccionesPoliza.click();
    }

    public void filtrarTransaccionesPorEstado(String estado){
        waitFor(CONSTANTE_2).seconds();
        filtroEstado.click();
        getDriver().manage().timeouts().implicitlyWait(TIEMPO_4,TimeUnit.SECONDS);
        filtroEstado.sendKeys(estado);
        getDriver().manage().timeouts().implicitlyWait(TIEMPO_4,TimeUnit.SECONDS);
        filtroEstado.sendKeys(Keys.ENTER);
        getDriver().manage().timeouts().implicitlyWait(TIEMPO_4,TimeUnit.SECONDS);
    }

    public void validarMensaje(String mensaje) {
        MatcherAssert.assertThat(msjTransaccionNoEncontrada.getText(), Matchers.containsString(mensaje));
    }

    public void filtrarTransaccionesPorTransaccion(String filtroTransaccion) {
        waitFor(CONSTANTE_2).seconds();
        this.filtroTipoTransaccion.waitUntilClickable();
        this.filtroTipoTransaccion.click();
        this.filtroTipoTransaccion.clear();
        this.filtroTipoTransaccion.sendKeys(filtroTransaccion);
        this.filtroTipoTransaccion.sendKeys(Keys.ENTER);
    }

    public void filtrarTransaccionesPorProducto(String filtroProducto) {
        waitFor(CONSTANTE_2).seconds();
        clickearElemento(this.filtroProducto);
        this.filtroProducto.sendKeys(filtroProducto);
        this.filtroProducto.sendKeys(Keys.ENTER);
    }

    public void validarTransaccionNoExistentePolizaColectiva(String transaccion) {
        waitFor(tablaTransacciones);
        List<WebElement> allRows = tablaTransacciones.findElements(By.tagName("tr"));
        String existeTransaccion = "No existe la póliza";
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if(transaccion.equals(cells.get(CONSTANTE_3).getText())){
                existeTransaccion = "Se encontró la póliza en las transacciones";
            }
        }
        MatcherAssert.assertThat("No existe la póliza", Is.is(Matchers.equalTo(existeTransaccion)));
    }
}
