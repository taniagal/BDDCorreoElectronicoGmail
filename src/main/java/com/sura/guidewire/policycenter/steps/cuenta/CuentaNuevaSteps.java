package com.sura.guidewire.policycenter.steps.cuenta;

import com.sura.guidewire.policycenter.pages.commons.InicioPage;
import com.sura.guidewire.policycenter.pages.cuenta.CuentaPage;
import com.sura.guidewire.policycenter.utils.Utils;

import java.util.Map;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import org.jbehave.core.model.ExamplesTable;

public class CuentaNuevaSteps extends ScenarioSteps {

    protected static final int CONSTANTE_6 = 6;
    protected static final int CONSTANTE_5 = 5;
    private static final String NOMBRECUENTA = "Busqueda";
    private final CuentaPage cuentaPage = new CuentaPage(getDriver());
    private String cedula = "";
    private String nit = "";

    public CuentaNuevaSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    private void initRandoms() {
        cedula = Utils.cedulaRandom();
        nit = Utils.nitRandom();
    }

    @Step
    public void crearCuentaNueva(ExamplesTable datosCotizacion) {
        Map<String, String> datosCuenta = datosCotizacion.getRow(0);
        if (datosCuenta.get("numeroDocumento") == null) {
            datosCuenta.put("numeroDocumento", "");
        }
        abrirNuevaCuenta();
        agregarTipoDocumento(datosCuenta.get("tipo_documento"), datosCuenta.get("numeroDocumento"));
        if ("CEDULA DE CIUDADANIA".equals(datosCuenta.get("tipo_documento"))) {
            agregarDatosCuenta(datosCotizacion, datosCuenta);
        } else {
            agregarDatosCuentaJuridica(datosCotizacion, datosCuenta);
        }
    }

    @Step
    public void crearCuentaNuevaConDocumento(ExamplesTable datosCotizacion) {
        Map<String, String> datosCuenta = datosCotizacion.getRow(0);
        abrirNuevaCuenta();
        agregarDocumento(datosCuenta.get("tipo_documento"), datosCuenta.get("documento"));
        agregarDatosCuenta(datosCotizacion, datosCuenta);
    }

    @Step
    private void agregarDatosCuenta(ExamplesTable datosCotizacion, Map<String, String> datosCuenta) {
        agregarOrganizacion("Sura", datosCuenta.get("agente"));
        agregarNombre(datosCuenta.get("primer_nombre"), datosCuenta.get("primer_apellido"), datosCuenta.get("fecha_nacimiento"));
        if (datosCuenta.get("correo_electronico_primario") != null && !datosCuenta.get("correo_electronico_primario").isEmpty()) {
            agregarCorreoPrimario(datosCuenta.get("correo_electronico_primario"));
        }
        agregarDireccion(datosCotizacion);
    }

    @Step
    private void agregarDatosCuentaJuridica(ExamplesTable datosCotizacion, Map<String, String> datosCuenta) {
        agregarOrganizacion("Sura", datosCuenta.get("agente"));
        agregarRazonSocial(datosCuenta.get("razon_social"));
        agregarDireccion(datosCotizacion);
    }

    @Step
    public void abrirNuevaCuenta() {
        inicioPage().irANuevaCuenta();
    }

    @Step
    public void agregarTipoDocumento(String tipoDocumento, String numeroDocumento) {
        if ("".equals(numeroDocumento)) {
            initRandoms();
        } else {
            cedula = numeroDocumento;
            nit = numeroDocumento;
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
        cuentaPage.agregarOrganizacion(nombreOrganizacion, agente);
    }

    @Step
    public void agregarNombre(String primerNombre, String primerApellido, String fechaNacimiento) {
        cuentaPage.agregarNombres(primerNombre, primerApellido, fechaNacimiento);
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
    public void agregarCorreoPrimario(String correoPrimario) {
        cuentaPage.agregarCorreoPrimario(correoPrimario);
    }


    @Step
    public void verificarCuenta(String nombreCuenta) {
        cuentaPage.verificarCuentaNumero(nombreCuenta);
    }

    @Step
    public void verificarMensaje(String mensaje) {
        cuentaPage.verificarMensaje(mensaje);
    }

    @Step
    public void verificarEstadoDeMensaje(String mensaje) {
        cuentaPage.verificarEstadoDeMensaje(mensaje);
    }
}
