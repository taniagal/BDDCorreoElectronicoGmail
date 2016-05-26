package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.SeusLoginPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.StringContains.containsString;

public class BusquedaDeOrganizacionPage extends SeusLoginPage {

    @FindBy(xpath=".//*[@id='TabBar:SearchTab']")
    private WebElementFacade mnuBuscar;
    @FindBy(xpath=".//*[@id='TabBar:SearchTab:Search_ActivitySearch']")
    private WebElementFacade mnuBuscarActividades;
    @FindBy(xpath=".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:AssignedUser-inputEl']")
    private WebElementFacade txtAsignadoA;
    @FindBy(xpath=".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:ActivityStatus-inputEl']")
    private WebElementFacade txtEstadoActividad;
    @FindBy(xpath=".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:ActivityPriority-inputEl']")
    private WebElementFacade txtPrioridad;
    @FindBy(xpath=".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:OverdueNow-inputEl']")
    private WebElementFacade txtVencida;
    @FindBy(xpath=".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:PolicyNumber-inputEl']")
    private WebElementFacade txtNumeroPoliza;
    @FindBy(xpath=".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:AccountNumber-inputEl']")
    private WebElementFacade txtNumeroCuenta;
    @FindBy(xpath=".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscar;
    @FindBy(xpath=".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset']")
    private WebElementFacade btnRestablecer;
    @FindBy(xpath="//td[4]/div")
    private WebElementFacade grdFechaVencimiento;
    @FindBy(xpath="//td[5]/div")
    private WebElementFacade grdPrioridad;
    @FindBy(xpath="//td[6]/div")
    private WebElementFacade grdEstadoActividad;
    @FindBy(xpath="//td[7]/div")
    private WebElementFacade grdAsunto;
    @FindBy(xpath="//td[8]/div")
    private WebElementFacade grdId;
    @FindBy(xpath="//td[9]/div")
    private WebElementFacade grdCuenta;
    @FindBy(xpath="//td[10]/div")
    private WebElementFacade grdProducto;
    @FindBy(xpath="//td[11]/div")
    private WebElementFacade grdAsignadoPor;
    @FindBy(xpath="//td[12]/div")
    private WebElementFacade grdEstado;
    @FindBy(xpath=".//*[@id='ActivitySearch:ActivitySearchScreen:_msgs']/div")
    private WebElementFacade msgFiltrosRequeridos;

    public BusquedaDeOrganizacionPage(WebDriver driver) {
        super(driver);
    }

    public void buscarActividades() {
        Actions act = new Actions(getDriver());
        mnuBuscar.waitUntilClickable();
        waitABit(1000);
        mnuBuscar.click();
        waitABit(1000);
        mnuBuscar.click();
        waitABit(1000);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(mnuBuscarActividades).click().build().perform();
        btnRestablecer.click();
        waitABit(1000);
    }

    public void filtrarPorAsignado(String usuario) {
        txtAsignadoA.sendKeys(usuario);
    }

    public void validarResultado(String prioridad, String estadoActividad,
                                 String asunto, String id, String titularCuenta, String producto, String asignadoPor,
                                 String estado) {
        btnBuscar.click();
        assertThat(this.grdFechaVencimiento.getText(), is(notNullValue()));
        assertThat(this.grdPrioridad.getText(), containsString(prioridad));
        assertThat(this.grdEstadoActividad.getText(), containsString(estadoActividad));
        assertThat(this.grdAsunto.getText(), containsString(asunto));
        assertThat(this.grdId.getText(), containsString(id));
        assertThat(this.grdCuenta.getText(), containsString(titularCuenta));
        assertThat(this.grdProducto.getText(), containsString(producto));
        assertThat(this.grdAsignadoPor.getText(), containsString(asignadoPor));
        assertThat(this.grdEstado.getText(), containsString(estado));
    }

    public void filtrarPorNumeroDePoliza(String numeroPoliza) {
        waitABit(2000);
        txtNumeroPoliza.sendKeys(numeroPoliza);
    }

    public void filtrarPorNumeroDeCuenta(String numeroCuenta) {
        waitABit(2000);
        txtNumeroCuenta.sendKeys(numeroCuenta);
    }

    public void buscarSinFiltro() {
        waitABit(2000);
    }

    public void validarMensjeFiltroRequerido(String mensaje) {
        btnBuscar.click();
        txtNumeroCuenta.clear();
        assertThat(this.msgFiltrosRequeridos.getText(), containsString(mensaje));
    }

    public void buscarPorFiltrosUsuarioYPrioridad(String usuario, String prioridad) {
        txtAsignadoA.sendKeys(usuario);
        txtPrioridad.clear();
        txtPrioridad.sendKeys(prioridad);
        txtPrioridad.sendKeys(Keys.ENTER);
    }

    public void buscarPorFiltrosUsuarioYEstadoDeActividad(String usuario, String estadoActividad) {
        txtAsignadoA.sendKeys(usuario);
        txtEstadoActividad.clear();
        txtEstadoActividad.sendKeys(estadoActividad);
        txtEstadoActividad.sendKeys(Keys.ENTER);
    }

    public void buscarPorFiltrosUsuarioYVencida(String usuario, String vencida) {
        txtAsignadoA.sendKeys(usuario);
        txtVencida.clear();
        txtVencida.sendKeys(vencida);
        txtVencida.sendKeys(Keys.ENTER);
    }

    public void buscarPorFiltroOpcional(String estadoActividad) {
        txtEstadoActividad.clear();
        txtEstadoActividad.sendKeys(estadoActividad);
        txtEstadoActividad.sendKeys(Keys.ENTER);
    }

    public void ingresarRazonSocial() {
        txtEstadoActividad.clear();
        txtEstadoActividad.sendKeys(estadoActividad);
        txtEstadoActividad.sendKeys(Keys.ENTER);
    }
}