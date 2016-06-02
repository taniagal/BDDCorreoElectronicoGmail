package com.sura.policycenter.selenium.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


import java.util.Map;


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
        MatcherAssert.assertThat(this.grdFechaVencimiento.getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(this.grdPrioridad.getText(), Is.is(Matchers.equalTo(exampleTable.get("prioridad"))));
        MatcherAssert.assertThat(this.grdEstadoActividad.getText(), Is.is(Matchers.equalTo(exampleTable.get("estadoActividad"))));
        MatcherAssert.assertThat(this.grdAsunto.getText(), Is.is(Matchers.equalTo(exampleTable.get("asunto"))));
        MatcherAssert.assertThat(this.grdId.getText(), Is.is(Matchers.equalTo(exampleTable.get("id"))));
        MatcherAssert.assertThat(this.grdCuenta.getText(), Is.is(Matchers.equalTo(exampleTable.get("titularCuenta"))));
        MatcherAssert.assertThat(this.grdProducto.getText(), Matchers.containsString(exampleTable.get("producto")));
        MatcherAssert.assertThat(this.grdAsignadoPor.getText(), Matchers.containsString(exampleTable.get("asignadoPor")));
        MatcherAssert.assertThat(this.grdEstado.getText(), Is.is(Matchers.equalTo(exampleTable.get("estado"))));
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
        MatcherAssert.assertThat(this.msgFiltrosRequeridos.getText(), Matchers.containsString(mensaje));
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