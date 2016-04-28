package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.SeusLoginPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.sikuli.api.robot.Key;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.isIn;

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

    @FindBy(xpath="//td[8]/div")
    WebElementFacade participante;

    @FindBy(xpath="//*[@id='ContactFile_WorkOrders:AssociatedWorkOrdersLV_tb:WorkOrdersCompletenessFilter-inputEl']")
    WebElementFacade filtroEstado;

    @FindBy(xpath="//td/div/div[3]/div/table")
    WebElementFacade table;

    @FindBy(xpath=".//*[@id='ContactFile_WorkOrders:AssociatedWorkOrdersLV_tb:WorkOrderTypeFilter-inputEl']")
    WebElementFacade filtroTipoTransaccion;

    @FindBy(xpath=".//*[@id='ContactFile_WorkOrders:AssociatedWorkOrdersLV_tb:ProductFilter-inputEl']")
    WebElementFacade filtroProducto;

    @FindBy(xpath=".//*[@id='ContactFile_WorkOrders:message:InfoMessage_ExtDV:message']")
    WebElementFacade msjTransaccionNoEncontrada;


    public ContactoOrdenesDeTrabajoPage(WebDriver driver) {
        super(driver);
    }

    public void filtrarTransaccionesPorEstado(String estado){
        filtroEstado.click();
        filtroEstado.sendKeys(estado);
        filtroEstado.sendKeys(Key.ENTER);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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

    //display key de los estados: typeList localization ---> TypeKey.PolicyPeriodStatus
    public void validarFiltroEstado(String filtroEstado) {
        String[] listEstadosCompletos = {"Comprometida", "No tomado", "Retirado", "Vencida", "Rechazado",
        "No renovado", "LegacyConversion", "Revocado", "Exonerado", "Completado"};
        String[] listEstadosAbiertos = {"Cotizado", "Borrador", "Nuevo", "Cotización", "Vinculación contractual",
        "Renovando", "No renovando", "No tomando", "Cancelando", "Revocando", "Rehabilitando"};
        String[] listEstadosTodos = ArrayUtils.addAll(listEstadosCompletos, listEstadosAbiertos);

        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            String estadoStr = cells.get(5).getText();
            if(filtroEstado == "Completo"){
                assertThat(estadoStr, isIn(listEstadosCompletos));
            }else if (filtroEstado == "Abierto"){
                assertThat(estadoStr, isIn(listEstadosAbiertos));
            }else{
                assertThat(estadoStr, isIn(listEstadosTodos));
            }
        }
    }

    public void filtrarTransaccionesPorTransaccion(String filtroTransaccion) {
        this.filtroTipoTransaccion.click();
        this.filtroTipoTransaccion.sendKeys(filtroTransaccion);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.filtroTipoTransaccion.sendKeys(Key.ENTER);
    }

    public void validarTransaccionesPorTransaccion(String filtroTransaccion) {
        List<WebElement> allRows = table.findElements(By.tagName("tr"));

        try {
            for (WebElement row : allRows) {
                List<WebElement> cells = row.findElements(By.tagName("td"));
                String transaccionStr = cells.get(4).getText();
                assertThat(transaccionStr, containsString(filtroTransaccion));
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void filtrarTransaccionesPorProducto(String filtroProducto) {
        this.filtroProducto.click();
        this.filtroProducto.sendKeys(filtroProducto);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.filtroProducto.sendKeys(Key.ENTER);
    }

    public void validarTransaccionesPorProducto(String filtroProducto) {
        List<WebElement> allRows = table.findElements(By.tagName("tr"));

        try {
            for (WebElement row : allRows) {
                List<WebElement> cells = row.findElements(By.tagName("td"));
                String transaccionStr = cells.get(2).getText();
                assertThat(transaccionStr, containsString(filtroProducto));
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void validarMensaje(String mensaje) {
        assertThat(msjTransaccionNoEncontrada.getText().toString(), containsString(mensaje));
    }
}