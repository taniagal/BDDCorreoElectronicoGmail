package com.sura.claims.selenium.steps;

import com.sura.claims.selenium.pages.AbrirApp;
import com.sura.claims.selenium.pages.Buscar;
import com.sura.claims.selenium.pages.Escritorio;
import com.sura.claims.selenium.pages.Reclamacion;
import com.sura.guidewire.selenium.Guidewire;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by edwabuac on 15/04/2016.
 */

public class ClaimsSteps extends ScenarioSteps{
    Guidewire gw = new Guidewire(getDriver());
    AbrirApp abrirApp = new AbrirApp(getDriver());
    Escritorio escritorio = new Escritorio(getDriver());
    Reclamacion reclamacion = new Reclamacion(getDriver());
    Buscar buscar = new Buscar(getDriver());

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
    public void assertion(String element) {
        escritorio.assertion(element);
    }

    @Step
    public void navegacion() throws InterruptedException {
        try {
            escritorio.navegacionNuevaReclamacion();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Step
    public void llenarReclamacion(String npoliza) {
        reclamacion.llenarReclamacion(npoliza);
    }

    public void navegacionBuscaAvanzada () throws InterruptedException {
        escritorio.navegacionBuscaAvanzada();
    }


    @Step
    public void buscaPolizaAvanzada (String Npoliza){
        buscar.buscaAvanzada(Npoliza);
    }

    @Step
    public void asersionPoliza (String numPoliza){
        buscar.asersionPoliza (numPoliza);
    }


    @Step
    public void logout(){
        gw.logout();
    }

    @Step
    public void asercion(String msn){
        reclamacion.asercion(msn);
    }

}
