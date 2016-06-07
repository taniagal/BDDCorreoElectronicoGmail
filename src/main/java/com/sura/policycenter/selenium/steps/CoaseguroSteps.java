package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.selenium.pages.CoaseguroPage;
import com.sura.policycenter.model.Aseguradora;
import java.util.ArrayList;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CoaseguroSteps extends ScenarioSteps{
    CoaseguroPage coaseguroPage = new CoaseguroPage(getDriver());

    public CoaseguroSteps(Pages pages){
        super(pages);
    }

    @Step
    public void validarCampos(){
        coaseguroPage.validarCampos();
    }

    @Step
    public void agregarCoaseguro(ArrayList<Aseguradora> aseguradoras){
        coaseguroPage.agregarCoaseguro(aseguradoras);
        coaseguroPage.verificarPorcentajeParticipacion();
        coaseguroPage.guardarcosaeguro();
    }

    @Step
    public void agregarCoaseguro2(ArrayList<Aseguradora> aseguradoras){
        coaseguroPage.agregarCoaseguro(aseguradoras);
        coaseguroPage.guardarcosaeguro();
    }

    @Step
    public void verificarCoaseguro(){
        coaseguroPage.verificarCoaseguro();
    }

    @Step
    public void verificarMensaje(String mensaje){
        coaseguroPage.verificarMensaje(mensaje);
    }
}
