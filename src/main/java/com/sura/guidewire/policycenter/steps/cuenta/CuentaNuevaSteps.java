package com.sura.guidewire.policycenter.steps.cuenta;

import com.sura.guidewire.policycenter.util.Commons;
import com.sura.guidewire.policycenter.pages.cuenta.CuentaPage;
import com.sura.guidewire.policycenter.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class CuentaNuevaSteps extends ScenarioSteps {

    private String cedula = "";
    private String nit = "";
    private final Commons gw = new Commons(getDriver());
    private final CuentaPage cuentaPage = new CuentaPage(getDriver());
    private static final String NOMBRECUENTA = "Busqueda";
    
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
        if ("".equals(cedula) || "".equals(nit)) {
            initRandoms();
        }
        if ("NIT".equals(tipoDocumento)) {
            cuentaPage.buscarPersona(NOMBRECUENTA, "Compania");
            cuentaPage.agregarTipoDocumento(tipoDocumento, nit);
        } else {
            cuentaPage.buscarPersona(NOMBRECUENTA, "Persona");
            cuentaPage.agregarTipoDocumento(tipoDocumento, cedula);
        }
    }

    @Step
    public void agregar_tipo_documento_b(String tipoDocumento) {
        initRandoms();
        if ("NIT".equals(tipoDocumento)) {
            cuentaPage.buscarPersona(NOMBRECUENTA, "Compania");
            cuentaPage.agregarTipoDocumento(tipoDocumento, nit);
        } else {
            cuentaPage.buscarPersona(NOMBRECUENTA, "Persona");
            cuentaPage.agregarTipoDocumento(tipoDocumento, cedula);
        }
    }

    @Step
    public void agregar_documento(String tipoDocumento) {
        initRandoms();
        StringBuilder documento = new StringBuilder("us");
        if ("NIT".equals(tipoDocumento) || "IDENT. FISCAL PARA EXTRANJEROS".equals(tipoDocumento)) {
            documento.append(nit.substring(0, 6) + "c");
            cuentaPage.buscarPersona(NOMBRECUENTA, "Compania");
            cuentaPage.agregarTipoDocumento(tipoDocumento, documento.toString());
        } else {
            documento.append(cedula.substring(0, 5) + "c");
            cuentaPage.buscarPersona(NOMBRECUENTA, "Persona");
            cuentaPage.agregarTipoDocumento(tipoDocumento, documento.toString());
        }
    }

    @Step
    public void agregar_documento(String tipoDocumento,String documento) {
        if ("NIT".equals(tipoDocumento)) {
            cuentaPage.buscarPersona(NOMBRECUENTA, "Compania");
        } else {
            cuentaPage.buscarPersona(NOMBRECUENTA, "Persona");
        }
        cuentaPage.agregarTipoDocumento(tipoDocumento, documento);
    }

    @Step
    public void agregar_direccion(ExamplesTable datos) {
        cuentaPage.agregarDireccion(datos);
        cuentaPage.actualizar();
    }

    @Step
    public void agregar_organizacion(String nombreOrganizacion, String agente) {
        cuentaPage.agregarOrganizacion(nombreOrganizacion,agente);
    }

    @Step
    public void agregar_nombre(String primerNombre, String primerApellido, String fechaNacimiento){
        cuentaPage.agregarNombres(primerNombre,primerApellido,fechaNacimiento);
    }

    @Step
    public void agregar_nombre_comecial(String nombreComercial) {
        cuentaPage.agregarNombrecomercial(nombreComercial);
    }

    @Step
    public void agregar_telefono_oficina(String telefonoOficina) {
        cuentaPage.agregarTelefonoOficina(telefonoOficina);
    }


    @Step
    public void agregar_razon_social(String razonSocial) {
        cuentaPage.agregarRazonsocial(razonSocial);
    }

    @Step
    public void verificar_cuenta(String nombreCuenta){
        cuentaPage.verificarCuentaNumero(nombreCuenta);
    }

    @Step
    public void verificar_edad_menor(String mensaje){
        cuentaPage.verificarMensaje(mensaje);
    }

    @Step
    public void verificar_mensaje(String mensaje){
        cuentaPage.verificarMensaje(mensaje);
    }

    @Step
    public void verificar_estado_de_mensaje(String mensaje) {
        cuentaPage.verificarEstadoDeMensaje(mensaje);
    }

}
