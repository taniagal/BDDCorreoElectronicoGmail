package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaContactoPage;
import com.sura.policycenter.selenium.pages.DetallesContactoPage;
import com.sura.policycenter.selenium.pages.EscritorioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


public class DetallesContactoSteps extends ScenarioSteps {

    BusquedaContactoPage bc = new BusquedaContactoPage(getDriver());

    DetallesContactoPage dc = new DetallesContactoPage(getDriver());

    EscritorioPage escritorioPolicy = new EscritorioPage(getDriver());

    public DetallesContactoSteps(Pages pages){
        super(pages);
    }

    @Step
    public void abrirDetallesContactoPersona(String primer_nombre, String primer_apellido){
        escritorioPolicy.navegarTabBar("Contacto", "Buscar", "");
        bc.buscarContactoPersona(primer_nombre,primer_apellido);
    }

    @Step
    public void verificarCamposPersonaNatural() {
        dc.verificarCamposPersonaNatural();
    }

    @Step
    public void abrirDetallesContactoEmpresa(String nombreEmpresa){
        escritorioPolicy.navegarTabBar("Contacto", "Buscar", "");
        bc.buscarContactoEmpresa(nombreEmpresa);
    }

    @Step
    public void verificarCamposPersonaJuridica() {
        dc.verificarCamposPersonaJuridica();
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
    public void verificarActualizacionPersonaJuridica(){
        dc.verificarActualizacionJuridico();
    }

    @Step
    public void agregarNombre(String segundoNombre){
        dc.editarContacto();
        waitABit(1000);
        dc.agregarNombre(segundoNombre);
    }

    @Step
    public void agregarApellido(String segundoApellido){
        dc.agregarApellido(segundoApellido);
    }

    @Step
    public void agregarProfesion(String profesion){
        dc.agregarProfesion(profesion);
    }

    @Step
    public void agregarEstadoCivil(String estadoCivil){
        dc.agregarEstadoCivil(estadoCivil);
    }

    @Step
    public void agregarTipoFamilia(String tipoFamilia){
        dc.agregarTipoFamilia(tipoFamilia);
    }

    @Step
    public void agregarTelefonos(String telefonoCelular, String telefonoResidencial, String telefonoTrabajo){
        dc.agregarTelefonos(telefonoCelular,telefonoResidencial,telefonoTrabajo);
    }

    @Step
    public void agregarCorreos(String correoElectronicoPrimario, String correoElectronicoSecundario){
        dc.agregarCorreo(correoElectronicoPrimario,correoElectronicoSecundario);
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