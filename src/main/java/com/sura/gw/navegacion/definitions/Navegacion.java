package com.sura.gw.navegacion.definitions;

import com.sura.gw.navegacion.steps.PolizaNavBarSteps;
import net.thucydides.core.annotations.Steps;

/**
 * Created by andralgu on 19/07/2016.
 */
public class Navegacion {

    @Steps
    PolizaNavBarSteps menuPoliza;


    public void cuandoSeleccioneOpcionDesplegableDeMenuSuperiorPoliza() {
        menuPoliza.seleccionar_opcion_desplegable_de_menu_superior_poliza();
    }

    public void cuandoBusquePorNumeroDeSubscripcionDePoliza(String numeroSubscripcion) {
        menuPoliza.ingresar_numero_de_subscripcion_y_teclear_enter(numeroSubscripcion);
    }


}
