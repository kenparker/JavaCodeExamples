package com.maggioni.NIOExamples.Basics;

import java.io.File;
import java.io.IOException;

public class NIOSelfTestExercise {

    public static void main(String[] args) {
        File dir = new File("dir3");
        File file = new File(dir, "file3");
        boolean mkdir = dir.mkdir();
        try {
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println("error");
        }
    }

}
