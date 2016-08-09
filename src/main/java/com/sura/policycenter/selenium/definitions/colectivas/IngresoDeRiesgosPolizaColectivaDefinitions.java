package com.sura.policycenter.selenium.definitions.colectivas;


import com.sura.policycenter.selenium.steps.colectivas.IngresoDeRiesgosPolizaColectivaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class IngresoDeRiesgosPolizaColectivaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    IngresoDeRiesgosPolizaColectivaSteps ingresoDeRiesgosPolizaColectivaSteps;

    @When("de clic en agregar riesgo para ir a la ventana de riesgos")
    public void clicEnAgregarRiesgoInfoPoliza(){
        ingresoDeRiesgosPolizaColectivaSteps.clicEnAgregarRiesgoInfoPoliza();
    }

    @When("de clic en agregar riesgo para agregar un riesgo a la poliza colectiva")
    public void clicEnAgregarRiesgo(){
        ingresoDeRiesgosPolizaColectivaSteps.clicEnAgregarRiesgo();
    }

    @When("ingrese los datos para realizar la busqueda de la cuenta persona natural <nombre> <apellido>")
    public void ingresarDatosParaBuscarPersonalNatural(@Named("nombre") String nombre,
                                                       @Named("apellido") String apellido){
        ingresoDeRiesgosPolizaColectivaSteps.ingresarDatosParaBuscarPersonalNatural(nombre, apellido);
    }

    @When("ingrese los datos para crear un contacto tipo persona natural $cuentaNueva")
    public void crearCuentaPersonaNatural(ExamplesTable cuentaNueva){
        ingresoDeRiesgosPolizaColectivaSteps.crearCuentaPersonaNatural(cuentaNueva);
    }

    @When("la cuenta fue creada y agregada satisfactoriamente como asegurado $asegurados")
    public void validarAseguradoAgregado(ExamplesTable asegurados){
        ingresoDeRiesgosPolizaColectivaSteps.validarAseguradoAgregado(asegurados);
    }

    @When("relacione el asegurado a los datos del vehiculo")
    public void relacionarAsegurado(){
        ingresoDeRiesgosPolizaColectivaSteps.relacionarAsegurado();
    }

    @When("ingrese las coberturas minimas para realizar la cotizacion")
    public void ingresarCoberturas(){
        ingresoDeRiesgosPolizaColectivaSteps.ingresarCoberturas();
    }

    @When("voy a la opcion de analisis de riesgo y autorizo")
    public void aprobarAnalisisDeRiesgo(){
        ingresoDeRiesgosPolizaColectivaSteps.aprobarAnalisisDeRiesgo();
    }

    @When("expido la poliza para agregar el riesgo a la poliza colectiva")
    public void expedirPoliza(){
        ingresoDeRiesgosPolizaColectivaSteps.expedirPoliza();
    }

    @Then("se debe visualizar la opcion de ir a la poliza colectiva de la nueva poliza creada")
    public void validarOpcionIrAPolizaColectiva(){
        ingresoDeRiesgosPolizaColectivaSteps.validarOpcionIrAPolizaColectiva();
    }

    @Then("al ir a la poliza colectiva e ir a los riesgos, debo ver el riesgo creado con los datos correspondientes $riesgosColectiva")
    public void validarRiesgoIngresado(ExamplesTable riesgosColectiva){
        ingresoDeRiesgosPolizaColectivaSteps.validarRiesgoIngresado(riesgosColectiva);
    }
}
