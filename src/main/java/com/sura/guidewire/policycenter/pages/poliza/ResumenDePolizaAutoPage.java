package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

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

    public ResumenDePolizaAutoPage(WebDriver driver) {
        super(driver);
    }

    public void visualizarPoliza() {
        waitForTextToAppear("Resumen de la póliza");
    }

    public void verificacionDeCampos(ExamplesTable camposAvalidar) {

        boolean camposValidados = false;
        Map<String, String> aVerificar = camposAvalidar.getRow(0);

        camposValidados = this.labelTipoDePlazo.getText().equals(aVerificar.get("txtTipoPlazo"));
        camposValidados = camposValidados && (this.labelPolizaFinanciada.getText().equals(aVerificar.get("txtPolizaFinaciada")));

        MatcherAssert.assertThat("No se encuentran las nuevas Etiquetas", camposValidados);
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
