package com.sura.gw.inicio.guidewire;

import com.sura.gw.navegacion.pages.INavegacionSuperiorWidget;
import com.sura.gw.navegacion.pages.MenuNavegacionSuperiorEnum;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.pages.Pages;
import org.openqa.selenium.WebDriver;

public class GuidewireHomePage extends PageObject{

    @FindBy(xpath = ".//*[@id=':tabs']")
    private INavegacionSuperiorWidget barraNavegacionSuperior;

    @Managed
    WebDriver driver;

    @ManagedPages
    Pages pages;

    public GuidewireHomePage(){
        barraNavegacionSuperior.seleccionarMenu(MenuNavegacionSuperiorEnum.ESCRITORIO);
    }


}
