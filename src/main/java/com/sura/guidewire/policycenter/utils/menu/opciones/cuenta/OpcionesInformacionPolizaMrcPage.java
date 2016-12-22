package com.sura.guidewire.policycenter.utils.menu.opciones.cuenta;


import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.AssertUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class OpcionesInformacionPolizaMrcPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:PolicyInfo']")
    WebElementFacade lblInformaPolizaEnRenovacion;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']")
    WebElementFacade txtNomAgente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-inputEl']")
    WebElementFacade txtFechaVigencia;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:identificationNumber-inputEl']")
    WebElementFacade txtNumDocumento;
    @FindBy(xpath = "//input[@id='Coinsurance_ExtPopup:CoinsuranceInputSet:DocumentNumberReference-inputEl']")
    WebElementFacade txtNumDocumentoCoaseguro;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:ttlBar']")
    WebElementFacade lblInformaPoliza;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ttlBar']")
    WebElementFacade lblNuevaCotizacion;
    @FindBy(xpath = "//a[contains(.,'Cotizar')]")
    WebElementFacade botonCotizar;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV-body']")
    WebElementFacade lblTabla;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Name-inputEl']")
    WebElementFacade lblNombreCompleto;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:ttlBar']")
    WebElementFacade lblBuscarDirectorio;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:FirstName-labelEl']")
    WebElementFacade lblPrimerNombre;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:_msgs']")
    WebElementFacade mensajePantalla;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    WebElementFacade btnSiguiente;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:Next-btnInnerEl']")
    WebElementFacade btnSiguienteCambioDePoliza;
    @FindBy(xpath = ".//input[contains(@id,'false-inputEl')]")
    WebElementFacade btnNoReaseguroEspecial;
    @FindBy(xpath = ".//*[@id='RenewalWizard:Next-btnInnerEl']")
    WebElementFacade btnSiguienteRenovacionDePoliza;
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
    @FindBy(xpath = "//a[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:addConinsuranceLink']")
    private WebElementFacade agregarCoaseguro;
    @FindBy(xpath = "//input[@id='Coinsurance_ExtPopup:CoinsuranceInputSet:coinsuranceTypeQuestion_true-inputEl']")
    private WebElementFacade radioButtonAceptado;
    @FindBy(xpath = "//input[@id='Coinsurance_ExtPopup:CoinsuranceInputSet:coinsuranceTypeQuestion_false-inputEl']")
    private WebElementFacade radioButtonCedido;
    @FindBy(xpath = ".//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarPopup;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:PolicyInfo']/div")
    private WebElementFacade menuItemInformacionDePoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:_msgs']/div")
    private WebElementFacade divMensaje;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:Update-btnInnerEl']")
    WebElementFacade botonAceptarCoaseguro;


    private static final String MSJVALIDARELEMENTOS = "No estan presentes los elementos:";
    private static final String LBL_MENSAJE_ALERTA = ".//*[@id='Coinsurance_ExtPopup:_msgs']/div";
    private static final String LISTA_TIPO_BENEFICIARIO_UNO = "//div[contains(.,'Seguros Generales Suramericana S.A.') and contains(@class,'x-grid-cell-inner')]";
    private static final String LISTA_TIPO_BENEFICIARIO = "//div[contains(.,'<ninguno>') and contains(@class,'x-grid-cell-inner')]";
    private static final String BTNELEGIRPRODUCTO = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV:";
    private static final String LBL_MENU_LATERAL_INICIAL = ".//td[contains(@id,'SubmissionWizard') and contains(.,'";
    private static final String LBL_MENU_LATERAL_FINAL = "')]";
    private static final String LBL_INFORMACION_POLIZA = ".//*[contains(@id,'SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV')]/td/div";
    private static final String LINK_MENU_LATERAL_INICIAL = ".//a[contains(@id,'SubmissionWizard') and contains(.,'";
    private static final String LINK_MENU_LATERAL_FINAL = "')]";
    private static final String ASEGURADORA = "ASEGURADORA";
    private boolean esVisible;
    public static final String MSJVALIDARVALORES = "No estan correctos los valores:";


    public OpcionesInformacionPolizaMrcPage(WebDriver driver) {
        super(driver);
    }

    public void ingresaAgente() {
        waitInfoPoliza(lblNuevaCotizacion);
        txtNomAgente.clear();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        waitInfoPoliza(lblTabla);
    }

    public void ingresarFechaVigencia(String fechaInicioVigencia) {
        waitInfoPoliza(lblInformaPoliza);
        txtFechaVigencia.clear();
        txtFechaVigencia.sendKeys(fechaInicioVigencia);
        actions.sendKeys(Keys.ENTER).build().perform();
    }

    public void ingresarTomadorAdicional(String cedula) {
        waitUntil(WAIT_TIME_2000);
        btnAgregar.waitUntilPresent().click();
        itemDirectorio.waitUntilVisible().waitUntilClickable().click();
        waitInfoPoliza(lblBuscarDirectorio);
        itemTipoDocumento.clear();
        fluent().await().atMost(WAIT_TIME_200, TimeUnit.MILLISECONDS);
        itemTipoDocumento.sendKeys("CEDULA DE CIUDADANIA");
        itemTipoDocumento.sendKeys(Keys.ENTER);
        waitInfoPoliza(lblPrimerNombre);
        txtNumDocumento.sendKeys(cedula);
        btnBuscar.waitUntilVisible().waitUntilClickable().click();
        waitInfoPoliza(btnSelecciona);
        btnSelecciona.waitUntilVisible().waitUntilClickable().click();
        waitInfoPoliza(lblInformaPoliza);
        btnSiguiente.waitUntilVisible().waitUntilClickable().click();
    }

    public void seleccionBotonSiguiente() {
        btnSiguiente.waitUntilVisible().waitUntilClickable().click();
    }

    public void seleccionBotonSiguienteenCambioDePoliza() {
        btnNoReaseguroEspecial.click();
        waitUntil(WAIT_TIME_5000);
        btnSiguienteCambioDePoliza.click();
        waitUntil(WAIT_TIME_5000);
        waitForTextToAppear("Edificios y ubicaciones");
    }

    public void seleccionBotonSiguienteenRenovacionDePoliza() {
        waitFor(WAIT_TIME_7).second();
        btnSiguienteRenovacionDePoliza.click();
    }

    public void seleccionaRiesgoAceptado() {
        waitInfoPoliza(lblInformaPoliza);
        radioBotReaseguroEspecial.click();
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(checkiReaseguroAceptado).waitUntilVisible();
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
        waitUntil(WAIT_TIME_1000);
        String xpathBotonElegirProducto = BTNELEGIRPRODUCTO + this.encontrarProducto(nomProducto).toString() + ":addSubmission']";
        WebElementFacade botonElegirProducto = esperarElemento(xpathBotonElegirProducto);
        botonElegirProducto.waitUntilEnabled();
        botonElegirProducto.click();
        if ("Multiriesgo corporativo".equals(nomProducto)) {
            setImplicitTimeout(WAIT_TIME_2, TimeUnit.SECONDS);
            if (botonAceptarPopup.isVisible()) {
                botonAceptarPopup.click();
                botonAceptarPopup.waitUntilNotVisible();
            }
            resetImplicitTimeout();
        }
    }

    public void seleccionarOpcionCotizar() {
        botonCotizar.waitUntilPresent();
        clickElement(botonCotizar);
        waitForTextToAppear("Cotización");
    }

    public Integer encontrarProducto(String producto) {
        withTimeoutOf(WAIT_TIME_15, TimeUnit.SECONDS).waitFor(tablaProductos).waitUntilVisible();
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
        clickElement(menuItemInformacionDePoliza);
        waitForTextToAppear("Información de póliza");
    }

    public void agregarUnCoaseguro(String tipoCo, ExamplesTable tablaaseguradoras) {
        waitFor(WAIT_TIME_3).second();
        clickElement(menuItemInformacionDePoliza);
        divMensaje.waitUntilPresent();
        menuItemInformacionDePoliza.click();
        agregarCoaseguro.waitUntilPresent().click();
        seleccionarElTipoDeCoaseguro(tipoCo);
        agregoLasAseguradoras(tablaaseguradoras);
    }


    public void seleccionarElTipoDeCoaseguro(String tipoCoaseguro) {
        waitUntil(WAIT_TIME_1000);
        if ("Cedido".equals(tipoCoaseguro)) {
            if ("0% 0%".equals($(radioButtonCedido).getCssValue("background-position"))) {
                waitUntil(WAIT_TIME_2000);
                radioButtonCedido.click();
            }
        } else {
            waitUntil(WAIT_TIME_2000);
            radioButtonAceptado.click();
        }

    }

    public void agregoLasAseguradoras(ExamplesTable tablaaseguradoras) {

        Map<String, String> asegurados;
        Actions act = new Actions(getDriver());
        for (int i = 0; i < tablaaseguradoras.getRowCount(); i++) {
            asegurados = tablaaseguradoras.getRows().get(i);
            if (i == 0) {
                if (!"Seguros Generales Suramericana S.A.".equals(asegurados.get(ASEGURADORA))) {
                    desplegarListaTipoAsegurado(LISTA_TIPO_BENEFICIARIO_UNO, asegurados.get(ASEGURADORA));
                }
                waitFor(WAIT_TIME_2).second();
                clickElement(findBy(LISTA_TIPO_BENEFICIARIO_UNO));
                waitFor(WAIT_TIME_2).second();
                act.sendKeys(Keys.TAB).build().perform();
                act.sendKeys(Keys.ENTER).build().perform();
                act.sendKeys(asegurados.get("PARTICIPACION")).build().perform();
            } else {
                desplegarListaTipoAsegurado(LISTA_TIPO_BENEFICIARIO, asegurados.get(ASEGURADORA));
                act.sendKeys(Keys.TAB).build().perform();
                act.sendKeys(Keys.ENTER).build().perform();
                act.sendKeys(asegurados.get("PARTICIPACION")).build().perform();
                act.sendKeys(Keys.TAB).build().perform();
            }
        }
    }

    public void validarMensajesCoaseguros(ExamplesTable mensajesEsperados) {
        List<String> mensajesWSList = new ArrayList<>(obtenerMensajesDeTrabajoCoaseguro());
        for (Map<String, String> mensajes : mensajesEsperados.getRows()) {
            String mensaje = mensajes.get("MENSAJES_WORKSPACE");
            MatcherAssert.assertThat(mensajesWSList, AssertUtil.hasItemContainsString(mensaje));
        }
    }

    public List<String> obtenerMensajesDeTrabajoCoaseguro() {
        List<String> mensajesEspacioDeTrabajo = new ArrayList<>();
        for (WebElementFacade mensaje : findAll(LBL_MENSAJE_ALERTA)) {
            mensajesEspacioDeTrabajo.add(mensaje.getText());
        }
        return mensajesEspacioDeTrabajo;
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
        waitFor(WAIT_TIME_3);
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
        valor = concatenarElementoDiferente("CEDULA DE CIUDADANIA", inputTipoDocumento.getText(), "Tipo cedula|", valor);
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
        setImplicitTimeout(WAIT_TIME_3, TimeUnit.SECONDS);
        StringBuilder notPresent = new StringBuilder(MSJVALIDARELEMENTOS);
        if (!"Compañía cedente".equals(lblTomador.getText())) {
            notPresent.append("salida errada: Compañía cedente|");
        }
        if (tblTomadoresAdicionales.isPresent()) {
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
            if (estadouno.contains("Visible") && menus.get("OPCIONES_MENU") != null) {
                String mensaje = menus.get("OPCIONES_MENU");
                xpathMenu = pathinicial + mensaje + pathfinal;
                elementoMenu = findBy(xpathMenu);
                MatcherAssert.assertThat("Alguno de los campos no es visible", elementoMenu.isVisible());
            } else if (estadodos.contains("No visible")) {
                String mensaje = menus.get("OPCIONES_MENU_NO_VISIBLES");
                xpathMenu = pathinicial + mensaje + pathfinal;
                elementoMenu = findBy(xpathMenu);
                setImplicitTimeout(WAIT_TIME_1, TimeUnit.SECONDS);
                MatcherAssert.assertThat("Alguno de los campos es visible", !elementoMenu.isVisible());
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

    public void validarCamposMenuLateral(String estadouno, String estadodos, ExamplesTable menusesperados) {
        validarCampos(estadouno, estadodos, menusesperados, LBL_MENU_LATERAL_INICIAL, LBL_MENU_LATERAL_FINAL);
    }

    public void validarCamposInformacionPoliza(String estadouno, String estadodos, ExamplesTable menusesperados) {
        validarCampos(estadouno, estadodos, menusesperados, LINK_MENU_LATERAL_INICIAL, LINK_MENU_LATERAL_FINAL);
    }

    public void seleccionarTipoNoReaseguro() {
        btnNoReaseguroEspecial.waitUntilPresent().click();
        waitUntil(WAIT_TIME_5000);
    }

    public void validaFormularioDescripDireccion() {
        if (esVisible) {
            MatcherAssert.assertThat("el campo Descripcion direccion no debe estar presente", !lblDescripDireccion.isPresent());
        } else {
            MatcherAssert.assertThat("el campo Descripcion direccion debe estar presente al ingresar direccion", lblDescripDireccion.isPresent());
        }
    }

    public void waitInfoPoliza(WebElementFacade webElementFacade) {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(webElementFacade).shouldBePresent();
    }

    public void darClicEnAceptarDeCoaseuguro() {
        botonAceptarCoaseguro.click();
    }


    public void validarcamposNoEditablesEnInformacionDePoliza() {
        validarCamposNoEditables(LBL_INFORMACION_POLIZA);
    }
}
