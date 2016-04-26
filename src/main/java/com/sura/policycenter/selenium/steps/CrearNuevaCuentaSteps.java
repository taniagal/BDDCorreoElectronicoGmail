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

    public CrearNuevaCuentaSteps(Pages pages){
        super(pages);
    }

    @Step
    public void abrirNuevaCuenta() {
        cp.navNuevaCuenta();
    }

    @Step
    public void crearNuevaCuentaPersona(String tipoDocumento, String documento, String primerNombre,
                                        String primerApellido, String tipoDireccion, String direccion,
                                        String ciudad, String estado, String codigoPostal,String nombreOrganizacion) {
        cp.buscarPersona("yyyy");
        cp.crearCuentaNuevaPersona(tipoDocumento, documento, primerNombre, primerApellido, tipoDireccion, direccion,ciudad,estado,codigoPostal,nombreOrganizacion);
    }

    @Step
    public void assertCrearCuenta(String resumenCuenta, String nombreCuenta){
        cp.assertCrearCuenta(resumenCuenta,nombreCuenta);
    }

    @Step
    public void crearNuevaCuentaPersonaJuridica(String tipoDocumento, String documento, String nombreEmpresa,
                                                String tipoDireccion, String direccion, String ciudad, String estado,
                                                String codigoPostal, String nombreOrganizacion) {
        cp.buscarPersona("yyyy");
        cp.crearCuentaNuevaPersonaJuridica(tipoDocumento, documento, nombreEmpresa, tipoDireccion, direccion,ciudad,estado,codigoPostal,nombreOrganizacion);

    }


}
