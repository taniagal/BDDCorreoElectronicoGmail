package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://local.sura.com:8180/pc/PolicyCenter.do")
public class AbrirAppPage extends Guidewire {
    public AbrirAppPage(WebDriver driver) {
        super(driver);
    }
}
