package com.sura.common.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase padre de excepciones
 */
public class SuraException extends Exception {

    private static final Logger LOGGER = LoggerFactory.getLogger(SuraException.class);
    private final String mensajeError;

    /**
     * Metodo para capturar excepciones a nivel tecnico
     * @param mensajeError
     * @param e
     */
    public SuraException(String codigoError, String mensajeError, Throwable e){
        super(e);
        this.mensajeError = mensajeError;
        LOGGER.error(codigoError.concat(" ").concat(mensajeError), e);
    }

    /**
     * Metodo para capturar excepciones a nivel de usuario final
     * @param mensajeError
     */
    public SuraException(String codigoError, String mensajeError){
        this.mensajeError = mensajeError;
        LOGGER.error(codigoError.concat(" ").concat(mensajeError));
    }

    public String getMensajeError() {
        return mensajeError;
    }

}
