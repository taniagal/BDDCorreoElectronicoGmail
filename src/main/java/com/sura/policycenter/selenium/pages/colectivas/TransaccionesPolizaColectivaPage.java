package com.sura.policycenter.selenium.pages.colectivas;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class TransaccionesPolizaColectivaPage extends PageObject{

    @FindBy(xpath = ".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_CollectivePolicy_Ext']/div/span")
    WebElementFacade menuTransaccionesColectivas;
    @FindBy(xpath = ".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_WorkOrders']/div/span")
    WebElementFacade menuTransaccionesIndividual;
    @FindBy(xpath = ".//*[@id='AccountFile_CollectivePolicy_Ext:1-body']")
    WebElementFacade tablaTransaccionesColectiva;
    @FindBy(xpath = ".//*[@id='AccountFile_WorkOrders:AccountFile_WorkOrdersScreen:ttlBar']")
    WebElementFacade tituloTransaccionesIndividual;
    @FindBy(xpath = "//td/div/div[2]/div/table/tbody/tr/td/div")
    WebElementFacade columnaCrearFecha;
    @FindBy(xpath = "//div/table/tbody/tr/td[2]/div")
    WebElementFacade columnaNumeroPoliza;
    @FindBy(xpath = "//td[3]/div")
    WebElementFacade columnaProducto;
    @FindBy(xpath = "//td[4]/div")
    WebElementFacade columnaTipo;
    @FindBy(xpath = "//td[5]/div")
    WebElementFacade columnaEstado;
    @FindBy(xpath = "//td[6]/div")
    WebElementFacade columnaFechaFinalizacion;
    @FindBy(xpath = "//td[7]/div")
    WebElementFacade columnaParticipante;
    @FindBy(xpath = ".//*[@id='AccountFile_CollectivePolicy_Ext:0:PolicyNumber']")
    WebElementFacade numeroPoliza;


    public TransaccionesPolizaColectivaPage(WebDriver driver){
        super(driver);
    }

    public void validarOpcionesDelMenu() {
        waitFor(menuTransaccionesColectivas);
        menuTransaccionesColectivas.shouldBeVisible();
        menuTransaccionesIndividual.shouldBeVisible();
        menuTransaccionesColectivas.shouldBeEnabled();
        menuTransaccionesIndividual.shouldBeEnabled();
        MatcherAssert.assertThat(menuTransaccionesColectivas.getText(), Is.is(Matchers.equalTo("Transacciones de póliza colectiva")));
        MatcherAssert.assertThat(menuTransaccionesIndividual.getText(), Is.is(Matchers.equalTo("Transacciones de póliza individual")));
    }

    public void seleccionarLaOpcionTransaccionesPolizaIndividual() {
        waitFor(menuTransaccionesIndividual);
        menuTransaccionesIndividual.click();
    }

    public void validarTransaccionesDePolizaColectiva(ExamplesTable transacciones) {
        Map<String, String> transaccionesColectiva = transacciones.getRows().get(0);
        menuTransaccionesColectivas.click();
        waitForTextToAppear("Transacciones de póliza colectiva del archivo de la cuenta");
        waitFor(tablaTransaccionesColectiva);
        columnaCrearFecha.shouldBeVisible();
        columnaNumeroPoliza.shouldBeVisible();
        columnaProducto.shouldBeVisible();
        columnaTipo.shouldBeVisible();
        columnaEstado.shouldBeVisible();
        columnaFechaFinalizacion.shouldBeVisible();
        columnaParticipante.shouldBeVisible();
        MatcherAssert.assertThat(columnaCrearFecha.getText(), Matchers.notNullValue());
        MatcherAssert.assertThat(numeroPoliza.getText(), Is.is(Matchers.equalTo(transaccionesColectiva.get("numeroPoliza"))));
        MatcherAssert.assertThat(columnaProducto.getText(), Is.is(Matchers.equalTo(transaccionesColectiva.get("producto"))));
        MatcherAssert.assertThat(columnaTipo.getText(), Is.is(Matchers.equalTo(transaccionesColectiva.get("tipo"))));
        MatcherAssert.assertThat(columnaEstado.getText(), Is.is(Matchers.equalTo(transaccionesColectiva.get("estado"))));
        MatcherAssert.assertThat(columnaFechaFinalizacion.getText(), Matchers.notNullValue());
        MatcherAssert.assertThat(columnaParticipante.getText(), Is.is(Matchers.equalTo(transaccionesColectiva.get("participante"))));
    }

    public void validarTransaccionesDePolizaIndividual() {
        waitFor(tituloTransaccionesIndividual);
        MatcherAssert.assertThat(tituloTransaccionesIndividual.getText(), Is.is(Matchers.equalTo("Transacciones de póliza del archivo de la cuenta")));
    }

    public void darClicEnElNumeroDePoliza() {
        numeroPoliza.click();
    }
}
