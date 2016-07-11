package com.sura.gw.navegacion.features;

import com.sura.gw.navegacion.steps.GuidewireLoginSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.slf4j.LoggerFactory;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

public class IngresoAPolicyCenterDefinitions {

    @Steps
    GuidewireLoginSteps login;

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    @Given("Deseo ingresar como super usuario a PolicyCenter")
    public void ingresarComoSuperUsuarioPolicyCenter(){
        //Empty Method
    }

    @When("Digíto usuario $usuario y contraseña $contrasenia, país $pais y enviar las credenciales")
    public void ingresarComoSuperUsuarioPolicyCenter(String usuario, String contrasenia, String pais){
        login.getLoginPage().open();
        login.loguearse_a_policycenter_como_su(usuario, contrasenia, pais);
    }
    @Then("Debería acceder a PolicyCenter y ver página $tituloPagina")
    public void ingresarAPolicyCenter(String tituloPagina){
        assertEquals(tituloPagina, login.validar_que_el_titulo_de_la_pagina_principal_sea_mis_actividads());
    }




}
