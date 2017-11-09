package com.test.correoelectronico.page;

import com.test.correoelectronico.navegacion.PageUtil;
import net.serenitybdd.core.Serenity;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Map;

public class CorreoElectronicoGmailPage extends PageUtil{
    private WebDriver driver;
    private WebDriverWait wait;
    private ArrayList<String[]> datosCorreoElectronico;
    private final String tablaFilasColumnas=".//div[@class='Cp']/div/table/tbody";
    private final String filasTabla=".//div[@class='Cp']/div/table/tbody/tr";
    public synchronized void createInstanceOfWebDriver(){
        if(driver == null) {
            driver = getInstanceOfWebDriver();
        }
    }
    public void ingresarACorreoElectronico(ExamplesTable informacion) throws InterruptedException {
        Map<String, String> informacionIngresoCorreoElectronico = informacion.getRow(0);
        String coreoElectronicoONumeroTelefonico = informacionIngresoCorreoElectronico.get("correoElectronicoONumeroTelefonico");
        String contraseniaCorreoElectronicoONumeroTelefonico = informacionIngresoCorreoElectronico.get("contrasenia");
        ingresarDato(coreoElectronicoONumeroTelefonico, driver.findElement(By.xpath(".//*[@id='identifierId']")));
        clickearBoton(driver.findElement(By.id("identifierNext")));
        Thread.sleep(2000);
        ingresarDato(contraseniaCorreoElectronicoONumeroTelefonico,driver.findElement(By.xpath(".//input[@name='password']")));
        clickearBoton(driver.findElement(By.xpath(".//div[@id='passwordNext']")));
        wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//div[@class='z0']/div")));
    }
    public void ingresarAGmail() {
        navegadorChrome("https://gmail.com");
    }
    public void enviarMensajeCorreoElectronico(ExamplesTable datosMensajeCorreoElectronico) throws InterruptedException { Thread.sleep(1000);
        clickearBoton(driver.findElement(By.xpath(".//div[@class='z0']/div")));
        Map<String,String> datosEnvioMensajeCorreoElectronico=datosMensajeCorreoElectronico.getRow(0);
        String para=datosEnvioMensajeCorreoElectronico.get("para");
        String asunto=datosEnvioMensajeCorreoElectronico.get("asunto");
        String mensaje=datosEnvioMensajeCorreoElectronico.get("mensaje");
        ingresarDato(para,driver.findElement(By.xpath(".//table/tbody/tr/td[2]/div/div/textarea[@role='combobox']")));
        ingresarDato(asunto,driver.findElement(By.xpath(".//input[@name='subjectbox']")));
        ingresarDato(mensaje,driver.findElement(By.xpath(".//*[@role='textbox']")));
        clickearBoton(driver.findElement(By.xpath("html/body/div[16]/div/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]")));
        Thread.sleep(2000);
        waitFor(driver.findElement(By.xpath(".//div/span[contains(.,'View message')]")));
    }

    public void salirEIngresarACorreoElectronico() throws InterruptedException {
        WebElement usuarioCorreoElectronico=driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[2]/div[1]/div/div[@class='gb_Bb gb_Cb']"));
        String nombreUsuario=usuarioCorreoElectronico.getText();
        Serenity.setSessionVariable("nombreUsuarioCorreoGmail".toLowerCase().trim()).to(nombreUsuario);
        clickearBoton(driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a")));
        clickearBoton(driver.findElement(By.xpath(".//*[@id='gb_71']")));
        clickearBoton(driver.findElement(By.xpath(".//form/div/div/div/div/div[@role='button']")));
        clickearBoton(driver.findElement(By.xpath(".//*[@id='identifierLink']")));
        Thread.sleep(2000);
    }
    public void ingresarAOpcionRecibidos() {
     String nombreUsuarioCorreoGmail = Serenity.sessionVariableCalled("nombreUsuarioCorreoGmail".toLowerCase().trim());
        datosCorreoElectronico = buscarDatoEnTabla(tablaFilasColumnas,filasTabla,nombreUsuarioCorreoGmail);
    }

    public ArrayList<String[]> obtenerDatosCorreoElectronico(){
        return datosCorreoElectronico;
    }
}
