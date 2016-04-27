package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.SeusLoginPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.sikuli.api.robot.Key;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ContactoOrdenesDeTrabajoPage extends SeusLoginPage {

    @FindBy(xpath=".//*[@id='ContactFile:MenuLinks:ContactFile_ContactFile_WorkOrders']/div")
    WebElementFacade mnuTransaccionesPoliza;

    @FindBy(xpath="//div[3]/div/table/tbody/tr/td/div")
    WebElementFacade fechaCreacion;

    @FindBy(xpath="//div/table/tbody/tr/td[2]/div")
    WebElementFacade poliza;

    @FindBy(xpath="//td[3]/div")
    WebElementFacade producto;

    @FindBy(xpath="//td[4]/div")
    WebElementFacade numeroTransaccion;

    @FindBy(xpath="//td[5]/div")
    WebElementFacade tipo;

    @FindBy(xpath="//td[6]/div")
    WebElementFacade estado;

    @FindBy(xpath="//td[7]/div")
    WebElementFacade fechaFin;

    @FindBy(xpath="//td[7]/div")
    WebElementFacade participante;

    @FindBy(xpath="//*[@id='ContactFile_WorkOrders:AssociatedWorkOrdersLV_tb:WorkOrdersCompletenessFilter-inputEl']")
    WebElementFacade filtroEstado;

    @FindBy(xpath=".//*[@id='ContactFile_WorkOrders:AssociatedWorkOrdersLV_tb:WorkOrderTypeFilter-inputEl']")
    WebElementFacade filtroTipoTransaccion;

    @FindBy(xpath=".//*[@id='ContactFile_WorkOrders:AssociatedWorkOrdersLV_tb:ProductFilter-inputEl']")
    WebElementFacade filtroProducto;


    public ContactoOrdenesDeTrabajoPage(WebDriver driver) {
        super(driver);
    }

    public void filtrarTransaccionesPorEstado(String estado){
        filtroEstado.click();
        filtroEstado.sendKeys(estado);
        filtroEstado.sendKeys(Key.ENTER);
    }

    public void seleccionarTransacciones(){
        this.mnuTransaccionesPoliza.click();
    }

    public void validarCamposTransacciones(String fechaCreacion, String poliza, String producto, String numeroTransaccion,
                                           String tipo, String estado, String fechaFin, String participante) {
        assertThat(this.fechaCreacion.getText().toString(), containsString(fechaCreacion));
        assertThat(this.poliza.getText().toString(), containsString(poliza));
        assertThat(this.producto.getText().toString(), containsString(producto));
        assertThat(this.numeroTransaccion.getText().toString(), containsString(numeroTransaccion));
        assertThat(this.tipo.getText().toString(), containsString(tipo));
        assertThat(this.estado.getText().toString(), containsString(estado));
        assertThat(this.fechaFin.getText().toString(), containsString(fechaFin));
        assertThat(this.participante.getText().toString(), containsString(participante));
    }
}
