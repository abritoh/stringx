package org.apache.clusterbr;

import org.junit.jupiter.api.Test;
import org.apache.clusterbr.util.StringX;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for StringXExtensionJavascript extension-methods.
 * 
 * @author abrito | 2024-oct
 * 
 */
public class StringXExtensionJavascriptTest extends BaseTest {

    // -- Includes (..)

    @Test
    void testIncludesWithExactMatch() {
        final String testName = "testIncludesWithExactMatch";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("hello");
        boolean result = original.includes("hello");

        super.logInfoOriginalResult(original.S(), Boolean.toString(result));
        assertTrue(result, "The method should return true for an exact match.");

        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testIncludesWithSubstringPresent() {
        final String testName = "testIncludesWithSubstringPresent";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("hello world");
        boolean result = original.includes("world");

        super.logInfoOriginalResult(original.S(), Boolean.toString(result));
        assertTrue(result, "The method should return true when the substring is present.");

        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testIncludesWithEmptySubstring() {
        final String testName = "testIncludesWithEmptySubstring";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("test");
        boolean result = original.includes("");

        super.logInfoOriginalResult(original.S(), Boolean.toString(result));
        assertTrue(result, "The method should return true when the substring is empty.");

        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testIncludesWithAbsentSubstring() {
        final String testName = "testIncludesWithAbsentSubstring";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("Java programming");
        boolean result = original.includes("Python");

        super.logInfoOriginalResult(original.S(), Boolean.toString(result));
        assertFalse(result, "The method should return false when the substring is not present.");

        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testIncludesWithWhitespaceSubstring() {
        final String testName = "testIncludesWithWhitespaceSubstring";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("hello world");
        boolean result = original.includes(" ");

        super.logInfoOriginalResult(original.S(), Boolean.toString(result));
        assertTrue(result, "The method should return true for a whitespace substring.");

        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testIncludesWithSpecialCharacters() {
        final String testName = "testIncludesWithSpecialCharacters";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("test@123");
        boolean result = original.includes("@");

        super.logInfoOriginalResult(original.S(), Boolean.toString(result));
        assertTrue(result, "The method should return true for special characters in the substring.");

        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testIncludesWithCaseMismatch() {
        final String testName = "testIncludesWithCaseMismatch";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("Hello");
        boolean result = original.includes("hello");

        super.logInfoOriginalResult(original.S(), Boolean.toString(result));
        assertFalse(result, "The method should be case-sensitive and return false for case mismatches.");

        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testIncludesWithNullSubstring() {
        final String testName = "testIncludesWithNullSubstring";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("test");

        super.logInfoOriginalResult(original.S(), "null");
        assertThrows(NullPointerException.class, () -> original.includes(null),
                "The method should throw a NullPointerException when given a null substring.");

        logger.info(getTestCompletedText(testName, true));
    }

    // -- repeat()

    @Test
    void testRepeatPositiveNTimes() {
        final String testName = "testRepeatPositiveNTimes";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("abc");
        StringX result = original.repeat(3);

        super.logInfoOriginalResult(original.S(), result.S());
        assertEquals(new StringX("abcabcabc").toString(), result.toString(),
                "The string should be repeated 3 times.");

        super.logInfoOriginalResult(original.S(), result.toString());
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testRepeatZeroTimes() {
        final String testName = "testRepeatZeroTimes";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("abc");
        StringX result = original.repeat(0);

        super.logInfoOriginalResult(original.S(), result.S());
        assertEquals(new StringX("").toString(), result.toString(),
                "Repeating 0 times should return an empty string.");

        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testRepeatOneTime() {
        final String testName = "testRepeatOneTime";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("xyz");
        StringX result = original.repeat(1);

        super.logInfoOriginalResult(original.S(), result.S());
        assertEquals(new StringX("xyz").toString(), result.toString(),
                "Repeating once should return the original string.");

        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testRepeatNegativeNTimes() {
        final String testName = "testRepeatNegativeNTimes";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("test");
        StringX result = original.repeat(-5);

        super.logInfoOriginalResult(original.S(), result.S());
        assertEquals(new StringX("").toString(), result.toString(),
                "Repeating a negative number of times should return an empty string.");

        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testRepeatWithEmptyString() {
        final String testName = "testRepeatWithEmptyString";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("");
        StringX result = original.repeat(5);

        super.logInfoOriginalResult(original.S(), result.S());
        assertEquals(new StringX("").toString(), result.toString(),
                "Repeating an empty string should always return an empty string.");

        logger.info(getTestCompletedText(testName, true));
    }
}
