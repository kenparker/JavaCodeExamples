
package com.maggioni.PartI.Chapter4;

import java.io.IOException;



public class Frisbee {

    /* Two points to notice here
        1. IOException on line 13 is only working if the import in line 4 is also added
        2. Exception an RunTimeException are belonging to java.lang package which is auti-imported in every Java program
    */
    //public static void main(String[] args) throws IOException{
    //public static void main(String[] args) throws Exception{
    public static void main(String[] args) throws RuntimeException{
        int x= 0;
        System.out.println(7/x);
    }
    
}
