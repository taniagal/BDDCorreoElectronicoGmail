package com.test.correoelectronico.navegacion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.ArrayList;

public class PageUtil extends net.thucydides.core.pages.PageObject {

    private WebDriver driver;
    private ArrayList<String[]> informacionCorreoElectronico;
    private String mensajeEncontrado=".//div[@class='G3 G2']/div/div/div[1]";
    private String buscarUsuarioCorreoElectronico=".//table[@class='cf adz']/tbody/tr/td/div[2]";
    private String correoElectronicoUsuario=".//span[@class='go']";

    protected void navegadorChrome(String url){
        System.setProperty("webdriver.chrome.driver", new File("target\\chromedriver.exe").getAbsolutePath());
        driver=new ChromeDriver();
        driver.navigate().to(url);
        informacionCorreoElectronico = new ArrayList<>();
    }
    protected void ingresarDato(String datoIngresar, WebElement campoIngresar){
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
                throw new RuntimeException("Time limit excited");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    protected WebDriver getInstanceOfWebDriver(){
        return driver;
    }
    public ArrayList<String[]> buscarDatoEnTabla(String tablaFilasColumnas,String filasTabla,String dato){
        for(int i=1;i<=driver.findElements(By.xpath(filasTabla)).size(); i++){
            String datoBuscar=tablaFilasColumnas+"/tr["+(i)+"]"+"/td[4]/div[2]";
            WebElement datoEncontrado=driver.findElement(By.xpath(datoBuscar));
            if(datoEncontrado.getText().contains(dato)){
                String asuntoEncontrado=".//table[@role='presentation']//td/div[2]/div/div[2]/div/h2";
                datoEncontrado.click();
                WebElement asuntosEncontrado=driver.findElement(By.xpath(asuntoEncontrado));
                WebElement mensajesEncontrados=driver.findElement(By.xpath(mensajeEncontrado));
                WebElement buscarUsuarioCorreoGmail=driver.findElement(By.xpath(buscarUsuarioCorreoElectronico));
                buscarUsuarioCorreoGmail.click();
                WebElement usuarioCorreoElectronico=driver.findElement(By.xpath(correoElectronicoUsuario));
                informacionCorreoElectronico.add(new String[]{
                        usuarioCorreoElectronico.getText(),
                        asuntosEncontrado.getText(),
                        mensajesEncontrados.getText()

                });
            }
        }
        return informacionCorreoElectronico;
    }
}

