package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Map;


public class BusquedaActividadesPage extends PageUtil {
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
    @FindBy(xpath = ".//*[@id='ActivitySearch:ActivitySearchScreen:_msgs']/div")
    private WebElementFacade divMensaje;

    public BusquedaActividadesPage(WebDriver driver) {
        super(driver);
    }

    public void irABuscarActividades() {
        waitFor(menuBuscar);
        actions.click(menuBuscar).build().perform();
        waitFor(menuBuscarActividades);
        waitUntil(WAIT_TIME_1500);
        actions.click(menuBuscarActividades).build().perform();
        waitForTextToAppear("Búsqueda");
        this.limpiarFiltros();
    }

    public void filtrarPorAsignado(String usuario) {
        waitFor(txtAsignadoA).waitUntilVisible();
        txtAsignadoA.sendKeys(usuario);
    }

    public void validarResultado(ExamplesTable resultadoFiltroActividades) {
        Map<String, String> exampleTable = resultadoFiltroActividades.getRows().get(0);
        actions.click(btnBuscar).build().perform();
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
        waitFor(botonRestablecer).waitUntilVisible();
        actions.click(botonRestablecer).build().perform();
        waitUntil(WAIT_TIME_2000);
    }

    public void filtrarPorNumeroDePoliza(String numeroPoliza) {
        waitFor(txtNumeroPoliza).waitUntilVisible();
        txtNumeroPoliza.sendKeys(numeroPoliza);
    }

    public void filtrarPorNumeroDeCuenta(String numeroCuenta) {
        waitFor(txtNumeroCuenta).waitUntilVisible();
        txtNumeroCuenta.sendKeys(numeroCuenta);
    }

    public void buscarSinFiltro() {
        this.limpiarFiltros();
    }

    public void validarMensjeFiltroRequerido(String mensaje) {
        waitFor(btnBuscar).waitUntilPresent();
        actions.click(btnBuscar).build().perform();
        divMensaje.waitUntilPresent();
        MatcherAssert.assertThat(this.msgFiltrosRequeridos.getText(), Matchers.containsString(mensaje));
    }

    public void buscarPorFiltrosUsuarioYPrioridad(String usuario, String prioridad) {
        waitFor(txtAsignadoA).waitUntilVisible();
        txtAsignadoA.sendKeys(usuario);
        this.ingresarDatoEnCombo(txtPrioridad, prioridad);
    }

    public void buscarPorFiltrosUsuarioYEstadoDeActividad(String usuario, String estadoActividad) {
        waitFor(txtAsignadoA).waitUntilVisible();
        try {
            txtAsignadoA.sendKeys(usuario);
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
            waitUntil(WAIT_TIME_2000);
            txtAsignadoA.sendKeys(usuario);
        }
        this.ingresarDatoEnCombo(txtEstadoActividad, estadoActividad);
    }

    public void buscarPorFiltrosUsuarioYVencida(String usuario, String vencida) {
        waitFor(txtAsignadoA).waitUntilVisible();
        txtAsignadoA.sendKeys(usuario);
        this.ingresarDatoEnCombo(txtVencida, vencida);
    }

    public void buscarPorFiltroOpcional(String estadoActividad) {
        waitFor(txtAsignadoA).waitUntilVisible();
        this.ingresarDatoEnCombo(txtEstadoActividad, estadoActividad);
    }

    public void ingresarDatoEnCombo(WebElementFacade elemento, String dato) {
        waitFor(elemento);
        elemento.clear();
        elemento.sendKeys(dato);
        try {
            elemento.sendKeys(Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
            waitUntil(WAIT_TIME_500);
            ingresarDatoEnCombo(elemento, dato);
        }
    }
}
