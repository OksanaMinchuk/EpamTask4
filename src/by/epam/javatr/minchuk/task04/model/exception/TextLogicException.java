package by.epam.javatr.minchuk.task04.model.exception;

public class TextLogicException extends TextException {

    public TextLogicException() {
    }

    public TextLogicException(String message) {
        super(message);
    }

    public TextLogicException(String message, Throwable cause) {
        super(message, cause);
    }

    public TextLogicException(Throwable cause) {
        super(cause);
    }
}
