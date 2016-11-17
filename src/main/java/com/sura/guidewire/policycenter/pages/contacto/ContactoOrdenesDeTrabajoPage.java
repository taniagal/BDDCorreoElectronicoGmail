package com.sura.guidewire.policycenter.pages.contacto;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.lang3.ArrayUtils;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class ContactoOrdenesDeTrabajoPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='ContactFile:MenuLinks:ContactFile_ContactFile_WorkOrders']/div")
    private WebElementFacade mnuTransaccionesPoliza;
    @FindBy(xpath = "//div[3]/div/table/tbody/tr/td/div")
    private WebElementFacade fechaCreacion;
    @FindBy(xpath = "//div/table/tbody/tr/td[2]/div")
    private WebElementFacade poliza;
    @FindBy(xpath = "//td[3]/div")
    private WebElementFacade producto;
    @FindBy(xpath = "//td[4]/div")
    private WebElementFacade numeroTransaccion;
    @FindBy(xpath = "//td[5]/div")
    private WebElementFacade tipo;
    @FindBy(xpath = "//td[6]/div")
    private WebElementFacade estado;
    @FindBy(xpath = "//td[7]/div")
    private WebElementFacade fechaFin;
    @FindBy(xpath = "//td[8]/div")
    private WebElementFacade participante;
    @FindBy(xpath = "//*[@id='ContactFile_WorkOrders:AssociatedWorkOrdersLV_tb:WorkOrdersCompletenessFilter-inputEl']")
    private WebElementFacade filtroEstado;
    @FindBy(xpath = "//td/div/div[3]/div/table")
    private WebElementFacade table;
    @FindBy(xpath = ".//*[@id='ContactFile_WorkOrders:AssociatedWorkOrdersLV_tb:WorkOrderTypeFilter-inputEl']")
    private WebElementFacade filtroTipoTransaccion;
    @FindBy(xpath = ".//*[@id='ContactFile_WorkOrders:AssociatedWorkOrdersLV_tb:ProductFilter-inputEl']")
    private WebElementFacade filtroProducto;
    @FindBy(xpath = ".//*[@id='ContactFile_WorkOrders:message:InfoMessage_ExtDV:message']")
    private WebElementFacade msjTransaccionNoEncontrada;
    @FindBy(xpath = ".//*[@id='ContactFile_WorkOrders:AssociatedWorkOrdersLV-body']")
    private WebElementFacade tablaTransaccionesDeContacto;

    protected static final int CONSTANTE_5 = 5;
    protected static final int CONSTANTE_4 = 4;
    protected static final int CONSTANTE_3 = 3;
    protected static final int CONSTANTE_2 = 2;

    public ContactoOrdenesDeTrabajoPage(WebDriver driver) {
        super(driver);
    }

    public void filtrarTransaccionesPorEstado(String estado) {
        waitFor(filtroEstado).waitUntilPresent();
        filtroEstado.click();
        filtroEstado.sendKeys(estado);
        filtroEstado.sendKeys(Keys.ENTER);
        waitUntil(WAIT_TIME_3000);
    }

    public void seleccionarTransacciones() {
        waitFor(mnuTransaccionesPoliza).waitUntilPresent();
        this.mnuTransaccionesPoliza.click();
    }

    public void validarCamposTransacciones(String poliza, String producto, String numeroTransaccion,
                                           String tipo, String estado, String participante) {
        waitFor(fechaCreacion).waitUntilPresent();
        waitUntil(WAIT_TIME_3000);
        MatcherAssert.assertThat(this.fechaCreacion.getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(this.poliza.getText(), Matchers.containsString(poliza));
        MatcherAssert.assertThat(this.producto.getText(), Matchers.containsString(producto));
        MatcherAssert.assertThat(this.numeroTransaccion.getText(), Matchers.containsString(numeroTransaccion));
        MatcherAssert.assertThat(this.tipo.getText(), Matchers.containsString(tipo));
        MatcherAssert.assertThat(this.estado.getText(), Matchers.containsString(estado));
        MatcherAssert.assertThat(this.fechaFin.getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(this.participante.getText(), Matchers.containsString(participante));
    }

    //display key de los estados: typeList localization ---> TypeKey.PolicyPeriodStatus
    public void validarFiltroEstado(String filtroEstado) {
        List<WebElement> cells;
        String estadoStr;
        String[] listEstadosCompletos = {"Comprometida", "No tomado", "Retirado", "Vencida", "Rechazado",
                "No renovado", "LegacyConversion", "Revocado", "Exonerado", "Completado", "Expedida"};
        String[] listEstadosAbiertos = {"Cotizado", "Borrador", "Nuevo", "Cotización", "Vinculación contractual",
                "Renovando", "No renovando", "No tomando", "Cancelando", "Revocando", "Rehabilitando"};
        String[] listEstadosTodos = ArrayUtils.addAll(listEstadosCompletos, listEstadosAbiertos);

        waitFor(table).waitUntilVisible();

        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            try {
                cells = row.findElements(By.tagName("td"));
                estadoStr = cells.get(CONSTANTE_5).getText();
            } catch (StaleElementReferenceException e) {
                LOGGER.info("StaleElementReferenceException " + e);
                waitUntil(WAIT_TIME_3000);
                cells = row.findElements(By.tagName("td"));
                estadoStr = cells.get(CONSTANTE_5).getText();
            }
            if (("Completo").equals(filtroEstado)) {
                MatcherAssert.assertThat(estadoStr, Matchers.isIn(listEstadosCompletos));
            } else if (("Abierto").equals(filtroEstado)) {
                MatcherAssert.assertThat(estadoStr, Matchers.isIn(listEstadosAbiertos));
            } else {
                MatcherAssert.assertThat(estadoStr, Matchers.isIn(listEstadosTodos));
            }
        }
    }

    public void filtrarTransaccionesPorTransaccion(String filtroTransaccion) {
        waitFor(filtroTipoTransaccion).waitUntilPresent();
        this.filtroTipoTransaccion.click();
        this.filtroTipoTransaccion.sendKeys(filtroTransaccion);
        this.filtroTipoTransaccion.sendKeys(Keys.ENTER);
    }

    public void validarTransaccionesPorTransaccion(String filtroTransaccion) {
        waitFor(table).waitUntilVisible();
        waitUntil(WAIT_TIME_2000);
        List<WebElement> allRows = table.findElements(By.tagName("tr"));

        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            String transaccionStr = cells.get(CONSTANTE_4).getText();
            MatcherAssert.assertThat(transaccionStr, Matchers.containsString(filtroTransaccion));
        }
    }

    public void filtrarTransaccionesPorProducto(String filtroProducto) {
        waitUntil(WAIT_TIME_1000);
        waitFor(this.filtroProducto).waitUntilPresent();
        waitUntil(WAIT_TIME_2000);
        this.filtroProducto.click();
        this.filtroProducto.sendKeys(filtroProducto);
        this.filtroProducto.sendKeys(Keys.ENTER);
    }

    public void validarTransaccionesPorProducto(String filtroProducto) {
        waitFor(table).waitUntilVisible();
        waitUntil(WAIT_TIME_2000);
        List<WebElement> allRows = table.findElements(By.tagName("tr"));

        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            String transaccionStr = cells.get(CONSTANTE_2).getText();
            MatcherAssert.assertThat(transaccionStr, Matchers.containsString(filtroProducto));
        }
    }

    public void validarMensaje(String mensaje) {
        waitFor(msjTransaccionNoEncontrada).waitUntilVisible();
        MatcherAssert.assertThat(msjTransaccionNoEncontrada.getText(), Matchers.containsString(mensaje));
    }

    public void validarTransaccionNoExistentePolizaColectiva(String transaccion) {
        waitFor(tablaTransaccionesDeContacto);
        List<WebElement> allRows = tablaTransaccionesDeContacto.findElements(By.tagName("tr"));
        String existeTransaccion = "No existe la póliza";
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (transaccion.equals(cells.get(CONSTANTE_3).getText())) {
                existeTransaccion = "Se encontró la póliza en las transacciones";
            }
        }
        MatcherAssert.assertThat("No existe la póliza", Is.is(Matchers.equalTo(existeTransaccion)));
    }
}
