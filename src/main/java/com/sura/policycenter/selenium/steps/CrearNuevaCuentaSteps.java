package com.sura.policycenter.selenium.steps;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.CuentaPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


public class CrearNuevaCuentaSteps extends ScenarioSteps {
    private final Guidewire gw = new Guidewire(getDriver());
    private final CuentaPage cp = new CuentaPage(getDriver());
    private InicioPage inicioPage() { return getPages().currentPageAt(InicioPage.class); }

    private String cedula = "";
    private String nit = "";

    private void  initRandoms(){
        cedula = gw.cedulaRandom();
        nit = gw.nitRandom();

    }

    public CrearNuevaCuentaSteps(Pages pages){
        super(pages);
    }

    @Step
    public void abrirNuevaCuenta() {
        inicioPage().irANuevaCuenta();
        //cp.navNuevaCuenta();
    }

    @Step
    public void crearNuevaCuentaPersona(String tipoDocumento, String fechaNacimiento, String primerNombre, String primerApellido, String tipoDireccion, String direccion, String codigoPostal, String nombreOrganizacion, String agente) {
        if("".equals(cedula) || "".equals(nit)){
            initRandoms();
        }
        cp.buscarPersona("Busqueda");
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
        cp.buscarPersona("Busqueda");
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

}
