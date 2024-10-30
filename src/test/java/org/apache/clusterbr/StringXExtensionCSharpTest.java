package org.apache.clusterbr;

import org.junit.jupiter.api.Test;
import org.apache.clusterbr.util.StringX;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for StringXExtensionCSharp extension-methods.
 * 
 * @author abrito | 2024-oct 
 */
public class StringXExtensionCSharpTest extends BaseTest {

    @Test
    void testPadLeftWithSufficientWidth() {
        final String testName = "testPadLeftWithSufficientWidth";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("Hello");
        StringX padded = original.padLeft(10, '*');

        super.logInfoOriginalResult(original.S(), padded.S());
        assertEquals("*****Hello", padded.toString(), "padLeft should add padding on the left.");

        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testPadLeftWithExactWidth() {
        final String testName = "testPadLeftWithExactWidth";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("Hello");
        StringX padded = original.padLeft(5, '*');

        super.logInfoOriginalResult(original.S(), padded.S());
        assertEquals("Hello", padded.toString(), "padLeft should not add padding if width is exact.");

        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testPadLeftWithInsufficientWidth() {
        final String testName = "testPadLeftWithInsufficientWidth";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("Hello");
        StringX padded = original.padLeft(3, '*');

        super.logInfoOriginalResult(original.S(), padded.S());
        assertEquals("Hello", padded.toString(),
                "padLeft should not add padding if width is less than current length.");

        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testPadLeftWithEmptyString() {
        final String testName = "testPadLeftWithEmptyString";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("");
        StringX padded = original.padLeft(5, '*');

        super.logInfoOriginalResult(original.S(), padded.S());
        assertEquals("*****", padded.toString(),
                "padLeft should add padding for empty string.");

        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testPadRightWithSufficientWidth() {
        final String testName = "testPadRightWithSufficientWidth";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("Hello");
        StringX padded = original.PadRight(10, '*');

        super.logInfoOriginalResult(original.S(), padded.S());
        assertEquals("Hello*****", padded.toString(),
                "PadRight should add padding on the right.");

        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testPadRightWithExactWidth() {
        final String testName = "testPadRightWithExactWidth";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("Hello");
        StringX padded = original.PadRight(5, '*');

        super.logInfoOriginalResult(original.S(), padded.S());
        assertEquals("Hello", padded.toString(),
                "PadRight should not add padding if width is exact.");

        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testPadRightWithInsufficientWidth() {
        final String testName = "testPadRightWithInsufficientWidth";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("Hello");
        StringX padded = original.PadRight(3, '*');

        super.logInfoOriginalResult(original.S(), padded.S());
        assertEquals("Hello", padded.toString(),
                "PadRight should not add padding if width is less than current length.");

        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testPadRightWithEmptyString() {
        final String testName = "testPadRightWithEmptyString";
        logger.info(getTestStartedText(testName));

        StringX original = new StringX("");
        StringX padded = original.PadRight(5, '*');

        super.logInfoOriginalResult(original.S(), padded.S());
        assertEquals("*****", padded.toString(),
                "PadRight should add padding for empty string.");

        logger.info(getTestCompletedText(testName, true));
    }
}
