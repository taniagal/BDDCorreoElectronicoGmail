package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.CapturaMedioDeVentasSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class CapturaMedioDeVentasDefinitions {
    @Steps
    CapturaMedioDeVentasSteps capturaMedioDeVentasSteps;

    @Given("estoy en el menu de administracion")
    public void irAlMenuAdministracion() {
        capturaMedioDeVentasSteps.irAlMenuAdministracion();
    }

    @When("seleccione la opcion de  configuracion red comercial")
    public void irARedComercial() {
        capturaMedioDeVentasSteps.irARedComercial();
    }

    @When("deben aparecer las siguientes opciones: $opciones")
    public void validarOpcionesRedComercial(ExamplesTable opciones) {
        capturaMedioDeVentasSteps.validarOpcionesRedComercial(opciones);
    }
    @When("deben aparecer las siguientes opciones por medio de venta: $opciones")
    public void validarOpcionesMediosDeVenta(ExamplesTable opciones) {
        capturaMedioDeVentasSteps.validarOpcionesMedioDeVenta(opciones);
    }
    @When("deben aparecer las siguientes opciones por oficina: $opciones")
    public void validarOpcionesOficina(ExamplesTable opciones) {
        capturaMedioDeVentasSteps.validarOpcionesOficina(opciones);
    }
    @When("deben aparecer las siguientes opciones por canal: $opciones")
    public void validarOpcionesCanal(ExamplesTable opciones) {
        capturaMedioDeVentasSteps.validarOpcionesCanal(opciones);
    }

    @When("cuando vaya a la opcion canales")
    public void irACanales() {
        capturaMedioDeVentasSteps.irACanales();
    }
    @When("los botones buscar y restablecer")
    public void verificarPrsenciaBotones() {
        capturaMedioDeVentasSteps.verificarPresenciaBotones();
    }

    @When("cuando vaya a la opciones medios de venta")
    public void irAMediosDeVenta() {
        capturaMedioDeVentasSteps.irAMediosDeVenta();
    }
    @When("cuando vaya a la opcion oficinas por canal")
    public void irAOficinasPorCanal() {
        capturaMedioDeVentasSteps.irAOficinasPorCanal();
    }


}
