package com.sura.policycenter.selenium.pages;


import com.sura.commons.selenium.Commons;

import java.util.Map;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class BusquedaActividadesPage extends PageObject {

    Commons commons = new Commons(getDriver());

    @FindBy(xpath = ".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:AssignedUser-inputEl']")
    private WebElementFacade txtAsignadoA;
    @FindBy(xpath = ".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:ActivityStatus-inputEl']")
    private WebElementFacade txtEstadoActividad;
    @FindBy(xpath = ".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:ActivityPriority-inputEl']")
    private WebElementFacade txtPrioridad;
    @FindBy(xpath = ".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:OverdueNow-inputEl']")
    private WebElementFacade txtVencida;
    @FindBy(xpath = ".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:PolicyNumber-inputEl']")
    private WebElementFacade txtNumeroPoliza;
    @FindBy(xpath = ".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:AccountNumber-inputEl']")
    private WebElementFacade txtNumeroCuenta;
    @FindBy(xpath = ".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscar;
    @FindBy(xpath = "//td[4]/div")
    private WebElementFacade grdFechaVencimiento;
    @FindBy(xpath = "//td[5]/div")
    private WebElementFacade grdPrioridad;
    @FindBy(xpath = "//td[6]/div")
    private WebElementFacade grdEstadoActividad;
    @FindBy(xpath = "//td[7]/div")
    private WebElementFacade grdAsunto;
    @FindBy(xpath = "//td[8]/div")
    private WebElementFacade grdId;
    @FindBy(xpath = "//td[9]/div")
    private WebElementFacade grdCuenta;
    @FindBy(xpath = "//td[10]/div")
    private WebElementFacade grdProducto;
    @FindBy(xpath = "//td[11]/div")
    private WebElementFacade grdAsignadoPor;
    @FindBy(xpath = "//td[12]/div")
    private WebElementFacade grdEstado;
    @FindBy(xpath = ".//*[@id='ActivitySearch:ActivitySearchScreen:_msgs']/div")
    private WebElementFacade msgFiltrosRequeridos;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab']")
    private WebElementFacade menuBuscar;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ActivitySearch']/div")
    private WebElementFacade menuBuscarActividades;
    @FindBy(xpath = ".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset']")
    private WebElementFacade botonRestablecer;

    public BusquedaActividadesPage(WebDriver driver) {
        super(driver);
    }

    public void irABuscarActividades() {
        waitFor(menuBuscar).waitUntilPresent();
        commons.waitUntil(2000);
        menuBuscar.click();
        waitFor(menuBuscarActividades);
        commons.waitUntil(1000);
        menuBuscarActividades.click();
        waitForTextToAppear("Búsqueda");
        this.limpiarFiltros();
    }

    public void filtrarPorAsignado(String usuario) {
        waitFor(txtAsignadoA).waitUntilPresent();
        txtAsignadoA.sendKeys(usuario);
    }

    public void validarResultado(ExamplesTable resultadoFiltroActividades) {
        Map<String, String> exampleTable = resultadoFiltroActividades.getRows().get(0);
        btnBuscar.waitUntilVisible().waitUntilClickable().click();
        grdFechaVencimiento.waitUntilVisible();
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

    public void limpiarFiltros() {
        waitFor(botonRestablecer).waitUntilPresent();
        botonRestablecer.click();
        commons.waitUntil(2000);
    }

    public void filtrarPorNumeroDePoliza(String numeroPoliza) {
        waitFor(txtNumeroPoliza).waitUntilPresent();
        txtNumeroPoliza.sendKeys(numeroPoliza);
    }

    public void filtrarPorNumeroDeCuenta(String numeroCuenta) {
        waitFor(txtNumeroCuenta).waitUntilPresent();
        txtNumeroCuenta.sendKeys(numeroCuenta);
    }

    public void buscarSinFiltro() {
        this.limpiarFiltros();
    }

    public void validarMensjeFiltroRequerido(String mensaje) {
        waitFor(btnBuscar).waitUntilPresent();
        btnBuscar.waitUntilVisible().waitUntilClickable().click();
        waitForPresenceOf(".//*[@id='ActivitySearch:ActivitySearchScreen:_msgs']/div");
        MatcherAssert.assertThat(this.msgFiltrosRequeridos.getText(), Matchers.containsString(mensaje));
    }

    public void buscarPorFiltrosUsuarioYPrioridad(String usuario, String prioridad) {
        waitFor(txtAsignadoA).waitUntilPresent();
        txtAsignadoA.sendKeys(usuario);
        this.ingresarDatoEnCombo(txtPrioridad, prioridad);
    }

    public void buscarPorFiltrosUsuarioYEstadoDeActividad(String usuario, String estadoActividad) {
        waitFor(txtAsignadoA).waitUntilPresent();
        txtAsignadoA.sendKeys(usuario);
        this.ingresarDatoEnCombo(txtEstadoActividad, estadoActividad);
    }

    public void buscarPorFiltrosUsuarioYVencida(String usuario, String vencida) {
        waitFor(txtAsignadoA).waitUntilPresent();
        txtAsignadoA.sendKeys(usuario);
        this.ingresarDatoEnCombo(txtVencida, vencida);
    }

    public void buscarPorFiltroOpcional(String estadoActividad) {
        waitFor(txtAsignadoA).waitUntilPresent();
        this.ingresarDatoEnCombo(txtEstadoActividad, estadoActividad);
    }

    public void ingresarDatoEnCombo(WebElementFacade elemento, String dato) {
        waitFor(elemento);
        elemento.clear();
        elemento.sendKeys(dato);
        elemento.sendKeys(Keys.ENTER);
    }
}