package com.sura.guidewire.policycenter.utils.menu.opciones.cuenta;

import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.Utils;

import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Map;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class OpcionesInformacionPolizaMrcPage extends PageUtil {

    public static final String MSJVALIDARVALORES = "No estan correctos los valores:";
    private static final String MSJVALIDARELEMENTOS = "No estan presentes los elementos:";
    private static final String LISTA_TIPO_BENEFICIARIO_UNO = "//div[contains(.,'Seguros Generales Suramericana S.A.') and contains(@class,'x-grid-cell-inner')]";
    private static final String LISTA_TIPO_BENEFICIARIO = "//div[contains(.,'<ninguno>') and contains(@class,'x-grid-cell-inner')]";
    private static final String BTNELEGIRPRODUCTO = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV:";
    private static final String LBL_MENU_LATERAL_INICIAL = ".//td[contains(@id,'SubmissionWizard') and contains(.,'";
    private static final String LBL_MENU_LATERAL_FINAL = "')]";
    private static final String LBL_INFORMACION_POLIZA = ".//*[contains(@id,'SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV')]/td/div";
    private static final String LINK_MENU_LATERAL_INICIAL = ".//a[contains(@id,'SubmissionWizard') and contains(.,'";
    private static final String LINK_MENU_LATERAL_FINAL = "')]";
    private static final String ASEGURADORA = "ASEGURADORA";
    @FindBy(xpath = ".//*[contains(@id, 'PolicyInfo')]/div/span")
    WebElementFacade lblInformaPolizaEnRenovacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-inputEl']")
    WebElementFacade txtFechaVigencia;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:TermType-inputEl']")
    WebElementFacade comboTipoVigencia;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:identificationNumber-inputEl']")
    WebElementFacade txtNumDocumento;
    @FindBy(xpath = "//input[@id='Coinsurance_ExtPopup:CoinsuranceInputSet:DocumentNumberReference-inputEl']")
    WebElementFacade txtNumDocumentoCoaseguro;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:ttlBar']")
    WebElementFacade lblInformaPoliza;
    @FindBy(xpath = ".//a[contains(.,'Cotizar')]")
    WebElementFacade botonCotizar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Name-inputEl']")
    WebElementFacade lblNombreCompleto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:_msgs']")
    WebElementFacade mensajePantalla;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:Next-btnInnerEl']")
    WebElementFacade botonSiguienteCambioDePoliza;
    @FindBy(xpath = ".//input[contains(@id,'false-inputEl')]")
    WebElementFacade btnNoReaseguroEspecial;
    @FindBy(xpath = ".//*[@id='RenewalWizard:Next-btnInnerEl']")
    WebElementFacade botonSiguienteRenovacionDePoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:AdditionalNamedInsuredsDV:NamedInsuredInputSet:NamedInsuredsLV_tb:AddContactsButton-btnInnerEl']")
    WebElementFacade btnAgregar;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscar;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV:0:_Select']")
    WebElementFacade btnSelecciona;
    @FindBy(xpath = ".//*[@id='EditPolicyContactRolePopup:ContactDetailScreen:Update-btnInnerEl']")
    WebElementFacade btnActualizaAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:AdditionalNamedInsuredsDV:NamedInsuredInputSet:NamedInsuredsLV_tb:AddContactsButton:AddFromSearch-textEl']")
    WebElementFacade itemDirectorio;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:DocumentType-inputEl']")
    WebElementFacade itemTipoDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:RIPolicyFieldsInputSet:reaseguroEspecial_true-inputEl']")
    WebElementFacade radioBotReaseguroEspecial;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:DocumentType-inputEl']")
    WebElementFacade lblTipoDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    WebElementFacade lblNumeroDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Phone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    WebElementFacade lblNumeroTelefono;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:ChangePolicyAddressButton-labelEl']")
    WebElementFacade lblDireccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-labelEl']")
    WebElementFacade lblFechaVigencia;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ExpirationDate-labelEl']")
    WebElementFacade lblFechaExpiracion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:WrittenDate-labelEl']")
    WebElementFacade lblFechaescrita;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyAddressDisplayInputSet:AddressDescription-labelEl']")
    WebElementFacade lblDescripcionDir;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:DocumentType-inputEl']")
    WebElementFacade inputTipoDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    WebElementFacade inputNumeroDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Phone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    WebElementFacade inputNumeroTelefono;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyAddressDisplayInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl']")
    WebElementFacade inputDireccion;
    @FindBy(xpath = ".//input[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:RIPolicyFieldsInputSet:reaseguroEspecial_false-inputEl']")
    WebElementFacade inputReaseguroEspecial;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:InsuredInputSet:CompanyNamedInsuredLabel-labelEl']")
    WebElementFacade lblTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:AdditionalNamedInsuredsDV']")
    WebElementFacade tblTomadoresAdicionales;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyAddressDisplayInputSet:AddressDescription-labelEl']")
    WebElementFacade lblDescripDireccion;
    @FindBy(xpath = ".//*[@id='EditPolicyContactRolePopup:ContactDetailScreen:PolicyContactRoleDetailsCV:PolicyContactDetailsDV:AddressDescription-inputEl']")
    WebElementFacade txtDescripDireccion;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV-body']")
    WebElementFacade tablaProductos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:RIPolicyFieldsInputSet:Accepted-inputEl']")
    WebElementFacade checkiReaseguroAceptado;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:Update-btnInnerEl']")
    WebElementFacade botonAceptarCoaseguro;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:addConinsuranceLink']")
    private WebElementFacade agregarCoaseguro;
    @FindBy(xpath = "//input[@id='Coinsurance_ExtPopup:CoinsuranceInputSet:coinsuranceTypeQuestion_true-inputEl']")
    private WebElementFacade radioButtonAceptado;
    @FindBy(xpath = "//input[@id='Coinsurance_ExtPopup:CoinsuranceInputSet:coinsuranceTypeQuestion_false-inputEl']")
    private WebElementFacade radioButtonCedido;
    @FindBy(xpath = ".//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarPopup;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:PolicyInfo']/div")
    private WebElementFacade menuItemInformacionDePoliza;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:_msgs']")
    private WebElementFacade divMensaje2;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:CoinsuranceInputSet:ReferencePolicyNumber-inputEl']")
    private WebElementFacade txtPolizaDeReferencia;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:CoinsuranceInputSet:DocumentNumberReference-inputEl']")
    private WebElementFacade txtNumeroDeDocumento;
    private boolean esVisible;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ExpirationDate-inputEl']")
    private WebElementFacade txtFechaFinVigencia;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:0']")
    private WebElementFacade lblRegistroDelAsesor;


    public OpcionesInformacionPolizaMrcPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarFechaVigencia(String fechaInicioVigencia) {
        String fechaVigencia = fechaInicioVigencia;
        waitInfoPoliza(lblInformaPoliza);
        txtFechaVigencia.clear();
        if (!fechaInicioVigencia.contains("/")){
            fechaVigencia = Utils.sumarDiasALaFechaActual(Integer.parseInt(fechaInicioVigencia));
        }
        txtFechaVigencia.sendKeys(fechaVigencia);
        actions.sendKeys(Keys.ENTER).build().perform();
        esperarHasta(TIEMPO_2000);
    }

    public void ingresarTipoDeVigencia(String tipoVigencia) {
        waitInfoPoliza(lblInformaPoliza);
        seleccionarItem(comboTipoVigencia, tipoVigencia);
    }

    public void ingresarTomadorAdicional(String tipoDocumento, String documento) {
        btnAgregar.waitUntilPresent();
        clickearElemento(btnAgregar);
        itemDirectorio.waitUntilVisible().waitUntilClickable().click();
        itemTipoDocumento.waitUntilPresent().clear();
        esperarHasta(TIEMPO_300);
        itemTipoDocumento.sendKeys(tipoDocumento);
        itemTipoDocumento.sendKeys(Keys.ENTER);
        waitForAnyTextToAppear("Primer nombre", "Razón social");
        txtNumDocumento.sendKeys(documento);
        clickearElemento(btnBuscar);
        btnSelecciona.waitUntilPresent();
        clickearElemento(btnSelecciona);
        waitInfoPoliza(lblInformaPoliza);
        clickearElemento(botonSiguiente);
    }

    public void seleccionBotonSiguiente() {
        try {
            botonSiguiente.waitUntilPresent();
            clickearElemento(botonSiguiente);
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
            esperarHasta(TIEMPO_2000);
            botonSiguiente.waitUntilPresent();
            clickearElemento(botonSiguiente);
        }
    }

    public void seleccionBotonSiguienteenCambioDePoliza() {
        botonSiguienteCambioDePoliza.waitUntilPresent();
        clickearElemento(botonSiguienteCambioDePoliza);
        waitForTextToAppear("Edificios y ubicaciones");
    }

    public void seleccionBotonSiguienteenRenovacionDePoliza() {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonSiguienteRenovacionDePoliza).waitUntilPresent();
        clickearElemento(botonSiguienteRenovacionDePoliza);
    }

    public void seleccionaRiesgoAceptado() {
        waitInfoPoliza(lblInformaPoliza);
        radioBotReaseguroEspecial.click();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(checkiReaseguroAceptado).waitUntilVisible();
        checkiReaseguroAceptado.click();
    }

    public boolean editarDescripDireccionTomador() {
        if (lblDescripDireccion.isPresent()) {
            lblNombreCompleto.click();
            waitInfoPoliza(txtDescripDireccion);
            txtDescripDireccion.clear();
            btnActualizaAsegurado.click();
            waitInfoPoliza(lblInformaPoliza);
            esVisible = true;
        } else {
            lblNombreCompleto.click();
            waitInfoPoliza(txtDescripDireccion);
            txtDescripDireccion.clear();
            txtDescripDireccion.sendKeys("Direccion Presente");
            btnActualizaAsegurado.click();
            waitInfoPoliza(lblInformaPoliza);
            esVisible = false;
        }
        return esVisible;
    }

    public void seleccionarProducto(String nomProducto) {
        esperarHasta(TIEMPO_1000);
        String xpathBotonElegirProducto = BTNELEGIRPRODUCTO + this.encontrarProducto(nomProducto).toString() + ":addSubmission']";
        WebElementFacade botonElegirProducto = esperarElemento(xpathBotonElegirProducto);
        botonElegirProducto.waitUntilEnabled();
        botonElegirProducto.click();
        if ("Multiriesgo corporativo".equals(nomProducto)) {
            setImplicitTimeout(TIEMPO_2, TimeUnit.SECONDS);
            if (botonAceptarPopup.isVisible()) {
                botonAceptarPopup.click();
                botonAceptarPopup.waitUntilNotVisible();
            }
            resetImplicitTimeout();
        }
    }

    public void seleccionarOpcionCotizar() {
        try {
            botonCotizar.waitUntilVisible();
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
            esperarHasta(TIEMPO_2000);
            botonCotizar.waitUntilPresent();
        }
        clickearElemento(botonCotizar);
        waitForTextToAppear("Cotización");
    }

    public void seleccionarOpcionCotizarPolizaPrincipal() {
        botonCotizar.waitUntilPresent();
        clickearElemento(botonCotizar);
        waitForTextToAppear("Número de cotización", TIEMPO_40000);
    }

    public Integer encontrarProducto(String producto) {
        withTimeoutOf(TIEMPO_15, TimeUnit.SECONDS).waitFor(tablaProductos).waitUntilVisible();
        Integer filaBoton = 0;
        List<WebElement> filas = tablaProductos.findElements(By.tagName("tr"));
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if (producto.equals(columna.get(1).getText())) {
                return filaBoton;
            }
            filaBoton++;
        }
        return filaBoton;
    }

    public void seleccionarInformacionDePoliza() {
        lblInformaPolizaEnRenovacion.click();
        waitForTextToAppear("Información de póliza");
    }

    public void ingresarAInformacionDePoliza() {
        clickearElemento(menuItemInformacionDePoliza);
        waitForTextToAppear("Información de póliza");
    }

    public void agregarUnCoaseguro(String tipoCo, String polizaRef, String documento, ExamplesTable tablaaseguradoras) {
        waitFor(TIEMPO_1).second();
        clickearElemento(menuItemInformacionDePoliza);
        agregarCoaseguro.waitUntilPresent().click();
        seleccionarElTipoDeCoaseguro(tipoCo, polizaRef, documento);
        agregoLasAseguradoras(tablaaseguradoras);
    }

    public void seleccionarElTipoDeCoaseguro(String tipoCoaseguro, String polizaRef, String documento) {
        esperarHasta(TIEMPO_1000);
        if ("Cedido".equals(tipoCoaseguro)) {
            if ("0% 0%".equals($(radioButtonCedido).getCssValue("background-position"))) {
                esperarHasta(TIEMPO_2000);
                radioButtonCedido.click();
            }
        } else {
            esperarHasta(TIEMPO_2000);
            radioButtonAceptado.click();
            esperarHasta(TIEMPO_1000);
            txtPolizaDeReferencia.sendKeys(polizaRef);
            txtNumeroDeDocumento.sendKeys(documento);
        }
    }

    public void agregoLasAseguradoras(ExamplesTable tablaaseguradoras) {
        Map<String, String> asegurados;
        Actions act = new Actions(getDriver());
        for (int i = 0; i < tablaaseguradoras.getRowCount(); i++) {
            asegurados = tablaaseguradoras.getRows().get(i);
            WebElementFacade campoLider = findBy(".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']/*/table/tbody/tr[" + (i + 1) + "]/td[4]");
            if (i == 0) {
                if (!"Seguros Generales Suramericana S.A.".equals(asegurados.get(ASEGURADORA))) {
                    desplegarListaTipoAsegurado(LISTA_TIPO_BENEFICIARIO_UNO, asegurados.get(ASEGURADORA));
                }
                waitFor(TIEMPO_2).second();
                clickearElemento(findBy(LISTA_TIPO_BENEFICIARIO_UNO));
                waitFor(TIEMPO_2).second();
                act.sendKeys(Keys.TAB).build().perform();
                act.sendKeys(Keys.ENTER).build().perform();
                act.sendKeys(asegurados.get("PARTICIPACION")).build().perform();
            } else {
                desplegarListaTipoAsegurado(LISTA_TIPO_BENEFICIARIO, asegurados.get(ASEGURADORA));
                waitFor(TIEMPO_2).second();
                act.sendKeys(Keys.TAB).build().perform();
                act.sendKeys(Keys.ENTER).build().perform();
                act.sendKeys(asegurados.get("PARTICIPACION")).build().perform();
                act.sendKeys(Keys.TAB).build().perform();
                setImplicitTimeout(TIEMPO_1, TimeUnit.SECONDS);
                if (txtPolizaDeReferencia.isVisible()) {
                    campoLider.click();
                }
                resetImplicitTimeout();
            }
        }
    }

    public void validarMensajesCoaseguros(ExamplesTable mensajesEsperados) {
        verificarMensajes(divMensaje2, mensajesEsperados);
    }

    public void noHabilitarNumeroDocumentoCoaseguro() {
        boolean validacion = txtNumDocumentoCoaseguro.isCurrentlyEnabled();
        MatcherAssert.assertThat(validacion, Is.is(Matchers.not(Matchers.equalTo(true))));
    }


    public void validaNombreTomador(String nombreCompleto) {
        waitInfoPoliza(lblInformaPoliza);
        MatcherAssert.assertThat("el al mostrar nombre completo", nombreCompleto.equals(lblNombreCompleto.getText()));
    }

    public void desplegarListaTipoAsegurado(String xPathAsegurado, String elemento) {
        WebElementFacade listaTipoAsegurado = findBy(xPathAsegurado);
        listaTipoAsegurado.click();
        waitFor(TIEMPO_3);
        seleccionarElementoDeLaLista(elemento);
    }

    public void seleccionarElementoDeLaLista(String elementoLista) {
        List<WebElementFacade> listaElementosCotizacion = findAll(By.xpath(".//li[@role='option']"));
        if (!listaElementosCotizacion.isEmpty()) {
            for (WebElementFacade listaElemento : listaElementosCotizacion) {
                if (listaElemento.containsText(elementoLista)) {
                    listaElemento.waitUntilPresent().click();
                    break;
                }
            }
        }
    }

    public void validaCamposPoliza() {
        StringBuilder noPresente = new StringBuilder(MSJVALIDARELEMENTOS);
        noPresente = concatenarElementoNoPresente(lblTipoDocumento, "Label errado: Tipo documento|", noPresente);
        noPresente = concatenarElementoNoPresente(lblNumeroDocumento, "Label errado: Numero documento|", noPresente);
        noPresente = concatenarElementoNoPresente(lblNumeroTelefono, "Label errado: Teléfono|", noPresente);
        noPresente = concatenarElementoNoPresente(lblDireccion, "Label errado: Dirección de la poliza", noPresente);
        noPresente = concatenarElementoNoPresente(inputReaseguroEspecial, "radio boton: No esta present|", noPresente);
        if (!"Fecha inicio de vigencia".equals(lblFechaVigencia.getText())) {
            noPresente.append("salida errada: Fecha inicio de vigencia|");
        }
        if (!"Fecha fin de vigencia".equals(lblFechaExpiracion.getText())) {
            noPresente.append("salida errada: Fecha fin de vigencia|");
        }
        if (!"Fecha de expedición".equals(lblFechaescrita.getText())) {
            noPresente.append("salida errada: Fecha de expedición|");
        }
        if (!"Descripción de la dirección".equals(lblDescripcionDir.getText())) {
            noPresente.append("salida errada: Descripcion direccion|");
        }
        String res = noPresente.toString();
        if (MSJVALIDARELEMENTOS.equals(res)) {
            res = noPresente.toString().substring(0, noPresente.toString().length() - 1);
        }
        MatcherAssert.assertThat(res, "No estan presentes los elementos".equals(res));
    }

    public void validarValoresDeCampos() {
        StringBuilder valor = new StringBuilder(MSJVALIDARVALORES);
        valor = concatenarElementoDiferente("CEDULA DE CIUDADANIA", waitFor(inputTipoDocumento).getText(), "Tipo cedula|", valor);
        valor = concatenarElementoDiferente("1234567891", inputNumeroDocumento.getText(), " Numero cedula|", valor);
        valor = concatenarElementoDiferente("408-2211", inputNumeroTelefono.getText(), " Telefono|", valor);
        valor = concatenarElementoDiferente("CR 65 # 48 - 162, MEDELLIN, Colombia", inputDireccion.getText(), " Direccion|", valor);

        String res = valor.toString();
        if (MSJVALIDARVALORES.equals(res)) {
            res = valor.toString().substring(0, valor.toString().length() - 1);
        }
        MatcherAssert.assertThat(res, "No estan correctos los valores".equals(res));
    }

    public void validaMensajeEnPantalla(String mensaje) {
        waitInfoPoliza(mensajePantalla);
        MatcherAssert.assertThat(mensajePantalla.getText(), Matchers.containsString(mensaje));
    }

    public void validaReaseguro() {
        setImplicitTimeout(TIEMPO_3, TimeUnit.SECONDS);
        StringBuilder notPresent = new StringBuilder(MSJVALIDARELEMENTOS);
        if (!"Compañía cedente".equals(lblTomador.getText())) {
            notPresent.append("salida errada: Compañía cedente|");
        }
        if (!tblTomadoresAdicionales.isPresent()) {
            notPresent.append("los tomadores adicionales no pueden estar presentes|");
        }
        String res = notPresent.toString();
        if (MSJVALIDARELEMENTOS.equals(res)) {
            res = notPresent.toString().substring(0, notPresent.toString().length() - 1);
        }
        resetImplicitTimeout();
        MatcherAssert.assertThat(res, "No estan presentes los elementos".equals(res));
    }

    public void validarCampos(String estadouno, String estadodos, ExamplesTable menusesperados, String pathinicial, String pathfinal) {
        WebElementFacade elementoMenu;
        Map<String, String> menus;
        String xpathMenu;
        for (int i = 0; i < menusesperados.getRowCount(); i++) {
            menus = menusesperados.getRows().get(i);
            if (estadouno.contains("Visible") && menus.get(OPCIONES_MENU) != null) {
                String mensaje = menus.get(OPCIONES_MENU);
                xpathMenu = pathinicial + mensaje + pathfinal;
                elementoMenu = findBy(xpathMenu);
                MatcherAssert.assertThat("El elemento: " + mensaje + ", no es visible", elementoMenu.isVisible());
            } else if (estadodos.contains("No visible")) {
                String mensaje = menus.get("OPCIONES_MENU_NO_VISIBLES");
                xpathMenu = pathinicial + mensaje + pathfinal;
                elementoMenu = findBy(xpathMenu);
                setImplicitTimeout(TIEMPO_1, TimeUnit.SECONDS);
                MatcherAssert.assertThat("El elemento: " + mensaje + ", no es visible", !elementoMenu.isVisible());
                resetImplicitTimeout();
            }
        }
    }

    public void validarCampos(String estado, ExamplesTable menusesperados, String pathinicial, String pathfinal) {
        WebElementFacade elementoMenu;
        Map<String, String> menus;
        String xpathMenu;
        for (int i = 0; i < menusesperados.getRowCount(); i++) {
            menus = menusesperados.getRows().get(i);
            if (estado.contains("Visible") && menus.get(OPCIONES_MENU) != null) {
                String mensaje = menus.get(OPCIONES_MENU);
                xpathMenu = pathinicial + mensaje + pathfinal;
                elementoMenu = findBy(xpathMenu);
                setImplicitTimeout(TIEMPO_2, TimeUnit.SECONDS);
                MatcherAssert.assertThat("El elemento: " + mensaje + ", no es visible", elementoMenu.isVisible());
                resetImplicitTimeout();
            } else if (estado.contains("No visible")) {
                String mensaje = menus.get("OPCIONES_MENU_NO_VISIBLES");
                xpathMenu = pathinicial + mensaje + pathfinal;
                elementoMenu = findBy(xpathMenu);
                setImplicitTimeout(TIEMPO_1, TimeUnit.SECONDS);
                MatcherAssert.assertThat("El elemento: " + mensaje + ", es visible", !elementoMenu.isVisible());
                resetImplicitTimeout();
            }
        }
    }

    public void validarCamposNoEditables(String elementos) {
        List<WebElementFacade> listaElementos = findAll(By.xpath(elementos));
        for (WebElementFacade listaElemento : listaElementos) {
            MatcherAssert.assertThat("El campo " + listaElemento.getTagName() + "es editable, lo cual es un error.Verificar",
                    !listaElemento.getAttribute("class").contains("x-form-text"));
        }
    }

    public void validarCamposMenuLateral(String estadouno, ExamplesTable menusesperados) {
        validarCampos(estadouno, menusesperados, LBL_MENU_LATERAL_INICIAL, LBL_MENU_LATERAL_FINAL);
    }

    public void validarCamposInformacionPoliza(String estadouno, String estadodos, ExamplesTable menusesperados) {
        validarCampos(estadouno, estadodos, menusesperados, LINK_MENU_LATERAL_INICIAL, LINK_MENU_LATERAL_FINAL);
    }

    public void seleccionarTipoNoReaseguro() {
        btnNoReaseguroEspecial.waitUntilPresent().click();
        esperarHasta(TIEMPO_5000);
    }

    public void validaFormularioDescripDireccion() {
        if (esVisible) {
            MatcherAssert.assertThat("el campo Descripcion direccion no debe estar presente", !lblDescripDireccion.isPresent());
        } else {
            MatcherAssert.assertThat("el campo Descripcion direccion debe estar presente al ingresar direccion", lblDescripDireccion.isPresent());
        }
    }

    public void waitInfoPoliza(WebElementFacade webElementFacade) {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(webElementFacade).waitUntilPresent();
    }
    public void ingresarFechaVigenciaMA(String fechaInicioVigencia,String fechaFinVigencia) {
        waitInfoPoliza(lblInformaPoliza);
        esperarHasta(3000);
        txtFechaVigencia.clear();
        if (!fechaInicioVigencia.contains("/")){
            fechaInicioVigencia = Utils.sumarDiasALaFechaActual(Integer.parseInt(fechaInicioVigencia));
        }
        if (!fechaFinVigencia.contains("/")){
            fechaFinVigencia = Utils.sumarDiasALaFechaActual(Integer.parseInt(fechaFinVigencia));
        }
        txtFechaVigencia.sendKeys(fechaInicioVigencia);
        esperarHasta(3500);
        clickearElemento(lblRegistroDelAsesor);
        txtFechaFinVigencia.clear();
        txtFechaFinVigencia.sendKeys(fechaFinVigencia);
        esperarHasta(3000);
        clickearElemento(lblRegistroDelAsesor);
        esperarHasta(3000);
        clickearElemento(botonSiguiente);
        esperarHasta(TIEMPO_9999);
        esperarHasta(TIEMPO_9999);
    }
    public void darClicEnAceptarDeCoaseuguro() {
        botonAceptarCoaseguro.click();
    }

    public void validarcamposNoEditablesEnInformacionDePoliza() {
        validarCamposNoEditables(LBL_INFORMACION_POLIZA);
    }
}
