package com.sura.policycenter.selenium.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.StringContains.containsString;

public class BusquedaActividadesPage extends PageObject {

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

    public BusquedaActividadesPage(WebDriver driver) {
        super(driver);
    }

    public void filtrarPorAsignado(String usuario) {
        this.limpiarFiltros();
        txtAsignadoA.sendKeys(usuario);
    }

    public void validarResultado(ExamplesTable resultadoFiltroActividades) {
        waitABit(1000);
        Map<String, String> exampleTable = resultadoFiltroActividades.getRows().get(0);
        btnBuscar.click();
        waitABit(1000);
        assertThat(this.grdFechaVencimiento.getText(), is(notNullValue()));
        assertThat(this.grdPrioridad.getText(), is(equalTo(exampleTable.get("prioridad"))));
        assertThat(this.grdEstadoActividad.getText(), is(equalTo(exampleTable.get("estadoActividad"))));
        assertThat(this.grdAsunto.getText(), is(equalTo(exampleTable.get("asunto"))));
        assertThat(this.grdId.getText(), is(equalTo(exampleTable.get("id"))));
        assertThat(this.grdCuenta.getText(), is(equalTo(exampleTable.get("titularCuenta"))));
        assertThat(this.grdProducto.getText(), containsString(exampleTable.get("producto")));
        assertThat(this.grdAsignadoPor.getText(), containsString(exampleTable.get("asignadoPor")));
        assertThat(this.grdEstado.getText(), is(equalTo(exampleTable.get("estado"))));
    }

    public void limpiarFiltros(){
        txtAsignadoA.clear();
        txtEstadoActividad.clear();
        txtNumeroPoliza.clear();
        txtNumeroCuenta.clear();
        txtPrioridad.clear();
        txtVencida.clear();
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
        limpiarFiltros();
    }

    public void validarMensjeFiltroRequerido(String mensaje) {
        btnBuscar.click();
        txtNumeroCuenta.clear();
        assertThat(this.msgFiltrosRequeridos.getText(), containsString(mensaje));
    }

    public void buscarPorFiltrosUsuarioYPrioridad(String usuario, String prioridad) {
        this.limpiarFiltros();
        txtAsignadoA.sendKeys(usuario);
        txtPrioridad.sendKeys(prioridad);
        txtPrioridad.sendKeys(Keys.ENTER);
    }

    public void buscarPorFiltrosUsuarioYEstadoDeActividad(String usuario, String estadoActividad) {
        this.limpiarFiltros();
        txtAsignadoA.sendKeys(usuario);
        txtEstadoActividad.sendKeys(estadoActividad);
        txtEstadoActividad.sendKeys(Keys.ENTER);
    }

    public void buscarPorFiltrosUsuarioYVencida(String usuario, String vencida) {
        this.limpiarFiltros();
        txtAsignadoA.sendKeys(usuario);
        txtVencida.sendKeys(vencida);
        txtVencida.sendKeys(Keys.ENTER);
    }

    public void buscarPorFiltroOpcional(String estadoActividad) {
        this.limpiarFiltros();
        txtEstadoActividad.sendKeys(estadoActividad);
        txtEstadoActividad.sendKeys(Keys.ENTER);
    }

}