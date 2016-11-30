package com.sura.guidewire.policycenter.steps.colectivas;

import com.sura.guidewire.policycenter.pages.colectivas.PolizaPrincipalPaPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;

public class PolizaPrincipalPaSteps extends ScenarioSteps {

    PolizaPrincipalPaPages polizaPrincipalPaPages;

    @Step
    public void validarElementosNoVisiblesDelMenu() {
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarBotonMenuAseguradosNoVisible(), Is.is(Matchers.equalTo(false)));
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarBotonMenuVehiculosNoVisible(), Is.is(Matchers.equalTo(false)));
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarBotonMenuCoberturasNoVisible(), Is.is(Matchers.equalTo(false)));
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarElementosDeshabilitadosDelMenu(), Is.is(Matchers.equalTo(true)));
    }

    @Step
    public void cotizarEIrALaSeccionDeCotizacion() {
        polizaPrincipalPaPages.clicEnElBotonCotizar();
    }

    @Step
    public void validarElementosNoVisiblesDeRevisionDePoliza() {
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarTablasDeDetalleDelRiesgoNoVisibles(), Is.is(Matchers.equalTo(false)));
    }

    @Step
    public void validarLaVisibilidadDeLaSeccionHerramientasDelMenuLateral() {
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarMenuLateralNotasVisible(), Is.is(Matchers.equalTo(true)));
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarMenuLateralDocumentosVisible(), Is.is(Matchers.equalTo(true)));
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarMenuLateralParticipantesVisible(), Is.is(Matchers.equalTo(true)));
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarMenuLateralPlanDeTrabajoVisible(), Is.is(Matchers.equalTo(true)));
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarMenuLateralHistorialVisible(), Is.is(Matchers.equalTo(true)));
    }

    @Step
    public void validarQueElDetalleDeVehiculosNoEsVisibleEnLaCotizacion() {
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarTablaDeVehiculosEnCotizacion(), Is.is(Matchers.equalTo(true)));
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarPanelDeDetalleEnCotizacion(), Is.is(Matchers.equalTo(false)));
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarBotonVerTablaDeTrabajoEnCotizacion(), Is.is(Matchers.equalTo(false)));
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarTablaTituloVehiculosEnCotizacion(), Is.is(Matchers.equalTo(true)));
    }

    @Step
    public void validarQueLosCamposDeLaCotizacionNoSonEditables() {
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarQueTodosLosCamposDeLaCotizacionNoSonEditables(), Is.is(Matchers.equalTo(true)));
    }

    @Step
    public void validarQueLasOpcionesDeAseguradosVehiculosCoberturasNoSonVisibles() {
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarMenuLateralEnPolizaAseguradosNoVisible(), Is.is(Matchers.equalTo(false)));
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarMenuLateralEnPolizaVehiculosNoVisible(), Is.is(Matchers.equalTo(false)));
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarMenuLateralEnPolizaCoberturasNoVisible(), Is.is(Matchers.equalTo(false)));
    }

    @Step
    public void validarQueLasOpcionesDelMenuLateralEnHerramientasEnPolizaExpedidaSonVisibles() {
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarMenuLateralEnPolizaResumenVisible(), Is.is(Matchers.equalTo(true)));
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarMenuLateralEnPolizaFacturacionVisible(), Is.is(Matchers.equalTo(true)));
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarMenuLateralEnPolizaNotasVisible(), Is.is(Matchers.equalTo(true)));
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarMenuLateralEnPolizaParticipantesVisible(), Is.is(Matchers.equalTo(true)));
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarMenuLateralEnPolizaContactosVisible(), Is.is(Matchers.equalTo(true)));
    }

    @Step
    public void clicMenuLateralCotizacion(){
        polizaPrincipalPaPages.clicMenuLateralCotizacion();
    }

    @Step
    public void validarQueLosCamposDeLaCotizacionEnLaPolizaExpedidaNoSonEditables() {
        MatcherAssert.assertThat(polizaPrincipalPaPages.validarQueTodosLosCamposDeLaCotizacionEnLaPolizaExpedidaNoSonEditables(), Is.is(Matchers.equalTo(true)));
    }
}
