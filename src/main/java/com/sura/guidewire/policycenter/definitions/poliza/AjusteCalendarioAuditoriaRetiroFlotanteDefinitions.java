package com.sura.guidewire.policycenter.definitions.poliza;


import com.sura.guidewire.policycenter.steps.BusquedaDePolizaSteps;
import com.sura.guidewire.policycenter.steps.EdificiosUbicacionesSteps;
import com.sura.guidewire.policycenter.steps.PolizaSteps;
import com.sura.guidewire.policycenter.steps.poliza.AjustePantallaPagosYValidacionesSteps;
import com.sura.guidewire.policycenter.steps.poliza.HerramientasPolizaSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaTasaUnicaSteps;
import com.sura.guidewire.policycenter.utils.Parametros;
import com.sura.guidewire.policycenter.utils.navegacion.steps.EscritorioSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class AjusteCalendarioAuditoriaRetiroFlotanteDefinitions {
    @Steps
    PolizaSteps polizaSteps;
    @Steps
    HerramientasPolizaSteps herramientasPolizaSteps;
    @Steps
    AjustePantallaPagosYValidacionesSteps ajustePantallaPagosYValidacionesSteps;
    @Steps
    BusquedaDePolizaSteps buscarNumeroPoliza;
    @Steps
    EscritorioSteps escritorioSteps;
    @Steps
    TarifaTasaUnicaSteps tasaUnicaSteps;
    protected static String numeroPoliza = "";

    @Steps
    EdificiosUbicacionesSteps edificiosUbicacionesSteps;

    @When("en la pantalla de payment en el item schedule debe asignar por default plan type \"Reporting Plan\" no editable. El item \"audits\" debe aparecer por default \"No\" editable y se debe seleccionar el plan de informacion:$opciones")
    public void seleccionarPlanDeInformacionYValidar(ExamplesTable opciones) {
        ajustePantallaPagosYValidacionesSteps.validacionDatosDePantallaPago(new Parametros(opciones));
        ajustePantallaPagosYValidacionesSteps.seleccionarPlanInformacionPrimas(new Parametros(opciones));
    }

    @When("ingreso a programa auditoria y verifico el periodo:$opciones")
    public void programaDeAuditoria(ExamplesTable opciones) {
        herramientasPolizaSteps.ingresarProgramaAuditoria();
        herramientasPolizaSteps.validarProgramaAuditoria(opciones);
    }
    @Then("ingreso a programa auditoria y verifico que no tenga los meses de la cancelacion:$opciones")
    public void verificarProgamaAuditoriaQueNotengaPeriodo(ExamplesTable opcion) {
        herramientasPolizaSteps.ingresarProgramaAuditoria();
        herramientasPolizaSteps.validarProgramaSinAuditoria(opcion);
    }
    @When("ingrese meses de cancelacion:$tiempo")
    public void ingresarMesesdeCancelacion(int tiempo) {
        polizaSteps.ingresarFechaDeCancelacion(tiempo);
    }

    @When("ingreso a escritorio a verificar el periodo")
    public void escritorioValidar() {
        escritorioSteps.irAmenuActividad();
        escritorioSteps.verificarAuditoriaFinal(numeroPoliza);
    }
    @When("remover articulo a utilizar")
    public void agregarNuevoArticulo() {
        edificiosUbicacionesSteps.removerRiesgos();
    }
    @When("expido la poliza y capturo el numero")
    public void expedirPoliza() {
        tasaUnicaSteps.expedirPoliza();
        numeroPoliza = buscarNumeroPoliza.capturarNumeroPoliza();
    }
}
