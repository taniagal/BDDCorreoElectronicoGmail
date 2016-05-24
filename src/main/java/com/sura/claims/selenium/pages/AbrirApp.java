package com.sura.claims.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

/**
 * Created by edwabuac on 15/04/2016.
 */
@DefaultUrl("http://localhost:8080/cc/ClaimCenter.do")
public class AbrirApp extends Guidewire {
    public AbrirApp(WebDriver driver) {
        super(driver);
    }
}