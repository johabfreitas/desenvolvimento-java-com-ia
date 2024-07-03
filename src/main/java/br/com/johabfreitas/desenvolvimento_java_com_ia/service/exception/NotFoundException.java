package br.com.johabfreitas.desenvolvimento_java_com_ia.service.exception;

public class NotFoundException extends BusinessException {

    private static final long serialVersionUID = 1L;

    public NotFoundException() {
        super("Resource not found.");
    }


}
