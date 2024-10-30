package org.apache.clusterbr.util;

import java.util.Arrays;
import java.util.List;

/**
 * This interface extends StringX with some methods from Python String
 * 
 * @author abrito | 2024-oct 
 */
public interface StringXExtensionPython extends StringXNativeInterfaces {

    /**
     * Capitalizes the first character of the string, returns a new String.
     * 
     * @return
     */
    default StringX capitalize() {        
        String internal = this.toString();
        StringX result = new StringX(this.toString());

        if (!internal.isEmpty()) {
            String schar0 = String.valueOf(internal.charAt(0)).toUpperCase();
            if (internal.length() > 1) {
                result = new StringX(schar0 + internal.substring(1, internal.length()));
            } else {
                result = new StringX(schar0);
            }
        }
        return result;
    }

    /**
     * Converts the first character of each word to uppercase, returns a new String.
     * 
     * @return
     */
    default StringX title() {
        String internal = this.toString();
        StringBuilder result = new StringBuilder("");
        List<String> listWordSeparator = Arrays.asList(" ", "-", "─");

        if (!internal.isEmpty()) {

            char previous = 0;
            char[] array = internal.toCharArray();

            for (int i = 0; i < array.length; i++) {
                char current = array[i];
                String current_str = String.valueOf(current);
                String previous_str = String.valueOf(previous);

                if (i == 0) {
                    result.append(current_str.toUpperCase());
                } else if ((i > 0) && listWordSeparator.contains(previous_str)) {
                    result.append(current_str.toUpperCase());
                } else {
                    result.append(current_str);
                }
                previous = current;
            }
        }
        return new StringX(result);
    }

    /**
     * Make the lower case letters upper case and the upper case letters lower case,
     * returns a new String.
     * 
     * @return
     */
    default StringX swapcase() {
        String internal = this.toString();
        StringBuilder result = new StringBuilder("");

        if (!internal.isEmpty()) {

            char[] array = internal.toCharArray();

            for (int i = 0; i < array.length; i++) {
                char current = array[i];
                if (Character.isLowerCase(current)) {
                    result.append(Character.toUpperCase(current));
                } else if (Character.isUpperCase(current)) {
                    result.append(Character.toLowerCase(current));
                } else {
                    result.append(current);
                }
            }
        }
        return new StringX(result);
    }

    /**
     * Pads the string with zeros on the left to fill a specified width,
     * returns a new String.
     * 
     * @return
     */
    default StringX zfill(int width) {
        String internal = this.toString();
        StringBuilder result = new StringBuilder("");

        if (width > 0 && width > internal.length()) {            
            int zerosWidth = width - internal.length();
            StringBuilder zerosAtLeft = new StringBuilder();
            for (int i = 0; i < zerosWidth; i++) {
                zerosAtLeft.append("0");
            }
            result.append(zerosAtLeft).append(internal);
        } else {
            result.append(internal);
        }
        return new StringX(result);
    }

    /**
     * Removes a specified prefix from the string, if present,
     * returns a new String.
     * @return
     */
    default StringX removeprefix(String prefix) {
        String internal = this.toString();
        StringBuilder result = new StringBuilder("");

        int index = internal.indexOf(prefix);
        if(index == 0 ) {
            int newStartIndex = index + prefix.length();
            result.append( internal.substring(newStartIndex) );
        } else {
            result.append(internal);
        }
        return new StringX(result);
    }

    /**
     * Removes a specified suffix from the string, if present
     * returns a new String.
     * @return
     */
    default StringX removesuffix(String prefix) {
        String internal = this.toString();
        StringBuilder result = new StringBuilder("");

        int index = internal.indexOf(prefix);
        int indexMustbe = internal.length() - prefix.length();
        if(index == indexMustbe) {
            result.append( internal.substring(0, indexMustbe) );
        } else {
            result.append(internal);
        }
        return new StringX(result);
    }    
}