package com.sura.claims.selenium.steps;

import com.sura.claims.selenium.pages.AbrirApp;
import com.sura.claims.selenium.pages.Buscar;
import com.sura.claims.selenium.pages.Reclamacion;
import com.sura.guidewire.selenium.Guidewire;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.steps.StepInterceptor;
import org.slf4j.LoggerFactory;
import javax.swing.JOptionPane;

public class ClaimsSteps extends ScenarioSteps{

    private final Guidewire gw = new Guidewire(getDriver());
    private final AbrirApp abrirApp = new AbrirApp(getDriver());
    private final Escritorio escritorio = new Escritorio(getDriver());
    private final Reclamacion reclamacion = new Reclamacion(getDriver());
    private final Buscar buscar = new Buscar(getDriver());

    public ClaimsSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void open() {
        abrirApp.open();
    }

    @Step
    public void login(String usuario, String contrasena) {
        login(usuario,contrasena);
    }

    @Step
    public void llenarReclamacion(String npoliza) {
        reclamacion.llenarReclamacion(npoliza);
    }

    @Step
    public void logout() {
        logout();
    }


}
