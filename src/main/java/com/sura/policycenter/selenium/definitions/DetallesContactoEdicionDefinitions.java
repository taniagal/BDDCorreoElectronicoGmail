package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CrearNuevoContactoSteps;
import com.sura.policycenter.selenium.steps.DetallesContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class DetallesContactoEdicionDefinitions {
    @Steps
    DetallesContactoSteps dcs;

    @Steps
    CrearNuevoContactoSteps ncs;

    @Given("Se ha consultado la informacion detallada de un contacto persona natural")
    public void personaNatural(){}

    @When("quiera editar la informacion del contacto con segundo nombre <segundo_nombre>")
    public void agregarNombre(@Named("segundo_nombre")String segundoNombre){
        dcs.agregarNombre(segundoNombre);
    }

    @When("segundo apellido <segundo_apellido>, telefono trabajo <telefono_trabajo>")
    public void agregarApellido(@Named("segundo_apellido")String segundoApellido,@Named("telefono_trabajo")String telefonoTrabajo){
        dcs.agregarApellido(segundoApellido);
        dcs.agregarTelefonoTrabajo(telefonoTrabajo);
    }

    @When("profesion <profesion>, estado civil <estado_civil>,tipo familia <tipo_familia>")
    public void agregarLists(@Named("profesion")String profesion,@Named("estado_civil")String estadoCivil,@Named("tipo_familia")String tipoFamilia){
        dcs.agregarLists(profesion,estadoCivil,tipoFamilia);
    }

    @When("telefono celular <telefono_celular>")
    public void agregarTelefonoCelular(@Named("telefono_celular")String telefonoCelular){
        dcs.agregarTelefonoCelular(telefonoCelular);
    }

    @When("correo electronico primario <correo_electronico_primario>, correo electronico secundario <correo_electronico_secundario>,telefono residencial<telefono_residencial>")
    public void agregarCorreos(@Named("correo_electronico_primario")String correoElectronicoPrimario,
                               @Named("correo_electronico_secundario")String correoElectronicoSecundario,@Named("telefono_residencial")String telefonoResidencial){
        dcs.agregarCorreos(correoElectronicoPrimario, correoElectronicoSecundario);
        dcs.agregarTelefonoResidencia(telefonoResidencial);
    }

    @Then("se deben habilitar la edicion de cierta informacion del contacto, actualizar y visualizar los cambios")
    public void ralizarEdicionInformacionContacto() {
        dcs.actualizarContacto();
        dcs.verificarActualizacionPersona();
    }


    //-------------------ESCENARIO 2---------------------
    @Given("Se ha consultado la informacion detallada de un contacto tipo persona juridica")
    public void infoContactoJurídico(){
    }

    @When("quiera editar la informacion del contacto con razon social <razon_social>, nombre comercial <nombre_comercial>, actividad comercial <actividad_comercial>")
    public void agregarRazonSocial(@Named("nombre_comercial")String nombreComercial, @Named("actividad_comercial")String actividadComercial){
        dcs.agregarRazonSocial(nombreComercial,actividadComercial);
    }

    @When("numero de empleados <numero_empleados>, valor activos <valor_activos>, ventas anuales <ventas_anuales>")
    public void agregarEmpleados(@Named("numero_empleados")String numeroEmpleados,@Named("valor_activos")String valorActivos,@Named("ventas_anuales")String ventasAnuales){
        dcs.agregarEmpleados(numeroEmpleados,ventasAnuales,valorActivos);
    }

    @When("telefono oficina <telefono_oficina>, correo electronico primario <correo_electronico_primario>, correo electronico secundario <correo_electronico_secundario>")
    public void agregarCorreosJ(@Named("telefono_oficina")String telefonoOficina,@Named("correo_electronico_primario")String correoPrimario,@Named("correo_electronico_secundario")String correoSecundario){
        dcs.agregarCorreosJ(telefonoOficina,correoPrimario,correoSecundario);
    }

    @Then("se deben habilitar la edicion de cierta informacion del contacto, actualizar y visualizar los cambios de persona juridica")
    public void ralizarEdicionInformacionContactoJuridico() {
        dcs.actualizarContacto();
        dcs.verificarActualizacionPersonaJuridica();
    }
}
