package com.sura.guidewire.policycenter.steps.cuenta;

import com.sura.guidewire.policycenter.util.PageUtil;
import com.sura.guidewire.policycenter.pages.cuenta.CuentaPage;
import com.sura.guidewire.policycenter.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class CuentaNuevaSteps extends ScenarioSteps {

    private String cedula = "";
    private String nit = "";
    private final PageUtil gw = new PageUtil(getDriver());
    private final CuentaPage cuentaPage = new CuentaPage(getDriver());
    private static final String NOMBRECUENTA = "Busqueda";
    protected static final int CONSTANTE_6 = 6;
    protected static final int CONSTANTE_5 = 5;

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
    public void abrirNuevaCuenta() {
        inicioPage().irANuevaCuenta();
    }

    @Step
    public void agregarTipoDocumento(String tipoDocumento) {
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
    public void agregarTipoDocumentoB(String tipoDocumento) {
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
    public void agregarDocumento(String tipoDocumento) {
        initRandoms();
        StringBuilder documento = new StringBuilder("us");
        if ("NIT".equals(tipoDocumento) || "IDENT. FISCAL PARA EXTRANJEROS".equals(tipoDocumento)) {
            documento.append(nit.substring(0, CONSTANTE_6) + "c");
            cuentaPage.buscarPersona(NOMBRECUENTA, "Compania");
            cuentaPage.agregarTipoDocumento(tipoDocumento, documento.toString());
        } else {
            documento.append(cedula.substring(0, CONSTANTE_5) + "c");
            cuentaPage.buscarPersona(NOMBRECUENTA, "Persona");
            cuentaPage.agregarTipoDocumento(tipoDocumento, documento.toString());
        }
    }

    @Step
    public void agregarDocumento(String tipoDocumento, String documento) {
        if ("NIT".equals(tipoDocumento)) {
            cuentaPage.buscarPersona(NOMBRECUENTA, "Compania");
        } else {
            cuentaPage.buscarPersona(NOMBRECUENTA, "Persona");
        }
        cuentaPage.agregarTipoDocumento(tipoDocumento, documento);
    }

    @Step
    public void agregarDireccion(ExamplesTable datos) {
        cuentaPage.agregarDireccion(datos);
        cuentaPage.actualizar();
    }

    @Step
    public void agregarOrganizacion(String nombreOrganizacion, String agente) {
        cuentaPage.agregarOrganizacion(nombreOrganizacion,agente);
    }

    @Step
    public void agregarNombre(String primerNombre, String primerApellido, String fechaNacimiento){
        cuentaPage.agregarNombres(primerNombre,primerApellido,fechaNacimiento);
    }

    @Step
    public void agregarNombreComecial(String nombreComercial) {
        cuentaPage.agregarNombrecomercial(nombreComercial);
    }

    @Step
    public void agregarTelefonoOficina(String telefonoOficina) {
        cuentaPage.agregarTelefonoOficina(telefonoOficina);
    }


    @Step
    public void agregarRazonSocial(String razonSocial) {
        cuentaPage.agregarRazonsocial(razonSocial);
    }

    @Step
    public void verificarCuenta(String nombreCuenta){
        cuentaPage.verificarCuentaNumero(nombreCuenta);
    }

    @Step
    public void verificarEdadMenor(String mensaje){
        cuentaPage.verificarMensaje(mensaje);
    }

    @Step
    public void verificarMensaje(String mensaje){
        cuentaPage.verificarMensaje(mensaje);
    }

    @Step
    public void verificarEstadoDeMensaje(String mensaje) {
        cuentaPage.verificarEstadoDeMensaje(mensaje);
    }

}
