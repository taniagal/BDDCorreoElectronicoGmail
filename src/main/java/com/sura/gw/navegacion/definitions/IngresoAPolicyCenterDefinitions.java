package com.sura.gw.navegacion.definitions;

import com.sura.gw.navegacion.steps.GuidewireLoginSteps;
import com.thoughtworks.selenium.SeleneseTestNgHelper;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

public class IngresoAPolicyCenterDefinitions {

    @Steps
    GuidewireLoginSteps login;

    @Managed
    public WebDriver driver;

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
        SeleneseTestNgHelper.assertEquals(tituloPagina, login.validar_que_el_titulo_de_la_pagina_principal_sea_mis_actividads());
    }

    @Given("que ingrese a PolicyCenter como usuario $rolUsuario")
    public void dadoQueAccedoAPolicyCenterConRol(@Named("rolUsuario") String rolUsuario) {
        login.loguearse_a_policycenter_con_rol(rolUsuario);
        LOGGER.info("IngresoAPolicyCenterDefinitions.dadoQueAccedoAPolicyCenterConRol");

    }



}
