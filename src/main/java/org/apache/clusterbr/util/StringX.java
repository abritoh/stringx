package org.apache.clusterbr.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Custom StringX Class, since Java String Class is inmutable hence direct
 * inheritance is not possible, to overcome that, this Class provides semantic 
 * extension-methods through Interfaces.
 *
 * @author abrito | 2024-oct
 */
public class StringX
      implements
      Serializable, StringXExtensionCSharp, StringXExtensionJavascript, StringXExtensionPython {

   private StringBuilder internal = null;

   // -- Section: Constructors

   public StringX() {
      internal = new StringBuilder(EMPTY);
   }

   public StringX(String input) {
      String value = (input != null) ? input : EMPTY;
      internal = new StringBuilder(value);
   }

   public StringX(StringBuilder input) {
      String value = (input != null) ? input.toString() : EMPTY;
      internal = new StringBuilder(value);
   }

   //-- Section: CharSequence

   @Override
   public char charAt(int index) {
      return internal.charAt(index);
   }

   @Override
   public int length() {
      return internal.length();
   }

   @Override
   public CharSequence subSequence(int start, int end) {
      return internal.subSequence(start, end);
   }

   //-- Section: Comparable<StringX>

   @Override
   public int compareTo(StringX other) {
      return internal.toString().compareTo(other.toString());
   }

   /**
    * This method returns native Java-String representation of this StringX class.
    * Hence the resulting String object contains all Java-String native methods.
    * 
    * @return the String representation of this object
    */
   @Override
   public String toString() {
      return internal.toString();
   }

   /**
    * Gives access to the Java String object through a shortcut method.
    * 
    * @return the String representation of this object
    */
   public String S() {
      return internal.toString();
   }

   /**
    * Gives access to the Java StringBulder object through a shortcut method.
    * 
    * @return the String representation of this object
    */
    public StringBuilder SB() {
      return this.internal;
   }   

   /**
    * Combines String.isEmpty() and String.isBlank() methods.
    * @return
    */
   public boolean isEmptyOrBlank() {
      return (internal.toString().isEmpty() || internal.toString().isBlank());
   }


   public List<String> toListOfStrings() {
      String internal = this.toString();
      char[] chars = internal.toCharArray();
      List<String> list = new ArrayList<String>();
      for(int i=0; i < chars.length; i++) {
         list.add( String.valueOf(chars[i]) );         
      }
      return list;
   }

   public String[] toArrayOfStrings() {
      List<String> list = this.toListOfStrings();
      return (!list.isEmpty()) ? list.stream().toArray(String[]::new) : null;
   }
}