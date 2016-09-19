package com.sura.gw.inicio.guidewire;

import com.sura.gw.navegacion.widget.INavegacionSuperiorWidget;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

public class GuidewirePage extends PageObject{

    @FindBy(xpath = ".//*[@id=':tabs']")
    private INavegacionSuperiorWidget barraNavegacionSuperior;

    protected static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);


    @Managed
    WebDriver driver;

    @ManagedPages
    Pages pages;

    public GuidewirePage(){
        //switchToPage(EscritorioPage.class);
    }


}
