package com.sura.guidewire.policycenter.util.menu.opciones.cuenta;


import com.sura.guidewire.policycenter.pages.colectivas.NuevaPolizaPage;
import com.sura.guidewire.policycenter.util.AssertUtil;
import com.sura.guidewire.policycenter.util.PageUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
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


public class OpcionesInformacionPolizaMrcPage extends PageUtil {

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
    WebElementFacade btnSiguinete;
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
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:InsuredInputSet:RIPolicyFieldsInputSet:reaseguroEspecial_true-inputEl']")
    WebElementFacade radioBotReaseguroEspecial;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:DocumentType-labelEl']")
    WebElementFacade lblTipoDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:OfficialIDDV_Input-labelEl']")
    WebElementFacade lblNumeroDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Phone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
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
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:InsuredInputSet:reaseguroEspecial_false-inputEl']")
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
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:InsuredInputSet:RIPolicyFieldsInputSet:Accepted-inputEl']")
    WebElementFacade checkiReaseguroAceptado;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:SalesOrganizationType-inputEl']")
    private WebElementFacade listaOrganizacion;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:ChannelType-inputEl']")
    private WebElementFacade listaCanal;
    //@FindBy(xpath =".//a[contains(.,'Agregar coaseguro')]")
    @FindBy(xpath = "//a[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:addConinsuranceLink']")
    private WebElementFacade agregarCoaseguro;
    @FindBy(xpath = "//input[@id='Coinsurance_ExtPopup:CoinsuranceInputSet:coinsuranceTypeQuestion_true-inputEl']")
    private WebElementFacade radioButtonAceptado;
    @FindBy(xpath = "//input[@id='Coinsurance_ExtPopup:CoinsuranceInputSet:coinsuranceTypeQuestion_false-inputEl']")
    private WebElementFacade radioButtonCedido;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']")
    private WebElementFacade tablaAseguradoras;
    @FindBy(xpath = "//span[@id='Coinsurance_ExtPopup:Update-btnInnerEl']")
    private WebElementFacade bttonAceptarCoaseguro;


    private static String lblMensajesAlerta = ".//*[@id='Coinsurance_ExtPopup:_msgs']/div";
    private static String LISTA_TIPO_BENEFICIARIO_UNO = "//div[contains(.,'Seguros Generales Suramericana S.A.') and contains(@class,'x-grid-cell-inner')]";
    private static String LISTA_TIPO_BENEFICIARIO = "//div[contains(.,'<ninguno>') and contains(@class,'x-grid-cell-inner')]";
    private static final String MSJVALIDARELEMENTOS = "No estan presentes los elementos:";
    private static String BTNELEGIRPRODUCTO = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV:";
    private boolean esVisible;


    NuevaPolizaPage nuevaPolizaPage;

