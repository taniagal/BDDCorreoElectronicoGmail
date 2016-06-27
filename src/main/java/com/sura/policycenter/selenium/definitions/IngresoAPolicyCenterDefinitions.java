package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.pages.GuidewireLoginPages;
import com.sura.policycenter.selenium.steps.GuidewireLoginSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

public class IngresoAPolicyCenterDefinitions {


    @Steps
    GuidewireLoginSteps superUsuario;

    GuidewireLoginPages guidewireLoginPages;

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
        assertEquals(tituloPagina, superUsuario.validar_que_el_titulo_de_la_pagina_principal_sea_mis_actividads());
    }


}
