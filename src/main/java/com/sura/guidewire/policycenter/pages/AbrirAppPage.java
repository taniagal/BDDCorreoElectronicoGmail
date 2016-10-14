package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.util.Commons;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://local.sura.com:8180/pc/PolicyCenter.do")
public class AbrirAppPage extends Commons {
    public AbrirAppPage(WebDriver driver) {
        super(driver);
    }
}
