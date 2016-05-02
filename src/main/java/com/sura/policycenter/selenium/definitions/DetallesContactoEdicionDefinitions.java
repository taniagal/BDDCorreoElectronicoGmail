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

    @Given("Se ha consultado la informacion detallada de un contacto con nombre <primer_nombre> y apellido <primer_apellido> \n" +
            "tipo persona natural con el usuario <user>, con contrasenia <pass> y pais <country>")
    public void login(@Named("user") String usuario, @Named("pass") String contrasenia, @Named("country")String pais,
                      @Named("primer_nombre")String primerNombre, @Named("primer_apellido")String primerApellido){
        //seusLogin.login(pais, usuario, contrasenia);
        ps.login("su","gw");
        dcs.abrirDetallesContactoPersona(primerNombre,primerApellido);
    }


    @When("quiera editar la informacion del contacto con perimer nombre <primer_nombre>, segundo nombre <segundo_nombre>, primer apellido <perimer_apellido>, segundo apellido <segundo_apellido>,\n" +
            "fecha fallecimiento <fecha_fallecimiento>, causa fallecimiento <causa_fallecimiento>, profesion <profesion>,\n" +
            "estado civil <estado_civil>, tipo familia <tipo_familia>, telefono primario <telefono_primario>, telefono celular <telefono_celular>,\n" +
            "telefono residencial <telefono_residencial>, telefono trabajo <telefono_trabajo>,\n" +
            "correo electronico primario <correo_electronico_primario>, correo electronico secundario <correo_electronico_secundario>")
    public void editarLaInformacionContacto(@Named("segundo_nombre") String segundoNombre, @Named("segundo_apellido") String segundoApellido,@Named("fecha_fallecimiento") String fechaFallecimiento, @Named("causa_fallecimiento")String causaFallecimiento,
                                            @Named("primer_nombre")String primerNombre, @Named("primer_apellido")String primerApellido,
                                            @Named("profesion")String profesion, @Named("estado_civil")String estadoCivil,
                                            @Named("tipo_familia")String tipoFamilia, @Named("telefono_primario")String telefonoPrimario,
                                            @Named("telefono_celular")String telefonoCelular,@Named("telefono_residencial")String telefonoResidencial,@Named("telefono_trabajo")String telefonoTrabajo,@Named("correo_electronico_primario")String correoElectronicoPrimario,@Named("correo_electronico_secundario")String correoElectronicoSecundario){
        dcs.editarContacto();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("se deben habilitar la edicion de cierta informacion del contacto n")
    public void ralizarEdicionInformacionContacto() {
        // PENDING
        assertThat("marca inicial",true);
    }


}
