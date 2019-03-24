package by.epam.javatr.minchuk.task04.model.entity;

import java.util.Objects;

/**
 * Class {@code Lexeme}
 *
 * @autor Oksana Minchuk
 * @version 1.0 23.03.2019
 */
public class Lexeme extends TextItem {

    private String lexemComponent;

    /**
     * Default constructor
     */
    public Lexeme() {
        super(TextItemType.LEXEME);
    }

    /**
     * Constructor
     *
     * @param lexemComponent
     */
    public Lexeme(String lexemComponent) {
        super(TextItemType.LEXEME);
        if (lexemComponent != null) {
            this.lexemComponent = lexemComponent;
        }
    }

    /**
     * Copy constructor
     *
     * @param lexeme
     */
    public Lexeme(Lexeme lexeme) {
        super(TextItemType.LEXEME);
        if (lexeme != null) {
            this.lexemComponent = lexemComponent;
        }
    }

    @Override
    public String getContent() {
        return lexemComponent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lexeme lexeme = (Lexeme) o;
        return lexemComponent.equals(lexeme.lexemComponent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lexemComponent);
    }
}
