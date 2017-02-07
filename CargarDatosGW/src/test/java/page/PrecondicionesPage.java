package page;


import core.sura.resources.MetodosComunes;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrecondicionesPage extends MetodosComunes {
    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElement campoTxtBuscar;
    @FindBy(xpath = ".//*[@id='InternalToolsTabBar:UnsupportedToolsTab-btnInnerEl']")
    private WebElement menuHerramientasInternas;
    @FindBy(xpath = ".//*[@id='UnsupportedTools:MenuLinks:UnsupportedTools_PCSampleData']/div")
    private WebElement menuItemDatosDeMuestraDePc;
    @FindBy(xpath = ".//*[@id='PCSampleData:PCSampleDataScreen:SampleDataSetsLV:0:LoadSampleData']")
    private WebElement botonCarga;
    @FindBy(xpath = ".//*[@id='PCSampleData:PCSampleDataScreen:0']")
    private WebElement labelCargaCorrecta;
    @FindBy(xpath = ".//*[@id=':TabLinkMenuButton-btnIconEl']")
    private WebElement botonPreferencias;
    @FindBy(xpath = ".//*[@id='TabBar:LanguageTabBarLink']")
    private WebElement menuItemInternacional;
    @FindBy(xpath = ".//*[@id='TabBar:LanguageTabBarLink:languageSwitcher']")
    private WebElement menuItemIdioma;
    @FindBy(xpath = ".//*[@id='TabBar:LanguageTabBarLink:languageSwitcher:1:langs-textEl']")
    private WebElement menuItemColombia;

    private static final int TIEMPO_1000 = 1000;
    private static final int TIEMPO_2000 = 2000;

    public void cargarDatos(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, TIEMPO_1000);
        campoTxtBuscar.sendKeys(Keys.ALT, Keys.SHIFT, "t");
        waitUntilVisible(menuHerramientasInternas, driver);
        menuHerramientasInternas.click();
        menuItemDatosDeMuestraDePc.click();
        botonCarga.click();
        wait.until(ExpectedConditions.visibilityOf(labelCargaCorrecta));
        assertThat(labelCargaCorrecta.getText(), anyOf(is("Conjunto cargado \"Sura\" correctamente."),
                is("Loaded set \"Sura\" successfully.")));
    }

    public void elegirLenguaje(WebDriver driver) {
        Actions actions = new Actions(driver);
        botonPreferencias.click();
        waitUntilVisible(menuItemInternacional, driver);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitUntilVisible(menuItemIdioma, driver);
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitUntilVisible(menuItemColombia, driver);
        menuItemColombia.click();
        MetodosComunes.waitUntil(TIEMPO_2000);
    }
}
