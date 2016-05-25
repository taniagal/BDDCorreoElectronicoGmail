package com.sura.claims.selenium.pages;

import com.sura.claims.selenium.pages.menu.Navegacion;
import com.sura.claims.selenium.pages.menu.superior.reclamacion.NuevaReclamacionPage;
import com.sura.claims.selenium.pages.menu.superior.reclamacion.ReclamacionBuscarPage;
import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class InicioPage extends Guidewire {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);
    Actions act = new Actions(getDriver());
    Navegacion navegacion;

    @FindBy(xpath = ".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']")
    WebElementFacade labelIngreso;
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab-btnWrap']")
    WebElementFacade mnuContact;
    @FindBy(xpath = ".//*[@id='TabBar:ClaimTab-btnInnerEl']")
    WebElementFacade mnuReclamacion;
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact:NewPerson-itemEl']")
    WebElementFacade mnuNewPerson;
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab:NewContact:NewCompany-textEl']")
    WebElementFacade mnuNewCompany;

    public InicioPage(WebDriver driver) {
        super(driver);
        navegacion = new Navegacion(driver);
    }

    @WhenPageOpens
    public void waitUntilMainElementsAppears() {
        element(labelIngreso).waitUntilVisible();
        element(mnuReclamacion).waitUntilVisible();
    }

    public void assertion(String element) {
        assertThat(labelIngreso.getText().toString(), containsString(element));
    }

    // Metodos navegacion Reclamacion
    public NuevaReclamacionPage irANuevaReclamacion() {
        return navegacion.irANuevaReclamacion();
    }

    public ReclamacionBuscarPage irABuscarReclamacion() {
        return navegacion.irABuscarReclamacion();
    }

}