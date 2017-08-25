package core.sura.resources;

import com.google.common.base.Function;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MetodosComunes {
    protected static final int TIEMPO_30 = 30;
    protected static final int TIEMPO_5000 = 5000;

    public static void waitUntil(int millis) {
        Integer i = 0;
        Wait<Integer> wait = new FluentWait<Integer>(i).withTimeout(millis,
                TimeUnit.MILLISECONDS).pollingEvery(millis,
                TimeUnit.MILLISECONDS);
        try {
            wait.until(new Function<Integer, Boolean>() {
                public Boolean apply(Integer i) {

                    return false;
                }
            });
        } catch (TimeoutException e) {
        }
    }

    protected void waitUntilVisible(WebElement element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, TIEMPO_30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void waitUntilClickable(WebElement element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, TIEMPO_30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public Properties loadProperty() {
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("src/main/resources/gradle.properties");
            prop.load(input);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return prop;
    }
}
