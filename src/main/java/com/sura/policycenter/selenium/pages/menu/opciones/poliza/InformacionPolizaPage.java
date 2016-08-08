package com.sura.policycenter.selenium.pages.menu.opciones.poliza;

import com.sura.commons.selenium.Commons;
import org.openqa.selenium.WebDriver;


public class InformacionPolizaPage extends Commons {

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
