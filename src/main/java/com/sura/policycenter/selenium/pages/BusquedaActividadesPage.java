package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.SeusLoginPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class BusquedaActividadesPage extends SeusLoginPage {

    @FindBy(xpath=".//*[@id='TabBar:SearchTab']")
    WebElementFacade mnuBuscar;

    @FindBy(xpath=".//*[@id='TabBar:SearchTab:Search_ActivitySearch']")
    WebElementFacade mnuBuscarActividades;

    @FindBy(xpath=".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:AssignedUser-inputEl']")
    WebElementFacade txtAsignadoA;

    @FindBy(xpath=".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:ActivityStatus-inputEl']")
    WebElementFacade txtEstadoActividad;

    @FindBy(xpath=".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:ActivityPriority-inputEl']")
    WebElementFacade txtPrioridad;

    @FindBy(xpath=".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:OverdueNow-inputEl']")
    WebElementFacade txtVencida;

    @FindBy(xpath=".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:PolicyNumber-inputEl']")
    WebElementFacade txtNumeroPoliza;

    @FindBy(xpath=".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:AccountNumber-inputEl']")
    WebElementFacade txtNumeroCuenta;

    @FindBy(xpath=".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscar;

    @FindBy(xpath=".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset']")
    WebElementFacade btnRestablecer;

    @FindBy(xpath="//div[4]/div/table/tbody/tr/td[2]/div")
    WebElementFacade grdIcono;

    @FindBy(xpath="//td[4]/div")
    WebElementFacade grdFechaVencimiento;

    @FindBy(xpath="//td[5]/div")
    WebElementFacade grdPrioridad;

    @FindBy(xpath="//td[6]/div")
    WebElementFacade grdEstadoActividad;

    @FindBy(xpath="//td[7]/div")
    WebElementFacade grdAsunto;

    @FindBy(xpath="//td[8]/div")
    WebElementFacade grdId;

    @FindBy(xpath="//td[9]/div")
    WebElementFacade grdCuenta;

    @FindBy(xpath="//td[10]/div")
    WebElementFacade grdProducto;

    @FindBy(xpath="//td[11]/div")
    WebElementFacade grdAsignadoPor;

    @FindBy(xpath="//td[12]/div")
    WebElementFacade grdEstado;


    @FindBy(xpath=".//*[@id='ActivitySearch:ActivitySearchScreen:_msgs']/div")
    WebElementFacade msgFiltrosRequeridos;

    public BusquedaActividadesPage(WebDriver driver) {super(driver);}

    public void buscarActividades() {
            Actions act = new Actions(getDriver());
            mnuBuscar.waitUntilClickable();
            mnuBuscar.click();
            waitABit(1000);
            mnuBuscar.click();
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.moveToElement(mnuBuscarActividades).click().build().perform();
            btnRestablecer.click();
            waitABit(1000);
    }

    public void filtrarPorAsignado(String usuario) {
        txtAsignadoA.sendKeys(usuario);
    }

    public void validarResultado(String prioridad, String estadoActividad,
                                 String asunto, String titularCuenta, String producto, String asignadoPor,
                                 String estado) {
        btnBuscar.click();
        assertThat(this.grdFechaVencimiento.getText(), is(notNullValue()));
        assertThat(this.grdPrioridad.getText(), containsString(prioridad));
        assertThat(this.grdEstadoActividad.getText(), containsString(estadoActividad));
        assertThat(this.grdAsunto.getText(), containsString(asunto));
        assertThat(this.grdId.getText(), is(notNullValue()));
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
}