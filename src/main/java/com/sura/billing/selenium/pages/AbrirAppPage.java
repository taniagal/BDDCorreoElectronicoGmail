package com.sura.billing.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://sandbox.sura.com:8580/bc/BillingCenter.do")
public class AbrirAppPage extends Guidewire {
    public AbrirAppPage(WebDriver driver) {
        super(driver);
    }
}
