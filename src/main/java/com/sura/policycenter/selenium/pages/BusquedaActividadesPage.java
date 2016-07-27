package com.sura.policycenter.selenium.pages;


import com.sura.commons.selenium.Commons;
import java.util.Map;
import java.util.concurrent.TimeUnit;
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
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab']")
    private WebElementFacade menuEscritorio;
    @FindBy(xpath = ".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset']")
    private WebElementFacade botonRestablecer;

    public BusquedaActividadesPage(WebDriver driver) {
        super(driver);
    }

    public void irABuscarActividades() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(menuBuscar).shouldBePresent();
        menuBuscar.click();
        commons.waitUntil(2000);
        menuBuscarActividades.click();
        waitForTextToAppear("Búsqueda");
        this.limpiarFiltros();
    }

    public void filtrarPorAsignado(String usuario) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(txtAsignadoA).waitUntilPresent();
        txtAsignadoA.sendKeys(usuario);
    }

    public void validarResultado(ExamplesTable resultadoFiltroActividades) {
        Map<String, String> exampleTable = resultadoFiltroActividades.getRows().get(0);
        //withTimeoutOf(10, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        btnBuscar.waitUntilVisible().waitUntilClickable().click();
        grdFechaVencimiento.waitUntilPresent().waitUntilVisible();
        //withTimeoutOf(15, TimeUnit.SECONDS).waitFor(grdFechaVencimiento).waitUntilPresent();
        MatcherAssert.assertThat(this.grdFechaVencimiento.getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(this.grdPrioridad.getText(), Is.is(Matchers.equalTo(exampleTable.get("prioridad"))));
        MatcherAssert.assertThat(this.grdEstadoActividad.getText(), Is.is(Matchers.equalTo(exampleTable.get("estadoActividad"))));
        MatcherAssert.assertThat(this.grdAsunto.getText(), Is.is(Matchers.equalTo(exampleTable.get("asunto"))));
        MatcherAssert.assertThat(this.grdId.getText(), Is.is(Matchers.equalTo(exampleTable.get("id"))));
        MatcherAssert.assertThat(this.grdCuenta.getText(), Is.is(Matchers.equalTo(exampleTable.get("titularCuenta"))));
        MatcherAssert.assertThat(this.grdProducto.getText(), Matchers.containsString(exampleTable.get("producto")));
        MatcherAssert.assertThat(this.grdAsignadoPor.getText(), Matchers.containsString(exampleTable.get("asignadoPor")));
        MatcherAssert.assertThat(this.grdEstado.getText(), Is.is(Matchers.equalTo(exampleTable.get("estado"))));
        menuEscritorio.click();
        waitForTextToAppear("Mis actividades");
    }

    public void limpiarFiltros() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(botonRestablecer).waitUntilPresent();
        botonRestablecer.click();
        commons.waitUntil(2000);
    }

    public void filtrarPorNumeroDePoliza(String numeroPoliza) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(txtNumeroPoliza).waitUntilPresent();
        txtNumeroPoliza.sendKeys(numeroPoliza);
    }

    public void filtrarPorNumeroDeCuenta(String numeroCuenta) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(txtNumeroCuenta).waitUntilPresent();
        txtNumeroCuenta.sendKeys(numeroCuenta);
    }

    public void buscarSinFiltro() {
        this.limpiarFiltros();
    }

    public void validarMensjeFiltroRequerido(String mensaje) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        btnBuscar.waitUntilVisible().waitUntilClickable().click();
        waitForPresenceOf(".//*[@id='ActivitySearch:ActivitySearchScreen:_msgs']/div");
        MatcherAssert.assertThat(this.msgFiltrosRequeridos.getText(), Matchers.containsString(mensaje));
    }

    public void buscarPorFiltrosUsuarioYPrioridad(String usuario, String prioridad) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(txtAsignadoA).waitUntilPresent();
        txtAsignadoA.sendKeys(usuario);
        txtPrioridad.clear();
        txtPrioridad.sendKeys(prioridad);
        txtPrioridad.sendKeys(Keys.ENTER);
    }

    public void buscarPorFiltrosUsuarioYEstadoDeActividad(String usuario, String estadoActividad) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(txtAsignadoA).waitUntilPresent();
        txtAsignadoA.sendKeys(usuario);
        txtEstadoActividad.clear();
        txtEstadoActividad.sendKeys(estadoActividad);
        txtEstadoActividad.sendKeys(Keys.ENTER);
    }

    public void buscarPorFiltrosUsuarioYVencida(String usuario, String vencida) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(txtAsignadoA).waitUntilPresent();
        txtAsignadoA.sendKeys(usuario);
        txtVencida.clear();
        txtVencida.sendKeys(vencida);
        txtVencida.sendKeys(Keys.ENTER);
    }

    public void buscarPorFiltroOpcional(String estadoActividad) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(txtAsignadoA).waitUntilPresent();
        txtEstadoActividad.clear();
        txtEstadoActividad.sendKeys(estadoActividad);
        txtEstadoActividad.sendKeys(Keys.ENTER);
    }

}
