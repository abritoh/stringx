package org.apache.clusterbr;

import java.util.stream.Stream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base-class for Unit test classes.
 * 
 * @author abrito | 2024-oct 
 */
public abstract class BaseTest {

    protected static final Logger logger = LoggerFactory.getLogger("StringX-JUnit-Tests");
    
    protected String getTestStartedText(String testName) {
        return String.format("Test started: %s", testName);
    }

    protected String getTestCompletedText(String testName, boolean result) {
        return String.format("Test completed: %s ─ Status: %s", testName, result ? "PASSED" : "FAILED");
    }    

    protected String getOriginalExpectedText(String original, String expected) {
        return String.format("Original: %s ─ Expected: %s", original, expected);
    }

    protected void logInfoOriginalResult(String original, String result) {
        logger.info(String.format("   Original -> %s", original));
        logger.info(String.format("   Result   -> %s", result));
    } 

    protected void logInfoMultiple(String ... texts) {
        Stream<String> stream = Stream.of(texts);
        stream.forEach(t -> logger.info(t));
    }    

}
