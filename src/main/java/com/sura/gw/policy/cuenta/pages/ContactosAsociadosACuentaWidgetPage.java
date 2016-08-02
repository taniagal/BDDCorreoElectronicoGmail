package com.sura.gw.policy.cuenta.pages;

import com.sura.gw.navegacion.util.widget.TableWidgetPage;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ContactosAsociadosACuentaWidgetPage extends PageObject {

    private static String XPATH_DIV_CONTENEDOR_TABLA_CONTACTOS = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV']";

    TableWidgetPage tablaContactos;

    private void obtenerTablaContactosAsociados() {
        tablaContactos = new TableWidgetPage(getDriver());
        tablaContactos.buscarTabla(XPATH_DIV_CONTENEDOR_TABLA_CONTACTOS);
    }

    public Boolean existenContactosAsociados(){
        Boolean existe;
        if (tablaContactos == null){
            obtenerTablaContactosAsociados();
            existe = tablaContactos.existenFilasEnTabla();
        } else {
            existe = tablaContactos.existenFilasEnTabla();
        }
        return existe;
    }

    public void filtrarContactosAsociados(String filtro, String combo ){
        tablaContactos.enToolbar().seleccionarDeComboConValor(combo);
        tablaContactos.opcionDeCombo(filtro);
    }

    public List<String> obtenerColumna(String columna ){

        List<String> filasPorColumna = new ArrayList<>();
        for (WebElement celda : tablaContactos.obtenerColumnaDeTabla(columna)){
            filasPorColumna.add(celda.getText());
        }

        return filasPorColumna;
    }


}


