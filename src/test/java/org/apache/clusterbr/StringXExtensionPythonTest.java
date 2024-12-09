package org.apache.clusterbr;

import org.junit.jupiter.api.Test;
import org.apache.clusterbr.util.StringX;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for StringXExtensionPython extension-methods.
 * 
 * @author abrito | 2024-oct
 * 
 */
public class StringXExtensionPythonTest extends BaseTest {

    // -- Capitalize()

    @Test
    void testCapitalizeRegularInput() {
        final String testName = "testCapitalizeRegularInput";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("stringX");
        StringX result = input.capitalize();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("StringX", result.toString(), "Should capitalize first letter");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testCapitalizeSingleCharacter() {
        final String testName = "testCapitalizeSingleCharacter";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("b");
        StringX result = input.capitalize();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("B", result.toString(), "Should capitalize single character");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testCapitalizeEmptyString() {
        final String testName = "testCapitalizeEmptyString";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("");
        StringX result = input.capitalize();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("", result.toString(), "Should return empty string");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testCapitalizeAlreadyCapitalized() {
        final String testName = "testCapitalizeAlreadyCapitalized";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("StringX");
        StringX result = input.capitalize();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("StringX", result.toString(), "Should remain unchanged");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testCapitalizeMultipleWords() {
        final String testName = "testCapitalizeMultipleWords";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("hello StringX");
        StringX result = input.capitalize();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("Hello StringX", result.toString(), "Should only capitalize first letter");
        logger.info(getTestCompletedText(testName, true));
    }

    // -- Title()

    @Test
    void testTitleRegularSentence() {
        final String testName = "testTitleRegularSentence";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("hello stringX");
        StringX result = input.title();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("Hello StringX", result.toString(), "Each word should be capitalized");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testTitleSingleWord() {
        final String testName = "testTitleSingleWord";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("stringX");
        StringX result = input.title();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("StringX", result.toString(), "Single word should be capitalized");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testTitleEmptyString() {
        final String testName = "testTitleEmptyString";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("");
        StringX result = input.title();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("", result.toString(), "Empty string should return an empty result");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testTitleAlreadyCapitalized() {
        final String testName = "testTitleAlreadyCapitalized";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("Hello StringX");
        StringX result = input.title();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("Hello StringX", result.toString(), "Should remain unchanged if already in title case");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testTitleMultipleSpacesBetweenWords() {
        final String testName = "testTitleMultipleSpacesBetweenWords";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("hello   stringX");
        StringX result = input.title();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("Hello   StringX", result.toString(), "Should handle multiple spaces correctly");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testTitleLeadingAndTrailingSpaces() {
        final String testName = "testTitleLeadingAndTrailingSpaces";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("   clusterBR stringX   ");
        StringX result = input.title();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("   ClusterBR StringX   ", result.toString(), "Should retain leading and trailing spaces");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testTitleSpecialCharacters() {
        final String testName = "testTitleSpecialCharacters";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("can-you-stringX-?");
        StringX result = input.title();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("Can-You-StringX-?", result.toString(), "Should treat non-space delimiters as part of the word");
        logger.info(getTestCompletedText(testName, true));
    }

    // --Swapcase()

    @Test
    void testSwapcaseRegularInput() {
        final String testName = "testSwapcaseRegularInput";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("StringX & sTRINGx");
        StringX result = input.swapcase();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("sTRINGx & StringX", result.toString(), "Should swap case of each character");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testSwapcaseSingleLowercaseCharacter() {
        final String testName = "testSwapcaseSingleLowercaseCharacter";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("x");
        StringX result = input.swapcase();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("X", result.toString(), "Lowercase character should become uppercase");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testSwapcaseSingleUppercaseCharacter() {
        final String testName = "testSwapcaseSingleUppercaseCharacter";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("A");
        StringX result = input.swapcase();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("a", result.toString(), "Uppercase character should become lowercase");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testSwapcaseEmptyString() {
        final String testName = "testSwapcaseEmptyString";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("");
        StringX result = input.swapcase();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("", result.toString(), "Empty string should return empty result");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testSwapcaseNumbersAndSymbols() {
        final String testName = "testSwapcaseNumbersAndSymbols";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("999.99!@#333.33");
        StringX result = input.swapcase();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("999.99!@#333.33", result.toString(), "Non-alphabetic characters should remain unchanged");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testSwapcaseMixedCharacters() {
        final String testName = "testSwapcaseMixedCharacters";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("aBc123XyZ");
        StringX result = input.swapcase();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("AbC123xYz", result.toString(), "Should swap only alphabetic characters");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testSwapcaseWithSpaces() {
        final String testName = "testSwapcaseWithSpaces";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("sTRINGx OR StringX");
        StringX result = input.swapcase();

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("StringX or sTRINGx", result.toString(), "Should swap only alphabetic characters-2");
        logger.info(getTestCompletedText(testName, true));
    }

    // -- zfill(..)

    @Test
    void testZfillWithWidthGreaterThanLength() {
        final String testName = "testZfillWithWidthGreaterThanLength";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("1000000001");
        StringX result = input.zfill(20);
        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("00000000001000000001", result.toString(), "Should pad with zeros to the left.");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testZfillWithExactWidth() {
        final String testName = "testZfillWithExactWidth";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("9999999999999");
        StringX result = input.zfill(13);

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("9999999999999", result.toString(), "Should return the same string when width matches length.");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testZfillWithSmallerWidth() {
        final String testName = "testZfillWithSmallerWidth";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("abcdef");
        StringX result = input.zfill(4);

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("abcdef", result.toString(), "Should return the same string if width is smaller than length.");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testZfillWithEmptyString() {
        final String testName = "testZfillWithEmptyString";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("");
        StringX result = input.zfill(3);

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("000", result.toString(), "Should return only zeros if input is empty.");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testZfillWithZeroWidth() {
        final String testName = "testZfillWithZeroWidth";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("data");
        StringX result = input.zfill(0);

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("data", result.toString(), "Should return the same string if width is 0.");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testZfillWithNegativeWidth() {
        final String testName = "testZfillWithNegativeWidth";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("xyz");
        StringX result = input.zfill(-1);

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("xyz", result.toString(), "Should return the same string if width is negative.");
        logger.info(getTestCompletedText(testName, true));
    }

    // -- removePrefix(...)

    @Test
    void testRemovePrefixWithMatchingPrefix() {
        final String testName = "testRemovePrefixWithMatchingPrefix";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("HelloStringX");
        StringX result = input.removeprefix("Hello");

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("StringX", result.toString(), "Should remove matching prefix.");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testRemovePrefixWithNoMatchingPrefix() {
        final String testName = "testRemovePrefixWithNoMatchingPrefix";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("Could you StringX?");
        StringX result = input.removeprefix("Try");

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("Could you StringX?", result.toString(), "Should return original string if prefix doesn't match.");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testRemovePrefixWithEmptyPrefix() {
        final String testName = "testRemovePrefixWithEmptyPrefix";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("More stuff!");
        StringX result = input.removeprefix("");

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("More stuff!", result.toString(), "Empty prefix should not modify the string.");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testRemovePrefixWithFullStringAsPrefix() {
        final String testName = "testRemovePrefixWithFullStringAsPrefix";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("From String to StringX");
        StringX result = input.removeprefix("From String to StringX");

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("", result.toString(), "If the whole string is the prefix, result should be empty.");
        logger.info(getTestCompletedText(testName, true));
    }

    // -- removesuffix

    @Test
    void testRemoveSuffixWithMatchingSuffix() {
        final String testName = "testRemoveSuffixWithMatchingSuffix";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("String to StringX. Then do it.");
        StringX result = input.removesuffix(" Then do it.");

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("String to StringX.", result.toString(), "Should remove matching suffix.");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testRemoveSuffixWithNoMatchingSuffix() {
        final String testName = "testRemoveSuffixWithNoMatchingSuffix";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("Making String a Fun Thing");
        StringX result = input.removesuffix("What?");

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("Making String a Fun Thing", result.toString(), "Should return original string if suffix doesn't match.");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testRemoveSuffixWithEmptySuffix() {
        final String testName = "testRemoveSuffixWithEmptySuffix";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("String.format is deprecated!");
        StringX result = input.removesuffix("Isn't it?");

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("String.format is deprecated!", result.toString(), "Empty suffix should not modify the string.");
        logger.info(getTestCompletedText(testName, true));
    }

    @Test
    void testRemoveSuffixWithFullStringAsSuffix() {
        final String testName = "testRemoveSuffixWithFullStringAsSuffix";
        logger.info(getTestStartedText(testName));

        StringX input = new StringX("No body told you, but java-interfaces are just pure-abstract classes");
        StringX result = input.removesuffix("No body told you, but java-interfaces are just pure-abstract classes");

        super.logInfoOriginalResult(input.S(), result.S());
        assertEquals("", result.toString(), "If the whole string is the suffix, result should be empty.");
        logger.info(getTestCompletedText(testName, true));
    }

}
