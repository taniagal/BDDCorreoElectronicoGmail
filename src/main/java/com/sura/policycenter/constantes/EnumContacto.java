package com.sura.policycenter.constantes;

/**
 * Created by brayruru on 2016/04/29.
 */
public enum EnumContacto {

        CIUDAD ("Ciudad: El campo \"Ciudad\" es requerido"),
        DEPARTAMENTO ("Departamento: El campo \"Departamento\" es requerido");

    private final String mensajeRequerido;

    EnumContacto(String mensaje){
        mensajeRequerido = mensaje;
    }

    public String getMensajeRequerido() {
        return mensajeRequerido;
    }
}
