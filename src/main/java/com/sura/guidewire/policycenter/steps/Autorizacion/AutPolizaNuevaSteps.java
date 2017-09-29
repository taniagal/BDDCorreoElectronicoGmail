package com.sura.guidewire.policycenter.steps.Autorizacion;

import com.sura.guidewire.policycenter.pages.AutPolizaNuevaPage;
import com.sura.guidewire.policycenter.resources.PageUtil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.reports.adaptors.specflow.ScenarioStep;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.poi.ss.usermodel.Workbook;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

import java.io.File;

public class AutPolizaNuevaSteps extends ScenarioSteps {
    @Page
    PageUtil pageUtil;
    @Page
    AutPolizaNuevaPage autPolizaNuevaPage;

    @Step
    public void capturarParametros(ExamplesTable paramatros) {
    }
    @Step
    public void leerParametros(ExamplesTable paramatros) {
        File archivo=new File(new File("src\\test\\resources\\data_driven\\Copia de ModeloAutorizaciones (6).xlsx").getAbsolutePath());
        autPolizaNuevaPage.leerExcel(archivo,0,paramatros);
    }
}
