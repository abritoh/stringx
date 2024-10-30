package org.apache.clusterbr.util;

/**
 * This interface extends StringX with some methods from Javascript String
 * 
 * @author abrito | 2024-oct
 */
public interface StringXExtensionJavascript extends StringXNativeInterfaces {

    /**
     * Pads a string to a specified length by adding characters to the beginning,
     * returns a new String.
     * 
     * @return
     */
    default StringX padStart(int totalWidth, char paddingChar) {
        StringXExtensionCSharp stringx = new StringX();
        return stringx.padLeft(totalWidth, paddingChar);
    }

    /**
     * Pads a string to a specified length by adding characters to the end,
     * returns a new String.
     * 
     * @return
     */
    default StringX padEnd(int totalWidth, char paddingChar) {
        StringXExtensionCSharp stringx = new StringX();
        return stringx.PadRight(totalWidth, paddingChar);
    }

    /**
     * Trims whitespace only from the start of a string,
     * returns a new String.
     * 
     * @return
     */
    default StringX trimStart() {
        String internal = this.toString();
        return new StringX(internal.stripLeading());
    }

    /**
     * Trims whitespace only from the end of a string,
     * returns a new String.
     * 
     * @return
     */
    default StringX trimEnd() {
        String internal = this.toString();
        return new StringX(internal.stripTrailing());
    }

    /**
     * Checks if a string contains a specified substring,
     * returns a boolean value
     * 
     * @return
     */
    default boolean includes(String other) {
        String internal = this.toString();
        return internal.contains(other);
    }

    /**
     * Returns a new string containing the specified number of copies of the
     * original string.
     * 
     * @return
     */
    default StringX repeat(int ntimes) {
        String internal = this.toString();
        StringBuilder result = new StringBuilder("");
        for (int i = 1; i <= ntimes; i++)
            result.append(internal);
        return new StringX(result.toString());
    }

}
