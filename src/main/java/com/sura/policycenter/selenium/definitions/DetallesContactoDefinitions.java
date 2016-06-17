package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.DetallesContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

@SuppressWarnings("WeakerAccess")
public class DetallesContactoDefinitions {

    @Steps
    private SeusLoginSteps seusLogin;

    @Steps
    private DetallesContactoSteps detallesContactoSteps;

    /**
     * ESCENARIO 1
     */
    @Given("tengo un contacto con <tipo_documento> c. <documento>")
    public void givenConsultarContacto(@Named("tipo_documento") String tipo_documento,@Named("documento") String documento){
    }

    @When("quiera ver informacion detallada del contacto con <tipo_documento> c. <documento>")
    public void whenConsultarDetallePersonaNatural(@Named("tipo_documento") String tipo_documento,@Named("documento") String documento) {
        detallesContactoSteps.abrir_detalles_contacto(tipo_documento,documento);
    }

    @Then("se debe ver minimo la siguiente informacion definida para el panel de detalles de persona narural")
    public void assertConsultarDetallePersonaNatural() {
        detallesContactoSteps.verificar_campos_persona_natural();
        seusLogin.close();
    }

    /**
     * ESCENARIO 2
     */
    @Then("se debe ver minimo la siguiente informacion definida para el panel de detalles de persona juridica")
    public void assertConsultarDetallePersonaJuridica(){
        detallesContactoSteps.verificar_campos_persona_juridica();
        seusLogin.close();
    }

}
