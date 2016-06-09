package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.pages.navegacion.PanelIzquierdoElement;
import com.sura.policycenter.pages.navegacion.PanelSuperiorElement;
import com.sura.policycenter.pages.policy.estados.poliza.cotizacion.NuevaCotizacionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.Keys;

import java.io.Serializable;

import static com.sura.policycenter.pages.policy.estados.poliza.cotizacion.NuevaCotizacionPage.*;

public class CotizacionSteps extends ScenarioSteps implements Serializable {

    private static final long serialVersionUID = 1L;

    private PanelSuperiorElement panelSuperior;
    private PanelIzquierdoElement panelIzquierdo;
    private NuevaCotizacionPage cotizacionPage;

    @Step
    public void ir_al_menu_escritorio_del_panel_superior(){
        panelSuperior.irMenu(PanelSuperiorElement.MENU_ESCRITORIO);
    }

    @Step
    public void clic_en_la_opcion_acciones_del_panel_izquierdo(){
        panelIzquierdo.opcion(PanelIzquierdoElement.LINK_ACCIONES);
    }

    @Step
    public void clic_en_la_opcion_nueva_cotizacion(){
        panelIzquierdo.opcion(PanelIzquierdoElement.LINK_NUEVA_COTIZACION);
    }

    @Step
    public void digitar_numero_de_cuenta(String numeroCuenta) {
        getCotizacionPage().enter(numeroCuenta).into(cotizacionPage.elemento(TXT_NUMERO_CUENTA));
    }

    @Step
    public void digitar_la_tecla(String teclaAccion) {
        // TODO: 08/06/2016 \VALIDAR QUE LO QUE SE ENVIA EN LA HISTORIA SEA UNA TECLA 
        getCotizacionPage().getDriver().switchTo().activeElement().sendKeys(Keys.TAB);
    }

    @Step
    public void digitar_nombre_agente(String nombreAgente) {
        getCotizacionPage().enter(nombreAgente).into(cotizacionPage.elemento(TXT_NOMBRE_AGENTE));

    }

    @Step
    public void digitar_codigo_de_agente(String codigoAgente) {
        getCotizacionPage().enter(codigoAgente).into(cotizacionPage.elemento(TXT_CODIGO_AGENTE));
    }

    public NuevaCotizacionPage getCotizacionPage() {
        return cotizacionPage;
    }
}
