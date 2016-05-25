package com.sura.claims.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;


//@DefaultUrl("http://sandbox.sura.com:8080/cc/ClaimCenter.do")
@DefaultUrl("http://localhost:8080/cc/ClaimCenter.do")

public class AbrirApp extends Guidewire {
    public AbrirApp(WebDriver driver) {
        super(driver);
    }
}
