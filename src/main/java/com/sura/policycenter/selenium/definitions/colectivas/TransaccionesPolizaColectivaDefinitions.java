package com.sura.policycenter.selenium.definitions.colectivas;


import com.sura.policycenter.selenium.steps.colectivas.TransaccionesPolizaColectivaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class TransaccionesPolizaColectivaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    TransaccionesPolizaColectivaSteps transaccionesPolizaColectivaSteps;

}
