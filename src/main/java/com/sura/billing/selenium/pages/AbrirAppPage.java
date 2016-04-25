package com.sura.billing.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

/**
 * Created by jorghome on 22/04/2016.
 */
// TODO: 22/04/2016 URL temporal mientras se despliega en los otros ambientes
@DefaultUrl("http://10.209.16.122:8580/bc/BillingCenter.do")
public class AbrirAppPage extends Guidewire {
    public AbrirAppPage(WebDriver driver) {
        super(driver);
    }
}
