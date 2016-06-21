package com.sura.policycenter.selenium.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


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
    private @FindBy(xpath = ".//*[@id='TabBar:SearchTab']")
    WebElementFacade menuBuscar;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ActivitySearch']/div")
    private WebElementFacade menuBuscarActividades;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab']")
    private WebElementFacade menuEscritorio;

    public BusquedaActividadesPage(WebDriver driver) {
        super(driver);
    }

    public void irABuscarActividades() {
        waitFor(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='TabBar:SearchTab']")));
        waitABit(1000);
        menuBuscar.click();
        waitForTextToAppear("Buscar");
        waitFor(ExpectedConditions.visibilityOf(menuBuscarActividades));
        waitFor(ExpectedConditions.elementToBeClickable(By.xpath("//td[@id='Search:MenuLinks:Search_ActivitySearch']/div/span")));
        waitABit(1000);
        menuBuscarActividades.click();
        waitForTextToAppear("Búsqueda");
        this.limpiarFiltros();
    }

    public void filtrarPorAsignado(String usuario) {
        waitFor(ExpectedConditions.visibilityOf(txtAsignadoA));
        txtAsignadoA.sendKeys(usuario);
    }

    public void validarResultado(ExamplesTable resultadoFiltroActividades) {
        Map<String, String> exampleTable = resultadoFiltroActividades.getRows().get(0);
        waitFor(ExpectedConditions.elementToBeClickable(btnBuscar));
        btnBuscar.click();
//        waitForTextToAppear("Normal", 5000);
        waitABit(1000);
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitiesSearchLV-body']")));
        waitFor(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ActivitySearch:ActivitySearchScreen:ActivitiesSearchLV-body']")));
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

    public void limpiarFiltros(){
        txtAsignadoA.clear();
        txtEstadoActividad.clear();
        txtNumeroPoliza.clear();
        txtNumeroCuenta.clear();
        txtPrioridad.clear();
        txtVencida.clear();
    }

    public void filtrarPorNumeroDePoliza(String numeroPoliza) {
        waitFor(ExpectedConditions.visibilityOf(txtNumeroPoliza));
        txtNumeroPoliza.sendKeys(numeroPoliza);
    }

    public void filtrarPorNumeroDeCuenta(String numeroCuenta) {
        waitFor(ExpectedConditions.visibilityOf(txtNumeroCuenta));
        txtNumeroCuenta.sendKeys(numeroCuenta);
    }

    public void buscarSinFiltro() {
        waitABit(2000);
        this.limpiarFiltros();
    }

    public void validarMensjeFiltroRequerido(String mensaje) {
        try {
            waitFor(ExpectedConditions.elementToBeClickable(btnBuscar));
            btnBuscar.click();
            waitForPresenceOf(".//*[@id='ActivitySearch:ActivitySearchScreen:_msgs']/div");
            MatcherAssert.assertThat(this.msgFiltrosRequeridos.getText(), Matchers.containsString(mensaje));
        }catch (StaleElementReferenceException elemento){
            elemento.printStackTrace();
        }
    }

    public void buscarPorFiltrosUsuarioYPrioridad(String usuario, String prioridad) {
        waitFor(ExpectedConditions.visibilityOf(txtAsignadoA));
        txtAsignadoA.sendKeys(usuario);
        txtPrioridad.clear();
        txtPrioridad.sendKeys(prioridad);
        txtPrioridad.sendKeys(Keys.ENTER);
    }

    public void buscarPorFiltrosUsuarioYEstadoDeActividad(String usuario, String estadoActividad) {
        waitFor(ExpectedConditions.visibilityOf(txtAsignadoA));
        waitFor(ExpectedConditions.elementToBeClickable(txtAsignadoA));
        txtAsignadoA.sendKeys(usuario);
        txtEstadoActividad.clear();
        txtEstadoActividad.sendKeys(estadoActividad);
        txtEstadoActividad.sendKeys(Keys.ENTER);
    }

    public void buscarPorFiltrosUsuarioYVencida(String usuario, String vencida) {
        waitFor(ExpectedConditions.visibilityOf(txtAsignadoA));
        txtAsignadoA.sendKeys(usuario);
        txtVencida.clear();
        txtVencida.sendKeys(vencida);
        txtVencida.sendKeys(Keys.ENTER);
    }

    public void buscarPorFiltroOpcional(String estadoActividad) {
        waitFor(ExpectedConditions.visibilityOf(txtEstadoActividad));
        txtEstadoActividad.clear();
        txtEstadoActividad.sendKeys(estadoActividad);
        txtEstadoActividad.sendKeys(Keys.ENTER);
    }

}