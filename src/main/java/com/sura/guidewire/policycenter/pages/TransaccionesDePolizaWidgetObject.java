package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.util.navegacion.util.widget.TableWidgetPage;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by andralgu on 18/07/2016.
 */
public class TransaccionesDePolizaWidgetObject extends PageObject{
    private static String XPATH_DIV_CONTENEDOR_TABLA_TRANSACCIONES = ".//*[@id='AccountFile_WorkOrders:AccountFile_WorkOrdersScreen:AccountWorkOrdersLV']";
    TableWidgetPage tablaTransaccionesDePoliza;

    private TransaccionesDePolizaWidgetObject obtenerTablaContactosAsociados() {
        this.tablaTransaccionesDePoliza = new TableWidgetPage(SerenityWebdriverManager.inThisTestThread().getCurrentDriver());
        this.tablaTransaccionesDePoliza.buscarTabla(XPATH_DIV_CONTENEDOR_TABLA_TRANSACCIONES);
        return this;
    }

    public void seleccionarPrimeraOcurrenciaProductoMultiriesgoCorporativo(){

        if (tablaTransaccionesDePoliza == null) {
            obtenerTablaContactosAsociados();
        }

        this.tablaTransaccionesDePoliza.enToolbar().seleccionarDeComboConLabel("Producto");
        this.tablaTransaccionesDePoliza.opcionDeCombo("Multiriesgo corporativo");
        ( (WebElement) this.tablaTransaccionesDePoliza.obtenerColumnaDeTabla("N.º de transacción").get(0)).findElement(By.tagName("a")).click();

        String tituloDePaginaContactos = "Información de póliza";
        waitForTextToAppear(tituloDePaginaContactos);
        shouldContainText(tituloDePaginaContactos);

    }


}
