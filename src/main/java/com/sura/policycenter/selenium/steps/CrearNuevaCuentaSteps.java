package com.sura.policycenter.selenium.steps;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.CuentaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by criscaor on 2016/04/25.
 */
public class CrearNuevaCuentaSteps extends ScenarioSteps {
    Guidewire gw = new Guidewire(getDriver());
    CuentaPage cp = new CuentaPage(getDriver());


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
        cp.navNuevaCuenta();
    }

    @Step
    public void crearNuevaCuentaPersona(String tipoDocumento, String documento, String fechaNacimiento,String primerNombre, String primerApellido, String tipoDireccion, String direccion, String ciudad, String estado, String codigoPostal,String nombreOrganizacion) {
        if("".equals(cedula) || "".equals(nit)){
            initRandoms();
        }
        cp.buscarPersona("Busqueda");
        cp.crearCuentaNuevaPersona(tipoDocumento, cedula,fechaNacimiento, primerNombre, primerApellido, tipoDireccion, direccion,ciudad,estado,codigoPostal,nombreOrganizacion);
    }

    @Step
    public void assertCrearCuenta(String nombreCuenta){
        cp.assertCrearCuenta(nombreCuenta);
    }

    @Step
    public void crearNuevaCuentaPersonaJuridica(String tipoDocumento, String documento, String nombreEmpresa, String tipoDireccion, String direccion, String ciudad, String estado, String codigoPostal, String nombreOrganizacion) {
        if("".equals(cedula) || "".equals(nit)){
            initRandoms();
        }
        cp.buscarPersona("Busqueda");
        cp.crearCuentaNuevaPersonaJuridica(tipoDocumento, nit, nombreEmpresa, tipoDireccion, direccion,ciudad,estado,codigoPostal,nombreOrganizacion);
    }

    @Step
    public void assertPolicyCenterLogin(){
        cp.assertPolicyCenterLogin();
    }

    @Step
    public void crearNuevaCuentaPersona2(String tipoDocumento, String documento, String fechaNacimiento,String primerNombre, String primerApellido, String tipoDireccion, String direccion, String ciudad, String estado, String codigoPostal,String nombreOrganizacion) {
        if("".equals(cedula) || "".equals(nit)){
            initRandoms();
        }
        cp.buscarPersona("Busqueda");
        cp.crearCuentaNuevaPersona(tipoDocumento, cedula,fechaNacimiento, primerNombre, primerApellido, tipoDireccion, direccion,ciudad,estado,codigoPostal,nombreOrganizacion);
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
