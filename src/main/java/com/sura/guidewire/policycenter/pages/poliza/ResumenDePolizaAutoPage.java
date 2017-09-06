package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.Map;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ResumenDePolizaAutoPage extends PageUtil {

    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td/div/table/tbody/tr[5]/td/table/tbody/tr/td[1]/label")
    private WebElementFacade labelTipoDePlazo;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td/div/table/tbody/tr[6]/td/table/tbody/tr/td[1]/label")
    private WebElementFacade labelPolizaFinanciada;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[3]/td/div/div[1]/div/div/div[2]/div/span")
    private WebElementFacade labelAseguradora;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[3]/td/div/div[1]/div/div/div[3]/div/span")
    private WebElementFacade labelParticipacion;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[3]/td/div/div[1]/div/div/div[4]/div/span")
    private WebElementFacade labelLider;
    @FindBy(xpath = ".//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_PolicyDV:HaveCoinsurance-labelEl']")
    private WebElementFacade labelTieneCoaseguro;
    @FindBy(xpath = ".//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_PolicyDV:coinsuranceTypeQuestion-labelEl']")
    private WebElementFacade labelTipoCoaseguro;
    @FindBy(xpath = ".//*[contains(@id,'PolicyPerEffDate-inputEl')]")
    private WebElementFacade labelFechaInicioVigencia;

    protected static  String fechaCotizador = "fechaCotizador";

    public ResumenDePolizaAutoPage(WebDriver driver) {
        super(driver);
    }

    public void visualizarPoliza() {
        waitForTextToAppear("Resumen de la póliza");
    }

    public void verificacionDeCampos(ExamplesTable camposAvalidar) {

        boolean camposValidados ;
        Map<String, String> aVerificar = camposAvalidar.getRow(0);

        camposValidados = this.labelTipoDePlazo.getText().equals(aVerificar.get("txtTipoPlazo"));
        camposValidados = camposValidados && (this.labelPolizaFinanciada.getText().equals(aVerificar.get("txtPolizaFinaciada")));

        MatcherAssert.assertThat("No se encuentran las nuevas Etiquetas", camposValidados);
    }

    public void verificarFechaInicialVigencia(String fecha) {

        String session = Serenity.sessionVariableCalled("fechaInicioVigencia".toLowerCase().trim());
        String idTransaccion;
        if (fecha.equals(fechaCotizador)) {
            idTransaccion = session;
        } else {
            idTransaccion =fecha;
        }

        MatcherAssert.assertThat("Las fechas no coinciden", labelFechaInicioVigencia.getText(), Is.is(Matchers.is(Matchers.equalTo(idTransaccion))));
    }

    public void verificoCamposCoaseguro(ExamplesTable datos) {

        boolean verificacionCampos = true;
        Map<String, String> aVerificar = datos.getRow(0);

        verificacionCampos = verificacionCampos
                && this.labelAseguradora.getText().equals(aVerificar.get("lblAseguradora"));

        verificacionCampos = verificacionCampos
                && this.labelParticipacion.getText().equals(aVerificar.get("lblParticipacion"));

        verificacionCampos = verificacionCampos
                && this.labelLider.getText().equals(aVerificar.get("lblLider"));

        verificacionCampos = verificacionCampos
                && this.labelTieneCoaseguro.getText().equals(aVerificar.get("lblTCoaseguro"));

        verificacionCampos = verificacionCampos
                && this.labelTipoCoaseguro.getText().equals(aVerificar.get("lblTpCoaseguro"));

        MatcherAssert.assertThat("No se encuntran los campos necesarios para la informacion de coaseguro", verificacionCampos);
    }


}
