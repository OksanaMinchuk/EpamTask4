package by.epam.javatr.minchuk.task04.model.exception;

public class TextUnsupportedOperationException extends TextLogicException {

    public TextUnsupportedOperationException() {
    }

    public TextUnsupportedOperationException(String message) {
        super(message);
    }

    public TextUnsupportedOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public TextUnsupportedOperationException(Throwable cause) {
        super(cause);
    }
}
