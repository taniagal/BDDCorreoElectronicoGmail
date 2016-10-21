package com.sura.guidewire.policycenter.definitions.contacto;

import com.sura.guidewire.policycenter.steps.contacto.DetallesContactoSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("WeakerAccess")
public class DetallesContactoEdicionDefinitions {
    @Managed
    WebDriver driver;
    @Steps
    private DetallesContactoSteps detallesContactoSteps;

    /**
     * ESCENARIO 1
     */
    @When("quiera editar la informacion del contacto con <tipo_documento> c. <documento>")
    public void editarContacto(@Named("tipo_documento") String tipoDocumento,@Named("documento") String documento){
        detallesContactoSteps.abrir_detalles_contacto(tipoDocumento,documento);
        detallesContactoSteps.editar_contacto();
    }

    @When("segundo nombre <segundo_nombre>")
    public void agregarNombre(@Named("segundo_nombre")String segundoNombre){
        detallesContactoSteps.agregar_nombre(segundoNombre);
        detallesContactoSteps.verificar_estado_de_documento();
    }

    @When("segundo apellido <segundo_apellido>, telefono trabajo <telefono_trabajo>")
    public void agregarApellido(@Named("segundo_apellido")String segundoApellido,@Named("telefono_trabajo")String telefonoTrabajo){
        detallesContactoSteps.agregar_apellido(segundoApellido);
        detallesContactoSteps.agregar_telefono_trabajo(telefonoTrabajo);
    }

    @When("profesion <profesion>, estado civil <estado_civil>,tipo familia <tipo_familia>")
    public void agregarLists(@Named("profesion")String profesion,@Named("estado_civil")String estadoCivil,@Named("tipo_familia")String tipoFamilia){
        detallesContactoSteps.agregar_profesion_estado_civil_y_tipo_familia(profesion,estadoCivil,tipoFamilia);
    }

    @When("telefono celular <telefono_celular>")
    public void agregarTelefonoCelular(@Named("telefono_celular")String telefonoCelular){
        detallesContactoSteps.agregar_telefono_celular(telefonoCelular);
    }

    @When("correo electronico primario <correo_electronico_primario>, correo electronico secundario <correo_electronico_secundario>,telefono residencial<telefono_residencial>")
    public void agregarCorreos(@Named("correo_electronico_primario")String correoElectronicoPrimario,
                               @Named("correo_electronico_secundario")String correoElectronicoSecundario,@Named("telefono_residencial")String telefonoResidencial){
        detallesContactoSteps.agregar_correos(correoElectronicoPrimario, correoElectronicoSecundario);
        detallesContactoSteps.agregar_telefono_residencia(telefonoResidencial);
    }

    @Then("se deben habilitar la edicion de cierta informacion del contacto, actualizar y visualizar los cambios")
    public void ralizarEdicionInformacionContacto() {
        detallesContactoSteps.actualizar_contacto();
        detallesContactoSteps.verificar_actualizacion_persona();
    }


    /**
     * ESCENARIO 2
     */
    @When("razon social <razon_social>, nombre comercial <nombre_comercial>, actividad comercial <actividad_comercial>")
    public void agregarRazonSocial(@Named("nombre_comercial")String nombreComercial, @Named("actividad_comercial")String actividadComercial){
        detallesContactoSteps.agregar_razon_social(nombreComercial,actividadComercial);
        detallesContactoSteps.verificar_estado_de_documento();
    }

    @When("numero de empleados <numero_empleados>, valor activos <valor_activos>, ventas anuales <ventas_anuales>")
    public void agregarEmpleados(@Named("numero_empleados")String numeroEmpleados,@Named("valor_activos")String valorActivos,@Named("ventas_anuales")String ventasAnuales){
        detallesContactoSteps.agregar_empleados(numeroEmpleados,ventasAnuales,valorActivos);
    }

    @When("telefono oficina <telefono_oficina>, correo electronico primario <correo_electronico_primario>, correo electronico secundario <correo_electronico_secundario>")
    public void agregarCorreosJ(@Named("telefono_oficina")String telefonoOficina,@Named("correo_electronico_primario")String correoPrimario,@Named("correo_electronico_secundario")String correoSecundario){
        detallesContactoSteps.agregar_correos_persona_juridica(telefonoOficina,correoPrimario,correoSecundario);
    }

    @Then("se deben habilitar la edicion de cierta informacion del contacto, actualizar y visualizar los cambios de persona juridica")
    public void ralizarEdicionInformacionContactoJuridico() {
        detallesContactoSteps.actualizar_contacto();
        detallesContactoSteps.verificar_actualizacion_persona_juridica();
    }
}
