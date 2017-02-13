package core.sura.resources;


import com.google.common.base.Function;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class MetodosComunes {
    protected static final int TIEMPO_30 = 30;


    protected void waitUntilVisible(WebElement element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, TIEMPO_30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public Properties loadProperty() throws Exception {
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("src/main/resources/gradle.properties");
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return prop;
    }

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
}
