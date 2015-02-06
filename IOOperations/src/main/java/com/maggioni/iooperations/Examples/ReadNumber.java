package com.maggioni.iooperations.Examples;

import java.io.*;
import java.text.DecimalFormat;
import java.text.ParseException;

/**
 *
 * @author maggioni
 */
public class ReadNumber {

    public static void main(String[] args) {
        System.out.println("Enter a number.");
        double numberFromConsole;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            DecimalFormat df = new DecimalFormat();
            Number n = df.parse(s);
            numberFromConsole = n.doubleValue();
        } catch (IOException e) {
            numberFromConsole = 0;
        } catch (ParseException e) {
            numberFromConsole = 0;
        }
        System.out.println(numberFromConsole);
    }
}
