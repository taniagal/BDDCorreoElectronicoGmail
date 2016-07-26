package com.sura.policycenter.selenium.pages.colectivas;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import java.lang.String;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class InformacionDePolizaColectivaPage extends PageObject {

    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:ttlBar']")
    WebElementFacade tituloDePagina;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:PrimaryNamedInsuredLabel-labelEl']")
    WebElementFacade tituloTomador;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:OfficialIDInputSet:DocumentType-inputEl']")
    WebElementFacade tipoDocumento;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    WebElementFacade numeroDocumento;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:Name-inputEl']")
    WebElementFacade nombreTomador;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:PhoneDisplay-inputEl']")
    WebElementFacade telefonoTomador;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:AddressType-inputEl']")
    WebElementFacade tipoDireccionTomador;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:AddressDescription-inputEl']")
    WebElementFacade descripcionDireccionTomador;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:ChangePolicyAddressButton-inputEl']")
    WebElementFacade direccionDeLaPoliza;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:0']")
    WebElementFacade detallesDePolizaTitulo;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:SalesOrganizationType-inputEl']")
    WebElementFacade organizacion;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:ChannelType-inputEl']")
    WebElementFacade canal;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:PolicyType-inputEl']")
    WebElementFacade tipoDePoliza;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:TermType-inputEl']")
    WebElementFacade tipoPlazo;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:EffectiveDate-inputEl']")
    WebElementFacade fechaInicioVigencia;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:ExpirationDate-bodyEl']")
    WebElementFacade fechaFinVigencia;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:IssueDate-inputEl']")
    WebElementFacade fechaExpedicion;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:FundedPolicyInputSet:QuestionFundedPolicy_true-boxLabelEl']")
    WebElementFacade polizaFinanciadaSi;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:FundedPolicyInputSet:QuestionFundedPolicy_false-boxLabelEl']")
    WebElementFacade polizaFinanciadaNo;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:PolicyInfoProducerOfRecordInputSet:Producer-inputEl']")
    WebElementFacade oficinaRadicacion;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:PolicyInfoProducerOfRecordInputSet:ProducerCode-inputEl']")
    WebElementFacade codAgente;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:modifier-inputEl']")
    WebElementFacade descuentoPoliza;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:CollectivePolicyInfo_ExtInputSet:addConinsuranceLink']")
    WebElementFacade linkAgregarCoaseguro;

    public InformacionDePolizaColectivaPage(WebDriver driver) {
        super(driver);
    }

    public void validarInformacionDePolizaColectiva(ExamplesTable informacionPolizaColectiva) {
        Map<String, String> infoPoliza = informacionPolizaColectiva.getRows().get(0);
        waitForTextToAppear("Información de la póliza colectiva");
        MatcherAssert.assertThat(tituloDePagina.getText(), Is.is(Matchers.equalTo(infoPoliza.get("titulo"))));
        MatcherAssert.assertThat(tituloTomador.getText(), Is.is(Matchers.equalTo(infoPoliza.get("tomadorInfo"))));
        MatcherAssert.assertThat(tipoDocumento.getText(), Is.is(Matchers.equalTo(infoPoliza.get("tipoDocumento"))));
        MatcherAssert.assertThat(numeroDocumento.getText(), Is.is(Matchers.equalTo(infoPoliza.get("numeroDocumento"))));
        MatcherAssert.assertThat(nombreTomador.getText(), Is.is(Matchers.equalTo(infoPoliza.get("nombre"))));
        MatcherAssert.assertThat(telefonoTomador.getText(), Is.is(Matchers.equalTo(infoPoliza.get("telefono"))));
        MatcherAssert.assertThat(tipoDireccionTomador.getText(), Is.is(Matchers.equalTo(infoPoliza.get("tipoDireccion"))));
        MatcherAssert.assertThat(descripcionDireccionTomador.getText(), Is.is(Matchers.equalTo(infoPoliza.get("descripcionDir"))));
        MatcherAssert.assertThat(direccionDeLaPoliza.getText(), Is.is(Matchers.equalTo(infoPoliza.get("direccionDePoliza"))));
        MatcherAssert.assertThat(detallesDePolizaTitulo.getText(), Is.is(Matchers.equalTo(infoPoliza.get("detallePoliza"))));
        MatcherAssert.assertThat(organizacion.getText(), Is.is(Matchers.equalTo(infoPoliza.get("organizacion"))));
        MatcherAssert.assertThat(canal.getText(), Is.is(Matchers.equalTo(infoPoliza.get("canal"))));
        MatcherAssert.assertThat(tipoDePoliza.getText(), Is.is(Matchers.equalTo(infoPoliza.get("tipoPoliza"))));
        MatcherAssert.assertThat(tipoPlazo.getValue(), Is.is(Matchers.equalTo(infoPoliza.get("tipoPlazo"))));
        MatcherAssert.assertThat(fechaInicioVigencia.getValue(), Is.is(Matchers.equalTo(infoPoliza.get("fechaInicioVigencia"))));
    }
}
