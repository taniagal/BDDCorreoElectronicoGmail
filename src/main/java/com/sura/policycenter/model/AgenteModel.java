package com.sura.policycenter.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class AgenteModel {
    private final String nombre;
    private final Integer codigo;

    public AgenteModel(String nombre, Integer codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }


    public Integer getCodigo() {
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
