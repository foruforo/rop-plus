package rop.request;

public class IllegalUploadFileFormatException extends IllegalArgumentException {

    public IllegalUploadFileFormatException() {
        super();
    }

    public IllegalUploadFileFormatException(String s) {
        super(s);
    }

    public IllegalUploadFileFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalUploadFileFormatException(Throwable cause) {
        super(cause);
    }
}

