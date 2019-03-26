import by.epam.javatr.minchuk.task04.model.entity.Sentence;
import by.epam.javatr.minchuk.task04.model.entity.Text;
import by.epam.javatr.minchuk.task04.model.entity.TextItem;
import by.epam.javatr.minchuk.task04.model.exception.TextNullPointerException;
import by.epam.javatr.minchuk.task04.model.parser.AbstractParser;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oksana Minchuk
 * @version 1.0 26.03.2019
 */

public class TextParserTest {

    private String paragraph = "Oracle provides this Oracle Java SE Support Roadmap, to help understand maintenance "
            + "and support options and related timelines.\nIf you are looking for the latest free JDK releases and updates "
            + "from Oracle under an open source license, please see jdk.java.net.\nWe recommend you take some time to "
            + "understand the new Java SE release cadence and OpenJDK builds from Oracle so that you can make the best "
            + "decisions for your corporate and personal use.\n";

    private static final String PARAGRAPH_SEPARATOR_REGEX = "(?<=[.!?]\\s)";

    private AbstractParser parser;

    @Test
    public void testParse() {


    }
}
