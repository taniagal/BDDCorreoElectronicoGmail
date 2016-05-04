package com.sura.policycenter.selenium.steps;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.ContactosAsociadosACuentasPage;
import com.sura.policycenter.selenium.pages.EscritorioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by jorgsape on 2016/05/04.
 */
public class ContactosAsociadosACuentasSteps extends ScenarioSteps {

    private final Guidewire gw = new Guidewire(getDriver());
    private final EscritorioPage escritorioPagePage = new EscritorioPage(getDriver());
    private final ContactosAsociadosACuentasPage nuevoContactoPage = new ContactosAsociadosACuentasPage(getDriver());


    public ContactosAsociadosACuentasSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void consultarCuentaPorNum(String numCuenta) {
        escritorioPagePage.navegarTabBar("CUENTA","CONSULTAR",numCuenta);

    }




}
