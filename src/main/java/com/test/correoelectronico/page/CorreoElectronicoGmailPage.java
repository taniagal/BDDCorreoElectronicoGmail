package com.test.correoelectronico.page;
import com.test.correoelectronico.navegacion.PageUtil;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class CorreoElectronicoGmailPage extends PageUtil{
    private WebDriver driver;
    private WebDriverWait wait;
    String tablaFilasColumnas=".//table/tbody";
    String filasTabla=".//table/tbody/tr[@class='zA yO']";

    public synchronized void createInstanceOfWebDriver(){
        if(driver == null) {
            driver = getInstanceOfWebDriver();
        }
    }
    public void ingresarACorreoElectronico(ExamplesTable informacion) {
        Map<String, String> informacionIngresoCorreoElectronico = informacion.getRow(0);
        String coreoElectronicoONumeroTelefonico = informacionIngresoCorreoElectronico.get("correoElectronicoONumeroTelefonico");
        String contraseniaCorreoElectronicoONumeroTelefonico = informacionIngresoCorreoElectronico.get("contrasenia");
        ingresarDato(coreoElectronicoONumeroTelefonico, driver.findElement(By.xpath(".//*[@id='identifierId']")));
        clickearBoton(driver.findElement(By.id("identifierNext")));
        wait=new WebDriverWait(driver,30);
        while(driver.findElement(By.cssSelector("input[type=password]")).isDisplayed() == false);
        ingresarDato(contraseniaCorreoElectronicoONumeroTelefonico, driver.findElement(By.cssSelector("input[type=password]")));
        clickearBoton(driver.findElement(By.xpath(".//div[@id='passwordNext']")));
        wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//div[@class='z0']/div")));
    }
    public void ingresarAGmail() {
        navegadorChrome("https://gmail.com");
    }
    public void enviarMensajeCorreoElectronico(ExamplesTable datosMensajeCorreoElectronico) {
        clickearBoton(driver.findElement(By.xpath(".//div[@class='z0']/div")));
        Map<String,String> datosEnvioMensajeCorreoElectronico=datosMensajeCorreoElectronico.getRow(0);
        String para=datosEnvioMensajeCorreoElectronico.get("para");
        String asunto=datosEnvioMensajeCorreoElectronico.get("asunto");
        String mensaje=datosEnvioMensajeCorreoElectronico.get("mensaje");
        ingresarDato(para,driver.findElement(By.xpath(".//table/tbody/tr/td[2]/div/div/textarea[@role='combobox']")));
        ingresarDato(asunto,driver.findElement(By.xpath(".//input[@name='subjectbox']")));
        ingresarDato(mensaje,driver.findElement(By.xpath(".//*[@role='textbox']")));
        clickearBoton(driver.findElement(By.xpath(".//table/tbody/tr/td[1]/div/div/div[4]/table/tbody//div/div[contains(.,'Enviar')]")));
        waitFor(driver.findElement(By.xpath(".//div/span[contains(.,'Ver el mensaje')]")));
    }

    public void salirEIngresarACorreoElectronico() {
        clickearBoton(driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a")));
        clickearBoton(driver.findElement(By.xpath(".//a[@class='gb_Fa gb_Kf gb_Rf gb_ze gb_Eb']")));
        clickearBoton(driver.findElement(By.xpath(".//form/div/div/div/div/div[@role='button']")));
        clickearBoton(driver.findElement(By.xpath(".//*[@id='identifierLink']")));
    }

    public ExamplesTable ingresarAOpcionRecibidosCorreoElectronico(ExamplesTable informacionMensajeRecibido) {
        clickearBoton(driver.findElement(By.xpath(".//div/span/a[contains(.,'Inbox')]")));
        Map<String,String> mensajeRecibido=informacionMensajeRecibido.getRow(0);
        String usuarioEnviaCorreo=mensajeRecibido.get("correoElectronicoONumeroTelefonico");
        String asuntoMensajeEnviado=mensajeRecibido.get("Prueba Correo");
        String mensajeMensajeEnviado=mensajeRecibido.get("mensaje");
        buscarDatoEnTabla(tablaFilasColumnas,filasTabla,usuarioEnviaCorreo);
        return informacionMensajeRecibido;
    }
}
