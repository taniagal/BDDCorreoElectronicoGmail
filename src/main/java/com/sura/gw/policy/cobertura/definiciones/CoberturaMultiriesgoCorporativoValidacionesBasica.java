package com.sura.gw.policy.cobertura.definiciones;

import com.sura.gw.navegacion.definitions.IngresoAPolicyCenterDefinitions;
import com.sura.gw.navegacion.definitions.Navegacion;
import com.sura.gw.policy.poliza.definitions.InformacionDePoliza;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class CoberturaMultiriesgoCorporativoValidacionesBasica {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    @Managed
    public WebDriver driver;

    @Steps
    IngresoAPolicyCenterDefinitions guidewire;

    @Steps
    Navegacion navegacion;

    @Steps
    InformacionDePoliza informacionDePoliza;


    @Given("que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>")
    public void dadoQueEstoyEnLaInformacionDeLaPolizaConNumeroDeSubscripcion(@Named("numSubscripcion") String numSubscripcion) {

        guidewire.dadoQueAccedoAPolicyCenterConRol("Asesor");
        navegacion.cuandoSeleccioneOpcionDesplegableDeMenuSuperiorPoliza();
        navegacion.cuandoBusquePorNumeroDeSubscripcionDePoliza(numSubscripcion);
        assertThat(informacionDePoliza.esperoVerNumeroDeSubscripcionEnEnvio(numSubscripcion), is(equalTo(true)));

        LOGGER.info("CoberturaMultiriesgoCorporativoValidacionesBasica.dadoQueEstoyEnLaInformacionDeLaPolizaConNumeroDeSubscripcion");
    }

    @When("cuando intente ingresar un articulo para una ubicacion para comprobar las validaciones de error del articulo")
    public void cuandoIntenteIngresarUnArticuloParaUnaUbicacionParaComprobarLasValidacionesDeErrorDelArticulo() {

        try {
            informacionDePoliza.cuandoEditeInformacionDeLaPoliza();
        }catch (Exception e){}
        informacionDePoliza.cuandoSeleccioneOpcionDeInformacionDePolizaEdificiosYUbicaciones();
        informacionDePoliza.cuandoDeseeIngresarArticuloAUnaUbicacion();
        informacionDePoliza.cuandoIntenteIngresarUnArticuloAUnaUbicacionParaComprobarValidacionesDeErrorDelArticulo();

        LOGGER.info("CoberturaMultiriesgoCorporativoValidacionesBasica.cuandoIntenteIngresarUnArticuloParaUnaUbicacionParaComprobarLasValidacionesDeErrorDelArticulo");
    }


    @Then("espero ver mensajes de advertencia indicandome que sobrepase los limites de valores para el valor del articulo")
    public void esperoVerMensajesDeAdvertenciaIndicandomeQueSobrepaseLosLimitesDeValoresParaElValorDelArticulo() {
        informacionDePoliza.entoncesValidarValoresDeSublimitesYValorAseguradoParaElValorDelArticulo();
        LOGGER.info("CoberturaMultiriesgoCorporativoValidacionesBasica.esperoVerMensajesDeAdvertenciaIndicandomeQueSobrepaseLosLimitesDeValoresParaElValorDelArticulo");
    }

}
