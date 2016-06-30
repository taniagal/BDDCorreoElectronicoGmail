package com.sura.policycenter.selenium.pages;


import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.model.Aseguradora;
import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.components.HtmlTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import static org.hamcrest.MatcherAssert.assertThat;

public class CoaseguroPage extends Guidewire {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:addConinsuranceLink']")
    private WebElementFacade linkAgregarCoaseguro;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:ReferencePolicyNumber-inputEl']")
    private WebElementFacade campoTxtPolizaDeReferencia;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:administrativeExpenses-inputEl']")
    private WebElementFacade campoTxtDastosAdministrativos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:editConinsuranceLink']")
    private WebElementFacade linkEditarCoaseguro;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:Update-btnInnerEl']")
    private WebElementFacade botonAceptar;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:insuranceLV_tb:Add-btnInnerEl']")
    private WebElementFacade botonAgregar;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:coinsuranceTypeQuestion_true-inputEl']")
    private WebElementFacade radioBotonAceptado;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']/*/table/tbody/tr[1]/td[4]")
    private WebElementFacade radioBotonLider;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:_msgs']")
    private WebElementFacade divMensaje;

    private static final String MSJVALIDARVALORES = "No estan correctos los elementos:";

    public CoaseguroPage(WebDriver diver) {
        super(diver);
    }

    public void validarCampos() {
        linkAgregarCoaseguro.waitUntilPresent().click();
        radioBotonAceptado.waitUntilPresent().click();

        StringBuilder right = new StringBuilder(MSJVALIDARVALORES);
        if(radioBotonAceptado.isSelected())
            right.append("radio_boton_cedido, ");
        if(!botonAgregar.isPresent())
            right.append("boton_agregar, ");
        if(!campoTxtDastosAdministrativos.containsText("2%") || campoTxtDastosAdministrativos.getAttribute("class").contains("x-form-text"))
            right.append("Gastos_Administrativos, ");
        if(!radioBotonLider.getAttribute("class").contains("radio"))
            right.append("radio_boton_lider ");

        String res = right.toString();
        if(MSJVALIDARVALORES.equals(res)){
            res = right.toString().substring(0,right.toString().length()-1);
        }
        assertThat(res+"verifique su codigo","No estan correctos los elementos".equals(res));
    }

    public void agregarCoaseguro(List<Aseguradora> aseguradoras) {
        campoTxtPolizaDeReferencia.waitUntilPresent().sendKeys("poliza123");
        Actions act = new Actions(getDriver());
        int i = 1;
        for (Aseguradora aseguradora : aseguradoras) {
            WebElementFacade campoAseguradora = findBy(".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']/*/table/tbody/tr[" + i + "]/td[2]");
            campoAseguradora.click();
            if (i == 1) {
                act.sendKeys(Keys.TAB).build().perform();
                act.sendKeys(Keys.ENTER).build().perform();
                act.sendKeys(aseguradora.getParticipacion()).build().perform();
                assertThat("Sura debe estar por defecto en las aseguradoras", campoAseguradora.containsText("Sura"));
            } else {
                act.click().build().perform();
                act.sendKeys(aseguradora.getNombre()).build().perform();
                act.sendKeys(Keys.TAB).build().perform();
                act.sendKeys(aseguradora.getParticipacion()).build().perform();
            }
            i++;
        }
        act.sendKeys(Keys.TAB).build().perform();
    }
    public void verificarPorcentajeParticipacion(){
        HtmlTable htmlTable = new HtmlTable(findBy(".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']/*/table"));
        assertThat("El total no es del 100%", htmlTable.getHeadings().toString().contains("100"));
    }

    public void guardarcosaeguro(){
        botonAceptar.click();
    }

    public void verificarCoaseguro() {
        assertThat("Error al agregar el coaseguro", linkEditarCoaseguro.isPresent());
    }

    public void verificarMensaje(String mensaje) {
        waitABit(1000);
        assertThat("Falló el mensaje de documento registrado", divMensaje.containsText(mensaje));
    }

}
