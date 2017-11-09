package com.test.correoelectronico.definitions;

import com.test.correoelectronico.steps.CorreoElectronicoGmailSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class CorreoElectronicoGmailDefinitions {
   @Steps
    CorreoElectronicoGmailSteps correoElectronicoGmailSteps;

   @Given("puedo ingresar a mi correo electronico de gmail con la siguiente informacion:$informacion")
    public void ingresarACorreoElectronico(ExamplesTable informacion) throws InterruptedException {
       correoElectronicoGmailSteps.ingresarACorreoElectronico(informacion);
   }
   @Given("puedo ingresar a gmail")
    public void ingresarAGmail(){
        correoElectronicoGmailSteps.ingresarAGmail();
   }
   @Given("puedo enviar un mensaje de correo electronico a un usuario con los siguientes datos:$datosMensajeEmail")
    public void enviarMensajeCorreoElectronico(ExamplesTable datosMensajeCorreoElectronico) throws InterruptedException {
        correoElectronicoGmailSteps.enviarMensajeCorreoElectronico(datosMensajeCorreoElectronico);
   }
   @When("ingrese al correo electronico al cual envie el mensaje con los siguientes datos:$informacion")
    public void ingresarACorreoDestinatario(ExamplesTable informacion) throws InterruptedException {
        correoElectronicoGmailSteps.ingresarACorreoElectronico(informacion);
   }
   @When("quiera acceder a la cuenta de correo electronico del usuario destinatario")
    public void salirEIngresarACorreoElectronico() throws InterruptedException {
        correoElectronicoGmailSteps.salirEIngresarACorreoElectronico();
   }
   @Then("debo poder visualizar la informacion que se me ha enviado junto con el usuario que me la envio:$informacion")
    public void ingresarAOpcionRecibidosCorreoElectronico(ExamplesTable informacionMensajeRecibido){
        correoElectronicoGmailSteps.ingresarAOpcionRecibidosCorreoElectronico(informacionMensajeRecibido);
   }
}
