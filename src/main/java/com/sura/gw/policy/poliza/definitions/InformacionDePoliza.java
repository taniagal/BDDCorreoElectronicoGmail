package com.sura.gw.policy.poliza.definitions;


import com.sura.gw.policy.poliza.steps.InformacionDePolizaSteps;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

public class InformacionDePoliza {

    @Steps
    InformacionDePolizaSteps informacionDePolizaSteps;

    public void cuandoSeleccioneOpcionDeInformacionDePolizaEdificiosYUbicaciones() {
        informacionDePolizaSteps.seleccionar_opcion_edificios_y_ubicaciones();
    }

    public Boolean esperoVerNumeroDeSubscripcionEnEnvio(String numeroSubscripcion) {
        return informacionDePolizaSteps.esperoVerNumeroDeSubscripcionEnEnvio(numeroSubscripcion);
    }

    public void cuandoEditeInformacionDeLaPoliza() {
        informacionDePolizaSteps.seleccionar_boton_llamado_editar_transaccion_de_poliza();
    }

    public void cuandoDeseeIngresarArticuloAUnaUbicacion() {
        informacionDePolizaSteps.seleccionar_boton_agregar_articulo_a_una_ubicacion();
    }

    public void cuandoIntenteIngresarUnArticuloAUnaUbicacionParaComprobarValidacionesDeErrorDelArticulo() {
        informacionDePolizaSteps.seleccionar_check_del_articulo_a_agregar();
        informacionDePolizaSteps.seleccionar_check_de_cobertura_que_desea_aplicar();

        /*
        Se ingresa valor asegurado superior al valor del articulo a asegurar y se ingresa valores a sublimites
        que superen el valor asegurado con el fin de validar en el paso de comprobaciones que se verifiquen los limites
        de valores para valor asegurado y sublimites.
         */
        informacionDePolizaSteps.ingresar_valor_reconstruccion_del_articulo("10000");
        informacionDePolizaSteps.ingresar_valor_asegurado_danos_materiales("10001");
        informacionDePolizaSteps.ingresar_valor_sublimite_translados("10002");
        informacionDePolizaSteps.ingresar_valor_sublimite_para_combustion("10002");
        informacionDePolizaSteps.seleccionar_boton_aceptar_para_agregar_articulo();
    }

    public void entoncesValidarValoresDeSublimitesYValorAseguradoParaElValorDelArticulo(){
        assertThat(informacionDePolizaSteps.espacioDeTrabajo(),
                hasItems("EL valor Asegurado de la cobertura Danos materiales NO debe ser mayor al valor asegurable del Artículo Edificio",
                        "El valor de \"Sublimite para traslados temporales de maquinaria y equipo\" debe ser menor al valor asegurado de la cobertura \"Danos materiales\".",
                        "El valor de \"Sublimite para combustion espontanea de mercancias a granel\" debe ser menor al valor asegurado de la cobertura \"Danos materiales\"."
                ));
    }


}
