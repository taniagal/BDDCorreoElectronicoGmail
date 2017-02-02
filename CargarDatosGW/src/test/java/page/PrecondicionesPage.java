package page;


import core.sura.resources.MetodosComunes;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrecondicionesPage {
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

    private static final int WAIT_1000 = 1000;
    private static final int WAIT_10 = 10;
    private static final int WAIT_2000 = 2000;

    public void cargarDatos(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_1000);
        campoTxtBuscar.sendKeys(Keys.ALT, Keys.SHIFT, "t");
        wait.until(ExpectedConditions.elementToBeClickable(menuHerramientasInternas)).isDisplayed();
        menuHerramientasInternas.click();
        menuItemDatosDeMuestraDePc.click();
        botonCarga.click();
        try {
            wait.until(ExpectedConditions.elementToBeClickable(labelCargaCorrecta)).isDisplayed();
        } catch (StaleElementReferenceException e) {
            wait.until(ExpectedConditions.elementToBeClickable(labelCargaCorrecta)).isDisplayed();
        }
        assertThat(labelCargaCorrecta.getText(), anyOf(is("Conjunto cargado \"Sura\" correctamente."),
                is("Loaded set \"Sura\" successfully.")));
    }

    public void elegirLenguaje(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_10);
        Actions actions = new Actions(driver);
        botonPreferencias.click();
        wait.until(ExpectedConditions.elementToBeClickable(menuItemInternacional)).isDisplayed();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(menuItemIdioma)).isDisplayed();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(menuItemColombia)).isDisplayed();
        menuItemColombia.click();
        MetodosComunes.waitUntil(WAIT_2000);
    }
}
