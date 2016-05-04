package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.DetallesContactoSteps;
import com.sura.policycenter.selenium.steps.PolicySteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by criscaor on 2016/05/02.
 */
public class DetallesContactoEdicionDefinitions {

    @Steps
    SeusLoginSteps seusLogin;

    @Steps
    PolicySteps ps;

    @Steps
    DetallesContactoSteps dcs;

    @Given("Se ha consultado la informacion detallada de un contacto tipo persona natural con nombre <primer_nombre> y apellido <primer_apellido>\n" +
            "y con el usuario <user>, con contrasenia <pass> y pais <country>")
    @Pending
    public void login(@Named("user") String usuario, @Named("pass") String contrasenia, @Named("country")String pais,
                      @Named("primer_nombre")String primerNombre, @Named("primer_apellido")String primerApellido){
        seusLogin.login();
        dcs.abrirDetallesContactoPersona(primerNombre,primerApellido);
    }


    @When("quiera editar la informacion del contacto con perimer nombre <primer_nombre>, \n" +
            "segundo nombre <segundo_nombre>, primer apellido <primer_apellido>, segundo apellido <segundo_apellido>,\n" +
            "fecha fallecimiento <fecha_fallecimiento>, causa fallecimiento <causa_fallecimiento>, profesion <profesion>,\n" +
            "estado civil <estado_civil>, tipo familia <tipo_familia>, telefono primario <telefono_primario>, \n" +
            "telefono celular <telefono_celular>,telefono residencial <telefono_residencial>, telefono trabajo <telefono_trabajo>,\n" +
            "correo electronico primario <correo_electronico_primario>, correo electronico secundario <correo_electronico_secundario>")
    @Pending
    public void editarLaInformacionContacto(@Named("primer_nombre")String primerNombre,@Named("segundo_nombre")String segundoNombre,
                                            @Named("primer_apellido")String primerApellido,@Named("segundo_apellido")String segundoApellido,
                                            @Named("fecha_fallecimiento")String fechaFallecimiento,@Named("causa_fallecimiento")String causaFallecimiento,
                                            @Named("profesion")String profesion,@Named("estado_civil")String estadoCivil,@Named("tipo_familia")String tipoFamilia,
                                            @Named("telefono_primario")String telefonoPrimario,@Named("telefono_celular")String telefonoCelular,
                                            @Named("telefono_residencial")String telefonoResidencial,@Named("telefono_trabajo")String telefonoTrabajo,
                                            @Named("correo_electronico_primario")String correoElectronicoPrimario,
                                            @Named("correo_electronico_secundario")String correoElectronicoSecundario){

        dcs.editarContacto(primerNombre,primerApellido,segundoNombre,segundoApellido, fechaFallecimiento, causaFallecimiento,
                profesion, estadoCivil, tipoFamilia, telefonoPrimario, telefonoCelular, telefonoResidencial, telefonoTrabajo,
                correoElectronicoPrimario, correoElectronicoSecundario);
    }

    @Then("se deben habilitar la edicion de cierta informacion del contacto, actualizar y visualizar los cambios")
    @Pending
    public void ralizarEdicionInformacionContacto() {
        dcs.actualizarContacto();
        dcs.verificarActualizacionPersona();
    }


    //-------------------ESCENARIO 2---------------------
    @Given("Se ha consultado la informacion detallada de un contacto tipo persona juridica con nombre <razon_social> con el usuario <user>, con contrasenia <pass> y pais <country>")
    public void login(@Named("user") String usuario, @Named("pass") String contrasenia, @Named("country")String pais,
                      @Named("razon_social")String razonSocial){
        seusLogin.login();
        dcs.abrirDetallesContactoEmpresa(razonSocial);
    }


  @When("quiera editar la informacion del contacto con razon social <razon_social>, nombre comercial <nombre_comercial>,\n" +
          "actividad comercial <actividad_comercial>, numero de empleados <numero_empleados>, valor activos <valor_activos>,\n" +
          " ventas anuales <ventas_anuales>, telefono oficina <telefono_oficina>, correo electronico primario <correo_electronico_primario>,\n" +
          "  correo electronico secundario <correo_electronico_secundario>")
    public void editarLaInformacionContacto(@Named("razon_social")String razonSocial,@Named("nombre_comercial")String nombreComercial,
                                            @Named("actividad_comercial")String actividadComercial,@Named("numero_empleados")String numeroEmpleados,
                                            @Named("valor_activos")String valorActivos,@Named("ventas_anuales")String ventasAnuales,
                                            @Named("telefono_oficina")String telefonoOficina,@Named("correo_electronico_primario")String correoElectronicoPrimario,
                                            @Named("correo_electronico_secundario")String correoElectronicoSecundario){

        dcs.editarContacto(razonSocial,nombreComercial,actividadComercial,numeroEmpleados, valorActivos, ventasAnuales,
                telefonoOficina, correoElectronicoPrimario, correoElectronicoSecundario);
    }

@Then("se deben habilitar la edicion de cierta informacion del contacto, actualizar y visualizar los cambios")
    public void ralizarEdicionInformacionContactoJuridico() {
        dcs.actualizarContacto();
        dcs.verificarActualizacionPersona();
    }


}
