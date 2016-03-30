package com.maggioni.MostDifficults;

import java.util.Locale;

/*
https://docs.oracle.com/javase/tutorial/i18n/format/simpleDateFormat.html
https://docs.oracle.com/javase/7/docs/api/java/text/DateFormat.html
https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html

*/
public class DateFormatDemo1 {

    public static void main(String[] args) {
        
        Locale aDefault = Locale.getDefault();
        System.out.println("default Locale : " + aDefault.getCountry() +
                                "\n aDefault.getDisplayCountry() "+ aDefault.getDisplayCountry() +
                                "\n aDefault.getDisplayLanguage() "+ aDefault.getDisplayLanguage() +
                                "\n aDefault.getDisplayName() "+ aDefault.getDisplayName() +
                                "\n aDefault.getLanguage() "+ aDefault.getLanguage());
    }

}
