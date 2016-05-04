package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaContactoPage;
import com.sura.policycenter.selenium.pages.DetallesContactoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by hectsaga on 2016/04/29.
 */
public class DetallesContactoSteps extends ScenarioSteps {

    BusquedaContactoPage bc = new BusquedaContactoPage(getDriver());

    DetallesContactoPage dc = new DetallesContactoPage(getDriver());

    public DetallesContactoSteps(Pages pages){
        super(pages);
    }

    @Step
    public void abrirDetallesContactoPersona(String primer_nombre, String primer_apellido){
        bc.accionarBuscarContacto();
        bc.buscarContactoPersona(primer_nombre,primer_apellido);
    }

    @Step
    public void verificarCamposPersonaNatural() {
        dc.verificarCamposPersonaNatural();
    }

    @Step
    public void abrirDetallesContactoEmpresa(String nombreEmpresa){
        bc.accionarBuscarContacto();
        bc.buscarContactoEmpresa(nombreEmpresa);
    }

    @Step
    public void verificarCamposPersonaJuridica() {
        dc.verificarCamposPersonaJuridica();
    }

    @Step
    public void editarContacto(String primerNombre, String primerApellido, String segundoNombre,
                               String segundoApellido, String fechaFallecimiento, String causaFallecimiento,
                               String profesion, String estadoCivil, String tipoFamilia, String telefonoPrimario,
                               String telefonoCelular, String telefonoResidencial, String telefonoTrabajo,
                               String correoElectronicoPrimario, String correoElectronicoSecundario) {

        dc.editarContacto();
        dc.editarContactoPersona(primerNombre,primerApellido,segundoNombre,segundoApellido, fechaFallecimiento, causaFallecimiento,
                profesion, estadoCivil, tipoFamilia, telefonoPrimario, telefonoCelular, telefonoResidencial, telefonoTrabajo,
                correoElectronicoPrimario, correoElectronicoSecundario);
    }



    @Step
    public void actualizarContacto(){
        dc.actualizaContacto();
    }

    @Step
    public void verificarActualizacionPersona(){
        dc.verificarActualizacion();
    }

    @Step
    public void editarContacto(String razonSocial, String nombreComercial, String actividadComercial, String numeroEmpleados,
                               String valorActivos, String ventasAnuales, String telefonoOficina,
                               String correoElectronicoPrimario, String correoElectronicoSecundario) {

        dc.editarContacto();
        dc.editarContactoJuridico(razonSocial,nombreComercial,actividadComercial,numeroEmpleados, valorActivos, ventasAnuales,
                telefonoOficina, correoElectronicoPrimario, correoElectronicoSecundario);
    }
}
