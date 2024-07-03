package br.com.johabfreitas.desenvolvimento_java_com_ia.service.exception;

public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }

}
