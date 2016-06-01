package com.sura.policycenter.pages.policy_estados_de_poliza.cotizacion;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class NuevaCotizacionPage extends PageObject {

    public static final String TITULO_PAGINA = "//span[@id='NewSubmission:NewSubmissionScreen:ttlBar']";
    public static final String TXT_NUMERO_CUENTA = "//input[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:Account-inputEl']";
    public static final String LINK_NOMBRE_PERSONA = "//div[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:AccountName-inputEl']";
    public static final String LABEL_NOMBRE_PERSONA = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:AccountName-labelCell']";

    public String obtenerTexto(String xpath){
     //   if (find(By.xpath(xpath)).isPresent()){
        //withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf((By.xpath(xpath)));
        return find(By.xpath(xpath)).getText();
    }

}
