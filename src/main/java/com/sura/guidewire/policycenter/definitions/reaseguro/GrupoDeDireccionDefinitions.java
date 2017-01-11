package com.sura.guidewire.policycenter.definitions.reaseguro;


import com.sura.guidewire.policycenter.definitions.InformacionDePolizaMrcDefinitions;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;

public class GrupoDeDireccionDefinitions {

    @Steps
    InformacionDePolizaMrcDefinitions informacionDePolizaMrcDefinitions;


    @Given("ingrese la <fechaInicioVigencia> para un anio")
    public void givenModifiqueLasFechasParaQueSeanCreadasEnDosPeriodos(@Named("fechaInicioVigencia")String fechaInicioVigencia) {
        informacionDePolizaMrcDefinitions.modificaFechaInicioFechaFin(fechaInicioVigencia);
    }

}
