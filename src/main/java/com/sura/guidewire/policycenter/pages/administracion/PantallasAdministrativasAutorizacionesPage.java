package com.sura.guidewire.policycenter.pages.administracion;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class PantallasAdministrativasAutorizacionesPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='Admin:AdminMenuActions-btnInnerEl']")
    WebElementFacade mnuAcciones;
    @FindBy(xpath = "//span[contains(.,'Nueva autorización')]")
    WebElementFacade itemNuevaAutorizacion;
    @FindBy(xpath = ".//*[@id='NewUWIssueInfo_Ext:UWIssueInfoDetailScreen:issue-inputEl']")
    WebElementFacade txtReglaValidacion;
    @FindBy(xpath = ".//*[@id='UWIssueInfo_ExtSearchPage:issue-inputEl']")
    WebElementFacade txtBuscarReglaValidacion;
    @FindBy(xpath = ".//*[@id='NewUWIssueInfo_Ext:UWIssueInfoDetailScreen:user-inputEl']")
    WebElementFacade txtpersonaRecibe;
    @FindBy(xpath = ".//*[@id='UserSearchPopup:UserSearchPopupScreen:UserSearchDV:Username-inputEl']")
    WebElementFacade txtNombreUsuario;
    @FindBy(xpath = ".//*[@id='NewUWIssueInfo_Ext:UWIssueInfoDetailScreen:approverGroup-inputEl']")
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
    @FindBy(xpath = ".//*[@id='ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:Code-inputEl']")
    WebElementFacade txtCodigoAsesor;
    @FindBy(xpath = ".//*[@id='ProducerCodeSearchPopup:ProducerCodeSearchScreen:ProducerCodeSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscarAsesorAutorizacion;
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
    public static final String PROPIEDADLECTURA = "readonly";

    public PantallasAdministrativasAutorizacionesPage(WebDriver driver) {
        super(driver);
    }

    public void irAlMenuAcciones() {
        mnuAcciones.click();
    }

    public void crearNuevaAutorizacion() {
        itemNuevaAutorizacion.click();
    }

    public void agregarNuevaAutorizacion(ExamplesTable datosNuevaAutorizacion) {
        Map<String, String> nuevaAutorizacion = datosNuevaAutorizacion.getRow(0);
        if (txtReglaValidacion.getAttribute(PROPIEDADLECTURA) != null) {
            agregarReglaValidacion(nuevaAutorizacion);
        } else {
            ingresarDato(txtReglaValidacion, nuevaAutorizacion.get("reglaValidacion"));

        }
        if (txtpersonaRecibe.getAttribute(PROPIEDADLECTURA) != null) {
            agregarPersonaRecibe(nuevaAutorizacion);
        } else {
            ingresarDato(txtpersonaRecibe, nuevaAutorizacion.get("personaRecibe"));
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
        ingresarDato(txtNombre, nuevaAutorizacion.get("reglaValidacion"));
        btnBuscarReglaValidacion.click();
        esperarHasta(TIEMPO_2000);
        btnSeleccionar.click();
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

