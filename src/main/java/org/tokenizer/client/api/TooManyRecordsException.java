package org.tokenizer.client.api;

public class TooManyRecordsException extends Exception {

    private static final long serialVersionUID = 1L;

    public TooManyRecordsException() {
        super();
    }

    public TooManyRecordsException(String message) {
        super(message);
    }

    public TooManyRecordsException(String message, Throwable cause) {
        super(message, cause);
    }

}
