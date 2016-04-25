package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;


// TODO: 19/04/2016 URL temporal mientras se despliega en los otros ambientes 

@DefaultUrl("http://10.209.16.122:8180/pc/PolicyCenter.do")
public class AbrirApp extends Guidewire {
    public AbrirApp(WebDriver driver) {
        super(driver);
    }
}
