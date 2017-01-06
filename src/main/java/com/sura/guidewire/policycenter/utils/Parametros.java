package com.sura.guidewire.policycenter.utils;


import org.jbehave.core.model.ExamplesTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Parametros {
    private static final String PARAMETRO_CODIGOASESOR = "codigoAsesor";
    private static final String PARAMETRO_PORCENTAJE = "porcentaje";
    private static final String PARAMETRO_ROL = "rol";
    private static final String PARAMETROS_MENSAJE = "mensaje";
    private String codigoAsesor;
    private String  porcentaje;
    private String  rol;
    private String  mensaje;


    List<String> listaroles;
    List<String> listaAgentes;
    List<String> listaPorcentaje;

    public List<String> getListaroles() {
        return listaroles;
    }

    public void setListaroles(List<String> listaroles) {
        this.listaroles = listaroles;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<String> getListaPorcentaje() {
        return listaPorcentaje;
    }

    public void setListaPorcentaje(List<String> listaPorcentaje) {
        this.listaPorcentaje = listaPorcentaje;
    }

    public List<String> getListaAgentes() {
        return listaAgentes;
    }

    public void setListaAgentes(List<String> listaAgentes) {
        this.listaAgentes = listaAgentes;
    }

    public String getCodigoAsesor() {
        return codigoAsesor;
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
            this.codigoAsesor = opcion.get(PARAMETRO_CODIGOASESOR);
            this.porcentaje = opcion.get(PARAMETRO_PORCENTAJE);
            this.rol =opcion.get(PARAMETRO_ROL);
            this.mensaje = opcion.get(PARAMETROS_MENSAJE);
            String[] arrayAgentes = this.codigoAsesor.split(",");
            listaAgentes= new ArrayList<>();
            Collections.addAll(listaAgentes, arrayAgentes);
            String[] arrayPorcentaje= this.porcentaje.split(",");
            listaPorcentaje= new ArrayList<>();
            Collections.addAll(listaPorcentaje, arrayPorcentaje);
            String[] arrayRol= this.rol.split(",");
            listaroles= new ArrayList<>();
            Collections.addAll(listaroles, arrayRol);
        }
    }
}


