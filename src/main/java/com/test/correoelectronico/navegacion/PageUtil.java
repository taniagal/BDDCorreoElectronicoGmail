package com.test.correoelectronico.navegacion;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;


public class PageUtil extends PageObject {

    private WebDriver driver;
    private ArrayList<String> usuariosCorreoElectronicoGmail=new ArrayList<>();
    public void navegadorChrome(String url){
        System.setProperty("webdriver.chrome.driver", "D:\\workSpaces\\BDD_END_TO_END\\com.test.correoelectronico.gmail\\target\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to(url);
    }

    protected void ingresarDato(String datoIngresar, WebElement campoIngresar){
        //while(campoIngresar.isDisplayed() == false);
        campoIngresar.sendKeys(datoIngresar);
    }

    protected void clickearBoton(WebElement boton){
        try{
            long tiempoActual = System.currentTimeMillis();
            long tiempoSiguiente = System.currentTimeMillis();
            boolean clickeado = false;
            while(tiempoSiguiente - tiempoActual <= 10000L && clickeado == false){
                if(boton.isDisplayed() && boton.isEnabled()){
                    boton.sendKeys(Keys.ENTER);
                    clickeado = true;
                }
                tiempoSiguiente = System.currentTimeMillis();
            }
            if(clickeado == false){
                throw new Error("Time limit excited");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    protected WebDriver getInstanceOfWebDriver(){
        return driver;
    }
    protected void buscarDatoEnTabla(String tablaFilasColumnas,String filasTabla,String dato){
        for(int i=0;i<=getDriver().findElements(By.xpath(filasTabla)).size();i++){
            String datoBuscar=tablaFilasColumnas+"/tr["+(i+1)+"]"+"td[@class='yX xY']";
            WebElement datoEncontrado=driver.findElement(By.xpath(datoBuscar));
            if(datoEncontrado.getText().contains(dato)){
                usuariosCorreoElectronicoGmail.add(datoEncontrado.getText());
            }
        }

    }
}

