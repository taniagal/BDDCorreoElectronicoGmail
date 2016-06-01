package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.pages.GuidewireLoginPages;
import com.sura.policycenter.selenium.steps.GuidewireLoginSteps;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

public class IngresoAPolicyCenterDefinitions {

    @Managed(driver="chrome")
    public WebDriver webDriver;

    @ManagedPages
    public Pages pages;

    @Steps
    GuidewireLoginSteps superUsuario;

    GuidewireLoginPages guidewireLoginPages;

    public IngresoAPolicyCenterDefinitions(Pages pages) {
        this.pages = pages;
        guidewireLoginPages = pages.get(GuidewireLoginPages.class);
    }

    @Given("Deseo ingresar como super usuario a PolicyCenter")
    public void ingresarComoSuperUsuarioPolicyCenter(){
        Serenity.done();
    }

    @When("Digíto usuario $usuario y contraseña $contrasenia y enviar las credenciales")
    public void ingresarComoSuperUsuarioPolicyCenter(String usuario, String contrasenia){
        guidewireLoginPages.open();
        superUsuario.ingresar_usuario(usuario);
        superUsuario.ingresar_contrasenia(contrasenia);
        superUsuario.enviar_credenciales();
    }
    @Then("Debería acceder a PolicyCenter y ver página $tituloPagina")
    public void ingresarAPolicyCenter(String tituloPagina){
        assertEquals(tituloPagina, superUsuario.validar_que_el_titulo_de_la_pagina_principal_sea_mis_actividads());
    }


}
