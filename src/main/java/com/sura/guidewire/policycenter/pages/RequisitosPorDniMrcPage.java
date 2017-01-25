package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class RequisitosPorDniMrcPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:CPBuildings']/div")
    private WebElementFacade botonEdificiosYUbicaciones;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddNewBuilding']")
    private WebElementFacade botonAgregarArticulos;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:CPBuildingInteresAdicional:CPAdditionalInteresInputSet:AdditionalInterestLV_tb:AddContactsButton-btnWrap']")
    private WebElementFacade botonAgregarInteresAdicional;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:CPBuildingInteresAdicional:CPAdditionalInteresInputSet:AdditionalInterestLV_tb:AddContactsButton:AddFromSearch-itemEl']")
    private WebElementFacade botonDelDirectorio;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:DocumentType-inputEl']")
    private WebElementFacade txtTipoDocumentos;
    @FindBy(xpath = ".//li[contains(.,'CEDULA DE CIUDADANIA')]")
    private WebElementFacade txtTipoDocumento;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:identificationNumber-inputEl']")
    private WebElementFacade txtNumeroDocumento;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade botonBuscar;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV:0:_Select']")
    private WebElementFacade botonSeleccionar;
    @FindBy(xpath = ".//input[contains(@class,'x-form-field x-form-text x-form-focus x-field-form-focus x-field-default-form-focus')]")
    private WebElementFacade txtTipoBeneficiario;

    public RequisitosPorDniMrcPage(WebDriver driver) {
        super(driver);
    }


    public void agregarAseguradoMrc(String tipoDocumento, String numeroDocumento, String tipoBeneficiario) {
        esperarYClickearBoton(botonEdificiosYUbicaciones);
        esperarYClickearBoton(botonAgregarArticulos);
        esperarYClickearBoton(botonAgregarInteresAdicional);
        esperarYClickearBoton(botonDelDirectorio);
        ingresarDato(txtTipoDocumentos,tipoDocumento);
        esperarYClickearBoton(txtTipoDocumento);
        ingresarDato(txtNumeroDocumento,numeroDocumento);
        esperarYClickearBoton(botonBuscar);
        esperarYClickearBoton(botonSeleccionar);
        ingresarDato(txtTipoBeneficiario,tipoBeneficiario);
    }
}
