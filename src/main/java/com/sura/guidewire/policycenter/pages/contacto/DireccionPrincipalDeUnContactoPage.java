package com.sura.guidewire.policycenter.pages.contacto;


import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.List;
import java.util.Map;

import net.serenitybdd.core.pages.WebElementFacade;

import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class DireccionPrincipalDeUnContactoPage extends PageUtil {
    public static final String MSJVALIDARVALORES = "No estan correctos los valores:";
    public static final String MSJVALIDARELEMENTOS = "No estan presentes los elementos:";
    DetallesContactoPage contactoPage = new DetallesContactoPage(getDriver());
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesCardTab']")
    private WebElementFacade botonDirecciones;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade campoTxtDireccion;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade comboBoxDepartamento;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Sura_City-inputEl']")
    private WebElementFacade comboBoxCiudad;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressType-inputEl']")
    private WebElementFacade comboBoxTipoDireccion;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']")
    private WebElementFacade comboBoxPais;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-labelEl']")
    private WebElementFacade labelPais;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-labelEl']")
    private WebElementFacade labelDepartamento;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Sura_City-labelEl']")
    private WebElementFacade labelCiudad;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-labelEl']")
    private WebElementFacade labelDireccion;
    @FindBy(xpath = " .//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressType-labelEl']")
    private WebElementFacade labelTipoDireccion;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:Description-labelEl']")
    private WebElementFacade labelDescripcionDireccion;

    public DireccionPrincipalDeUnContactoPage(WebDriver driver) {
        super(driver);
    }


    public void irADirecciones() {
        esperarHasta(TIEMPO_1000);
        botonDirecciones.click();
        contactoPage.botonAgregar.waitUntilPresent().click();
    }

    public void agregarDireccion(ExamplesTable datos) {
        Map<String, String> dato = datos.getRow(0);
        esperarHasta(TIEMPO_2000);
        campoTxtDireccion.sendKeys(dato.get("direccion"));
        seleccionarItem(comboBoxDepartamento, dato.get("departamento"));
        esperarPorValor(comboBoxDepartamento, dato.get("departamento"));
        seleccionarItem(comboBoxCiudad, dato.get("ciudad"));
        esperarPorValor(comboBoxCiudad, dato.get("ciudad"));
        seleccionarItem(comboBoxTipoDireccion, dato.get("tipo_direccion"));
        esperarPorValor(comboBoxTipoDireccion, dato.get("tipo_direccion"));
    }


    public void validarCampos() {
        comboBoxPais.waitUntilPresent();
        StringBuilder valor = new StringBuilder(MSJVALIDARVALORES);
        valor = concatenarElementoDiferente("Colombia", comboBoxPais.getValue().toString(), " pais,", valor);
        valor = concatenarElementoDiferente("<ninguno>", comboBoxDepartamento.getValue().toString(), "departamento,", valor);
        valor = concatenarElementoDiferente("Esta Direccion podria estandarizarse automáticamente", campoTxtDireccion.getAttribute("data-qtip"), "drireccion data-tip,", valor);
        valor = concatenarElementoDiferente("200", campoTxtDireccion.getAttribute("maxlength"), "direccion maxlength,", valor);
        String res = valor.toString();
        if (MSJVALIDARVALORES.equals(res)) {
            res = valor.toString().substring(0, valor.toString().length() - 1);
        }
        MatcherAssert.assertThat(res, "No estan correctos los valores".equals(res));
    }

    public void validarDatosPantalla() {
        esperarHasta(TIEMPO_1000);
        StringBuilder noPresente = new StringBuilder(MSJVALIDARELEMENTOS);
        noPresente = concatenarElementoNoPresente(labelPais, " pais,", noPresente);
        noPresente = concatenarElementoNoPresente(labelDepartamento, " deprtamento,", noPresente);
        noPresente = concatenarElementoNoPresente(labelCiudad, " ciudad,", noPresente);
        noPresente = concatenarElementoNoPresente(labelTipoDireccion, "  tipo dirección,", noPresente);
        noPresente = concatenarElementoNoPresente(labelDescripcionDireccion, "  descripción direccion,", noPresente);
        noPresente = concatenarElementoNoPresente(labelDireccion, "direccion,", noPresente);
        String res = noPresente.toString();
        if (MSJVALIDARELEMENTOS.equals(res)) {
            res = noPresente.toString().substring(0, noPresente.toString().length() - 1);
        }
        MatcherAssert.assertThat(res, "No estan presentes los elementos".equals(res));
    }


    public void validarDireccion() {
        List<WebElementFacade> contactos = getLista(".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressesLV-body']/div/table/tbody/tr");
        MatcherAssert.assertThat("Error en la direccion agregada", contactos.get(1).getText().contains("CL 60 B # 10 - 157") || contactos.get(1).getText().contains("CALLE 60B #10-157"));
    }

}
