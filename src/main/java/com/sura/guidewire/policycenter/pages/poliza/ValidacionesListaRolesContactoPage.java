package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ValidacionesListaRolesContactoPage extends PageUtil {

    Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:ContactRolesDV:ContactRolesLV_tb:AddRoleButton-btnWrap']")
    private WebElementFacade botonAgregarRol;
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:Cancel-btnInnerEl']")
    private WebElementFacade botonCancelarRol;


    public ValidacionesListaRolesContactoPage (WebDriver driver){
        super(driver);
    }

    public void validarOpcionesAgregarRol(ExamplesTable ListaContactosRoles) {
        botonAgregarRol.click();
        validarDatosDeLaListaRoles(ListaContactosRoles);
    }

    private void validarDatosDeLaListaRoles(ExamplesTable tipoRol) {
        List<WebElementFacade> elementosTipoRolesContacto;
        String tipo = tipoRol.getRows().get(0).get("roles");
            elementosTipoRolesContacto = withTimeoutOf(TIEMPO_1, TimeUnit.SECONDS).findAll("//span[contains(@id, 'NewAccountContactPopup:ContactDetailScreen:AccountContactCV:ContactRolesDV:ContactRolesLV_tb:AddRoleButton:') and contains(@id, ':RoleType-textEl')]");
            for (WebElementFacade lista : elementosTipoRolesContacto) {
                if(lista.getText().contains(tipo)){
                    MatcherAssert.assertThat("El rol " + lista.getText() + " ya se ha seleccionado en crear contacto, no se debería mostrar en la lista " , lista.getText().contains(tipo), Is.is(Matchers.equalTo(false)));
                }
            }
    }
}
