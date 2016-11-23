package com.sura.guidewire.policycenter.definitions.contacto;

import com.sura.guidewire.policycenter.steps.commons.LoginSteps;
import com.sura.guidewire.policycenter.steps.contacto.DetallesContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

@SuppressWarnings("WeakerAccess")
public class DetallesContactoDefinitions {
    @Steps
    private LoginSteps seusLogin;

    @Steps
    private DetallesContactoSteps detallesContactoSteps;

    /**
     * ESCENARIO 1
     */
    @Given("tengo un contacto con <tipo_documento> c. <documento>")
    public void givenConsultarContacto(@Named("tipo_documento") String tipoDocumento,@Named("documento") String documento){
        seusLogin.login();
    }

    @When("quiera ver informacion detallada del contacto con <tipo_documento> c. <documento>")
    public void whenConsultarDetallePersonaNatural(@Named("tipo_documento") String tipoDocumento,@Named("documento") String documento) {
        detallesContactoSteps.abrir_detalles_contacto(tipoDocumento,documento);
    }

    @Then("se debe ver minimo la siguiente informacion definida para el panel de detalles de persona narural")
    public void assertConsultarDetallePersonaNatural() {
        detallesContactoSteps.verificar_campos_persona_natural();
    }

    /**
     * ESCENARIO 2
     */
    @Then("se debe ver minimo la siguiente informacion definida para el panel de detalles de persona juridica")
    public void assertConsultarDetallePersonaJuridica(){
        detallesContactoSteps.verificar_campos_persona_juridica();
    }

}
