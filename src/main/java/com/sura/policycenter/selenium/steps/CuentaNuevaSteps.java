package com.sura.policycenter.selenium.steps;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.CuentaPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CuentaNuevaSteps extends ScenarioSteps {

    private String cedula = "";
    private String nit = "";
    private final Guidewire gw = new Guidewire(getDriver());
    private final CuentaPage cp = new CuentaPage(getDriver());

    public CuentaNuevaSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    private void  initRandoms(){
        cedula = gw.cedulaRandom();
        nit = gw.nitRandom();

    }

    @Step
    public void abrir_nueva_cuenta() {
        inicioPage().irANuevaCuenta();
    }

    @Step
    public void agregar_tipo_documento(String tipoDocumento) {
        if("".equals(cedula) || "".equals(nit)) {
            initRandoms();
        }
        if("NIT".equals(tipoDocumento)){
            cp.buscarPersona("Busqueda","Compania");
            cp.agregarTipoDocumento(tipoDocumento,nit);
        } else {
            cp.buscarPersona("Busqueda","Persona");
            cp.agregarTipoDocumento(tipoDocumento,cedula);
        }
    }

    @Step
    public void agregar_direccion(String tipoDireccion, String direccion, String departamento, String ciudad) {
        cp.agregarDireccion(tipoDireccion,direccion,departamento,ciudad);
        cp.actualizar();
    }

    @Step
    public void agregar_organizacion(String nombreOrganizacion, String agente) {
        cp.agregarOrganizacion(nombreOrganizacion,agente);
    }

    @Step
    public void agregar_nombre(String primerNombre, String primerApellido, String fechaNacimiento){
        cp.agregarNombres(primerNombre,primerApellido,fechaNacimiento);
    }

    @Step
    public void agregar_razon_social(String razonSocial) {
        cp.agregarRazonsocial(razonSocial);
    }

    @Step
    public void verificar_cuenta(String nombreCuenta){
        cp.verificarCuentaNumero(nombreCuenta);
    }

    @Step
    public void verificar_edad_menor(String mensaje){
        cp.verificarMensaje(mensaje);
    }

    @Step
    public void verificar_mensaje(String mensaje){
        cp.verificarMensaje(mensaje);
    }

}
