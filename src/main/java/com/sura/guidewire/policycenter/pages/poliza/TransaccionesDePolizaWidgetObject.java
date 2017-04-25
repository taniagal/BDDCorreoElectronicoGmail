package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.utils.navegacion.util.widget.TableWidgetPage;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TransaccionesDePolizaWidgetObject extends PageObject{
    private static final String XPATH_DIV_CONTENEDOR_TABLA_TRANSACCIONES = ".//*[@id='AccountFile_WorkOrders:AccountFile_WorkOrdersScreen:AccountWorkOrdersLV']";
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
        (this.tablaTransaccionesDePoliza.obtenerColumnaDeTabla("N.º de transacción").get(0)).findElement(By.tagName("a")).click();

        String tituloDePaginaContactos = "Información de póliza";
        waitForTextToAppear(tituloDePaginaContactos);
        shouldContainText(tituloDePaginaContactos);

    }


}
