package com.sura.common.exception;

/**
 * Clase de excepciones tecnicas
 */
public class SuraExceptionTechnical extends SuraException {

    private final String mensajeTecnico;
    private final String codigoError;

    /**
     * Captura de excepciones tecnicas
     * @param codigoError
     * @param mensajeTecnico
     * @param e
     */
    public SuraExceptionTechnical(String codigoError, String mensajeTecnico, Throwable e){
        super(codigoError, mensajeTecnico,e);
        this.mensajeTecnico = mensajeTecnico;
        this.codigoError = codigoError;
    }

    public String getMensajeTecnico() {
        return mensajeTecnico;
    }

    public String getCodigoError() {
        return codigoError;
    }
}
