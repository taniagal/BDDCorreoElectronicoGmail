package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.pages.GuidewireLoginPages;
import com.sura.guidewire.policycenter.steps.GuidewireLoginSteps;
import com.thoughtworks.selenium.SeleneseTestNgHelper;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class IngresoAPolicyCenterDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    GuidewireLoginSteps superUsuario;

    GuidewireLoginPages guidewireLoginPages = new GuidewireLoginPages();

    @Given("Deseo ingresar como super usuario a PolicyCenter")
    public void ingresarComoSuperUsuarioPolicyCenter(){
        //Empty Method
    }

    @When("Digíto usuario $usuario y contraseña $contrasenia, país $pais y enviar las credenciales")
    public void ingresarComoSuperUsuarioPolicyCenter(String usuario, String contrasenia, String pais){
        guidewireLoginPages.open();
        superUsuario.logearse_a_policycenter_como_su(usuario, contrasenia, pais);
    }
    @Then("Debería acceder a PolicyCenter y ver página $tituloPagina")
    public void ingresarAPolicyCenter(String tituloPagina){
        SeleneseTestNgHelper.assertEquals(tituloPagina, superUsuario.validar_que_el_titulo_de_la_pagina_principal_sea_mis_actividads());
    }


}
