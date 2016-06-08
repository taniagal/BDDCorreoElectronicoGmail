package com.sura.common.exception;

/**
 * Clase de excepciones para usuario final
 */
public class SuraExceptionUser extends SuraException {

    private final String mensajeUsuario;
    private final String codigoError;

    /**
     * Captura de excepciones para usuario final
     * @param codigoError
     * @param mensajeUsuario
     */
    public SuraExceptionUser(String codigoError, String mensajeUsuario){
        super(codigoError, mensajeUsuario);
        this.mensajeUsuario = mensajeUsuario;
        this.codigoError = codigoError;
    }

    public String getMensajeUsuario() {
        return mensajeUsuario;
    }

    public String getCodigoError() {
        return codigoError;
    }
}
