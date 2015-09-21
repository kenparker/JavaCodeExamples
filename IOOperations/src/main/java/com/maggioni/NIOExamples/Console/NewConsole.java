package com.maggioni.NIOExamples.Console;

import java.io.Console;

public class NewConsole {

    public static void main(String[] args) {
        Console c = System.console();
        String name = "";
        name = c.readLine("%s", "Name :");
        char[] pw;
        pw = c.readPassword("%s", "pw :");
        for (char q : pw) {
            c.format("%s", q);
        }
    }

}
