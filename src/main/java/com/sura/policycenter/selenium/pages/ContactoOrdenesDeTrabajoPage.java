package com.sura.policycenter.selenium.pages;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isIn;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.sikuli.api.robot.Key;
import com.sura.guidewire.selenium.SeusLoginPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;

public class ContactoOrdenesDeTrabajoPage extends SeusLoginPage {

    @FindBy(xpath=".//*[@id='ContactFile:MenuLinks:ContactFile_ContactFile_WorkOrders']/div")
    private WebElementFacade mnuTransaccionesPoliza;
    @FindBy(xpath="//div[3]/div/table/tbody/tr/td/div")
    private WebElementFacade fechaCreacion;
    @FindBy(xpath="//div/table/tbody/tr/td[2]/div")
    private WebElementFacade poliza;
    @FindBy(xpath="//td[3]/div")
    private WebElementFacade producto;
    @FindBy(xpath="//td[4]/div")
    private WebElementFacade numeroTransaccion;
    @FindBy(xpath="//td[5]/div")
    private WebElementFacade tipo;
    @FindBy(xpath="//td[6]/div")
    private WebElementFacade estado;
    @FindBy(xpath="//td[7]/div")
    private WebElementFacade fechaFin;
    @FindBy(xpath="//td[8]/div")
    private WebElementFacade participante;
    @FindBy(xpath="//*[@id='ContactFile_WorkOrders:AssociatedWorkOrdersLV_tb:WorkOrdersCompletenessFilter-inputEl']")
    private WebElementFacade filtroEstado;
    @FindBy(xpath="//td/div/div[3]/div/table")
    private WebElementFacade table;
    @FindBy(xpath=".//*[@id='ContactFile_WorkOrders:AssociatedWorkOrdersLV_tb:WorkOrderTypeFilter-inputEl']")
    private WebElementFacade filtroTipoTransaccion;
    @FindBy(xpath=".//*[@id='ContactFile_WorkOrders:AssociatedWorkOrdersLV_tb:ProductFilter-inputEl']")
    private WebElementFacade filtroProducto;
    @FindBy(xpath=".//*[@id='ContactFile_WorkOrders:message:InfoMessage_ExtDV:message']")
    private WebElementFacade msjTransaccionNoEncontrada;

    public ContactoOrdenesDeTrabajoPage(WebDriver driver) {
        super(driver);
    }

    public void filtrarTransaccionesPorEstado(String estado){
        filtroEstado.click();
        filtroEstado.sendKeys(estado);
        filtroEstado.sendKeys(Key.ENTER);
        waitABit(2000);
    }

    public void seleccionarTransacciones(){
        this.mnuTransaccionesPoliza.click();
    }

    public void validarCamposTransacciones(String poliza, String producto, String numeroTransaccion,
                                           String tipo, String estado, String participante) {
        assertThat(this.fechaCreacion.getText(), is(notNullValue()));
        assertThat(this.poliza.getText(), containsString(poliza));
        assertThat(this.producto.getText(), containsString(producto));
        assertThat(this.numeroTransaccion.getText(), containsString(numeroTransaccion));
        assertThat(this.tipo.getText(), containsString(tipo));
        assertThat(this.estado.getText(), containsString(estado));
        assertThat(this.fechaFin.getText(), is(notNullValue()));
        assertThat(this.participante.getText(), containsString(participante));
    }

    //display key de los estados: typeList localization ---> TypeKey.PolicyPeriodStatus
    public void validarFiltroEstado(String filtroEstado) {
        String[] listEstadosCompletos = {"Comprometida", "No tomado", "Retirado", "Vencida", "Rechazado",
        "No renovado", "LegacyConversion", "Revocado", "Exonerado", "Completado", "Expedida"};
        String[] listEstadosAbiertos = {"Cotizado", "Borrador", "Nuevo", "Cotización", "Vinculación contractual",
        "Renovando", "No renovando", "No tomando", "Cancelando", "Revocando", "Rehabilitando"};
        String[] listEstadosTodos = ArrayUtils.addAll(listEstadosCompletos, listEstadosAbiertos);

        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            String estadoStr = cells.get(5).getText();
            if(("Completo").equals(filtroEstado)){
                assertThat(estadoStr, isIn(listEstadosCompletos));
            }else if (("Abierto").equals(filtroEstado)){
                assertThat(estadoStr, isIn(listEstadosAbiertos));
            }else{
                assertThat(estadoStr, isIn(listEstadosTodos));
            }
        }
    }

    public void filtrarTransaccionesPorTransaccion(String filtroTransaccion) {
        this.filtroTipoTransaccion.click();
        this.filtroTipoTransaccion.sendKeys(filtroTransaccion);
        waitABit(1000);
        this.filtroTipoTransaccion.sendKeys(Key.ENTER);
    }

    public void validarTransaccionesPorTransaccion(String filtroTransaccion) {
        List<WebElement> allRows = table.findElements(By.tagName("tr"));

        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            String transaccionStr = cells.get(4).getText();
            assertThat(transaccionStr, containsString(filtroTransaccion));
        }
    }

    public void filtrarTransaccionesPorProducto(String filtroProducto) {
        this.filtroProducto.click();
        this.filtroProducto.sendKeys(filtroProducto);
        waitABit(1000);
        this.filtroProducto.sendKeys(Key.ENTER);
    }

    public void validarTransaccionesPorProducto(String filtroProducto) {
        List<WebElement> allRows = table.findElements(By.tagName("tr"));

        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            String transaccionStr = cells.get(2).getText();
            assertThat(transaccionStr, containsString(filtroProducto));
        }
    }

    public void validarMensaje(String mensaje) {
        assertThat(msjTransaccionNoEncontrada.getText(), containsString(mensaje));
    }
}
