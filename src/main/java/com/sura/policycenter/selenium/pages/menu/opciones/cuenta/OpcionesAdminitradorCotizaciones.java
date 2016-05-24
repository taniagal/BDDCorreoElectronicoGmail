package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;

import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class OpcionesAdminitradorCotizaciones extends Guidewire {

    public OpcionesAdminitradorCotizaciones(WebDriver driver) {
        super(driver);
    }

    Actions act = new Actions(getDriver());

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(OpcionesAdminitradorCotizaciones.class);

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:1:SubmissionActions:SubmissionActionsMenuIcon']")
    private WebElementFacade btnAcciones;

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:1:SubmissionActions:SubmissionActionsMenuItemSet:Decline-textEl']")
    private WebElementFacade itmDeclinar;

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:1:SubmissionActions:SubmissionActionsMenuItemSet:NotTakenJob-textEl']")
    private WebElementFacade itmNoTomar;

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManager_NewSubmission-btnInnerEl']")
    private WebElementFacade btnNuevaCotizacion;

    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ttlBar']")
    private WebElementFacade lblEnviosNuevos;

    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:Producer-labelEl']")
    private WebElementFacade lblOrganizacion;

    @FindBy(xpath = ".//*[@id='SubmissionManager:SubmissionManagerScreen:SubmissionManagerLV:1:SubmissionActions:SubmissionActionsMenuIcon-fieldMenu']")
    private WebElementFacade lstAcciones;

    @FindBy(xpath = "//td/div/div[3]/div/table")
    private WebElementFacade tblCotizaciones;

    public void seleccionarAcciones(){
        waitABit(1000);
        btnAcciones.click();
    }

    public void validarEstadosCotizacion(String estadoDeclinar, String estadoNoTomar){
        try{
            assertThat(itmDeclinar.getText(), is(equalTo(estadoDeclinar)));
            assertThat(itmNoTomar.getText(), is(equalTo(estadoNoTomar)));
        } catch (Exception e){
            LOGGER.error("This is error", e);
        }
    }

    public void crearNuevaCotizacion() {
        waitABit(1000);
        btnNuevaCotizacion.click();
    }

    public void validarCreacionCotizacion(){
        waitABit(1000);
        boolean validacion = false;
        if(lblEnviosNuevos.isPresent() && lblOrganizacion.isPresent()){
            validacion = true;
        }
        assertTrue(validacion);
    }

    public void validarOpcionRetirar(String retirar){
        Boolean validacion = false;
        validacion = lstAcciones.containsElements(retirar);
        assertFalse(validacion);
    }

    public void seleccionarFiltros(String cotizacion, String prodcuto){

    }
}
