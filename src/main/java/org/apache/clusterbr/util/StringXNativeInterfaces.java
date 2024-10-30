package org.apache.clusterbr.util;

/**
 * Composed interface to be implemented by StringX Class 
 * and extended by other Interfaces that provide extension-methods for StringX Class
 *
 * @author abrito | 2024-oct
 */
public interface StringXNativeInterfaces extends CharSequence, Comparable<StringX> {

    static final String EMPTY = "";
    
}
