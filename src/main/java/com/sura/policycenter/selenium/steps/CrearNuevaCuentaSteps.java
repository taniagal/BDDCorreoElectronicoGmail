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

    public CrearNuevaCuentaSteps(Pages pages){
        super(pages);
    }

    private InicioPage inicioPage(){
        return getPages().currentPageAt(InicioPage.class);
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
    public void agregarTipoDocumento(String tipoDocumento) {
        if("".equals(cedula) || "".equals(nit)) initRandoms();
        if("NIT".equals(tipoDocumento)){
            cp.buscarPersona("Busqueda","Compania");
            cp.agregarTipoDocumento(tipoDocumento,nit);
        }else{
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

    @Step
    public void verificarCrearCuenta(String nombreCuenta){
        cp.verificarCrearCuenta(nombreCuenta);
    }

    @Step
    public void validarLogeoPolicyCenter(){
        cp.validarLogeoPolicyCenter();
    }

    @Step
    public void verificarEdadMenor(String mensaje){
        cp.verificarEdadMenor(mensaje);
    }

    @Step
    public void verificarMensaje(String mensaje){
        cp.verificarMensaje(mensaje);
    }
}
