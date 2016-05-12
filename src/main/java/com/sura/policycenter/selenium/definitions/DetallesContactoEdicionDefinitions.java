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
    //@Pending
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


    @When("quiera editar la informacion del contacto con perimer nombre <primer_nombre>,\n" +
            "segundo nombre <segundo_nombre>, primer apellido <primer_apellido>, segundo apellido <segundo_apellido>,\n" +
            "fecha fallecimiento <fecha_fallecimiento>, causa fallecimiento <causa_fallecimiento>, profesion <profesion>,\n" +
            "estado civil <estado_civil>, tipo familia <tipo_familia>,telefono celular <telefono_celular>,telefono residencial \n" +
            "<telefono_residencial>, telefono trabajo <telefono_trabajo>,correo electronico primario <correo_electronico_primario>,\n" +
            " correo electronico secundario <correo_electronico_secundario>")
    //@Pending
    public void editarLaInformacionContacto(@Named("primer_nombre")String primerNombre,@Named("segundo_nombre")String segundoNombre,
                                            @Named("primer_apellido")String primerApellido,@Named("segundo_apellido")String segundoApellido,
                                            @Named("fecha_fallecimiento")String fechaFallecimiento,@Named("causa_fallecimiento")String causaFallecimiento,
                                            @Named("profesion")String profesion,@Named("estado_civil")String estadoCivil,@Named("tipo_familia")String tipoFamilia,
                                            @Named("telefono_celular")String telefonoCelular,@Named("telefono_residencial")String telefonoResidencial,
                                            @Named("telefono_trabajo")String telefonoTrabajo,@Named("correo_electronico_primario")String correoElectronicoPrimario,
                                            @Named("correo_electronico_secundario")String correoElectronicoSecundario){

        dcs.editarContacto(primerNombre,primerApellido,segundoNombre,segundoApellido, fechaFallecimiento, causaFallecimiento,
                profesion, estadoCivil, tipoFamilia,telefonoCelular, telefonoResidencial, telefonoTrabajo,
                correoElectronicoPrimario, correoElectronicoSecundario);
    }

    @Then("se deben habilitar la edicion de cierta informacion del contacto, actualizar y visualizar los cambios")
    public void ralizarEdicionInformacionContacto() {
        dcs.actualizarContacto();
        dcs.verificarActualizacionPersona();
    }


    //-------------------ESCENARIO 2---------------------
    @Given("Se ha consultado la informacion detallada de un contacto tipo persona juridica con nombre <razon_social>,\n" +
            "tipo de direccion <tipo_direccion> y direccion <direccion>")
    public void login(@Named("razon_social")String razonSocial,@Named("tipo_direccion")String tipoDireccion,
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
