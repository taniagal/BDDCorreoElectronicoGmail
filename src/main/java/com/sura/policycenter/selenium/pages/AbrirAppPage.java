package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://local.sura.com:8180/pc/PolicyCenter.do")
public class AbrirAppPage extends Commons {
    public AbrirAppPage(WebDriver driver) {
        super(driver);
    }
}
