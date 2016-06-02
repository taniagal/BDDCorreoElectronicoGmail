package com.sura.policycenter.selenium.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class BusquedaDeOrganizacionPage extends PageObject {

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
    @FindBy(xpath=".//*[@id='OrganizationSearchPage:OrganizationSearchScreen:OrganizationSearchDV:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade txtRazonSocial;
    @FindBy(xpath=".//*[@id='OrganizationSearchPage:OrganizationSearchScreen:OrganizationSearchResultsLV:0:Name']")
    private WebElementFacade linkRazonSocial;

    public BusquedaDeOrganizacionPage(WebDriver driver) {
        super(driver);
    }

    public void filtrarPorAsignado(String usuario) {
        txtAsignadoA.sendKeys(usuario);
    }

    public void validarResultado(String prioridad, String estadoActividad,
                                 String asunto, String id, String titularCuenta, String producto, String asignadoPor,
                                 String estado) {
        btnBuscar.click();
        MatcherAssert.assertThat(this.grdFechaVencimiento.getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(this.grdPrioridad.getText(), Matchers.containsString(prioridad));
        MatcherAssert.assertThat(this.grdEstadoActividad.getText(), Matchers.containsString(estadoActividad));
        MatcherAssert.assertThat(this.grdAsunto.getText(), Matchers.containsString(asunto));
        MatcherAssert.assertThat(this.grdId.getText(), Matchers.containsString(id));
        MatcherAssert.assertThat(this.grdCuenta.getText(), Matchers.containsString(titularCuenta));
        MatcherAssert.assertThat(this.grdProducto.getText(), Matchers.containsString(producto));
        MatcherAssert.assertThat(this.grdAsignadoPor.getText(), Matchers.containsString(asignadoPor));
        MatcherAssert.assertThat(this.grdEstado.getText(), Matchers.containsString(estado));
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
        MatcherAssert.assertThat(this.msgFiltrosRequeridos.getText(), Matchers.containsString(mensaje));
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

    public void ingresarRazonSocial(String razonSocial) {
        txtRazonSocial.clear();
        txtRazonSocial.sendKeys(razonSocial);
        txtRazonSocial.sendKeys(Keys.ENTER);
    }

    public void validarOrganizacion(String nomOrganizacion) {
        linkRazonSocial.waitUntilClickable();
        MatcherAssert.assertThat(linkRazonSocial.getText(), Matchers.containsString(nomOrganizacion));
    }
}
