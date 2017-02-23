package com.sura.guidewire.policycenter.pages.poliza;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class HerramientasPolizaPage extends PageUtil {
    private String TABLA_PROGRAMA_AUDITORIA = ".//*[@id='PolicyFile_Audits:AuditInformationScreen:AuditsLV-body']/*/table/tbody/tr";
    private String PATH_PROGRAMA_AUDITORIA = ".//*[@id='PolicyFile_Audits:AuditInformationScreen:0']";
    @FindBy(xpath = ".//*[@id='PolicyFile:MenuLinks:PolicyFile_PolicyFile_Audits']/div")
    private WebElementFacade menuProgramaAuditoria;

    public HerramientasPolizaPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarProgramaAuditoria() {
        menuProgramaAuditoria.click();
        esperarElemento(PATH_PROGRAMA_AUDITORIA);
    }

    public void validarProgramaAuditoria(ExamplesTable opciones) {
        int cantidaProgramaAuditoria = consultarNumeroElementosTabla(TABLA_PROGRAMA_AUDITORIA);
        String tipo = consultarTextoCeldaTabla(TABLA_PROGRAMA_AUDITORIA,1,3);
        String estado = consultarTextoCeldaTabla(TABLA_PROGRAMA_AUDITORIA,1,7);
        if (cantidaProgramaAuditoria>0){
            for (Map<String, String> dato : opciones.getRows()) {
                MatcherAssert.assertThat("El valor no es equivalente, esperado: "+tipo+", "+estado+"; Elementos recibidos: "+dato.get("tipo")+"; "+dato.get("estado"),(dato.get("tipo").equals(tipo) && dato.get("estado").equals(estado)));
            }
        }

    }
    public void validarProgramaSinAuditoria(ExamplesTable opciones) {
        int cantidaProgramaAuditoria = consultarNumeroElementosTabla(TABLA_PROGRAMA_AUDITORIA);
        String tipo = consultarTextoCeldaTabla(TABLA_PROGRAMA_AUDITORIA,1,3);
        String estado = consultarTextoCeldaTabla(TABLA_PROGRAMA_AUDITORIA,1,7);
        if (cantidaProgramaAuditoria<2){
            for (Map<String, String> dato : opciones.getRows()) {
                MatcherAssert.assertThat("El valor no es equivalente, esperado: "+tipo+", "+estado+"; Elementos recibidos: "+dato.get("tipo")+"; "+dato.get("estado"),(dato.get("tipo").equals(tipo) && dato.get("estado").equals(estado)));
            }
        }

    }
}
