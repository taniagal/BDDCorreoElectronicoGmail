package com.sura.policycenter.selenium.pages;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import org.openqa.selenium.WebDriver;
import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class DetalleRegistrosSuscripcionPage extends Guidewire{

    @FindBy(xpath=".//*[@id='AccountFile:MenuLinks:AccountFile_UnderwritingFiles']/div/span")
    WebElementFacade mnuRegistrosSuscripcion;
    @FindBy(xpath=".//*[@id='UnderwritingFiles:RenewalManagerScreen:RenewalManagerLV:0:GroupName']")
    WebElementFacade lblTransaccion;
    @FindBy(xpath=".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:NumJobs-inputEl']")
    WebElementFacade lblNroCotizaciones;
    @FindBy(xpath=".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:TotalCost-inputEl']")
    WebElementFacade lblCostoTotal;
    @FindBy(xpath="//div[2]/div/table/tbody/tr/td/div/div[2]/div/table/tbody/tr/td/div")
    WebElementFacade lblProducto;
    @FindBy(xpath="//div/table/tbody/tr/td[2]/div")
    WebElementFacade lblNroEnvio;
    @FindBy(xpath="//td[3]/div")
    WebElementFacade lblEstado;
    @FindBy(xpath="//td[4]/div")
    WebElementFacade lblNroPoliza;
    @FindBy(xpath="//td[5]/div")
    WebElementFacade lblCrearFecha;
    @FindBy(xpath="//td[6]/div")
    WebElementFacade lblFechaCierre;

    public DetalleRegistrosSuscripcionPage(WebDriver driver) {
        super(driver);
    }

    public void validarCamposDetalle(String producto, String nroEnvio, String estado, String nroPoliza){
        assertThat(lblProducto.getText(), is(equalTo(producto)));
        assertThat(lblNroEnvio.getText(), is(equalTo(nroEnvio)));
        assertThat(lblEstado.getText(), is(equalTo(estado)));
        assertThat(lblNroPoliza.getText(), is(equalTo(nroPoliza)));
        assertThat(lblCrearFecha.getText(), is(notNullValue()));
        lblFechaCierre.shouldBeVisible();
    }

    public void buscarRegistrosDeSucripcion(){
        waitABit(1000);
        mnuRegistrosSuscripcion.click();
        waitABit(1000);
        lblTransaccion.click();
    }

    public void validarTotal(String total){
        assertThat(lblCostoTotal.getText(), is(equalTo(total)));
    }

    public void validarSumaGrupo(String suma){
        assertThat(lblNroCotizaciones.getText(), is(equalTo(suma)));
    }

}
