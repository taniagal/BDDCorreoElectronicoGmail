package com.sura.policycenter.selenium.pages.menu.opciones.poliza;

import com.sura.guidewire.selenium.Guidewire;
import org.openqa.selenium.WebDriver;

/**
 * Created by jonamele on 02/06/2016.
 */
public class InformacionPolizaPage extends Guidewire {

    public InformacionPolizaPage(WebDriver driver) {
        super(driver);
    }

    //mapeo informacion poliza xpat mensajepage

    public void expedirPolizaMrc() {

    }

    public void validacion (String mensaje){
       // assertThat(mensaje,containsString(mensajepage.getText()));
    }


}
