package com.test;
import java.util.Locale;

public class LocaleOne {
 
    public static void main(String[] args) {
      
       Locale myLocale = Locale.getDefault();
       System.out.println(myLocale.getCountry());
       System.out.println(myLocale.getLanguage());
       System.out.println(myLocale.getDisplayCountry());
       System.out.println(myLocale.getDisplayLanguage());
    }
}