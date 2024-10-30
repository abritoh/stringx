package org.apache.clusterbr.util;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;

/**
 * StringW stands for String-Wrapper.
 * This is a wrapper for the Java-String class.
 * Since Java-String class is inmutable this class is an example on how to
 * create a custom wrapper class with the same features and behavior,
 * allowing for extension and direct modification.
 * 
 * This Wrapper correspond to the Java-8 String Class:
 *      https://docs.oracle.com/javase/8/docs/api/index.html?java/lang/String.html
 */
public class StringW
        implements CharSequence, Comparable<StringW>, Serializable {

    private String EMPTY = "";
    private String internal = EMPTY;

    /*
     * 
     * Constructors
     * ************
     * 
     */
    /**
     * Initializes a newly created String object so that it represents an empty
     * character sequence.
     */
    StringW() {
        internal = new String(EMPTY);
    }

    /**
     * Constructs a new String by decoding the specified array of bytes using the
     * platform's default charset.
     * 
     * @param bytes
     */
    StringW(byte[] bytes) {
        internal = new String(bytes);
    }

    /**
     * Constructs a new String by decoding the specified array of bytes using the
     * specified charset.
     * 
     * @param bytes
     * @param charset
     */
    StringW(byte[] bytes, Charset charset) {
        internal = new String(bytes, charset);
    }

    /**
     * Deprecated.
     * This method does not properly convert bytes into characters.
     * As of JDK 1.1, the preferred way to do this is via the String constructors
     * that take a Charset, charset name, or that use the platform's default
     * charset.
     * 
     * @param ascii
     * @param hibyte
     */
    StringW(byte[] ascii, int hibyte) {
        internal = new String(ascii, hibyte);
    }

    /**
     * Constructs a new String by decoding the specified subarray of bytes using the
     * platform's default charset.
     * 
     * @param bytes
     * @param offset
     * @param length
     */
    StringW(byte[] bytes, int offset, int length) {
        internal = new String(bytes, offset, length);
    }

    /**
     * Constructs a new String by decoding the specified subarray of bytes using the
     * specified charset.
     * 
     * @param bytes
     * @param offset
     * @param length
     * @param charset
     */
    StringW(byte[] bytes, int offset, int length, Charset charset) {
        internal = new String(bytes, offset, length, charset);
    }

    /**
     * Deprecated.
     * This method does not properly convert bytes into characters.
     * As of JDK 1.1, the preferred way to do this is via the String constructors
     * that take a Charset,
     * charset name, or that use the platform's default charset.
     * 
     * @param ascii
     * @param hibyte
     * @param offset
     * @param count
     */
    StringW(byte[] ascii, int hibyte, int offset, int count) {
        internal = new String(ascii, hibyte, offset, count);
    }

    /**
     * Constructs a new String by decoding the specified subarray of bytes using the
     * specified charset.
     * 
     * @param bytes
     * @param offset
     * @param length
     * @param charsetName
     * @throws UnsupportedEncodingException
     */
    StringW(byte[] bytes, int offset, int length, String charsetName) throws UnsupportedEncodingException {
        internal = new String(bytes, offset, length, charsetName);
    }

    /**
     * Constructs a new String by decoding the specified array of bytes using the
     * specified charset.
     * 
     * @param bytes
     * @param charsetName
     * @throws UnsupportedEncodingException
     */
    StringW(byte[] bytes, String charsetName) throws UnsupportedEncodingException {
        internal = new String(bytes, charsetName);
    }

    /**
     * Allocates a new String so that it represents the sequence of characters
     * currently contained in the character array argument.
     * 
     * @param value
     */
    StringW(char[] value) {
        internal = new String(value);
    }

    /**
     * Allocates a new String that contains characters from a subarray of the
     * character array argument.
     * 
     * @param value
     * @param offset
     * @param count
     */
    StringW(char[] value, int offset, int count) {
        internal = new String(value, offset, count);
    }

    /**
     * Allocates a new String that contains characters from a subarray of the
     * Unicode code point array argument.
     * 
     * @param codePoints
     * @param offset
     * @param count
     */
    StringW(int[] codePoints, int offset, int count) {
        internal = new String(codePoints, offset, count);
    }

    /**
     * Initializes a newly created String object so that it represents the same
     * sequence of characters as the argument;
     * in other words, the newly created string is a copy of the argument string.
     * 
     * @param original
     */
    StringW(String original) {
        internal = new String(original);
    }

    /**
     * Allocates a new string that contains the sequence of characters currently
     * contained in the string buffer argument.
     * 
     * @param buffer
     */
    StringW(StringBuffer buffer) {
        internal = new String(buffer);
    }

    /**
     * Allocates a new string that contains the sequence of characters currently
     * contained in the string builder argument.
     * 
     * @param builder
     */
    StringW(StringBuilder builder) {
        internal = new String(builder);
    }

    /*
     * 
     * Methods
     * ************
     */

    /**
     * Returns the char value at the specified index.
     * 
     * @param index
     * @return
     */
    public char charAt(int index) {
        return internal.charAt(index);
    }

    /**
     * Returns the character (Unicode code point) at the specified index.
     * 
     * @param index
     * @return
     */
    public int codePointAt(int index) {
        return internal.codePointAt(index);
    }

    /**
     * Returns the character (Unicode code point) before the specified index.
     * 
     * @param index
     * @return
     */
    public int codePointBefore(int index) {
        return internal.codePointBefore(index);
    }

    /**
     * Returns the number of Unicode code points in the specified text range of this
     * String.
     * 
     * @param beginIndex
     * @param endIndex
     * @return
     */
    public int codePointCount(int beginIndex, int endIndex) {
        return internal.codePointCount(beginIndex, endIndex);
    }

    /**
     * Compares two strings lexicographically.
     * 
     * @param anotherString
     * @return
     */
    public int compareTo(String anotherString) {
        return internal.compareTo(anotherString);
    }

    /**
     * Compares two strings lexicographically, ignoring case differences.
     * 
     * @param str
     * @return
     */
    public int compareToIgnoreCase(String str) {
        return internal.compareToIgnoreCase(str);
    }

    /**
     * Concatenates the specified string to the end of this string.
     * 
     * @param str
     * @return
     */
    public String concat(String str) {
        return internal.concat(str);
    }

    /**
     * Returns true if and only if this string contains the specified sequence of
     * char values.
     * 
     * @param s
     * @return
     */
    public boolean contains(CharSequence s) {
        return internal.contains(s);
    }

    /**
     * Compares this string to the specified CharSequence.
     * 
     * @param cs
     * @return
     */
    public boolean contentEquals(CharSequence cs) {
        return internal.contentEquals(cs);
    }

    /**
     * Compares this string to the specified StringBuffer.
     * 
     * @param sb
     * @return
     */
    public boolean contentEquals(StringBuffer sb) {
        return internal.contentEquals(sb);
    }

    /**
     * Equivalent to valueOf(char[]);
     * 
     * @param data
     * @return
     */
    public static String copyValueOf(char[] data) {
        return String.copyValueOf(data);
    }

    /**
     * Equivalent to valueOf(char[], int, int);
     * 
     * @param data
     * @param offset
     * @param count
     * @return
     */
    public static String copyValueOf(char[] data, int offset, int count) {
        return String.copyValueOf(data, offset, count);
    }

    /**
     * 
     * @param suffix
     * @return
     */
    public boolean endsWith(String suffix) {
        return internal.endsWith(suffix);
    }

    /**
     * Compares this string to the specified object.
     * 
     * @param anObject
     * @return
     */
    public boolean equals(Object anObject) {
        return internal.equals(anObject);
    }

    /**
     * Compares this String to another String, ignoring case considerations.
     * 
     * @param anotherString
     * @return
     */
    public boolean equalsIgnoreCase(String anotherString) {
        return internal.equalsIgnoreCase(anotherString);
    }

    /**
     * Returns a formatted string using the specified locale, format string, and
     * arguments.
     * 
     * @param l
     * @param format
     * @param args
     * @return
     */
    public static String format(Locale l, String format, Object... args) {
        return String.format(l, format, args);
    }

    /**
     * Returns a formatted string using the specified format string and arguments.
     * 
     * @param format
     * @param args
     * @return
     */
    public static String format(String format, Object... args) {
        return String.format(format, args);
    }

    /**
     * Encodes this String into a sequence of bytes using the platform's default
     * charset, storing the result into a new byte array.
     * 
     * @return
     */
    public byte[] getBytes() {
        return internal.getBytes();
    }

    /**
     * Encodes this String into a sequence of bytes using the given charset, storing
     * the result into a new byte array.
     * 
     * @param charset
     * @return
     */
    public byte[] getBytes(Charset charset) {
        return internal.getBytes(charset);
    }

    /**
     * Deprecated.
     * This method does not properly convert characters into bytes. As of JDK 1.1,
     * the preferred way to do this is via the getBytes() method, which uses the
     * platform's default charset.
     * 
     * @param srcBegin
     * @param srcEnd
     * @param dst
     * @param dstBegin
     */
    public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
        internal.getBytes(srcBegin, srcEnd, dst, dstBegin);
    }

    /**
     * Encodes this String into a sequence of bytes using the named charset, storing
     * the result into a new byte array.
     * 
     * @param charsetName
     * @return
     * @throws UnsupportedEncodingException
     */
    public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
        return internal.getBytes(charsetName);
    }

    /**
     * Copies characters from this string into the destination character array.
     * 
     * @param srcBegin
     * @param srcEnd
     * @param dst
     * @param dstBegin
     */
    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        internal.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    /**
     * Returns a hash code for this string.
     */
    public int hashCode() {
        return internal.hashCode();
    }

    /**
     * Returns the index within this string of the first occurrence of the specified
     * character.
     * 
     * @param ch
     * @return
     */
    public int indexOf(int ch) {
        return internal.indexOf(ch);
    }

    /**
     * Returns the index within this string of the first occurrence of the specified
     * character, starting the search at the specified index.
     * 
     * @param ch
     * @param fromIndex
     * @return
     */
    public int indexOf(int ch, int fromIndex) {
        return internal.indexOf(ch, fromIndex);
    }

    /**
     * Returns the index within this string of the first occurrence of the specified
     * substring.
     * 
     * @param str
     * @return
     */
    public int indexOf(String str) {
        return internal.indexOf(str);
    }

    /**
     * Returns the index within this string of the first occurrence of the specified
     * substring, starting at the specified index.
     * 
     * @param str
     * @param fromIndex
     * @return
     */
    public int indexOf(String str, int fromIndex) {
        return internal.indexOf(str, fromIndex);
    }

    /**
     * Returns a canonical representation for the string object.
     * 
     * @return
     */
    public String intern() {
        return internal.intern();
    }

    /**
     * Returns true if, and only if, length() is 0.
     * 
     * @return
     */
    public boolean isEmpty() {
        return internal.isEmpty();
    }

    /**
     * Returns a new String composed of copies of the CharSequence elements joined
     * together with a copy of the specified delimiter.
     * 
     * @param delimiter
     * @param elements
     * @return
     */
    public static String join(CharSequence delimiter, CharSequence... elements) {
        return String.join(delimiter, elements);
    }

    /**
     * Returns a new String composed of copies of the CharSequence elements joined
     * together with a copy of the specified delimiter.
     * 
     * @param delimiter
     * @param elements
     * @return
     */
    public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) {
        return String.join(delimiter, elements);
    }

    /**
     * Returns the index within this string of the last occurrence of the specified
     * character.
     * 
     * @param ch
     * @return
     */
    public int lastIndexOf(int ch) {
        return internal.lastIndexOf(ch);
    }

    /**
     * Returns the index within this string of the last occurrence of the specified
     * character, searching backward starting at the specified index.
     * 
     * @param ch
     * @param fromIndex
     * @return
     */
    public int lastIndexOf(int ch, int fromIndex) {
        return internal.lastIndexOf(ch, fromIndex);
    }

    /**
     * Returns the index within this string of the last occurrence of the specified
     * substring.
     * 
     * @param str
     * @return
     */
    public int lastIndexOf(String str) {
        return internal.lastIndexOf(str);
    }

    /**
     * Returns the index within this string of the last occurrence of the specified
     * substring, searching backward starting at the specified index.
     * 
     * @param str
     * @param fromIndex
     * @return
     */
    public int lastIndexOf(String str, int fromIndex) {
        return internal.lastIndexOf(str, fromIndex);
    }

    /**
     * Returns the length of this string.
     * 
     * @return
     */
    public int length() {
        return internal.length();
    }

    /**
     * Tells whether or not this string matches the given regular expression.
     * 
     * @param regex
     * @return
     */
    public boolean matches(String regex) {
        return internal.matches(regex);
    }

    /**
     * Returns the index within this String that is offset from the given index by
     * codePointOffset code points.
     * 
     * @param index
     * @param codePointOffset
     * @return
     */
    public int offsetByCodePoints(int index, int codePointOffset) {
        return internal.offsetByCodePoints(index, codePointOffset);
    }

    /**
     * Tests if two string regions are equal.
     * 
     * @param ignoreCase
     * @param toffset
     * @param other
     * @param ooffset
     * @param len
     * @return
     */
    public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
        return internal.regionMatches(ignoreCase, toffset, other, ooffset, len);
    }

    /**
     * Tests if two string regions are equal.
     * 
     * @param toffset
     * @param other
     * @param ooffset
     * @param len
     * @return
     */
    public boolean regionMatches(int toffset, String other, int ooffset, int len) {
        return internal.regionMatches(toffset, other, ooffset, len);
    }

    /**
     * Returns a string resulting from replacing all occurrences of oldChar in this
     * string with newChar.
     * 
     * @param oldChar
     * @param newChar
     * @return
     */
    public String replace(char oldChar, char newChar) {
        return internal.replace(oldChar, newChar);
    }

    /**
     * Replaces each substring of this string that matches the literal target
     * sequence with the specified literal replacement sequence.
     * 
     * @param target
     * @param replacement
     * @return
     */
    public String replace(CharSequence target, CharSequence replacement) {
        return internal.replace(target, replacement);
    }

    /**
     * Replaces each substring of this string that matches the given regular
     * expression with the given replacement.
     * 
     * @param regex
     * @param replacement
     * @return
     */
    public String replaceAll(String regex, String replacement) {
        return internal.replaceAll(regex, replacement);
    }

    /**
     * Replaces the first substring of this string that matches the given regular
     * expression with the given replacement.
     * 
     * @param regex
     * @param replacement
     * @return
     */
    public String replaceFirst(String regex, String replacement) {
        return internal.replaceFirst(regex, replacement);
    }

    /**
     * Splits this string around matches of the given regular expression.
     * 
     * @param regex
     * @return
     */
    public String[] split(String regex) {
        return internal.split(regex);
    }

    /**
     * Splits this string around matches of the given regular expression.
     * 
     * @param regex
     * @param limit
     * @return
     */
    public String[] split(String regex, int limit) {
        return internal.split(regex, limit);
    }

    /**
     * Tests if this string starts with the specified prefix.
     * 
     * @param prefix
     * @return
     */
    public boolean startsWith(String prefix) {
        return internal.startsWith(prefix);
    }

    /**
     * Tests if the substring of this string beginning at the specified index starts
     * with the specified prefix.
     * 
     * @param prefix
     * @param toffset
     * @return
     */
    public boolean startsWith(String prefix, int toffset) {
        return internal.startsWith(prefix, toffset);
    }

    /**
     * Returns a character sequence that is a subsequence of this sequence.
     * 
     * @param beginIndex
     * @param endIndex
     * @return
     */
    public CharSequence subSequence(int beginIndex, int endIndex) {
        return internal.subSequence(beginIndex, endIndex);
    }

    /**
     * Returns a string that is a substring of this string.
     * 
     * @param beginIndex
     * @return
     */
    public String substring(int beginIndex) {
        return internal.substring(beginIndex);
    }

    /**
     * Returns a string that is a substring of this string.
     * 
     * @param beginIndex
     * @param endIndex
     * @return
     */
    public String substring(int beginIndex, int endIndex) {
        return internal.substring(beginIndex, endIndex);
    }

    /**
     * Converts this string to a new character array.
     * 
     * @return
     */
    public char[] toCharArray() {
        return internal.toCharArray();
    }

    /**
     * Converts all of the characters in this String to lower case using the rules
     * of the default locale.
     * 
     * @return
     */
    public String toLowerCase() {
        return internal.toLowerCase();
    }

    /**
     * Converts all of the characters in this String to lower case using the rules
     * of the given Locale.
     * 
     * @param locale
     * @return
     */
    String toLowerCase(Locale locale) {
        return internal.toLowerCase(locale);
    }

    /**
     * This object (which is already a string!) is itself returned.
     */
    public String toString() {
        return internal.toString();
    }

    /**
     * Converts all of the characters in this String to upper case using the rules
     * of the default locale.
     * 
     * @return
     */
    public String toUpperCase() {
        return internal.toUpperCase();
    }

    /**
     * Converts all of the characters in this String to upper case using the rules
     * of the given Locale.
     * 
     * @param locale
     * @return
     */
    public String toUpperCase(Locale locale) {
        return internal.toUpperCase(locale);
    }

    /**
     * Returns a string whose value is this string, with any leading and trailing
     * whitespace removed.
     * 
     * @return
     */
    public String trim() {
        return internal.trim();
    }

    /**
     * Returns the string representation of the boolean argument.
     * 
     * @param b
     * @return
     */
    public static String valueOf(boolean b) {
        return String.valueOf(b);
    }

    /**
     * Returns the string representation of the char argument.
     * 
     * @param c
     * @return
     */
    public static String valueOf(char c) {
        return String.valueOf(c);
    }

    /**
     * Returns the string representation of the char array argument.
     * 
     * @param data
     * @return
     */
    public static String valueOf(char[] data) {
        return String.valueOf(data);
    }

    /**
     * Returns the string representation of a specific subarray of the char array
     * argument.
     * 
     * @param data
     * @param offset
     * @param count
     * @return
     */
    public static String valueOf(char[] data, int offset, int count) {
        return String.valueOf(data, offset, count);
    }

    /**
     * Returns the string representation of the double argument.
     * 
     * @param d
     * @return
     */
    public static String valueOf(double d) {
        return String.valueOf(d);
    }

    /**
     * Returns the string representation of the float argument.
     * 
     * @param f
     * @return
     */
    public static String valueOf(float f) {
        return String.valueOf(f);
    }

    /**
     * Returns the string representation of the int argument.
     * 
     * @param i
     * @return
     */
    public static String valueOf(int i) {
        return String.valueOf(i);
    }

    /**
     * Returns the string representation of the long argument.
     * 
     * @param l
     * @return
     */
    public static String valueOf(long l) {
        return String.valueOf(l);
    }

    /**
     * Returns the string representation of the Object argument.
     * 
     * @param obj
     * @return
     */
    public static String valueOf(Object obj) {
        return String.valueOf(obj);
    }

    @Override
    public int compareTo(StringW arg0) {
        return this.toString().compareTo(arg0.toString());
    }

    /**
     * 
     * Custom Methods, add more as neccesary.
     * 
     */

    
    public boolean isEmptyOrBlank() {
        return (internal.isEmpty() || internal.isBlank());
    }
}
