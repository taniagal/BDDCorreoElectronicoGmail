package com.sura.guidewire.policycenter.pages.poliza;

import ch.lambdaj.Lambda;

import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.List;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PolizaPage extends PageUtil {

    protected static final int CONSTANTE_61 = 61;
    private static final DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy");
    private static String xpathMenuDesplegable = "//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box']";
    private static String xpathMostrarCoaseguros = ".//*[@id='PolicyFile_PolicyInfo:PolicyFile_PolicyInfoScreen:PolicyFile_PolicyInfoDV:PolicyInfoInputSet:showConinsuranceLink']";
    private static final String MENSAJE_REHABILITACION = "Iniciar la rehabilitación";
    @Page
    CotizacionPage cotizacionPage;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:0_header_hd']")
    private WebElementFacade headerEnvio;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:SalesOrganizationType-inputEl']")
    private WebElementFacade comboBoxOrganizacionMrc;
    @FindBy(xpath = ".//a[contains(.,'Retirar operación')]")
    private WebElementFacade menuItemRetirarTransaccion;
    @FindBy(xpath = ".//a[contains(@class, 'x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon') and contains(., 'Aceptar')]")
    private WebElementFacade botonRetirarCancelacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:RIPolicyFieldsInputSet:reaseguroEspecial_true-inputEl']")
    private WebElementFacade opcionReaseguroEspecialSi;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:RIPolicyFieldsInputSet:Accepted-inputEl']")
    private WebElementFacade checkReaseguroEspecialSi;
    @FindBy(xpath = ".//*[contains(@id,'PolicyFile_PolicyFile_Contacts')]")
    private WebElementFacade menuItemContactos;
    @FindBy(xpath = "//span[contains(@id,'PolicyFile:PolicyFileMenuActions-btnInnerEl')]")
    private WebElementFacade botonAcciones;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnInnerEl']")
    private WebElementFacade menuEscritorio;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:CancelDate_date-inputEl']")
    private WebElementFacade txtFechaCancelacion;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_EntryScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']")
    private WebElementFacade btnCotizarCancelacion;
    @FindBy(xpath = ".//*[@id='CancellationWizard:Next-btnInnerEl']")
    private WebElementFacade btnSiguiente;
    @FindBy(xpath = ".//*[@id='CancellationWizard:Finish-btnInnerEl']")
    private WebElementFacade btnFinalizar;
    @FindBy(xpath = ".//*[contains(@id,'Screen:JobWizardToolbarButtonSet:BindOptions-btnInnerEl')]")
    private WebElementFacade btnOpcionesCompromiso;
    @FindBy(xpath = ".//*[contains(@id,'Screen:JobWizardToolbarButtonSet:BindOptions:CancelNow-textEl')]")
    private WebElementFacade btnCancelarAhora;
    @FindBy(xpath = ".//*[@id='button-1005-btnInnerEl']")
    private WebElementFacade btnAceptar;
    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:ttlBar']")
    private WebElementFacade labelCancelacionExpedida;
    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ReturnToDesktop-inputEl']")
    private WebElementFacade linkIrAlEscritorio;
    @FindBy(xpath = ".//*[@id='ReinstatementWizard:Job_RiskAnalysisScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']")
    private WebElementFacade btnCotizarRehabilitacion;
    @FindBy(xpath = ".//*[contains(@id,'Screen:JobWizardToolbarButtonSet:Reinstate-btnInnerEl')]")
    private WebElementFacade btnRehabilitar;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton-btnInnerEl']")
    private WebElementFacade btnBorrar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:EditPolicy-btnInnerEl']")
    private WebElementFacade botonEditarTransaccion;
    @FindBy(xpath = ".//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarTransaccion;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:NewCancellation-btnInnerEl']")
    private WebElementFacade botonIniciarCancelacion;
    @FindBy(id = "ReinstatementWizard:Draft")
    private WebElementFacade botonIniciarRehabilitacion;
    private String campoEmpleadoSura = ".//div[@id='PolicyFile_PolicyI\"input\"nfo:PolicyFile_PolicyInfoScreen:PolicyFile_PolicyInfoDV:PolicyInfoInputSet:PolicyEmployee_ExtInputSet:employee-inputEl']";
    private String xpathFechaVigenteCancelacion = "//input[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:CancelDate_date-inputEl']";
    private String xpathMetodoDeReembolso = "//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:CalcMethod-inputEl']";
    private String xpathMensajeBloqueoCancelacionPoliza = "//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:PreQuoteIssueTitle']";
    private String xpathMensajeDeCancelacionPolizaconOneroso = "//label[@id='CancellationWizard:CancellationWizard_QuoteScreen:WarningOnerousMessageCancellation']";
    private String xpathVerPolizExpedida = "//div[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl']";
    private List<String> listaMotivos;
    protected static String INPUT = "input";



    public PolizaPage(WebDriver driver) {
        super(driver);
    }

    public void seleccionarBotonSiguienteEnInicioDeCambioDePoliza() {
        waitFor(TIEMPO_5).seconds();
        waitForTextToAppear("Iniciar cambios en póliza");
        String btnSiguienteCambioPoliza = ".//*[@id='StartPolicyChange:StartPolicyChangeScreen:NewPolicyChange-btnInnerEl']";
        findBy(btnSiguienteCambioPoliza).waitUntilVisible().waitUntilClickable().click();
    }

    public void seleccionaBotonVerAsesoresDeLaPoliza() {
        waitFor(TIEMPO_5).seconds();
        String verAsesoresDeLaPoliza = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:ProducersLink']";
        findBy(verAsesoresDeLaPoliza).waitUntilVisible().waitUntilClickable().click();
    }

    @Step
    public String consultarOficinaDeRadicacion() {
        String oficionaDeRadicacion = ".//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_ProducerDV:PolicyInfoProducerInfoInputSet:SuraMainOffice-inputEl']";
        WebElementFacade labelOficionaDeRadicacion = getElemento(oficionaDeRadicacion);
        return labelOficionaDeRadicacion.getText();
    }

    public void editarTransaccion() {
        WebElementFacade btnEditarTransaccion = null;
        String xpatBtnAceptarConfirmacion = ".//span[contains(@id,'button') and contains(@id,'btnInnerEl')]";

        setImplicitTimeout(TIEMPO_1, TimeUnit.SECONDS);
        try {
            btnEditarTransaccion = withTimeoutOf(TIEMPO_1, TimeUnit.SECONDS).find(Boton.EDITAR_TRANSACCION_DE_POLIZA.xpath()).waitUntilVisible();
        } catch (Exception e) {
            LOGGER.info("BOTON EDITAR TRANSACCION DE POLIZA NO VISUALIZADO : " + e);
        }
        resetImplicitTimeout();

        if (btnEditarTransaccion != null) {
            btnEditarTransaccion.waitUntilClickable().click();
            findBy(xpatBtnAceptarConfirmacion).waitUntilClickable().click();
            waitForTextToAppear("Revisión de póliza");
            shouldContainText("Revisión de póliza");
        }

    }

    public void seleccionarOpcionEdificiosyUbicaciones() {
        headerEnvio.waitUntilPresent();
        seleccionarOpcion(Opcion.LINK_EDIFICIOS_Y_UBICACIONES.xpath(), "Edificios y ubicaciones");
    }

    public void seleccionarOpcionInformacionDeLaPoliza() {
        seleccionarOpcion(Opcion.LINK_INFORMACION_DE_LA_POLIZA.xpath(), "Información de póliza");
    }

    public void seleccionarOpcionInformacionDePolizaDos() {
        seleccionarOpcion(Opcion.LINK_INFORMACION_DE_LA_POLIZA_CAMBIO.xpath(), "Información de póliza");
    }

    public void seleccionarOpcion(String xpath, String tituloPaginaEsperada) {
        try {
            WebElementFacade opcion = findBy(xpath).waitUntilVisible();
            shouldBeVisible(opcion);
            opcion.waitUntilClickable().click();
            String xpathimgMensajesWarnig = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:_msgs']//div//img[@class='warning_icon']";
            setImplicitTimeout(TIEMPO_2, TimeUnit.SECONDS);
            if (findBy(xpathimgMensajesWarnig).isVisible()) {
                opcion.waitUntilClickable().click();
            }
            resetImplicitTimeout();
            waitForTextToAppear(tituloPaginaEsperada);
            shouldContainText(tituloPaginaEsperada);
        } catch (Exception e) {
            LOGGER.info("SE SELECCIONÓ UN ELEMENTO NO CLICLEABLE (EJ. DIV) " + e);
        }
    }

    public String obtenerEnvio(String numeroSubscripcion) {
        headerEnvio.waitUntilPresent();
        waitFor(ExpectedConditions.textToBePresentInElement(headerEnvio, numeroSubscripcion));
        return headerEnvio.getText();
    }

    public Boolean esEditableElemento(String nombreElemento) {
        WebElementFacade elemento = null;
        Boolean esEditableElemento = false;

        try {
            switch (nombreElemento) {
                case "Reaseguro aceptado":
                    elemento = find(By.xpath(InformacionDeLaPolizaWidget.TD_DIV_REASEGURO_ACEPTADO.xpath()));
                    break;
                case "Boton agregar tomadores adicionales":
                    esEditableElemento = findBy(InformacionDeLaPolizaWidget.LINK_AGREGAR_TOMADOR.xpath()).isCurrentlyVisible();
                    break;
                case "Fecha de inicio de vigencia":
                    elemento = findBy(InformacionDeLaPolizaWidget.DIV_FECHA_INICIO_VIGENCIA.xpath());
                    esEditableElemento = elemento.findElement(By.tagName("input")).isEnabled();
                    break;
                case "Fecha de expedicion":
                    elemento = findBy(InformacionDeLaPolizaWidget.DIV_FECHA_DE_EXPEDICION.xpath());
                    esEditableElemento = elemento.findElement(By.tagName("input")).isEnabled();
                    break;
                case "Tipo de licitacion":
                    elemento = findBy(InformacionDeLaPolizaWidget.DIV_TIPO_LICITACION.xpath());
                    esEditableElemento = elemento.findElement(By.tagName("input")).isEnabled();
                    break;
                case "Agregar coaseguro":
                    esEditableElemento = findBy(InformacionDeLaPolizaWidget.LINK_AGREGAR_COASEGURO.xpath()).isEnabled();
                    break;
                default:
                    break;
            }
        } catch (Exception e) {

            if (elemento != null) {
                esEditableElemento = false;
            }

            LOGGER.info("NO SE ENCONTRO ELEMENTO > " + e);
        }
        return esEditableElemento;
    }

    public void ingresarMotivosCancelacion(String motivo, String descripcion) {
        waitForTextToAppear("Iniciar cancelación de póliza");
        shouldContainText("Iniciar cancelación de póliza");
        String xpathInputMotivo = "//input[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:Reason-inputEl']";
        String xpathTextareaDescripcion = "//textarea[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:ReasonDescription-inputEl']";
        findBy(xpathInputMotivo).type(motivo);
        waitFor(TIEMPO_2).seconds();
        findBy(xpathInputMotivo).sendKeys(Keys.ENTER);
        waitFor(TIEMPO_2).seconds();
        findBy(xpathTextareaDescripcion).type(descripcion);
        waitFor(TIEMPO_2).seconds();
        findBy(xpathTextareaDescripcion).sendKeys(Keys.ENTER);
    }

    public void ingresarMotivosRehabilitacion(String motivo, String descripcion) {
        waitForTextToAppear(MENSAJE_REHABILITACION);
        shouldContainText(MENSAJE_REHABILITACION);
        String xpathInputMotivo = ".//*[@id='ReinstatementWizard:ReinstatementWizard_ReinstatePolicyScreen:ReinstatePolicyDV:ReasonCode-inputEl']";
        String xpathTextareaDescripcion = ".//*[@id='ReinstatementWizard:ReinstatementWizard_ReinstatePolicyScreen:ReinstatePolicyDV:ReasonDescription-inputEl']";
        String botonSiguiente = ".//*[@id='ReinstatementWizard:Next-btnInnerEl']";
        findBy(xpathInputMotivo).type(motivo);
        waitFor(TIEMPO_1).seconds();
        findBy(xpathInputMotivo).sendKeys(Keys.ENTER);
        waitFor(TIEMPO_1).seconds();
        findBy(xpathTextareaDescripcion).type(descripcion);
        waitFor(TIEMPO_1).seconds();
        findBy(xpathTextareaDescripcion).sendKeys(Keys.ENTER);
        findBy(botonSiguiente).click();
        waitFor(TIEMPO_2).seconds();
        findBy(botonSiguiente).click();
    }

    public void ingresarMotivosRehabilitacionMigradas(String motivo, String descripcion) {
        waitForTextToAppear(MENSAJE_REHABILITACION);
        shouldContainText(MENSAJE_REHABILITACION);
        String xpathInputMotivo = ".//*[@id='ReinstatementWizard:ReinstatementWizard_ReinstatePolicyScreen:ReinstatePolicyDV:ReasonCode-inputEl']";
        String xpathTextareaDescripcion = ".//*[@id='ReinstatementWizard:ReinstatementWizard_ReinstatePolicyScreen:ReinstatePolicyDV:ReasonDescription-inputEl']";
        findBy(xpathInputMotivo).type(motivo);
        waitFor(TIEMPO_1).seconds();
        findBy(xpathInputMotivo).sendKeys(Keys.ENTER);
        waitFor(TIEMPO_1).seconds();
        findBy(xpathTextareaDescripcion).type(descripcion);
        waitFor(TIEMPO_1).seconds();
        findBy(xpathTextareaDescripcion).sendKeys(Keys.ENTER);
    }

    public void ingresarFechaCancelacion(String fechaCancelacion) {
        txtFechaCancelacion.clear();
        txtFechaCancelacion.sendKeys(fechaCancelacion);
        actions.sendKeys(Keys.ENTER).build().perform();
        esperarHasta(TIEMPO_2000);
    }

    public void cotizarCancelacion() {
        btnCotizarCancelacion.waitUntilPresent();
        esperarObjetoClikeableServidorWe(btnCotizarCancelacion);
    }

    public void rehabilitarPoliza() {
        btnCotizarRehabilitacion.waitUntilPresent();
        btnCotizarRehabilitacion.click();
        clicRehabilitarPoliza();
    }

    public void clicRehabilitarPoliza() {
        setImplicitTimeout(TIEMPO_5, TimeUnit.SECONDS);
        btnRehabilitar.waitUntilVisible().click();
        btnAceptar.waitUntilVisible().click();
        while (btnBorrar.isVisible()) {
            clickearElemento(btnBorrar);
            esperarHasta(TIEMPO_3000);
        }
        btnRehabilitar.waitUntilVisible().click();
        btnAceptar.waitUntilVisible().click();
        resetImplicitTimeout();
    }

    public void clicRehabilitarPolizaUat() {
        setImplicitTimeout(TIEMPO_5, TimeUnit.SECONDS);
        btnRehabilitar.waitUntilVisible().click();
        btnAceptar.waitUntilVisible().click();
        while (btnBorrar.isVisible()) {
            clickearElemento(btnBorrar);
            esperarHasta(TIEMPO_3000);
        }
    }

    public void desplegarMotivosCancelacion() {
        String xpathDropdownInstruccion = "//input[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:Reason-inputEl']";
        findBy(xpathDropdownInstruccion).waitUntilVisible().click();
        waitFor((WebElementFacade) $(xpathMenuDesplegable)).waitUntilVisible();
        shouldBeVisible(getDriver().findElement(By.xpath(xpathMenuDesplegable)));
        List<WebElementFacade> listaMotivosWE;listaMotivosWE = findBy(xpathMenuDesplegable).thenFindAll("//li");
        listaMotivos = Lambda.extract(listaMotivosWE, Lambda.on(WebElementFacade.class).getText());
    }

    public List<String> obtenerMotivosDisponibles() {
        return this.listaMotivos;
    }

    public Boolean esFechaCancelacionHOY() {
        waitFor(xpathFechaVigenteCancelacion);
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathFechaVigenteCancelacion)));
        return esFechaPorDefectoHOY(obtenerFechacancelacionElemento());
    }

    public Boolean esFechaPorDefectoHOY(WebElementFacade fecha) {
        waitFor(fecha);
        if (LocalDate.now().isEqual(formatter.parseDateTime(fecha.getText()).toLocalDate())) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public void ingresarFechaAnteriorA61Dias(WebElementFacade fecha) {
        LocalDate fechaHace61Dias = formatter.parseDateTime(fecha.getValue()).toLocalDate().minusDays(CONSTANTE_61);
        obtenerFechacancelacionElemento().clear();
        obtenerFechacancelacionElemento().sendKeys(formatter.print(fechaHace61Dias));
        obtenerFechacancelacionElemento().sendKeys(Keys.TAB);
    }

    public void ingresarFechaSuperior(WebElementFacade fecha) {
        LocalDate fechaSuperior = formatter.parseDateTime(fecha.getValue()).toLocalDate().plusDays(CONSTANTE_10);
        obtenerFechacancelacionElemento().clear();
        obtenerFechacancelacionElemento().sendKeys(formatter.print(fechaSuperior));
        obtenerFechacancelacionElemento().sendKeys(Keys.TAB);
    }

    public void ingresaraResumenDeLaPolizaExpedida() {
        esperarHasta(TIEMPO_3500);
        findBy(xpathVerPolizExpedida).click();
        waitForTextToAppear("Resumen");
    }

    public void clicBotonEscritorio() {
        menuEscritorio.click();
        esperarHasta(TIEMPO_2000);
    }

    public WebElementFacade obtenerFechacancelacionElemento() {
        waitFor(TIEMPO_2).seconds();
        return findBy(xpathFechaVigenteCancelacion);
    }

    public void validarBotones(String path) {
        findBy(path);

    }

    public String obtenerMetodoDeReembolso() {
        waitFor(TIEMPO_2).seconds();
        return findBy(xpathMetodoDeReembolso).getText();
    }

    public WebElementFacade obtenerTituloBloqueoCancelacionPoliza() {
        return findBy(xpathMensajeBloqueoCancelacionPoliza);

    }

    public WebElementFacade obtenerMensajeDeCancelacionPolizaConOneroso() {
        return findBy(xpathMensajeDeCancelacionPolizaconOneroso);

    }

    public void validarTransaccionPendienteNoExistenteEnResumenPoliza(String tipo) {
        String xPathTablaTransacciones = ".//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_JobsInProgressLV-body']";
        WebElementFacade tablaTransacciones = findBy(xPathTablaTransacciones);
        waitFor(tablaTransacciones);
        List<WebElement> allRows = tablaTransacciones.findElements(By.tagName("tr"));
        String existeTransaccion = "No existe la póliza";
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (tipo.equals(cells.get(TIEMPO_5).getText())) {
                existeTransaccion = "Se encontró la póliza en las transacciones";
            }
        }
        MatcherAssert.assertThat("No existe la póliza", Is.is(Matchers.equalTo(existeTransaccion)));
    }

    public boolean esVisibleMensaje(String xpath) {
        boolean visible;
        visible = findBy(xpath).isVisible();
        return visible;
    }

    public void validarQueNoSeMuestreMensaje(String xpath) {
        MatcherAssert.assertThat(esVisibleMensaje(xpath), Is.is(false));
    }

    public void ingresarOpcionMostrarCoaseguros() {
        findBy(xpathMostrarCoaseguros).click();
        waitForTextToAppear("Coaseguro");
    }

    public void seleccionarBotonAcciones() {
        botonAcciones.waitUntilPresent();
        clickearElemento(botonAcciones);
    }

    public void realizarCancelacion() {
        esperarHasta(TIEMPO_5000);
        cliquearOpcionCompromiso();
    }

    public void cliquearOpcionCompromiso() {
        esperarHasta(TIEMPO_5000);
        btnOpcionesCompromiso.waitUntilPresent();
        clickearElemento(btnOpcionesCompromiso);
        esperarHasta(TIEMPO_3500);
        esperarObjetoClikeableServidorWe(btnCancelarAhora);
        esperarHasta(TIEMPO_3500);
        esperarObjetoClikeableServidorWe(btnAceptar);
    }

    public void verificarCancelacion() {
        "Cancelación Expedida".equals(labelCancelacionExpedida.waitUntilPresent().getText());
        linkIrAlEscritorio.click();
    }

    public void verificarRehabilitacion() {
        "Rehabilitación Expedida".equals(labelCancelacionExpedida.waitUntilPresent().getText());
    }

    public void seleccionarOpcionRetirarTransaccion() {
        menuItemRetirarTransaccion.waitUntilPresent();
        clickearElemento(menuItemRetirarTransaccion);
    }

    public void clicIniciarCancelacion() {
        botonIniciarCancelacion.waitUntilVisible().click();
    }

    public void confirmarCancelacion() {
        botonRetirarCancelacion.waitUntilPresent();
        clickearElemento(botonRetirarCancelacion);
    }

    public void seleccionarReaseguroEspecialSi() {
        opcionReaseguroEspecialSi.waitUntilPresent();
        clickearElemento(opcionReaseguroEspecialSi);
        checkReaseguroEspecialSi.waitUntilPresent();
        clickearElemento(checkReaseguroEspecialSi);
    }

    public void validarQueSeMuestreValorEnCampoYNoSeaEditable(String valor) {
        setImplicitTimeout(TIEMPO_2, TimeUnit.SECONDS);
        MatcherAssert.assertThat("El campo no es igual al valor recibido", findBy(campoEmpleadoSura).getText().equals(valor));
        MatcherAssert.assertThat(cotizacionPage.buscarInputHabilitadoEnElemento(campoEmpleadoSura), Is.is(false));
        resetImplicitTimeout();
    }

    public void ingresarFechaDeCancelacion(WebElementFacade fecha, int mes) {
        LocalDate fechaSuperior = formatter.parseDateTime(fecha.getValue()).toLocalDate().plusMonths(mes);
        obtenerFechacancelacionElemento().clear();
        obtenerFechacancelacionElemento().sendKeys(formatter.print(fechaSuperior));
        obtenerFechacancelacionElemento().sendKeys(Keys.TAB);
    }

    public void seleccionarOpcionContactos() {
        menuItemContactos.waitUntilVisible();
        menuItemContactos.click();
    }

    public void cuandoEditeLaCotizacion() {
        botonEditarTransaccion.waitUntilPresent();
        clickearElemento(botonEditarTransaccion);
        clickearElemento(botonAceptarTransaccion);
        waitForTextToAppear("Borrador");
    }

    public void ingreseaIniciarRehabilitacion(){
        botonIniciarRehabilitacion.click();
        waitForTextToAppear(MENSAJE_REHABILITACION);
    }

    public enum Opcion {
        LINK_EDIFICIOS_Y_UBICACIONES(".//*[@id='SubmissionWizard:LOBWizardStepGroup:CPBuildings']/div"),
        LINK_INFORMACION_DE_LA_POLIZA(".//*[@id='PolicyFile:PolicyFileAcceleratedMenuActions:PolicyMenuItemSet:PolicyMenuItemSet_PolicyInfo']/div"),
        LINK_INFORMACION_DE_LA_POLIZA_CAMBIO(".//*[@id='SubmissionWizard:PolicyInfo']/div"),
        ENVIO(".//*[@id='SubmissionWizard:0_header_hd']");
        private String elemento;

        Opcion(String opcion) {
            this.elemento = opcion;
        }

        public String xpath() {
            return elemento;
        }
    }

    public enum Boton {
        EDITAR_TRANSACCION_DE_POLIZA(".//a[contains(.,'Editar transacción de póliza')]");
        private String botonXP;

        Boton(String boton) {
            this.botonXP = boton;
        }

        public String xpath() {
            return botonXP;
        }
    }

    public enum InformacionDeLaPolizaWidget {
        DIV_FECHA_INICIO_VIGENCIA(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-inputEl']"),
        DIV_FECHA_DE_EXPEDICION(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:WrittenDate-inputEl']"),
        DIV_TIPO_LICITACION(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:TypeTender-inputEl']"),
        LINK_AGREGAR_COASEGURO(".//a[contains(.,'Agregar coaseguro')]"),
        LINK_AGREGAR_TOMADOR(".//a[contains(.,'Agregar') and contains(@id,'AddContactsButton')]"),
        TD_DIV_REASEGURO_ACEPTADO(".//td[contains(@id,'reaseguroAceptado-bodyEl') and (descendant::*[contains(., 'No')])]"),
        DIV_REASEGURO_ESPECIAL(".//div[contains(@id,'campoReaseguroEspecial-containerEl')]/table/tbody/tr/td"),
        TD_FECHA_FIN_VIGENCIA(".//td[contains(@id,'ExpirationDate-bodyEl')]");

        private String elemento;

        InformacionDeLaPolizaWidget(String elemento) {
            this.elemento = elemento;
        }

        public String xpath() {
            return elemento;
        }
    }
}
