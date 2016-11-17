package com.sura.guidewire.policycenter.pages.cuenta;

import com.sura.guidewire.policycenter.utils.navegacion.util.widget.TableWidgetPage;
import java.util.ArrayList;
import java.util.List;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;


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


