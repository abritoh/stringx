package org.apache.clusterbr.util;

/**
 * This interface extends StringX with some methods from C-Sharp String
 * 
 * @author abrito | 2024-oct
 */
public interface StringXExtensionCSharp extends StringXNativeInterfaces {

    /**
     * Returns a new string that right-aligns the characters in this instance by
     * padding them
     * with spaces on the left, for a specified total length.
     * 
     * @param totalWidth
     * @param paddingChar
     * @return
     */
    default StringX padLeft(int totalWidth, char paddingChar) {
        StringX result = null;
        String internal = this.toString();

        if (totalWidth > internal.length()) {
            int numberOfBlanks = totalWidth - internal.length();
            result = new StringX(Character.toString(paddingChar).repeat(numberOfBlanks) + internal);
        } else {
            result = new StringX(this.toString());
        }
        return result;
    }

    /**
     * Returns a new string that left-aligns the characters in this string by
     * padding them
     * with spaces on the right, for a specified total length.
     * 
     * @param totalWidth
     * @param paddingChar
     * @return
     */
    default StringX PadRight(int totalWidth, char paddingChar) {
        StringX result = null;
        String internal = this.toString();

        if (totalWidth > internal.length()) {
            int numberOfBlanks = totalWidth - internal.length();
            result = new StringX(internal + Character.toString(paddingChar).repeat(numberOfBlanks));
        } else {
            result = new StringX(this.toString());
        }
        return result;
    }
}