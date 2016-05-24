package com.sura.claims.selenium.steps;

import com.sura.claims.selenium.pages.AbrirApp;
import com.sura.claims.selenium.pages.Buscar;
import com.sura.claims.selenium.pages.Reclamacion;
import com.sura.guidewire.selenium.Guidewire;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

//import com.sura.policycenter.selenium.pages.PaginaPrincipal;

/**
 * Created by edwabuac on 15/04/2016.
 */

public class ClaimsSteps extends ScenarioSteps{
    Guidewire gw = new Guidewire(getDriver());
    AbrirApp abrirApp = new AbrirApp(getDriver());
    Reclamacion reclamacion = new Reclamacion(getDriver());
    Buscar buscar = new Buscar(getDriver());
    //PaginaPrincipal paginaPrincipal= new PaginaPrincipal (getDriver());

    public ClaimsSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void open() {
        abrirApp.open();
    }

    @Step
    public void login(String usuario, String contrasena) {
        gw.login(usuario,contrasena);
    }


    @Step
    public void logout(){
        gw.logout();
    }

    @Step
    public void asercion(String msn){reclamacion.asercion(msn);
    }



}
