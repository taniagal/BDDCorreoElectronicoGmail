package com.sura.guidewire.policycenter.util.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class AgenteModel {
    private final String nombre;
    private final String codigo;

    public AgenteModel(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }


    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
