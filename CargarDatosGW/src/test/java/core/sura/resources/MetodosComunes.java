package core.sura.resources;



import com.google.common.base.Function;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Wait;


public class MetodosComunes {

    public Properties loadProperty() throws Exception {
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("src/main/resources/gradle.properties");
            prop.load(input);
        }
        catch (IOException ex) {
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

    public void waitUntil(int millis) {
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
