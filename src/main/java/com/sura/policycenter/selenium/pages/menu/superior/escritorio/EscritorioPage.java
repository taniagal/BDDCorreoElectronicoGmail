package com.sura.policycenter.selenium.pages.menu.superior.escritorio;


import com.sura.policycenter.config.Localizador;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class EscritorioPage extends PageObject {


    protected WebElement lnkAcciones;

    public EscritorioPage(WebDriver driver) {


        super(driver);
        lnkAcciones = find(By.xpath(Localizador.obtenerPropiedad("escritorio.linkAcciones")));
    }


    public ExpectedCondition<Boolean> existeOpcionEnMenuAcciones(String opcion) {
        return new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return (lnkAcciones.isEnabled());
            }
        };
    }


    public ExpectedCondition<Boolean> btnAccionesEsHabilitado() {

        return new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return (lnkAcciones.isEnabled());
            }
        };
    }

}
