package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaContactoPage;
import com.sura.policycenter.selenium.pages.DetallesContactoPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


public class DetallesContactoSteps extends ScenarioSteps {

    private final BusquedaContactoPage bc = new BusquedaContactoPage(getDriver());

    private final DetallesContactoPage dc = new DetallesContactoPage(getDriver());

    //EscritorioPage escritorioPolicy = new EscritorioPage(getDriver());
    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    public DetallesContactoSteps(Pages pages){
        super(pages);
    }



    @Step
    public void abrirDetallesContactoPersona(String primer_nombre, String primer_apellido){
        //escritorioPolicy.navegarTabBar("Contacto", "Buscar", "");
        inicioPage().irABuscarContacto();
        bc.consultarContactoPorNombresYApellidos("CEDULA DE CIUDADANIA",primer_nombre,"",primer_apellido,"");
        bc.seleccionarContacto();
    }

    @Step
    public void verificarCamposPersonaNatural() {
        dc.verificarCamposPersonaNatural();
    }

    @Step
    public void abrirDetallesContactoEmpresa(String nombreEmpresa){
        //escritorioPolicy.navegarTabBar("Contacto", "Buscar", "");
        inicioPage().irABuscarContacto();
        bc.consultarPersonaJuridaPorRazonSocial("NIT", nombreEmpresa);
        bc.seleccionarContacto();
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
        dc.agregarNombre(segundoNombre);
    }

    @Step
    public void agregarApellido(String segundoApellido){
        dc.agregarApellido(segundoApellido);
    }

    @Step
    public void agregarLists(String profesion,String estadoCivil,String tipoFamilia){
        dc.agregarLists(profesion,estadoCivil,tipoFamilia);
    }

    @Step
    public void agregarTelefonoResidencia(String telefonoResidencial){
        dc.agregarTelefonosResidencial(telefonoResidencial);
    }

    @Step
    public void agregarTelefonoTrabajo(String telefonoTrabajo){
        dc.agregarTelefonoTrabajo(telefonoTrabajo);
    }

    @Step
    public void agregarTelefonoCelular(String telefonoCelular){
        dc.agregarTelefonoCelular(telefonoCelular);
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

    @Step
    public void agregarDireccion() {
        dc.editarContacto();
        dc.irADirecciones();
    }

    @Step
    public void validarDatosPatalla() {
        dc.validarDatosPantalla();
    }

    @Step
    public void validarCampos() {
        dc.validarCampos();
    }
}