    Actions actions = new Actions(getDriver());

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
        btnAgregar.waitUntilVisible().waitUntilClickable().click();
        itemDirectorio.waitUntilVisible().waitUntilClickable().click();
        waitInfoPoliza(lblBuscarDirectorio);
        itemTipoDocumento.clear();
        fluent().await().atMost(200,TimeUnit.MILLISECONDS);
        itemTipoDocumento.sendKeys("CEDULA DE CIUDADANIA");
        itemTipoDocumento.sendKeys(Keys.ENTER);
        waitInfoPoliza(lblPrimerNombre);
        txtNumDocumento.sendKeys(cedula);
        btnBuscar.waitUntilVisible().waitUntilClickable().click();
        waitInfoPoliza(btnSelecciona);
        btnSelecciona.waitUntilVisible().waitUntilClickable().click();
        waitInfoPoliza(lblInformaPoliza);
        btnSiguinete.waitUntilVisible().waitUntilClickable().click();
        //waitInfoPoliza(mensajePantalla);
    }

    public void seleccionBotonSiguiente()
    {
        btnSiguinete.click();
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
        return  esVisible;
    }

    public void  seleccionarProducto(String nomProducto) {
        waitUntil(WAIT_TIME_1000);
        String xpathBotonElegirProducto = BTNELEGIRPRODUCTO + this.encontrarProducto(nomProducto).toString() + ":addSubmission']";
        WebElementFacade botonElegirProducto = esperarElemento(xpathBotonElegirProducto);
        botonElegirProducto.waitUntilEnabled();
        botonElegirProducto.click();
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

    public void seleccionarOrganizacion(String organizacion) {
        listaOrganizacion.waitUntilPresent();
        listaOrganizacion.click();
        listaOrganizacion.sendKeys(organizacion);
        listaOrganizacion.sendKeys(Keys.ENTER);

    }

    public void seleccionarCanal(String canal) {
        waitFor(WAIT_TIME_3).second();
        listaCanal.click();
        listaCanal.sendKeys(canal);
        listaCanal.sendKeys(Keys.ENTER);
        waitFor(WAIT_TIME_1).second();

    }
    public void agregarUnCoaseguro(String tipoCo, ExamplesTable tablaaseguradoras){
        waitFor(WAIT_TIME_3).second();
        agregarCoaseguro.click();
        seleccionarElTipoDeCoaseguro(tipoCo);
        agregoLasAseguradoras(tablaaseguradoras);



    }
    public void seleccionarElTipoDeCoaseguro(String tipoCoaseguro) {
        waitUntil(WAIT_TIME_1000);
        if ("Cedido".equals(tipoCoaseguro)) {
            if ("0% 0%".equals($(radioButtonCedido).getCssValue("background-position"))) {
                waitUntil(WAIT_TIME_1500);
                radioButtonCedido.click();
            }
        } else {
            if (!"0% 0%".equals($(radioButtonAceptado).getCssValue("background-position"))) {
                waitUntil(WAIT_TIME_1500);
                radioButtonAceptado.click();
            }
        }
    }
    public void agregoLasAseguradoras(ExamplesTable tablaaseguradoras){

        Map<String, String> asegurados;
        Actions act = new Actions(getDriver());
        for (int i = 0; i < tablaaseguradoras.getRowCount(); i++) {
            asegurados = tablaaseguradoras.getRows().get(i);
            if(i==0){
                if(!asegurados.get("ASEGURADORA").equals("Seguros Generales Suramericana S.A.")) {
                    desplegarListaTipoAsegurado(LISTA_TIPO_BENEFICIARIO_UNO, asegurados.get("ASEGURADORA"));
                }
                findBy(LISTA_TIPO_BENEFICIARIO_UNO).click();
                act.sendKeys(Keys.TAB).build().perform();
                act.sendKeys(Keys.ENTER).build().perform();
                act.sendKeys(asegurados.get("PARTICIPACION")).build().perform();
            }else {
                desplegarListaTipoAsegurado(LISTA_TIPO_BENEFICIARIO,asegurados.get("ASEGURADORA"));
                act.sendKeys(Keys.TAB).build().perform();
                act.sendKeys(Keys.ENTER).build().perform();
                act.sendKeys(asegurados.get("PARTICIPACION")).build().perform();
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

    public List<String> obtenerMensajesDeTrabajoCoaseguro(){
        List<String> mensajesEspacioDeTrabajo = new ArrayList<>();
        for (WebElementFacade mensaje : findAll(lblMensajesAlerta)){
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

    public void desplegarListaTipoAsegurado(String XPathAsegurado,String elemento){
        WebElementFacade listaTipoAsegurado = findBy(XPathAsegurado);
        listaTipoAsegurado.click();
        waitFor(WAIT_TIME_3);
        seleccionarElementoDeLaLista(elemento);
    }

    public void seleccionarElementoDeLaLista(String elementoLista) {
        List<WebElementFacade> listaElementosCotizacion = findAll(By.xpath(".//li[@role='option']"));
        if (!listaElementosCotizacion.isEmpty()) {
            for (WebElementFacade listaElemento : listaElementosCotizacion) {
                if (listaElemento.containsText(elementoLista)) {
                    listaElemento.click();
                    break;
                }
            }
        }
    }




    public void validaCamposPoliza() {
        StringBuilder notPresent = new StringBuilder(MSJVALIDARELEMENTOS);
        if (!lblTipoDocumento.isPresent()) {
            notPresent.append("Label errado: Tipo documento|");
        }
        if (!lblNumeroDocumento.isPresent()) {
            notPresent.append("Label errado: Numero documento|");
        }
        if (!lblNumeroTelefono.isPresent()) {
            notPresent.append("label errado: Teléfono|");
        }
        if (!lblDireccion.isPresent()) {
            notPresent.append("label errado: Dirección de la poliza|");
        }
        if ("".equals(inputTipoDocumento.getText())) {
            notPresent.append("salida errada: Tipo cedula|");
        }
        if ("".equals(inputNumeroDocumento.getText())) {
            notPresent.append("salida errada: Numero cedula|");
        }
        if ("".equals(inputNumeroTelefono.getText())) {
            notPresent.append("salida errada: Telefono|");
        }
        if ("".equals(inputDireccion.getText())) {
            notPresent.append("salida errada: Direccion|");
        }
        if (inputReaseguroEspecial.isVisible()) {
            notPresent.append("radio boton: No esta present|");
        }
        if (!"Fecha inicio de vigencia".equals(lblFechaVigencia.getText())) {
            notPresent.append("salida errada: Fecha inicio de vigencia|");
        }
        if (!"Fecha fin de vigencia".equals(lblFechaExpiracion.getText())) {
            notPresent.append("salida errada: Fecha fin de vigencia|");
        }
        if (!"Fecha de expedición".equals(lblFechaescrita.getText())) {
            notPresent.append("salida errada: Fecha de expedición|");
        }
        if (!"Descripción de la dirección".equals(lblDescripcionDir.getText())) {
            notPresent.append("salida errada: Descripcion direccion|");
        }
        String res = notPresent.toString();
        if (MSJVALIDARELEMENTOS.equals(res)) {
            res = notPresent.toString().substring(0, notPresent.toString().length() - 1);
        }
        MatcherAssert.assertThat(res, "No estan presentes los elementos".equals(res));
    }

    public void validaMensajeEnPantalla(String mensaje) {
        waitInfoPoliza(mensajePantalla);
        MatcherAssert.assertThat(mensajePantalla.getText(), Matchers.containsString(mensaje));
    }

    public void validaReaseguro() {
        setImplicitTimeout(WAIT_TIME_3, TimeUnit.SECONDS);
        StringBuilder notPresent = new StringBuilder(MSJVALIDARELEMENTOS);
        if (!"Compañía cedente".equals(lblTomador.getText()))
            notPresent.append("salida errada: Compañía cedente|");
        if (tblTomadoresAdicionales.isPresent())
            notPresent.append("los tomadores adicionales no pueden estar presentes|");
        String res = notPresent.toString();
        if (MSJVALIDARELEMENTOS.equals(res)) {
            res = notPresent.toString().substring(0, notPresent.toString().length() - 1);
        }
        resetImplicitTimeout();
        MatcherAssert.assertThat(res, "No estan presentes los elementos".equals(res));
    }

    public void validaFormularioDescripDireccion() {
        if (esVisible) {
            MatcherAssert.assertThat("el campo Descripcion direccion no debe estar presente", !lblDescripDireccion.isPresent());
        }else{
            MatcherAssert.assertThat("el campo Descripcion direccion debe estar presente al ingresar direccion", lblDescripDireccion.isPresent());
        }
    }
    // TODO: 30/06/2016 Metodo wait para implementar generico
    public void waitInfoPoliza(WebElementFacade webElementFacade) {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(webElementFacade).shouldBePresent();
    }


}
