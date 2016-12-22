package com.sura.guidewire.policycenter.pages.cuenta;

import com.sura.guidewire.policycenter.resources.PageUtil;
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

public class HistorialCuentaPage extends PageUtil {

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
    @FindBy(xpath=".//li[4]")
    private WebElementFacade itmRelacionadoCon;
    @FindBy(xpath=".//td[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
    private WebElementFacade btnMostrarProducto;
    @FindBy(xpath=".//li[contains(.,'Autos')]")
    private WebElementFacade itmProducto;
    @FindBy(xpath=".//*[@id='AccountFile_History:HistoryScreenDV:user-inputEl']")
    private WebElementFacade txtUsuario;
    @FindBy(xpath=".//*[@id='AccountFile_History:HistoryScreenDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscarItem;
    @FindBy(xpath=".//td/div/div[2]/div/table/tbody/tr/td/div")
    private WebElementFacade itemTipoResultado;
    @FindBy(xpath=".//td/div/div/div/div/div/div/span")
    private WebElementFacade colTipo;
    @FindBy(xpath=".//div/div/div[2]/div/span")
    private WebElementFacade colUsuario;
    @FindBy(xpath=".//div[3]/div/span")
    private WebElementFacade colFechaTransaccion;
    @FindBy(xpath=".//div/div/div[4]/div/span")
    private WebElementFacade colDescripcion;
    @FindBy(xpath=".//div[5]/div/span")
    private WebElementFacade colProducto;
    @FindBy(xpath=".//div[6]/div/span")
    private WebElementFacade colPoliza;
    @FindBy(xpath=".//div[7]/div/span")
    private WebElementFacade colTransaccionPoliza;
    @FindBy(xpath=".//div[8]/div/span")
    private WebElementFacade colValorOriginal;
    @FindBy(xpath=".//div[9]/div/span")
    private WebElementFacade colValorNuevo;
    @FindBy(xpath=".//*[@id='AccountFile_History:HistoryScreenDV:relatedto-inputEl']")
    private WebElementFacade itmRelacionadoConRenovacion;
    @FindBy(xpath=".//td[3]/div/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input")
    private WebElementFacade txtFechaDesde;
    @FindBy(xpath=".//tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input")
    private WebElementFacade txtFechaHasta;
    @FindBy(xpath=".//*[@id='AccountFile_History:1-body']")
    private WebElementFacade table;
    @FindBy(xpath=".//*[@id='AccountFile_History:HistoryScreenDV:ProductFilter-inputEl']")
    private WebElementFacade txtProducto;
    @FindBy(xpath=".//*[@id='AccountFile_History:HistoryScreenDV:SearchAndResetInputSet:SearchLinksInputSet:Reset']")
    private WebElementFacade botonRestablecer;

    protected static final int POSICION_4 = 4;

    public HistorialCuentaPage(WebDriver driver) {
        super(driver);
    }

    public void seleccionarCuenta(String numCuenta) {
        waitUntil(WAIT_TIME_2000);
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(mnuCuenta).waitUntilPresent();
        clickElement(mnuCuenta);
        waitUntil(WAIT_TIME_3500);
        clickElement(mnuCuenta);
        waitUntil(WAIT_TIME_500);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        txtNumCuenta.waitUntilPresent();
        ingresarDato(txtNumCuenta, numCuenta);
        act.sendKeys(Keys.ENTER).build().perform();
        waitUntil(WAIT_TIME_2000);
    }


    public void seleccionarHistorial() {
        clickElement(mnuHistorial);
        waitUntil(WAIT_TIME_3000);
    }

    public void buscarCuentaRelacionadoCon(){
        btnMostrarRelacionadoCon.waitUntilPresent();
        btnMostrarRelacionadoCon.click();
        itmRelacionadoCon.waitUntilEnabled();
        itmRelacionadoCon.click();
        btnBuscarItem.click();
        waitUntil(WAIT_TIME_3000);
    }

    public void buscarCuentaProducto(){
        waitFor(btnMostrarProducto).shouldBePresent();
        btnMostrarProducto.click();
        waitUntil(WAIT_TIME_1500);
        itmProducto.click();
        waitUntil(WAIT_TIME_1500);
        btnBuscarItem.click();
        waitUntil(WAIT_TIME_3000);
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

    public void buscarCuentaConMultiplesOpciones(String usuario, String producto, String fechaDesde, String fechaHasta){
        botonRestablecer.waitUntilPresent().click();
        waitForTextToDisappear(usuario, WAIT_TIME_30000);
        txtUsuario.waitUntilEnabled();
        txtUsuario.type(usuario);
        waitFor(btnMostrarProducto).shouldBePresent();
        btnMostrarProducto.click();
        itmProducto.click();
        waitUntil(WAIT_TIME_1000);
        txtFechaDesde.waitUntilEnabled();
        txtFechaDesde.type(fechaDesde);
        txtFechaHasta.waitUntilEnabled();
        txtFechaHasta.type(fechaHasta);
        btnBuscarItem.waitUntilEnabled();
        btnBuscarItem.click();
        waitUntil(WAIT_TIME_3000);
    }

    public void validarDatosOpcionesMultiples() {
        waitFor(table).shouldBePresent();
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        String usuario = txtUsuario.getValue().toString();
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            MatcherAssert.assertThat(cells.get(1).getText(), Is.is(Matchers.equalTo(usuario)));
        }
    }

    public void validarResultadoProducto(){
        waitFor(table).shouldBePresent();
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        String producto = txtProducto.getValue().toString();
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            MatcherAssert.assertThat(cells.get(POSICION_4).getText(), Is.is(Matchers.equalTo(producto)));
        }
    }
}