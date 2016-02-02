package com.maggioni.NIOExamples.Basics;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvingPathDemo1 {

    public static void main(String[] args) {
        Path absolute = Paths.get("/home/java");
        Path relative = Paths.get("dir");
        Path file = Paths.get("model.pdf");
        
        System.out.println("1 : " + absolute.resolve(relative));
        System.out.println("2 : " + absolute.resolve(file));
        System.out.println("3 : " + relative.resolve(file));
        System.out.println("4 : " + relative.resolve(absolute)); // bad
        System.out.println("5 : " + file.resolve(absolute));    // bad
        System.out.println("6 : " + file.resolve(relative));    // bad
        
        /*
        String pathNull1 = null;
        System.out.println("7 : " + absolute.resolve(pathNull1)); // compile but will throw "NullPointerException
        System.out.println("8 : " + absolute.resolve((String) pathNull1)); // compile but will throw "NullPointerException
        System.out.println("9 : " + absolute.resolve((String) null)); // compile but will throw "NullPointerException*/
        
        String pathNull2;
        //System.out.println("7 : " + absolute.resolve(pathNull2)); // do not compile because var = null
        
        absolute = Paths.get("c:/");
        relative = Paths.get(".");
        System.out.println("10 : " + absolute.resolve(relative));
        System.out.println("11 : " + relative.resolve(absolute));
     
        
        
        Path p1 = Paths.get("\\personal\\readme.txt");
        Path p2 = Paths.get("\\index.txt");
        Path p3 = p1.resolve(p2);
        System.out.println("12: "+p3.toString());
    }

}
