package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class ResumenDePolizaPage extends PageUtil {


    @FindBy(xpath = "")
    private WebElementFacade menuItemResumen;
    @FindBy(xpath = "")
    private WebElementFacade labelOferta;
    @FindBy(xpath = "")
    private WebElementFacade labelExpedida;
    @FindBy(xpath = "")
    private WebElementFacade labelTomador;
    @FindBy(xpath = "")
    private WebElementFacade labelTipoDocumento;
    @FindBy(xpath = "")
    private WebElementFacade labelNumeroDocumento;
    @FindBy(xpath = "")
    private WebElementFacade labelFechaInicioVigencia;
    @FindBy(xpath = "")
    private WebElementFacade labelFechaFinVigencia;
    @FindBy(xpath = "")
    private WebElementFacade labelTipoDePlazo;
    @FindBy(xpath = "")
    private WebElementFacade labelPolizaFinanciada;
    @FindBy(xpath = "")
    private WebElementFacade labelCodigoAgenteRegistro;
    @FindBy(xpath = "")
    private WebElementFacade labelCodigoAgenteServicio;


    public ResumenDePolizaPage(WebDriver driver) {
        super(driver);
    }


    public void ingresoAResumen() {
        this.menuItemResumen.waitUntilVisible().click();
    }

    public void visualizarPoliza() {
        waitForTextToAppear("Resumen de la póliza");
    }

    public void verificacionDeCampos(ExamplesTable camposAvalidar) {

        boolean camposValidados = false;
        Map<String, String> aVerificarIzq = camposAvalidar.getRow(0);
        Map<String, String> aVerificarDer = camposAvalidar.getRow(1);

        camposValidados = !(this.labelOferta.isVisible());
        camposValidados = camposValidados && (this.labelExpedida.getText().equals(aVerificarIzq.get("txtExpedida")));
        camposValidados = camposValidados && (this.labelTomador.getText().equals(aVerificarIzq.get("txtTomador")));
        camposValidados = camposValidados && (this.labelTipoDocumento.getText().equals(aVerificarIzq.get("txtTipoDocumento")));
        camposValidados = camposValidados && (this.labelNumeroDocumento.getText().equals(aVerificarIzq.get("txtNumeroDocumento")));
        camposValidados = camposValidados && (this.labelFechaInicioVigencia.getText().equals(aVerificarDer.get("txtFechaInicioVigencia")));
        camposValidados = camposValidados && (this.labelFechaFinVigencia.getText().equals(aVerificarDer.get("txtFechaFinVigencia")));
        camposValidados = camposValidados && (this.labelTipoDePlazo.getText().equals(aVerificarDer.get("txtTipoPlazo")));
        camposValidados = camposValidados && (this.labelPolizaFinanciada.getText().equals(aVerificarDer.get("txtPolizaFinaciada")));
        camposValidados = camposValidados && (this.labelCodigoAgenteRegistro.getText().equals(aVerificarDer.get("agenteRegistro")));
        camposValidados = camposValidados && (this.labelCodigoAgenteServicio.getText().equals(aVerificarDer.get("agenteServicio")));

        MatcherAssert.assertThat("No se encuentran todos los campos requeridos", camposValidados);
    }


}
