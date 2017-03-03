package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesInformacionDelVehiculoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class InformacionDeVehiculoSteps extends ScenarioSteps {


    OpcionesInformacionDelVehiculoPage opcionesInformacionDelVehiculoPage = new OpcionesInformacionDelVehiculoPage(getDriver());

    public InformacionDeVehiculoSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void ingresar_a_cotizacion_de_vehiculo() {
        opcionesInformacionDelVehiculoPage.ingresarOpcionVehiculo();
    }

    @Step
    public void pasar_a_pagina_siguiente() {
        opcionesInformacionDelVehiculoPage.validarPaginaSiguiente();
    }

    @Step
    public void ingresar_intereses_adicionales_o_conductor(String tipoDocumento, String numeroDocumento) {
        opcionesInformacionDelVehiculoPage.ingresaBeneficiario(tipoDocumento, numeroDocumento);
    }

    @Step
    public void ingresar_valores_accesorios(String valorAccesorio, String valorAccesorioEsp) {
        opcionesInformacionDelVehiculoPage.ingresaValoresAccesorios(valorAccesorio, valorAccesorioEsp);
    }

    @Step
    public void ingresar_valores_de_bonificacion(String valorBoniTecnica, String valorBoniComercial) {
        opcionesInformacionDelVehiculoPage.ingresaValoresBonificacion(valorBoniTecnica , valorBoniComercial);
    }

    @Step
    public void validar_campos_informacion_vehiculo() {
        opcionesInformacionDelVehiculoPage.validaMensajePantalla();
    }

    @Step
    public void validar_campos_informacion_vehiculo(String mensaje) {
        opcionesInformacionDelVehiculoPage.validaMensajePantalla(mensaje);
    }

    @Step
    public void validar_poliza_total(){
        opcionesInformacionDelVehiculoPage.comparaValorAseguradoTotal();
    }

    @Step
    public void validar_Interes_Adicional_PEP() {
        opcionesInformacionDelVehiculoPage.validarInteresAdicionalPEP();
    }

    @Step
    public void validar_Mensaje_PEP_Interes_Adicional(String mensaje) {
        opcionesInformacionDelVehiculoPage.validarMensajePEPInteresAdicional(mensaje);
    }

    @Step
    public void permitir_Conticuar_Cotizacion() {
        opcionesInformacionDelVehiculoPage.permitirContinuarCotizacion();
    }
}
