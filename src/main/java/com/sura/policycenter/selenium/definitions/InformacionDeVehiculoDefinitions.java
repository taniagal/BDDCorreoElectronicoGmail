package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.InformacionDePolizaMrcSteps;
import com.sura.policycenter.selenium.steps.InformacionDeVehiculoSteps;
import net.thucydides.core.annotations.Steps;
import org.bytedeco.javacpp.annotation.Name;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class InformacionDeVehiculoDefinitions {

    @Steps
    InformacionDeVehiculoSteps informacionDeVehiculoSteps;

    @Steps
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;

    @When("quiera registrar la informacion del vehiculo <nomProducto>")
    public void whenQuieraRegistrarLaInformacionDelVehiculo(@Named("nomProducto")String nomProducto) {
        informacionDePolizaMrcSteps.navegar_por_las_opciones_de_acciones();
        informacionDePolizaMrcSteps.selecciona_cotizacion_para_producto(nomProducto);
        informacionDeVehiculoSteps.ingresar_a_cotizacion_de_vehiculo();
        informacionDeVehiculoSteps.ingresar_informacion_del_vehiculo();
    }

    @Then("el sistema debe mostrar los datos correspondiente al vehiculo")
    public void thenElSistemaDebeMostrarLosDatosCorrespondienteAlVehiculo() {
        informacionDeVehiculoSteps.validar_campos_del_vehiculo();
    }
}
