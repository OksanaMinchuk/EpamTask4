package by.epam.javatr.minchuk.task04.model.exception;

public class TextTechnicalExeption extends TextException {

    public TextTechnicalExeption() {
    }

    public TextTechnicalExeption(String message) {
        super(message);
    }

    public TextTechnicalExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public TextTechnicalExeption(Throwable cause) {
        super(cause);
    }
}
