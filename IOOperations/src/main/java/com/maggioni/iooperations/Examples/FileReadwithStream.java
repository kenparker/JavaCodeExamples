package com.maggioni.iooperations.Examples;

import java.io.*;

/**
 * http://www.java2s.com/Tutorials/Java/IO/Text_File/Convert_InputStream_to_String_in_Java.htm
 * 
 * @author maggioni
 */
public class FileReadwithStream {

    public static void main(String[] args) throws Exception {
        InputStream is = FileReadwithStream.class.getResourceAsStream("/data.txt");
        System.out.println(convertStreamToString(is));
    }

    public static String convertStreamToString(InputStream is) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line + "\n");
        }
        is.close();
        return sb.toString();
    }
}
