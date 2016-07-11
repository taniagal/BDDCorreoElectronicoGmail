package com.sura.gw.policy.runners.administracion.consulta.cuenta.pages;

import com.sura.gw.navegacion.util.widget.TableWidgetPage;
import net.serenitybdd.core.pages.PageObject;

public class ContactosCuentaWidgetPage extends PageObject{

    TableWidgetPage tableWidgetPage;
    TableWidgetPage tablaWidgwtContactos;

    public Boolean existeContactosAsociadosALaCuenta(String numCuenta){
        return Boolean.TRUE;
    }

    public ContactosCuentaWidgetPage deTabla(String xpathEncabezadoTabla) {
        tablaWidgwtContactos = tableWidgetPage.deTabla(xpathEncabezadoTabla);
        return this;
    }

    public ContactosCuentaWidgetPage seleccionarDeCombo(String valorInputDeComboBox) {
        tablaWidgwtContactos = tablaWidgwtContactos.enToolbar().seleccionarDeComboConValor(valorInputDeComboBox);
        return this;
    }

    public void opcionDeCombo(String nombreDeOpcionDeCombo) {
        tablaWidgwtContactos.opcionDeCombo(nombreDeOpcionDeCombo);
    }


}


