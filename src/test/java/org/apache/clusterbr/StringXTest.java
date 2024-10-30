package org.apache.clusterbr;

import org.junit.jupiter.api.Test;
import org.apache.clusterbr.util.StringX;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * StringX Junit tests
 * 
 * @author abrito | 2024-oct
 */
public class StringXTest extends BaseTest {

    @Test
    void testDefaultConstructor() {
        final String testName = "testDefaultConstructor";
        logger.info(getTestStartedText(testName));

        StringX result = new StringX();
        assertEquals("", result.toString(), "Default constructor should initialize with an empty string.");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testConstructorWithNonNullString() {
        final String testName = "testConstructorWithNonNullString";
        logger.info(getTestStartedText(testName));

        StringX result = new StringX("Hello");
        assertEquals("Hello", result.toString(),
                "Constructor with non-null input should initialize with the given string.");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testConstructorWithNullString() {
        final String testName = "testConstructorWithNullString";
        logger.info(getTestStartedText(testName));

        StringX result = new StringX((String) null);
        assertEquals("", result.toString(), "Constructor with null input should initialize with an empty string.");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testConstructorWithNonNullStringBuilder() {
        final String testName = "testConstructorWithNonNullStringBuilder";
        logger.info(getTestStartedText(testName));

        StringBuilder sb = new StringBuilder("Builder");
        StringX result = new StringX(sb);
        assertEquals("Builder", result.toString(),
                "Constructor with non-null StringBuilder should initialize with its value.");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testConstructorWithNullStringBuilder() {
        final String testName = "testConstructorWithNullStringBuilder";
        logger.info(getTestStartedText(testName));

        StringX result = new StringX((StringBuilder) null);
        assertEquals("", result.toString(),
                "Constructor with null StringBuilder should initialize with an empty string.");
        logger.info(getTestCompletedText(testName, true));
    }
}
