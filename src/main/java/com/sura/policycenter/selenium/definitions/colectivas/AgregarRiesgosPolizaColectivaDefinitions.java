package com.sura.policycenter.selenium.definitions.colectivas;


import com.sura.policycenter.selenium.steps.colectivas.AgregarRiesgosPolizaColectivaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class AgregarRiesgosPolizaColectivaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    AgregarRiesgosPolizaColectivaSteps agregarRiesgosPolizaColectivaSteps;
}
