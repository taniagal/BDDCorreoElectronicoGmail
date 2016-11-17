package com.sura.guidewire.policycenter.utils.navegacion.definitions;

import com.sura.guidewire.policycenter.utils.navegacion.steps.MenuBuscarSteps;
import com.sura.guidewire.policycenter.utils.navegacion.steps.PolizaNavBarSteps;
import net.thucydides.core.annotations.Steps;

/**
 * Created by andralgu on 19/07/2016.
 */
public class Navegacion {

    @Steps
    PolizaNavBarSteps menuPoliza;

    @Steps
    MenuBuscarSteps menuBuscar;



    public void cuandoSeleccioneOpcionDesplegableDeMenuSuperiorPoliza() {
        menuPoliza.seleccionar_opcion_desplegable_de_menu_superior_poliza();
    }

    public void cuandoBusquePorNumeroDeDePoliza(String numeroDePoliza) {
        menuPoliza.ingresar_numero_de_poliza_y_teclear_enter(numeroDePoliza);
    }

    public void cuandoBusquePorNumeroDeSubscripcionDePoliza(String numeroSubscripcion) {
        menuPoliza.ingresar_numero_de_subscripcion_y_teclear_enter(numeroSubscripcion);
    }

    public void cuandoIngresoALaOpcionBuscar(){
        menuBuscar.ingresar_a_la_opcion_Buscar();
    }

}
