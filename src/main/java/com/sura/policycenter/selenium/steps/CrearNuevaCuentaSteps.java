package com.sura.policycenter.selenium.steps;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.CuentaPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


public class CrearNuevaCuentaSteps extends ScenarioSteps {
    private String cedula = "";
    private String nit = "";

    Guidewire gw = new Guidewire(getDriver());
    CuentaPage cp = new CuentaPage(getDriver());

    private InicioPage inicioPage() { return getPages().currentPageAt(InicioPage.class); }

    public CrearNuevaCuentaSteps(Pages pages){
        super(pages);
    }
    private void  initRandoms(){
        cedula = gw.cedulaRandom();
        nit = gw.nitRandom();

    }

    @Step
    public void abrirNuevaCuenta() {
        inicioPage().irANuevaCuenta();
    }

    @Step
    public void crearNuevaCuentaPersona(String tipoDocumento, String fechaNacimiento, String primerNombre, String primerApellido, String tipoDireccion, String direccion, String codigoPostal, String nombreOrganizacion, String agente) {
        if("".equals(cedula) || "".equals(nit)){
            initRandoms();
        }
        cp.buscarPersona("Busqueda","Persona");
        cp.crearCuentaNuevaPersona(tipoDocumento, cedula,fechaNacimiento, primerNombre, primerApellido, tipoDireccion, direccion,codigoPostal,nombreOrganizacion,agente);
    }

    @Step
    public void assertCrearCuenta(String nombreCuenta){
        cp.assertCrearCuenta(nombreCuenta);
    }

    @Step
    public void crearNuevaCuentaPersonaJuridica(String tipoDocumento, String nombreEmpresa, String tipoDireccion, String direccion,String codigoPostal, String nombreOrganizacion,String agente) {
        if("".equals(cedula) || "".equals(nit)){
            initRandoms();
        }
        cp.buscarPersona("Busqueda","Compania");
        cp.crearCuentaNuevaPersonaJuridica(tipoDocumento, nit, nombreEmpresa, tipoDireccion, direccion,codigoPostal,nombreOrganizacion,agente);
    }

    @Step
    public void assertPolicyCenterLogin(){
        cp.assertPolicyCenterLogin();
    }

    @Step
    public void assertVerificarMenor(String mensaje){
        cp.assertVerificarMenor(mensaje);
    }
    @Step
    public void assertVerificarMensaje(String mensaje){
        cp.assertVerificarMensaje(mensaje);
    }

    @Step
    public void agregarTipoDocumento(String tipoDocumento) {
        if("".equals(cedula) || "".equals(nit)) initRandoms();
        if("NIT".equals(tipoDocumento)){
            cp.buscarPersona("Busqueda","Compania");
            cp.agregarTipoDocumento(tipoDocumento,nit);
        }
        else{
            cp.buscarPersona("Busqueda","Persona");
            cp.agregarTipoDocumento(tipoDocumento,cedula);
        }
    }

    @Step
    public void agregarDireccion(String tipoDireccion, String direccion, String departamento, String ciudad) {
        cp.agregarDireccion(tipoDireccion,direccion,departamento,ciudad);
        cp.actualizar();
    }

    @Step
    public void agregarOrganizacion(String nombreOrganizacion, String agente) {
        cp.agregarOrganizacion(nombreOrganizacion,agente);
    }

    @Step
    public void agregarNombre(String primerNombre, String primerApellido, String fechaNacimiento){
        cp.agregarNombres(primerNombre,primerApellido,fechaNacimiento);
    }

    @Step
    public void agregarRazonSocial(String razonSocial) {
        cp.agregarRazonsocial(razonSocial);
    }
}
