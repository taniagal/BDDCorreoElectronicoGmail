package com.sura.guidewire.policycenter.utils;


import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class Parametros {
    private static final String PARAMETROCODIGOASESOR = "codigoAsesor";
    private static final String PARAMETROPORCENTAJE = "porcentaje";
    private static final String PARAMETROROL = "rol";
    private String codigoAsesor;
    private String  porcentaje;
    private String  rol;
    public String getCodigoAsesor() {
        return codigoAsesor;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    public void setCodigoAsesor(String codigoAsesor) {
        this.codigoAsesor = codigoAsesor;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
    public Parametros(ExamplesTable opciones) {
        for (Map<String, String> opcion : opciones.getRows()) {
            this.codigoAsesor = opcion.get(PARAMETROCODIGOASESOR);
            this.porcentaje = opcion.get(PARAMETROPORCENTAJE);
            this.rol =opcion.get(PARAMETROROL);
        }
    }
}


