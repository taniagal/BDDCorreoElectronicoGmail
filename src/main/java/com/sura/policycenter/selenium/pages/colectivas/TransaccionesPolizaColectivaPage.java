package com.sura.policycenter.selenium.pages.colectivas;


import java.util.Map;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;


public class TransaccionesPolizaColectivaPage extends PageObject{

    @FindBy(xpath = ".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_CollectivePolicy_Ext']/div/span")
    WebElementFacade menuTransaccionesColectivas;
    @FindBy(xpath = ".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_WorkOrders']/div/span")
    WebElementFacade menuTransaccionesIndividual;
    @FindBy(xpath = ".//*[@id='AccountFile_CollectivePolicy_Ext:1-body']")
    WebElementFacade tablaTransaccionesColectiva;
    @FindBy(xpath = ".//*[@id='AccountFile_WorkOrders:AccountFile_WorkOrdersScreen:ttlBar']")
    WebElementFacade tituloTransaccionesIndividual;
    @FindBy(xpath = "//div/table/tbody/tr/td[2]/div")
    WebElementFacade columnaNumeroPoliza;
    @FindBy(xpath = "//td[3]/div")
    WebElementFacade columnaProducto;
    @FindBy(xpath = "//td[4]/div")
    WebElementFacade columnaTipo;
    @FindBy(xpath = "//td[5]/div")
    WebElementFacade columnaEstado;
    @FindBy(xpath = "//td[6]/div")
    WebElementFacade columnaFechaFinalizacion;
    @FindBy(xpath = "//td[7]/div")
    WebElementFacade columnaParticipante;
    @FindBy(xpath = ".//*[@id='AccountFile_CollectivePolicy_Ext:0:PolicyNumber']")
    WebElementFacade numeroPoliza;
    @FindBy(xpath = ".//*[@id='EditContactPopup:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade contactoPrimerNombre;
    @FindBy(xpath = ".//*[@id='EditContactPopup:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:GlobalPersonNameInputSet:MiddleName-inputEl']")
    WebElementFacade contactoSegundoNombre;
    @FindBy(xpath = ".//*[@id='EditContactPopup:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade contactoPrimerApellido;
    @FindBy(xpath = ".//*[@id='EditContactPopup:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:GlobalPersonNameInputSet:Particle-inputEl']")
    WebElementFacade contactoSegundoApellido;
    @FindBy(xpath = ".//*[@id='EditContactPopup:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:DateOfBirth-inputEl']")
    WebElementFacade contactoFechaNacimiento;
    @FindBy(xpath = ".//*[@id='EditContactPopup:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:MaritalStatus-inputEl']")
    WebElementFacade contactoEstadoCivil;
    @FindBy(xpath = ".//*[@id='EditContactPopup:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:EmailAddress1-inputEl']")
    WebElementFacade contactoEmail;
    @FindBy(xpath = ".//*[@id='EditContactPopup:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:HomePhone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    WebElementFacade contactoTelefono;
    @FindBy(xpath = ".//*[@id='EditContactPopup:ContactPanelSet:ContactCV:ContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl']")
    WebElementFacade contactoDireccion;


    public TransaccionesPolizaColectivaPage(WebDriver driver){
        super(driver);
    }

    public void validarOpcionesDelMenu() {
        waitFor(menuTransaccionesColectivas);
        menuTransaccionesColectivas.shouldBeVisible();
        menuTransaccionesIndividual.shouldBeVisible();
        menuTransaccionesColectivas.shouldBeEnabled();
        menuTransaccionesIndividual.shouldBeEnabled();
        MatcherAssert.assertThat(menuTransaccionesColectivas.getText(), Is.is(Matchers.equalTo("Transacciones de póliza colectiva")));
        MatcherAssert.assertThat(menuTransaccionesIndividual.getText(), Is.is(Matchers.equalTo("Transacciones de póliza individual")));
    }

    public void seleccionarLaOpcionTransaccionesPolizaIndividual() {
        waitFor(menuTransaccionesIndividual);
        menuTransaccionesIndividual.click();
    }

    public void validarTransaccionesDePolizaColectiva(ExamplesTable transacciones) {
        Map<String, String> transaccionesColectiva = transacciones.getRows().get(0);
        menuTransaccionesColectivas.click();
        waitForTextToAppear("Transacciones de póliza colectiva");
        waitFor(tablaTransaccionesColectiva);
        columnaNumeroPoliza.shouldBeVisible();
        columnaProducto.shouldBeVisible();
        columnaTipo.shouldBeVisible();
        columnaEstado.shouldBeVisible();
        columnaFechaFinalizacion.shouldBeVisible();
        columnaParticipante.shouldBeVisible();
        MatcherAssert.assertThat(numeroPoliza.getText(), Is.is(Matchers.equalTo(transaccionesColectiva.get("numeroPoliza"))));
        MatcherAssert.assertThat(columnaProducto.getText(), Is.is(Matchers.equalTo(transaccionesColectiva.get("producto"))));
        MatcherAssert.assertThat(columnaTipo.getText(), Is.is(Matchers.equalTo(transaccionesColectiva.get("tipo"))));
        MatcherAssert.assertThat(columnaEstado.getText(), Is.is(Matchers.equalTo(transaccionesColectiva.get("estado"))));
        MatcherAssert.assertThat(columnaFechaFinalizacion.getText(), Matchers.notNullValue());
        MatcherAssert.assertThat(columnaParticipante.getText(), Is.is(Matchers.equalTo(transaccionesColectiva.get("participante"))));
    }

    public void validarTransaccionesDePolizaIndividual() {
        waitFor(tituloTransaccionesIndividual);
        MatcherAssert.assertThat(tituloTransaccionesIndividual.getText(), Is.is(Matchers.equalTo("Transacciones de póliza individual")));
    }

    public void darClicEnElNumeroDePoliza() {
        numeroPoliza.click();
        waitForTextToAppear("Información de la póliza colectiva");
    }


    public void validarConsultaDeTomador(String tomador) {
        waitForTextToAppear("Contacto");
        if("tomador".equals(tomador)){
            MatcherAssert.assertThat(contactoSegundoNombre.getValue(), Matchers.nullValue());
            MatcherAssert.assertThat(contactoSegundoApellido.getValue(), Matchers.nullValue());
            MatcherAssert.assertThat(contactoTelefono.getValue(), Matchers.nullValue());
        }
        MatcherAssert.assertThat(contactoPrimerNombre.getValue(), Matchers.nullValue());
        MatcherAssert.assertThat(contactoPrimerApellido.getValue(), Matchers.nullValue());
        MatcherAssert.assertThat(contactoEstadoCivil.getValue(), Matchers.nullValue());
        MatcherAssert.assertThat(contactoEmail.getValue(), Matchers.nullValue());
        MatcherAssert.assertThat(contactoFechaNacimiento.getValue(), Matchers.nullValue());
        MatcherAssert.assertThat(contactoDireccion.getValue(), Matchers.nullValue());
    }

    public void clicEnTransaccionesDePolizaColectiva() {
        waitFor(menuTransaccionesColectivas);
        menuTransaccionesColectivas.click();
    }
}
