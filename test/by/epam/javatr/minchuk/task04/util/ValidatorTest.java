package by.epam.javatr.minchuk.task04.util;

import by.epam.javatr.minchuk.task04.util.validator.Validator;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Oksana Minchuk
 * @version 1.0 26.03.2019
 */

public class ValidatorTest {

    @Test
    public void testPositiveIsValidParagraph() {
        String text = "Java can reduce costs, drive innovation, and improve application services";
        boolean expected = true;
        boolean actual = Validator.isValidParagraph(text);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNegativeIsValidParagraph() {
        String text = "     java can reduce costs, drive innovation, and improve application services";
        boolean expected = false;
        boolean actual = Validator.isValidParagraph(text);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tesPositivetIsValidWord() {
        String text = "java";
        boolean expected = true;
        boolean actual = Validator.isValidWord(text);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNegativeIsValidWord() {
        String text = ", java";
        boolean expected = false;
        boolean actual = Validator.isValidWord(text);
        Assert.assertEquals(expected, actual);
    }
}
