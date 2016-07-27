package com.sura.policycenter.selenium.definitions.colectivas;


import com.sura.policycenter.selenium.steps.colectivas.InformacionDePolizaColectivaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class InformacionDePolizaColectivaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    InformacionDePolizaColectivaSteps informacionDePolizaColectivaSteps;

    @When("seleccione el producto <producto> de poliza colectiva para expedirla")
    public void seleccionarProductoDePolizaColectiva(@Named("producto") String producto){
        informacionDePolizaColectivaSteps.seleccionarProductoDePolizaColectiva(producto);
    }

    @When("seleccione segundo tomador para la poliza colectiva")
    public void seleccionarSegundoTomadorParaPolizaColectiva(){
        informacionDePolizaColectivaSteps.seleccionarSegundoTomadorParaPolizaColectiva();
    }

    @When("cambie la fecha de inicio de vigencia de la poliza colectiva (un mes antes de la fecha actual)")
    public void cambiarLaFechaDeInicioDeVigencia(){
        informacionDePolizaColectivaSteps.cambiarLaFechaDeInicioDeVigencia();
    }

    @When("cambie la fecha de inicio de vigencia de la poliza colectiva mas de 60 dias  hacia atrás o 60 hacia adelante <sesentaDias>")
    public void cambiarLaFechaDeInicioDeVigenciaSesentaDias(@Named("sesentaDias") String sesentaDias){
        informacionDePolizaColectivaSteps.cambiarLaFechaDeInicioDeVigenciaSesentaDias(sesentaDias);
    }

    @When("de clic en boton siguiente para pasar al siguiente paso de la poliza colectiva")
    public void darClicEnElBotonSiguiente(){
        informacionDePolizaColectivaSteps.darClicEnElBotonSiguiente();
    }

    @When("ingrese el porcentaje de descuento invalido <porcentaje>")
    public void ingresarPorcentajeDeDescuentoDeLaPoliza(@Named("porcentaje") String porcentaje){
        informacionDePolizaColectivaSteps.ingresarPorcentajeDeDescuentoDeLaPoliza(porcentaje);
    }

    @Then("debo ver los siguiente campos en la pantalla con su respectiva informacion: $informacionPolizaColectiva")
    public void validarInformacionDePolizaColectiva(ExamplesTable informacionPolizaColectiva){
        informacionDePolizaColectivaSteps.validarInformacionDePolizaColectiva(informacionPolizaColectiva);
    }

    @Then("debo ver la fecha de fin de vigencia <cantidadAniosVigencia> calculado de acuerdo al producto seleccionado")
    public void validarFechaFinVigencia(@Named("cantidadAniosVigencia") int cantidadAniosVigencia){
        informacionDePolizaColectivaSteps.validarFechaFinVigencia(cantidadAniosVigencia);
    }

    @Then("debo ver los siguientes datos del segundo tomador en la pantalla: $informacionSegundoTomador")
    public void validarInformacionDelSegundoTomador(ExamplesTable informacionSegundoTomador){
        informacionDePolizaColectivaSteps.validarInformacionDelSegundoTomador(informacionSegundoTomador);
    }

    @Then("debe recalcular la fecha fin de vigencia <aniosFinVigencia> de acuerdo al producto seleccionado")
    public void validarFechaDeFinDeVigenciaRecalculada(@Named("aniosFinVigencia") int aniosFinVigencia){
        informacionDePolizaColectivaSteps.validarFechaDeFinDeVigenciaRecalculada(aniosFinVigencia);
    }

    @Then("me debe mostrar el mensaje <mensaje> indicando que no cumple con la retroactividad permitida")
    public void validarMensajeDeRetroactividad(@Named("mensaje") String mensaje){
        informacionDePolizaColectivaSteps.validarMensajeDeRetroactividad(mensaje);
    }

    @Then("me debe mostrar el mensaje <mensaje> indicando la inconsistencia en el valor del descuento")
    public void validarMensajeDeValidacionDelCampoDescuento(@Named("mensaje") String mensaje){
        informacionDePolizaColectivaSteps.validarMensajeDeValidacionDelCampoDescuento(mensaje);
    }
}

