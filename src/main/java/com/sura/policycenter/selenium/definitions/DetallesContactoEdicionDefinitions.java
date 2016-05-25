package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.DetallesContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

@SuppressWarnings("WeakerAccess")
public class DetallesContactoEdicionDefinitions {
    @Steps
    private DetallesContactoSteps detallesContactoSteps;
    @Steps
    private SeusLoginSteps seusLoginSteps;


    /**
     * ESCENARIO 1
     */
    @When("quiera editar la informacion del contacto con segundo nombre <segundo_nombre>")
    public void agregarNombre(@Named("segundo_nombre")String segundoNombre){
        detallesContactoSteps.agregarNombre(segundoNombre);
        detallesContactoSteps.verificarEstadoDocumento();
    }

    @When("segundo apellido <segundo_apellido>, telefono trabajo <telefono_trabajo>")
    public void agregarApellido(@Named("segundo_apellido")String segundoApellido,@Named("telefono_trabajo")String telefonoTrabajo){
        detallesContactoSteps.agregarApellido(segundoApellido);
        detallesContactoSteps.agregarTelefonoTrabajo(telefonoTrabajo);
    }

    @When("profesion <profesion>, estado civil <estado_civil>,tipo familia <tipo_familia>")
    public void agregarLists(@Named("profesion")String profesion,@Named("estado_civil")String estadoCivil,@Named("tipo_familia")String tipoFamilia){
        detallesContactoSteps.agregarLists(profesion,estadoCivil,tipoFamilia);
    }

    @When("telefono celular <telefono_celular>")
    public void agregarTelefonoCelular(@Named("telefono_celular")String telefonoCelular){
        detallesContactoSteps.agregarTelefonoCelular(telefonoCelular);
    }

    @When("correo electronico primario <correo_electronico_primario>, correo electronico secundario <correo_electronico_secundario>,telefono residencial<telefono_residencial>")
    public void agregarCorreos(@Named("correo_electronico_primario")String correoElectronicoPrimario,
                               @Named("correo_electronico_secundario")String correoElectronicoSecundario,@Named("telefono_residencial")String telefonoResidencial){
        detallesContactoSteps.agregarCorreos(correoElectronicoPrimario, correoElectronicoSecundario);
        detallesContactoSteps.agregarTelefonoResidencia(telefonoResidencial);
    }

    @Then("se deben habilitar la edicion de cierta informacion del contacto, actualizar y visualizar los cambios")
    public void ralizarEdicionInformacionContacto() {
        detallesContactoSteps.actualizarContacto();
        detallesContactoSteps.verificarActualizacionPersona();
        seusLoginSteps.close();

    }


    /**
     * ESCENARIO 2
     */
    @When("quiera editar la informacion del contacto con razon social <razon_social>, nombre comercial <nombre_comercial>, actividad comercial <actividad_comercial>")
    public void agregarRazonSocial(@Named("nombre_comercial")String nombreComercial, @Named("actividad_comercial")String actividadComercial){
        detallesContactoSteps.agregarRazonSocial(nombreComercial,actividadComercial);
        detallesContactoSteps.verificarEstadoDocumento();
    }

    @When("numero de empleados <numero_empleados>, valor activos <valor_activos>, ventas anuales <ventas_anuales>")
    public void agregarEmpleados(@Named("numero_empleados")String numeroEmpleados,@Named("valor_activos")String valorActivos,@Named("ventas_anuales")String ventasAnuales){
        detallesContactoSteps.agregarEmpleados(numeroEmpleados,ventasAnuales,valorActivos);
    }

    @When("telefono oficina <telefono_oficina>, correo electronico primario <correo_electronico_primario>, correo electronico secundario <correo_electronico_secundario>")
    public void agregarCorreosJ(@Named("telefono_oficina")String telefonoOficina,@Named("correo_electronico_primario")String correoPrimario,@Named("correo_electronico_secundario")String correoSecundario){
        detallesContactoSteps.agregarCorreosJ(telefonoOficina,correoPrimario,correoSecundario);
    }

    @Then("se deben habilitar la edicion de cierta informacion del contacto, actualizar y visualizar los cambios de persona juridica")
    public void ralizarEdicionInformacionContactoJuridico() {
        detallesContactoSteps.actualizarContacto();
        detallesContactoSteps.verificarActualizacionPersonaJuridica();
    }
}
