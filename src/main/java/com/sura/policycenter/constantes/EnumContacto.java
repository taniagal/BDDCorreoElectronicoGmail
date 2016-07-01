package com.sura.policycenter.constantes;

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
