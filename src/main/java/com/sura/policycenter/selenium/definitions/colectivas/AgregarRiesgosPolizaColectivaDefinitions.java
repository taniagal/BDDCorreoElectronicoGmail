package com.sura.policycenter.selenium.definitions.colectivas;


import com.sura.policycenter.selenium.steps.colectivas.AgregarRiesgosPolizaColectivaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class AgregarRiesgosPolizaColectivaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    AgregarRiesgosPolizaColectivaSteps agregarRiesgosPolizaColectivaSteps;

    @When("de clic en agregar riesgo para ir a la ventana de riesgos")
    public void clicEnAgregarRiesgoInfoPoliza(){
        agregarRiesgosPolizaColectivaSteps.clicEnAgregarRiesgoInfoPoliza();
    }

    @When("de clic en agregar riesgo para agregar un riesgo a la poliza colectiva")
    public void clicEnAgregarRiesgo(){
        agregarRiesgosPolizaColectivaSteps.clicEnAgregarRiesgo();
    }

    @When("ingrese los datos para realizar la busqueda de la cuenta persona natural <nombre> <apellido>")
    public void ingresarDatosParaBuscarPersonalNatural(@Named("nombre") String nombre,
                                                       @Named("apellido") String apellido){
        agregarRiesgosPolizaColectivaSteps.ingresarDatosParaBuscarPersonalNatural(nombre, apellido);
    }

    @When("ingrese los datos para crear un contacto tipo persona natural $cuentaNueva")
    public void crearCuentaPersonaNatural(ExamplesTable cuentaNueva){
        agregarRiesgosPolizaColectivaSteps.crearCuentaPersonaNatural(cuentaNueva);
    }

    @When("la cuenta fue creada y agregada satisfactoriamente como asegurado $asegurados")
    public void validarAseguradoAgregado(ExamplesTable asegurados){
        agregarRiesgosPolizaColectivaSteps.validarAseguradoAgregado(asegurados);
    }

    @When("relacione el asegurado a los datos del vehiculo")
    public void relacionarAsegurado(){
        agregarRiesgosPolizaColectivaSteps.relacionarAsegurado();
    }

    @When("ingrese las coberturas minimas para realizar la cotizacion")
    public void ingresarCoberturas(){
        agregarRiesgosPolizaColectivaSteps.ingresarCoberturas();
    }
}
