package com.sura.guidewire.policycenter.pages.contacto;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.lang3.ArrayUtils;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class ContactoOrdenesDeTrabajoPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='ContactFile:MenuLinks:ContactFile_ContactFile_WorkOrders']/div")
    private WebElementFacade mnuTransaccionesPoliza;
    @FindBy(xpath = "//div[3]/div/table/tbody/tr/td/div")
    private WebElementFacade fechaCreacion;
    @FindBy(xpath = "//td[3]/div")
    private WebElementFacade producto;
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

    public ContactoOrdenesDeTrabajoPage(WebDriver driver) {
        super(driver);
    }

    public void filtrarTransaccionesPorEstado(String estado) {
        waitFor(filtroEstado).waitUntilPresent();
        filtroEstado.click();
        filtroEstado.sendKeys(estado);
        filtroEstado.sendKeys(Keys.ENTER);
        esperarHasta(TIEMPO_3000);
    }

    public void seleccionarTransacciones() {
        waitFor(mnuTransaccionesPoliza).waitUntilPresent();
        this.mnuTransaccionesPoliza.click();
    }

    public void validarCamposTransacciones(String poliza, String producto, String numeroTransaccion,
                                           String tipo, String estado, String participante) {
        waitFor(fechaCreacion).waitUntilPresent();
        waitForTextToAppear(producto, TIEMPO_30000);
        String xpathTabla = ".//*[@id='ContactFile_WorkOrders:AssociatedWorkOrdersLV-body']/*/table/tbody/tr[" + this.encontrarTransaccion(poliza).toString() + "]";
        MatcherAssert.assertThat(findBy(xpathTabla + "/td[1]/div").waitUntilVisible().getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(findBy(xpathTabla + "/td[2]/div").getText(), Is.is(Matchers.equalTo(poliza)));
        MatcherAssert.assertThat(findBy(xpathTabla + "/td[3]/div").getText(), Is.is(Matchers.equalTo(producto)));
        MatcherAssert.assertThat(findBy(xpathTabla + "/td[4]/div").getText(), Is.is(Matchers.equalTo(numeroTransaccion)));
        MatcherAssert.assertThat(findBy(xpathTabla + "/td[5]/div").getText(), Matchers.containsString(tipo));
        MatcherAssert.assertThat(findBy(xpathTabla + "/td[6]/div").getText(), Matchers.containsString(estado));
        MatcherAssert.assertThat(findBy(xpathTabla + "/td[7]/div").getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(findBy(xpathTabla + "/td[8]/div").getText(), Matchers.containsString(participante));
    }

    public Integer encontrarTransaccion(String idTransaccion) {
        waitFor(tablaTransaccionesDeContacto).waitUntilPresent();
        Integer filaTransaccion = 1;
        List<WebElement> filas = tablaTransaccionesDeContacto.findElements(By.tagName("tr"));
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if (idTransaccion.equals(columna.get(CONSTANTE_1).getText())) {
                return filaTransaccion;
            }
            filaTransaccion++;
        }
        return filaTransaccion;
    }

    //display key de los estados: typeList localization ---> TypeKey.PolicyPeriodStatus
    public void validarFiltroEstado(String filtroEstado) {
        List<WebElement> cells;
        String estadoStr;
        String[] listEstadosCompletos = {"Comprometida", "No tomado", "Retirado", "Vencida", "Rechazado",
                "No renovado", "LegacyConversion", "Revocado", "Exonerado", "Completado", "Expedida", "Declinada"};
        String[] listEstadosAbiertos = {"Cotizado", "Borrador", "Nuevo", "Cotización", "Vinculación contractual",
                "Renovando", "No renovando", "No tomando", "Cancelando", "Revocando", "Rehabilitando"};
        String[] listEstadosTodos = ArrayUtils.addAll(listEstadosCompletos, listEstadosAbiertos);
        waitFor(table).waitUntilVisible();
        List<WebElement> allRows;
        try {
            allRows = table.findElements(By.tagName("tr"));
        } catch (ElementNotVisibleException e) {
            LOGGER.info("ElementNotVisibleException " + e);
            esperarHasta(TIEMPO_2000);
            allRows = table.findElements(By.tagName("tr"));
        }
        for (WebElement row : allRows) {
            try {
                cells = row.findElements(By.tagName("td"));
                estadoStr = cells.get(CONSTANTE_5).getText();
            } catch (StaleElementReferenceException e) {
                LOGGER.info("StaleElementReferenceException " + e);
                esperarHasta(TIEMPO_3000);
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
        esperarHasta(TIEMPO_2000);
        List<WebElement> allRows = table.findElements(By.tagName("tr"));

        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            String transaccionStr = cells.get(CONSTANTE_4).getText();
            MatcherAssert.assertThat(transaccionStr, Matchers.containsString(filtroTransaccion));
        }
    }

    public void filtrarTransaccionesPorProducto(String filtroProducto) {
        esperarHasta(TIEMPO_1000);
        waitFor(this.filtroProducto).waitUntilPresent();
        esperarHasta(TIEMPO_2000);
        this.filtroProducto.click();
        this.filtroProducto.sendKeys(filtroProducto);
        this.filtroProducto.sendKeys(Keys.ENTER);
    }

    public void validarTransaccionesPorProducto(String filtroProducto) {
        waitFor(table).waitUntilVisible();
        esperarHasta(TIEMPO_2000);
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
