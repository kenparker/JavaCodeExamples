package com.maggioni.MOOC.Lessons;

import com.maggioni.Core.Utilities.ListOfAllSystemProperties;
import java.net.URL;

public class GetPathClass {

    public static void main(String[] args) {

        ClassLoader cl = GetPathClass.class.getClassLoader();
        System.out.println("" + cl.getResource("com/maggioni/MOOC/Lessons/GetPathClass.class"));
        /* getting:
         file:/C:/Users/magang/Documents/Java_Uebungen/JavaCodeExamplesNewTry/LambdaExamples/target/classes/com/maggioni/MOOC/Lessons/GetPathClass.class
         */
        URL url = GetPathClass.class.getProtectionDomain().getCodeSource().getLocation();
        String path = GetPathClass.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        System.out.println(" URL :" + url); // URL :file:/C:/Users/magang/Documents/Java_Uebungen/JavaCodeExamplesNewTry/LambdaExamples/target/classes/
        System.out.println(" path :" + path); // path :/C:/Users/magang/Documents/Java_Uebungen/JavaCodeExamplesNewTry/LambdaExamples/target/classes/
        System.out.println("");
        ListOfAllSystemProperties.getAllSystemProperties();
    }

}
