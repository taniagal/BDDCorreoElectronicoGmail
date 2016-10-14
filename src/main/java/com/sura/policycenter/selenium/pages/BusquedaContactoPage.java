package com.sura.policycenter.selenium.pages;


import com.sura.commons.selenium.Commons;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BusquedaContactoPage extends Commons {

    @FindBy(xpath = ".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade txtNombre;
    @FindBy(xpath = ".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    private WebElementFacade txtApellido;
    @FindBy(xpath = ".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:MiddleName-inputEl']")
    private WebElementFacade txtSegNombre;
    @FindBy(xpath = ".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:Particle-inputEl']")
    private WebElementFacade txtSegApellido;
    @FindBy(xpath = ".//*[@id='ContactSearch:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade botonBuscar;
    @FindBy(xpath = "//tr[3]/td/table/tbody/tr/td[2]/input\n")
    private WebElementFacade txtRazonSocial;
    @FindBy(xpath = ".//*[@id='ContactSearch:ContactSearchScreen:ContactSearchResultsLV:_RecordCount']")
    private WebElementFacade msjSinRegistros;
    @FindBy(xpath = ".//*[@id='ContactSearch:ContactSearchScreen:SearchWarningMessagePanelSet:SearchWarningMessage']")
    private WebElementFacade msjSinCriterios;
    @FindBy(xpath = ".//*[@id='ContactSearch:ContactSearchScreen:DocumentType-inputEl']")
    private WebElementFacade txtTipoDoc;
    @FindBy(xpath = ".//*[@id='ContactSearch:ContactSearchScreen:identificationNumber-inputEl']")
    private WebElementFacade txtNumDoc;
    @FindBy(xpath = ".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalContactNameInputSet:CommercialName-inputEl']")
    private WebElementFacade txtNombreComercial;
    @FindBy(xpath = ".//*[@id='ContactSearch:ContactSearchScreen:ContactSearchResultsLV:0:DocumentType']")
    private WebElementFacade selectContact;
    @FindBy(xpath = "//div[3]/div/table")
    private WebElementFacade table;
    @FindBy(xpath = ".//div/div/div[2]/div/span")
    private WebElementFacade lblTipoId;
    @FindBy(xpath = ".//div/div/div[3]/div/span")
    private WebElementFacade lblNumId;
    @FindBy(xpath = ".//div[4]/div/span")
    private WebElementFacade lblPrimNombre;
    @FindBy(xpath = ".//div/div/div[5]/div/span")
    private WebElementFacade lblSegNombre;
    @FindBy(xpath = ".//div[6]/div/span")
    private WebElementFacade lblPriApellido;
    @FindBy(xpath = ".//div[7]/div/span")
    private WebElementFacade lblSegApellido;
    @FindBy(xpath = ".//div[8]/div/span")
    private WebElementFacade lblNomComercial;
    @FindBy(xpath = ".//div[9]/div/span")
    private WebElementFacade lblRazonSocial;
    @FindBy(xpath = ".//div[10]/div/span")
    private WebElementFacade lblDireccion;
    @FindBy(xpath = ".//div[11]/div/span")
    private WebElementFacade lblTelefono;
    @FindBy(xpath = ".//div[12]/div/span")
    private WebElementFacade lblEmail;
    @FindBy(xpath = ".//div[13]/div/span")
    private WebElementFacade lblExterna;
    @FindBy(xpath = ".//td/div/table/tbody/tr/td/div/table/tbody/tr[3]/td", timeoutInSeconds = "10")
    private WebElementFacade divNombre;
    @FindBy(xpath = ".//*[@id='ContactSearch:ContactSearchScreen:ContactSearchResultsLV:0:DocumentType']")
    private WebElementFacade primerElementoTabla;
    @FindBy(xpath = "//td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
    private WebElementFacade botonTipoDoc;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:DocumentType-inputEl']")
    private WebElementFacade txtTipoDocDirectorioCotizacion;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:identificationNumber-inputEl']")
    private WebElementFacade txtNumDocDirectorioCotizacion;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscarDirectorioCotizacion;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab-btnInnerEl']")
    private WebElementFacade menuBuscar;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ContactSearch']/div/span")
    private WebElementFacade menuBuscarContacto;

    private static final String BUSQUEDADECONTACTOS = "Búsqueda de contactos";
    private static final String LONGITUD_VALIDA = "Longitud válida";
    private static final String XPATH_LI_CONTAINS = ".//li[contains(.,'";

    public BusquedaContactoPage(WebDriver driver) {
        super(driver);
    }

    public void irABuscarContacto() {
        withTimeoutOf(30,TimeUnit.SECONDS).waitFor(menuBuscar).click();
        waitForTextToAppear("Buscar pólizas",5000);
        withTimeoutOf(30,TimeUnit.SECONDS).waitFor(menuBuscarContacto).click();
        waitForTextToAppear(BUSQUEDADECONTACTOS,5000);
    }

    public void consultarPersonaJuridaPorRazonSocial(String tipoDoc, String razonSocial) {
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(txtTipoDoc).shouldBeVisible();
        txtTipoDoc.type(tipoDoc);
        txtTipoDoc.sendKeys(Keys.ENTER);
        waitFor(txtRazonSocial).waitUntilVisible();
        txtRazonSocial.type(razonSocial);
        withTimeoutOf(30,TimeUnit.SECONDS).waitFor(botonBuscar).waitUntilEnabled();
        botonBuscar.click();
    }

    public void validarInformacionTipoId() {
        String msjSinReg = "No hay datos para mostrar";
        waitForTextToAppear(msjSinReg);
        MatcherAssert.assertThat(msjSinRegistros.getText(), Matchers.is(Matchers.equalTo(msjSinReg)));
    }

    public void validarMensaje(String msjVal) {
        waitForTextToAppear(msjVal);
        waitFor(msjSinCriterios).waitUntilVisible();
        MatcherAssert.assertThat(msjSinCriterios.getText(), Matchers.is(Matchers.equalTo(msjVal)));
    }

    public void consultarContactoNumDoc(String tipoDoc, String numDoc) {
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(txtTipoDoc).shouldBeVisible();
        txtTipoDoc.clear();
        txtTipoDoc.sendKeys(tipoDoc);
        txtTipoDoc.sendKeys(Keys.ENTER);
        txtRazonSocial.waitUntilVisible();
        txtNumDoc.type(numDoc);
        withTimeoutOf(30,TimeUnit.SECONDS).waitFor(botonBuscar).waitUntilEnabled();
        botonBuscar.click();
    }

    public void consultarContactoTipoDoc(String tipoDoc) {
        waitForTextToAppear(BUSQUEDADECONTACTOS);
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(txtTipoDoc).shouldBeVisible();
        txtTipoDoc.type(tipoDoc);
        withTimeoutOf(30,TimeUnit.SECONDS).waitFor(botonBuscar).waitUntilEnabled();
        botonBuscar.click();
    }

    public void verInfoPersonaNatural(String filtro1, String filtro2) {
        String valido = "Información persona natural no válida";
        waitFor(primerElementoTabla).waitUntilVisible();
        String primerElemento = primerElementoTabla.getText();
        waitForTextToAppear(primerElemento);
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.get(3).getText().equals(filtro1) && cells.get(5).getText().equals(filtro2)) {
                valido = "Información persona natural válida";
            }
        }
        MatcherAssert.assertThat("Información persona natural válida", Is.is(Matchers.equalTo(valido)));
    }

    public void consultarContactoTipoNumDoc(String tipoDoc, String numDoc) {
        waitForTextToAppear(BUSQUEDADECONTACTOS);
        if (!"<ninguno>".equals(tipoDoc)) {
            waitFor(botonTipoDoc).waitUntilVisible();
            botonTipoDoc.click();
            WebElementFacade cbxTipoDoc = findBy(XPATH_LI_CONTAINS + tipoDoc + "')]");
            waitForTextToAppear(tipoDoc);
            cbxTipoDoc.click();
            waitUntil(2000);
            divNombre.waitUntilVisible();
            txtNumDoc.type(numDoc);
            botonBuscar.click();
        } else {
            txtNumDoc.type(numDoc);
            botonBuscar.click();
            waitForTextToAppear("La búsqueda no devolvió resultados.");
        }
    }

    public void consultarContactoPorNombresYApellidos(String tipoDoc, String primerNombre,
                                                      String segundoNombre, String primerApellido,
                                                      String segundoApellido) {
        waitForTextToAppear(BUSQUEDADECONTACTOS);
        waitFor(botonTipoDoc).waitUntilVisible();
        botonTipoDoc.click();
        WebElementFacade cbxTipoDoc = findBy(XPATH_LI_CONTAINS + tipoDoc + "')]");
        waitForTextToAppear(tipoDoc);
        cbxTipoDoc.click();
        waitUntil(1500);
        if (!"<ninguno>".equals(tipoDoc)) {
            String nombreElemento = divNombre.getText();
            waitForTextToAppear(nombreElemento);
            waitFor(txtNombre).waitUntilVisible();
            txtNombre.type(primerNombre);
            txtSegNombre.type(segundoNombre);
            waitFor(txtApellido).waitUntilVisible();
            txtApellido.type(primerApellido);
            txtSegApellido.type(segundoApellido);
            withTimeoutOf(30,TimeUnit.SECONDS).waitFor(botonBuscar).waitUntilEnabled();
            botonBuscar.click();
        } else {
            withTimeoutOf(30,TimeUnit.SECONDS).waitFor(botonBuscar).waitUntilEnabled();
            botonBuscar.click();
            waitForTextToAppear("La búsqueda no devolvió resultados");
        }
    }

    public void consultarContactoNombreComercial(String tipoDoc, String nombreComercial) {
        waitForTextToAppear(BUSQUEDADECONTACTOS);
        waitFor(txtTipoDoc).waitUntilVisible();
        txtTipoDoc.type(tipoDoc);
        txtTipoDoc.sendKeys(Keys.ENTER);
        waitFor(txtNombreComercial).waitUntilVisible();
        txtNombreComercial.type(nombreComercial);
        withTimeoutOf(30,TimeUnit.SECONDS).waitFor(botonBuscar).waitUntilEnabled();
        botonBuscar.click();
    }

    public void buscarContacto(String tipoContacto, String nombre, String apellido, String numero) {
        waitForTextToAppear(BUSQUEDADECONTACTOS);
        waitFor(txtTipoDoc).shouldBeVisible();
        txtTipoDoc.click();
        WebElementFacade cbxTipoDoc = findBy(XPATH_LI_CONTAINS + tipoContacto + "')]");
        waitFor(cbxTipoDoc).shouldBeVisible();
        cbxTipoDoc.click();
        int parada = Integer.parseInt(numero);
        if (("CEDULA DE CIUDADANIA").equals(tipoContacto)) {
            txtNombre.type(nombre);
            txtApellido.type(apellido);
        } else {
            txtRazonSocial.type(nombre);
        }
        withTimeoutOf(30,TimeUnit.SECONDS).waitFor(botonBuscar).waitUntilEnabled();
        botonBuscar.click();

        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        WebElement selectedContact1 = null;

        for (int i = 0; i < parada && i < allRows.size(); i++) {
            WebElement row = allRows.get(i);
            List<WebElement> cells = row.findElements(By.tagName("td"));
            selectedContact1 = cells.get(1);
        }
        if (selectedContact1 != null) {
            selectedContact1.click();
        }
    }

    @SuppressWarnings("SameParameterValue")
    public void validarLongitudPersonaNatural(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        String valido = "Longitud no válida";
        if (primerNombre.length() < 2 || segundoNombre.length() < 2 || primerApellido.length() < 2 || segundoApellido.length() < 2) {
            valido = LONGITUD_VALIDA;
        }
        MatcherAssert.assertThat(LONGITUD_VALIDA, Is.is(Matchers.equalTo(valido)));
    }

    public void validarLongitudPersonaJuridica(String razonSocial, String nombreComercial) {
        String valido = "Longitud no válida";
        if (razonSocial.length() < 4 || nombreComercial.length() < 4) {
            valido = LONGITUD_VALIDA;
        }
        MatcherAssert.assertThat(LONGITUD_VALIDA, Is.is(Matchers.equalTo(valido)));
    }

    public void validarLabelsPersonaNatural(Map<String, String> labelsContacto) {
        waitUntil(2000);
        MatcherAssert.assertThat(lblTipoId.getText(), Matchers.is(Matchers.equalTo(labelsContacto.get("tipoId"))));
        MatcherAssert.assertThat(lblNumId.getText(), Matchers.is(Matchers.equalTo(labelsContacto.get("numId"))));
        MatcherAssert.assertThat(lblPrimNombre.getText(), Matchers.is(Matchers.equalTo(labelsContacto.get("priNombre"))));
        MatcherAssert.assertThat(lblSegNombre.getText(), Matchers.is(Matchers.equalTo(labelsContacto.get("segNombre"))));
        MatcherAssert.assertThat(lblPriApellido.getText(), Matchers.is(Matchers.equalTo(labelsContacto.get("priApellido"))));
        MatcherAssert.assertThat(lblSegApellido.getText(), Matchers.is(Matchers.equalTo(labelsContacto.get("segApellido"))));
        MatcherAssert.assertThat(lblDireccion.getText(), Matchers.is(Matchers.equalTo(labelsContacto.get("direccion"))));
        MatcherAssert.assertThat(lblTelefono.getText(), Matchers.is(Matchers.equalTo(labelsContacto.get("telefono"))));
        MatcherAssert.assertThat(lblEmail.getText(), Matchers.is(Matchers.equalTo(labelsContacto.get("email"))));
        MatcherAssert.assertThat(lblExterna.getText(), Matchers.is(Matchers.equalTo(labelsContacto.get("externa"))));
    }

    public void validarLabelsPersonaJuridica(Map<String, String> labelsContacto) {
        waitUntil(2000);
        MatcherAssert.assertThat(lblTipoId.getText(), Matchers.is(Matchers.equalTo(labelsContacto.get("tipoId"))));
        MatcherAssert.assertThat(lblNumId.getText(), Matchers.is(Matchers.equalTo(labelsContacto.get("numId"))));
        MatcherAssert.assertThat(lblNomComercial.getText(), Matchers.is(Matchers.equalTo(labelsContacto.get("nomComercial"))));
        MatcherAssert.assertThat(lblRazonSocial.getText(), Matchers.is(Matchers.equalTo(labelsContacto.get("razonSocial"))));
        MatcherAssert.assertThat(lblDireccion.getText(), Matchers.is(Matchers.equalTo(labelsContacto.get("direccion"))));
        MatcherAssert.assertThat(lblTelefono.getText(), Matchers.is(Matchers.equalTo(labelsContacto.get("telefono"))));
        MatcherAssert.assertThat(lblEmail.getText(), Matchers.is(Matchers.equalTo(labelsContacto.get("email"))));
        MatcherAssert.assertThat(lblExterna.getText(), Matchers.is(Matchers.equalTo(labelsContacto.get("externa"))));
    }

    public void seleccionarContacto() {
        waitFor(selectContact).waitUntilVisible();
        selectContact.click();
    }

    public void consultarContactoPorTipoDocumentoCotizacion(String tipoId, String numeroId) {
        waitFor(txtTipoDocDirectorioCotizacion).waitUntilVisible();
        txtTipoDocDirectorioCotizacion.clear();
        txtTipoDocDirectorioCotizacion.sendKeys(tipoId);
        txtTipoDocDirectorioCotizacion.sendKeys(Keys.ENTER);
        waitUntil(2000);
        txtNumDocDirectorioCotizacion.sendKeys(numeroId);
        btnBuscarDirectorioCotizacion.click();
        waitForWithRefresh();
    }
}