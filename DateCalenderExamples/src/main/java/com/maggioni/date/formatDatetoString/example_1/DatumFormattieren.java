
package com.maggioni.date.formatDatetoString.example_1;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 *
 * javabeginners.de
 */
public class DatumFormattieren {

    public DatumFormattieren() {
        String className = getClass().getName();
        System.out.println("classname :" + className);
        className = className.replace(".", "/");
        System.out.println("classname after replace :" + className);
        String path = System.getProperty("user.dir") + "/src/main/java/" + className + ".java";
        System.out.println("path : " + path);
        File file = new File(path);
        
        // core code to format a date
        SimpleDateFormat sf = new SimpleDateFormat();
        System.out.println("" + sf.format(file.lastModified()));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new DatumFormattieren();
    }
    
}
