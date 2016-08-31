package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HistorialCuentaPage extends Commons {

    Actions act = new Actions(getDriver());
    @FindBy(xpath=".//*[@id='TabBar:AccountTab-btnWrap']")
    private WebElementFacade mnuCuenta;
    @FindBy(xpath=".//*[@id='TabBar:AccountTab:AccountTab_AccountNumberSearchItem-inputEl']")
    private WebElementFacade txtNumCuenta;
    @FindBy(xpath=".//*[@id='TabBar:AccountTab:AccountTab_AccountNumberSearchItem_Button']")
    private WebElementFacade btnBuscarCuenta;
    @FindBy(xpath=".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_History']/div")
    private WebElementFacade mnuHistorial;
    @FindBy(xpath=".//*[@id='AccountFile_History:HistoryScreenDV:relatedto-inputEl']")
    private WebElementFacade btnMostrarRelacionadoCon;
    @FindBy(xpath="//li[5]")
    private WebElementFacade itmRelacionadoCon;
    @FindBy(xpath="//td[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
    private WebElementFacade btnMostrarProducto;
    @FindBy(xpath="//li[2]")
    private WebElementFacade itmProducto;
    @FindBy(xpath=".//*[@id='AccountFile_History:HistoryScreenDV:user-inputEl']")
    private WebElementFacade txtUsuario;
    @FindBy(xpath=".//*[@id='AccountFile_History:HistoryScreenDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscarItem;
    @FindBy(xpath="//td/div/div[2]/div/table/tbody/tr/td/div")
    private WebElementFacade itemTipoResultado;
    @FindBy(xpath="//td/div/div/div/div/div/div/span")
    private WebElementFacade colTipo;
    @FindBy(xpath="//div/div/div[2]/div/span")
    private WebElementFacade colUsuario;
    @FindBy(xpath="//div[3]/div/span")
    private WebElementFacade colFechaTransaccion;
    @FindBy(xpath="//div/div/div[4]/div/span")
    private WebElementFacade colDescripcion;
    @FindBy(xpath="//div[5]/div/span")
    private WebElementFacade colProducto;
    @FindBy(xpath="//div[6]/div/span")
    private WebElementFacade colPoliza;
    @FindBy(xpath="//div[7]/div/span")
    private WebElementFacade colTransaccionPoliza;
    @FindBy(xpath="//div[8]/div/span")
    private WebElementFacade colValorOriginal;
    @FindBy(xpath="//div[9]/div/span")
    private WebElementFacade colValorNuevo;
    @FindBy(xpath="//li[2]")
    private WebElementFacade itmRelacionadoConRenovacion;
    @FindBy(xpath="//td[3]/div/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input")
    private WebElementFacade txtFechaDesde;
    @FindBy(xpath="//tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input")
    private WebElementFacade txtFechaHasta;
    @FindBy(xpath="//td/div/div[2]/div/table")
    private WebElementFacade table;
    @FindBy(xpath="//td[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td/input")
    private WebElementFacade txtProducto;

    public HistorialCuentaPage(WebDriver driver) {
        super(driver);
    }

    public void seleccionarCuenta(String numCuenta) {
        waitUntil(2000);
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(mnuCuenta).shouldBePresent();
        mnuCuenta.click();
        waitUntil(3000);
        mnuCuenta.click();
        waitUntil(1000);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitUntil(2000);
        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(txtNumCuenta).shouldBePresent();
        txtNumCuenta.typeAndEnter(numCuenta);
        waitUntil(2000);
    }

    public void buscarCuenta(String numCuenta) {
        waitFor(mnuCuenta).shouldBePresent();
        act.sendKeys(mnuCuenta,Keys.ARROW_DOWN).build().perform();
        act.moveToElement(txtNumCuenta).click().build().perform();
        setImplicitTimeout(1, TimeUnit.SECONDS);
        waitUntil(2000);
        txtNumCuenta.waitUntilEnabled();
        txtNumCuenta.type(numCuenta);
        btnBuscarCuenta.waitUntilEnabled();
        btnBuscarCuenta.click();
        setImplicitTimeout(1, TimeUnit.SECONDS);
    }

    public void seleccionarHistorial() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(mnuHistorial).shouldBePresent();
        mnuHistorial.click();
        waitUntil(3000);
    }

    public void buscarCuentaRelacionadoCon(){
        btnMostrarRelacionadoCon.waitUntilPresent();
        btnMostrarRelacionadoCon.click();
        itmRelacionadoCon.waitUntilEnabled();
        itmRelacionadoCon.click();
        btnBuscarItem.click();
        waitUntil(3000);
    }

    public void buscarCuentaProducto(){
        waitFor(btnMostrarProducto).shouldBePresent();
        btnMostrarProducto.click();
        waitUntil(1500);
        itmProducto.click();
        waitUntil(1500);
        btnBuscarItem.click();
        waitUntil(3000);
    }

    public void validarResultadoBusqueda(){
        waitFor(itemTipoResultado).shouldBePresent();
        MatcherAssert.assertThat(itemTipoResultado.getText().toString(), Is.is(Matchers.not(Matchers.equalTo(""))));
        MatcherAssert.assertThat(itemTipoResultado.getText().toString(), Is.is(Matchers.not(Matchers.equalTo(null))));
    }

    public void validarColumnasHistorialCuenta(){
        waitFor(colTipo).shouldBePresent();
        MatcherAssert.assertThat(colTipo.getText().toString(), Is.is(Matchers.not(Matchers.equalTo(null))));
        MatcherAssert.assertThat(colUsuario.getText().toString(), Is.is(Matchers.not(Matchers.equalTo(null))));
        MatcherAssert.assertThat(colFechaTransaccion.getText().toString(), Is.is(Matchers.not(Matchers.equalTo(null))));
        MatcherAssert.assertThat(colDescripcion.getText().toString(), Is.is(Matchers.not(Matchers.equalTo(null))));
        MatcherAssert.assertThat(colProducto.getText().toString(), Is.is(Matchers.not(Matchers.equalTo(null))));
        MatcherAssert.assertThat(colPoliza.getText().toString(), Is.is(Matchers.not(Matchers.equalTo(null))));
        MatcherAssert.assertThat(colTransaccionPoliza.getText().toString(), Is.is(Matchers.not(Matchers.equalTo(null))));
        MatcherAssert.assertThat(colValorOriginal.getText().toString(), Is.is(Matchers.not(Matchers.equalTo(null))));
        MatcherAssert.assertThat(colValorNuevo.getText().toString(), Is.is(Matchers.not(Matchers.equalTo(null))));
    }

    public void buscarCuentaConMultiplesOpciones(String usuario, String fechaDesde, String fechaHasta){
        waitFor(btnMostrarRelacionadoCon).shouldBePresent();
        btnMostrarRelacionadoCon.click();
        itmRelacionadoConRenovacion.click();
        txtUsuario.waitUntilEnabled();
        txtUsuario.type(usuario);
        txtFechaDesde.waitUntilEnabled();
        txtFechaDesde.type(fechaDesde);
        txtFechaHasta.waitUntilEnabled();
        txtFechaHasta.type(fechaHasta);
        btnBuscarItem.waitUntilEnabled();
        btnBuscarItem.click();
        waitUntil(3000);
    }

    public void validarDatosOpcionesMultiples(){
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(table).shouldBePresent();
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        String usuario = txtUsuario.getValue().toString();
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            MatcherAssert.assertThat(cells.get(1).getText(), Is.is(Matchers.equalTo(usuario)));
        }
    }

    public void validarResultadoProducto(){
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(table).shouldBePresent();
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        String producto = txtProducto.getValue().toString();
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            MatcherAssert.assertThat(cells.get(4).getText(), Is.is(Matchers.equalTo(producto)));
        }
    }

}
