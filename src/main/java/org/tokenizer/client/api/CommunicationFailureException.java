package org.tokenizer.client.api;

public class CommunicationFailureException extends Exception {

    private static final long serialVersionUID = 1L;

    public CommunicationFailureException() {
        super();
    }

    public CommunicationFailureException(String message) {
        super(message);
    }

    public CommunicationFailureException(String message, Throwable cause) {
        super(message, cause);
    }

}
