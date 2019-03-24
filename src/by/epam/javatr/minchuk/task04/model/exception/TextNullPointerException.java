package by.epam.javatr.minchuk.task04.model.exception;

public class TextNullPointerException extends TextTechnicalExeption {

    public TextNullPointerException() {
    }

    public TextNullPointerException(String message) {
        super(message);
    }

    public TextNullPointerException(String message, Throwable cause) {
        super(message, cause);
    }

    public TextNullPointerException(Throwable cause) {
        super(cause);
    }
}
