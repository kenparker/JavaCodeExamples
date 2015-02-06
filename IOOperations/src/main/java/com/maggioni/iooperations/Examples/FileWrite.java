package com.maggioni.iooperations.Examples;

import java.io.*;

/**
 * http://www.tutorialspoint.com/javaexamples/java_files.htm
 * @author maggioni
 */
public class FileWrite {
    public static void main(String[] args)  {
      try {
         BufferedWriter out = new BufferedWriter(new FileWriter("outfilename"));
         out.write("aString");
         out.close();
         System.out.println
         ("File created successfully");
      }
      catch (IOException e) {
      }
   }
}
