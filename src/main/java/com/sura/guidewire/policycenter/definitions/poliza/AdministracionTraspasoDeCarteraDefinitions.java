package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.PolizaSteps;
import com.sura.guidewire.policycenter.steps.poliza.AdministracionTraspasoDeCarteraSteps;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class AdministracionTraspasoDeCarteraDefinitions {

    @Steps
    AdministracionTraspasoDeCarteraSteps administracionTraspasoDeCarteraSteps;

    @Steps
    PolizaSteps polizaSteps;

    @When("Traspasar cartera de asesor a asesor: $opciones")
    @Alias("Traspasar cartera de asesor a asesor directo: $opciones")
    public void traspasarCarteraDeAsesorAAsesor(ExamplesTable parametros) {
        String oldProduceCode = "";
        String newProduceCode = "";

        for (Map<String, String> dato : parametros.getRows()) {
            oldProduceCode = dato.get("oldProduceCode");
            newProduceCode = dato.get("newProduceCode");
        }
        administracionTraspasoDeCarteraSteps.traspasarCarteraDeAsesorAAsesor(oldProduceCode, newProduceCode);

    }

    @When("Traspasar cartera de oficina a oficina: $opciones")
    public void traspasarCarteraDeOficinaAOficina(ExamplesTable parametros) {

        String oldOficna = "";
        String newOficina = "";

        for (Map<String, String> dato : parametros.getRows()) {
            oldOficna = dato.get("anteriorOficiona");
            newOficina = dato.get("nuevaOficina");
        }
        administracionTraspasoDeCarteraSteps.traspasarCarteraDeOficionaAOficiona(oldOficna, newOficina);
    }

    @When("Traspasar cartera en poliza: $opciones")
    public void traspasarCarteraEnPoliza(ExamplesTable parametros) {
        String newProduceCode = "";
        String numeroCuenta = "";

        for (Map<String, String> dato : parametros.getRows()) {
            newProduceCode = dato.get("newProduceCode");
            numeroCuenta = dato.get("numeroCuenta");
        }
        administracionTraspasoDeCarteraSteps.traspasarCarteraEnPoliza(numeroCuenta, newProduceCode);
    }

    @Then("validar trapaso de cartera: $opciones")
    public void validarTrasPasoDeCartera(ExamplesTable parametros) {
        String nuevoCodigoAsesor = "";

        for (Map<String, String> dato : parametros.getRows()) {
            nuevoCodigoAsesor = dato.get("nuevoCodigoAsesor");
        }

        polizaSteps.seleccionarBotonAcciones();
        polizaSteps.seleccionarOpcionCambiarPoliza();
        polizaSteps.seleccionarBotonSiguienteParaIniciarCambioEnPoliza();
        polizaSteps.seleccionaBotonVerAsesoresDeLaPoliza();
        String codigoAsesorActual = administracionTraspasoDeCarteraSteps.consultarCodigoAsesorActual();
        MatcherAssert.assertThat("No se pudo realizar el traspaso de cartera, no se cambió el asesor", codigoAsesorActual.equals(nuevoCodigoAsesor));
    }

    @Then("validar oficiona de radicacion: $opciones")
    public void validarOficionaDeRadicacion(ExamplesTable parametros) {

        String oficinaDeRadicacion = "";
        for (Map<String, String> dato : parametros.getRows()) {
            oficinaDeRadicacion = dato.get("oficinaDeRadicacion");
        }

        String oficinaDeRadicacionActual = polizaSteps.consultarOficinaDeRadicacion();
        MatcherAssert.assertThat("No se pudo realizar el traspaso de cartera, no se la oficina", oficinaDeRadicacionActual.equals(oficinaDeRadicacion));
    }

    @When("Adelantar el reloj un dia")
    public void adelantarRelojUnDia() {
        administracionTraspasoDeCarteraSteps.agregarDiaReloj();
    }

    @When("Ejecutar proceso<nombreProceso>")
    public void ejecutarProceso(@Named("nombreProceso") String nombreProceso) {
        administracionTraspasoDeCarteraSteps.ejecutarProceso(nombreProceso);
    }
}
