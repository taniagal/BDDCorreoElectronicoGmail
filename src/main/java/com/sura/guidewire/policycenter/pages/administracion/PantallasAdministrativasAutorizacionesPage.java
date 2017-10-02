package com.sura.guidewire.policycenter.pages.administracion;

import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.Map;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class PantallasAdministrativasAutorizacionesPage extends PageUtil {
    public static final String PROPIEDADLECTURA = "readonly";
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions-btnInnerEl']")
    WebElementFacade mnuAcciones;
    @FindBy(xpath = "//span[contains(.,'Nueva autorización')]")
    WebElementFacade itemNuevaAutorizacion;
    @FindBy(xpath = ".//*[@id='NewUWIssueInfo_Ext:UWIssueInfoDetailScreen:issue-inputEl']")
    WebElementFacade txtReglaValidacion;
    @FindBy(xpath = ".//*[@id='NewUWIssueInfo_Ext:UWIssueInfoDetailScreen:group-inputEl']")
    WebElementFacade txtGrupoRecibe;
    @FindBy(xpath = ".//*[@id='UserSearchPopup:UserSearchPopupScreen:UserSearchDV:Username-inputEl']")
    WebElementFacade txtNombreUsuario;
    @FindBy(xpath = ".//*[@id='NewUWIssueInfo_Ext:UWIssueInfoDetailScreen:ApproverGroup-inputEl']")
    WebElementFacade txtGrupoAutorizador;
    @FindBy(xpath = ".//*[@id='NewUWIssueInfo_Ext:UWIssueInfoDetailScreen:Office-inputEl']")
    WebElementFacade txtOficina;
    @FindBy(xpath = ".//*[@id='NewUWIssueInfo_Ext:UWIssueInfoDetailScreen:Agente-inputEl']")
    WebElementFacade txtAsesor;
    @FindBy(xpath = ".//*[@id='NewUWIssueInfo_Ext:UWIssueInfoDetailScreen:activationDate_true-inputEl']")
    WebElementFacade optAutorizacionActiva;
    @FindBy(xpath = "//span[contains(.,'Actualizar')]")
    WebElementFacade btnActualizar;
    @FindBy(xpath = ".//*[@id='UWIssueInfo_ExtDetailPage:UWIssueInfoDetailScreen:Edit-btnInnerEl']")
    WebElementFacade btnEditar;
    @FindBy(xpath = ".//*[@id='UWIssueTypeSearchPopup:UWIssueTypeSearchScreen:UWIssueTypeSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscarReglaValidacion;
    @FindBy(xpath = ".//*[@id='UserSearchPopup:UserSearchPopupScreen:UserSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscarPersonaRecibe;
    @FindBy(xpath = ".//*[@id='NewUWIssueInfo_Ext:UWIssueInfoDetailScreen:issue:Selectissue']")
    WebElementFacade btnBuscarRegla;
    @FindBy(xpath = ".//*[@id='UWIssueInfo_ExtSearchPage:issue:Selectissue']")
    WebElementFacade btnSeleccionarRegla;
    @FindBy(xpath = ".//*[@id='NewUWIssueInfo_Ext:UWIssueInfoDetailScreen:approverGroup:approverGroupMenuIcon']/img")
    WebElementFacade btnGrupoAutorizador;
    @FindBy(xpath = ".//*[@id='NewUWIssueInfo_Ext:UWIssueInfoDetailScreen:user:Selectuser']")
    WebElementFacade btnBuscarPersona;
    @FindBy(xpath = ".//*[@id='NewUWIssueInfo_Ext:UWIssueInfoDetailScreen:Office:SelectOffice']")
    WebElementFacade btnBuscarOficina;
    @FindBy(xpath = ".//*[@id='UWIssueTypeSearchPopup:UWIssueTypeSearchScreen:UWIssueTypeSearchDV:Name-inputEl']")
    WebElementFacade txtNombre;
    @FindBy(xpath = "//a[contains(.,'Seleccionar')]")
    WebElementFacade btnSeleccionar;
    @FindBy(xpath = ".//*[@id='NewUWIssueInfo_Ext:UWIssueInfoDetailScreen:approverGroup:GroupPickerMenuIcon-textEl']")
    WebElementFacade itemSeleccionarGrupo;
    @FindBy(xpath = ".//*[@id='GroupSearchPopup:GroupSearchPickerScreen:GroupSearchDV:InputSetRefContactName:GlobalContactNameInputSet:Name-inputEl']")
    WebElementFacade txtRazonSocial;
    @FindBy(xpath = ".//*[@id='GroupSearchPopup:GroupSearchPickerScreen:GroupSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscarGrupoAutorizador;
    @FindBy(xpath = ".//*[@id='SuraOfficeSearchPopup:SuraOfficeSearchScreen:user-inputEl']")
    WebElementFacade txtNombreOficina;
    @FindBy(xpath = ".//*[@id='SuraOfficeSearchPopup:SuraOfficeSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscarOficinaAutorizacion;
    @FindBy(xpath = ".//*[@id='NewUWIssueInfo_Ext:UWIssueInfoDetailScreen:Agente:SelectAgente']")
    WebElementFacade btnBuscarAsesor;
    @FindBy(xpath = ".//*[@id ='NewUWIssueInfo_Ext:UWIssueInfoDetailScreen:SaleChannel:SelectSaleChannel']")
    WebElementFacade btnBuscarCanal;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:Code-inputEl']")
    WebElementFacade txtCodigoAsesor;
    @FindBy(xpath = ".//*[@id='NewUWIssueInfo_Ext:UWIssueInfoDetailScreen:SaleChannel-inputEl']")
    WebElementFacade txtCodigoCanal;
    @FindBy(xpath = ".//*[@id='SuraSaleChannelSearchPopup:SaleChannelSearchScreen:codeChannel-inputEl']")
    WebElementFacade txtCampoCodigoCanal;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscarAsesorAutorizacion;
    @FindBy(xpath = ".//*[@id='SuraSaleChannelSearchPopup:SaleChannelSearchScreen:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscarCodigoCanal;
    @FindBy(xpath = "//tr[3]/td/div/div")
    WebElementFacade labelRegistroDuplicado;
    @FindBy(xpath = ".//*[@id='UWIssueInfo_ExtDetailPage:UWIssueInfoDetailScreen:issue-inputEl']")
    WebElementFacade labelReglaValidacion;
    @FindBy(xpath = ".//*[@id='UWIssueInfo_ExtDetailPage:UWIssueInfoDetailScreen:user-inputEl']")
    WebElementFacade labelRecibePersona;
    @FindBy(xpath = ".//*[@id='UWIssueInfo_ExtDetailPage:UWIssueInfoDetailScreen:approverGroup-inputEl']")
    WebElementFacade labelGrupoAutorizador;
    @FindBy(xpath = ".//*[@id='UWIssueInfo_ExtDetailPage:UWIssueInfoDetailScreen:Office-inputEl']")
    WebElementFacade labelOficina;
    @FindBy(xpath = "//div[3]/div[2]/div/table/tbody/tr[11]/td/div/span")
    WebElementFacade itemBuscarAutorizaciones;
    @FindBy(xpath = "//div[4]/table/tbody/tr/td/div/table/tbody/tr[5]/td")
    WebElementFacade tblInformacionAutorizacion;
    @FindBy(xpath = ".//*[@id='UWIssueInfo_ExtSearchPage:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscarInformacion;
    String activo = "No";

    public PantallasAdministrativasAutorizacionesPage(WebDriver driver) {
        super(driver);
    }

    public void irAlMenuAcciones() {
        esperarObjetoClikeableServidorWe(mnuAcciones);
    }

    public void crearNuevaAutorizacion() {
        actions.click(itemNuevaAutorizacion).build().perform();
    }

    public void agregarNuevaAutorizacion(ExamplesTable datosNuevaAutorizacion) {
        Map<String, String> nuevaAutorizacion = datosNuevaAutorizacion.getRow(0);
        if (txtReglaValidacion.getAttribute(PROPIEDADLECTURA) != null) {
            agregarReglaValidacion(nuevaAutorizacion);
        } else {
            ingresarDato(txtReglaValidacion, nuevaAutorizacion.get("reglaValidacion"));

        }
        if (txtGrupoRecibe.getAttribute(PROPIEDADLECTURA) != null) {
            agregarPersonaRecibe(nuevaAutorizacion);
        } else {
            ingresarDato(txtGrupoRecibe, nuevaAutorizacion.get("personaRecibe"));
        }
        if (txtGrupoAutorizador.getAttribute(PROPIEDADLECTURA) != null) {
            agregarGrupoAutorizador(nuevaAutorizacion);
        } else {
            ingresarDato(txtGrupoAutorizador, nuevaAutorizacion.get("grupoAutorizador"));
        }
        if (txtOficina.getAttribute(PROPIEDADLECTURA) != null) {
            agregarOficinaAutorizacion(nuevaAutorizacion);
        } else {
            ingresarDato(txtOficina, nuevaAutorizacion.get("oficina"));
        }
        if (txtAsesor.getAttribute(PROPIEDADLECTURA) != null) {
            agregarAsesorAutorizacion(nuevaAutorizacion);
        } else {
            ingresarDato(txtAsesor, nuevaAutorizacion.get("asesor"));
        }
        if (txtCodigoCanal.getAttribute(PROPIEDADLECTURA) != null) {
            agregarCanalComercial(nuevaAutorizacion);
        } else {
            ingresarDato(txtCodigoCanal, nuevaAutorizacion.get("canalcomercial"));

        }
        if (activo.equals(nuevaAutorizacion.get("activo"))) {
            seleccionarAutorizacionActiva();
        }
    }

    private void agregarAsesorAutorizacion(Map<String, String> nuevaAutorizacion) {
        btnBuscarAsesor.click();
        ingresarDato(txtCodigoAsesor, nuevaAutorizacion.get("asesor"));
        btnBuscarAsesorAutorizacion.click();
        btnSeleccionar.click();
    }

    private void agregarCanalComercial(Map<String, String> nuevaAutorizacion) {
        btnBuscarCanal.click();
        ingresarDato(txtCampoCodigoCanal, nuevaAutorizacion.get("canalcomercial"));
        btnBuscarCodigoCanal.click();
        clickearElemento(btnSeleccionar);
    }

    private void agregarOficinaAutorizacion(Map<String, String> nuevaAutorizacion) {
        btnBuscarOficina.click();
        ingresarDato(txtNombreOficina, nuevaAutorizacion.get("oficina"));
        btnBuscarOficinaAutorizacion.click();
        esperarHasta(TIEMPO_2000);
        btnSeleccionar.click();
    }

    private void agregarGrupoAutorizador(Map<String, String> nuevaAutorizacion) {
        esperarHasta(TIEMPO_2000);
        btnGrupoAutorizador.click();
        itemSeleccionarGrupo.click();
        ingresarDato(txtRazonSocial, nuevaAutorizacion.get("grupoAutorizador"));
        btnBuscarGrupoAutorizador.click();
        esperarHasta(TIEMPO_2000);
        btnSeleccionar.click();
    }

    private void agregarPersonaRecibe(Map<String, String> nuevaAutorizacion) {
        esperarHasta(TIEMPO_2000);
        btnBuscarPersona.click();
        ingresarDato(txtNombreUsuario, nuevaAutorizacion.get("personaRecibe"));
        btnBuscarPersonaRecibe.click();
        esperarHasta(TIEMPO_2000);
        btnSeleccionar.click();
    }

    private void agregarReglaValidacion(Map<String, String> nuevaAutorizacion) {
        btnBuscarRegla.click();
        esperarHasta(TIEMPO_3500);
        ingresarDato(txtNombre, nuevaAutorizacion.get("reglaValidacion"));
        btnBuscarReglaValidacion.click();
        esperarHasta(TIEMPO_3500);
        btnSeleccionar.click();
        esperarHasta(TIEMPO_3500);
    }

    private void seleccionarAutorizacionActiva() {
        optAutorizacionActiva.click();
    }

    public void actualizarInformacionIngresada() {
        btnActualizar.waitUntilVisible();
        btnActualizar.click();
    }

    public void validarIngresoDeRegistro() {
        waitForAllTextToAppear("Autorización");
        btnEditar.isCurrentlyVisible();
    }

    public String validarMensajeDuplicado() {
        return labelRegistroDuplicado.getText();
    }

    public void modificarInformacionDeAutorizacion() {
        btnEditar.click();
    }

    public void validarEstadoDeCampos() {
        labelReglaValidacion.isDisplayed();
        labelRecibePersona.isDisplayed();
        labelGrupoAutorizador.isDisplayed();
        labelOficina.isDisplayed();
        btnActualizar.click();
    }

    public void busquedaPorReglaDeValidacion(String reglaValidacion) {
        itemBuscarAutorizaciones.click();
        btnSeleccionarRegla.click();
        ingresarDato(txtNombre, reglaValidacion);
        btnBuscarReglaValidacion.click();
        esperarHasta(TIEMPO_2000);
        btnSeleccionar.click();
        btnBuscarInformacion.click();
    }

    public String validarInformacionAutorizacion() {
        tblInformacionAutorizacion.isPresent();
        return tblInformacionAutorizacion.getText();
    }
}

