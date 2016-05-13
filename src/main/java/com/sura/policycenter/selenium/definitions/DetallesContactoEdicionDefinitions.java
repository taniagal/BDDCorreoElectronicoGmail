package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.CrearNuevoContactoSteps;
import com.sura.policycenter.selenium.steps.DetallesContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;


public class DetallesContactoEdicionDefinitions {

    @Steps
    SeusLoginSteps seusLogin;

    @Steps
    DetallesContactoSteps dcs;

    @Steps
    CrearNuevoContactoSteps ncs;

    @Given("Se tiene y se ha consultado la informacion detallada de un contacto tipo persona natural con nombre\n" +
            "<primer_nombre> y apellido <primer_apellido>, tipo direccion <tipo_direccion>, direccion <direccion>,\n" +
            "tipo documento <tipo_documento>, documento <documento>")
    public void login(@Named("primer_nombre")String primerNombre, @Named("primer_apellido")String primerApellido,
                      @Named("tipo_documento")String tipoDocumento,@Named("documento")String documento,
                      @Named("tipo_direccion")String tipoDireccion,@Named("direccion")String direccion){
        seusLogin.login();
        ncs.nuevoContactoPersona();
        ncs.seleccionarTipoDocumentoPersonaNatural(tipoDocumento);
        ncs.ingresarNumeroDocumentoPersonaNatural(documento);
        ncs.ingresarPrimerNombrePersonaNatural(primerNombre);
        ncs.ingresarPrimerApellidoPersonaNatural(primerApellido);
        ncs.seleccionarTipoDireccionPersonaNatural(tipoDireccion);
        ncs.ingresarDireccionPersonaNatural(direccion);
        ncs.btnCrearPersona();
        dcs.abrirDetallesContactoPersona(primerNombre,primerApellido);
    }

    @When("quiera editar la informacion del contacto con perimer nombre <primer_nombre>,segundo nombre <segundo_nombre>")
    public void agregarNombre(@Named("segundo_nombre")String segundoNombre){
        dcs.agregarNombre(segundoNombre);
    }
    @When("primer apellido <primer_apellido>, segundo apellido <segundo_apellido>, telefono trabajo <telefono_trabajo>")
    public void agregarApellido(@Named("segundo_apellido")String segundoApellido,@Named("telefono_trabajo")String telefonoTrabajo){
        dcs.agregarApellido(segundoApellido);
        dcs.agregarTelefonoTrabajo(telefonoTrabajo);
    }

    @When("profesion <profesion>, estado civil <estado_civil>,tipo familia <tipo_familia>,telefono residencial<telefono_residencial>")
    public void agregarLists(@Named("profesion")String profesion,@Named("estado_civil")String estadoCivil,@Named("tipo_familia")String tipoFamilia,@Named("telefono_residencial")String telefonoResidencial){
        dcs.agregarTelefonoResidencia(telefonoResidencial);
        dcs.agregarLists(profesion,estadoCivil,tipoFamilia);
    }

    @When("telefono celular <telefono_celular>")
    public void agregarTelefonoCelular(@Named("telefono_celular")String telefonoCelular){
        dcs.agregarTelefonoCelular(telefonoCelular);
    }

    @When("correo electronico primario <correo_electronico_primario>, correo electronico secundario <correo_electronico_secundario>")
    public void agregarCorreos(@Named("correo_electronico_primario")String correoElectronicoPrimario,
                               @Named("correo_electronico_secundario")String correoElectronicoSecundario){
        dcs.agregarCorreos(correoElectronicoPrimario, correoElectronicoSecundario);
    }

    @Then("se deben habilitar la edicion de cierta informacion del contacto, actualizar y visualizar los cambios")
    public void ralizarEdicionInformacionContacto() {
        dcs.actualizarContacto();
        dcs.verificarActualizacionPersona();
    }


    //-------------------ESCENARIO 2---------------------
    @Given("Se ha consultado la informacion detallada de un contacto tipo persona juridica con nombre <razon_social>,\n" +
            "tipo de direccion <tipo_direccion> y direccion <direccion>")
    public void infoContactoJurídico(@Named("razon_social")String razonSocial,@Named("tipo_direccion")String tipoDireccion,
                      @Named("direccion")String direccion){
        ncs.nuevoContactoPersonaJuridica();
        ncs.seleccionarTipoDocumentoPersonaNatural("NIT");
        ncs.ingresarRazonSocial(razonSocial);
        ncs.seleccionarTipoDireccionPersonaNatural(tipoDireccion);
        ncs.ingresarDireccionPersonaNatural(direccion);
        ncs.ingresarNumeroDocumentoPersonaNatural("");
        ncs.btnCrearPersona();
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

    @Then("se deben habilitar la edicion de cierta informacion del contacto, actualizar y visualizar los cambios de persona juridica")
    public void ralizarEdicionInformacionContactoJuridico() {
        dcs.actualizarContacto();
        dcs.verificarActualizacionPersonaJuridica();
    }


}
