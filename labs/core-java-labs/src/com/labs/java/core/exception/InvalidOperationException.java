package com.labs.java.core.exception;

public class InvalidOperationException extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidOperationException() {
        super();
    }

    public InvalidOperationException(String message) {
        super(message);
    }
}
