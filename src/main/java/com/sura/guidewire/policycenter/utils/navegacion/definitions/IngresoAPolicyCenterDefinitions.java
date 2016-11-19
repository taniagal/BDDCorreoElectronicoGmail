package com.sura.guidewire.policycenter.utils.navegacion.definitions;

import com.sura.guidewire.policycenter.utils.navegacion.steps.GuidewireLoginSteps;
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
        login.loguearseAPolicycenterComoSu(usuario, contrasenia, pais);
    }
    @Then("Debería acceder a PolicyCenter y ver página $tituloPagina")
    public void ingresarAPolicyCenter(String tituloPagina){
        SeleneseTestNgHelper.assertEquals(tituloPagina, login.validarQueElTituloDeLaPaginaPrincipalSeaMisActividads());
    }

    @Given("que ingrese a PolicyCenter como usuario $rolUsuario")
    public void dadoQueAccedoAPolicyCenterConRol(@Named("rolUsuario") String rolUsuario) {
        login.loguearseAPolicycenterConRol(rolUsuario);
        LOGGER.info("IngresoAPolicyCenterDefinitions.dadoQueAccedoAPolicyCenterConRol");

    }



}
