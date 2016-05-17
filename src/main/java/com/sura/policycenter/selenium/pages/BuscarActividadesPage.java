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

public class BuscarActividadesPage extends SeusLoginPage {

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


    public BuscarActividadesPage(WebDriver driver) {super(driver);}

    public void buscarActividades() {
        try{
            Actions act = new Actions(getDriver());
            mnuBuscar.click();
            Thread.sleep(1000);
            mnuBuscar.click();
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.moveToElement(mnuBuscarActividades).click().build().perform();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void filtrarPorAsignado(String usuario) {
        txtAsignadoA.sendKeys("Alice Applegate");
        btnBuscar.click();
    }

    public void validarResultado(String icono, String fechaVencimiento, String prioridad, String estadoActividad,
                                 String asunto, String id, String titularCuenta, String producto, String asignadoPor,
                                 String estado) {
        assertThat(this.grdIcono.getText(), is(notNullValue()));
        assertThat(this.grdFechaVencimiento.getText(), is(notNullValue()));
        assertThat(this.grdPrioridad.getText(), containsString(prioridad));
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
        txtNumeroPoliza.sendKeys(numeroPoliza);
        btnBuscar.click();
    }

    public void filtrarPorNumeroDeCuenta(String numeroCuenta) {
        txtNumeroPoliza.sendKeys(numeroCuenta);
        btnBuscar.click();
    }
}
