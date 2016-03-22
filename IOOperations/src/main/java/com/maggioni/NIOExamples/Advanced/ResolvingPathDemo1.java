package com.maggioni.NIOExamples.Advanced;

import java.nio.file.Path;
import java.nio.file.Paths;

/*
 Joining Two Paths
https://docs.oracle.com/javase/tutorial/essential/io/pathOps.html#resolve

 You can combine paths by using the resolve method. 
 You pass in a partial path , which is a path that does not include a root element, and that partial path is appended to the original path.
 For example, consider the following code snippet:

 // Solaris
 Path p1 = Paths.get("/home/joe/foo");
 // Result is /home/joe/foo/bar
 System.out.format("%s%n", p1.resolve("bar"));

 or

 // Microsoft Windows
 Path p1 = Paths.get("C:\\home\\joe\\foo");
 // Result is C:\home\joe\foo\bar
 System.out.format("%s%n", p1.resolve("bar"));

 Passing an absolute path to the resolve method returns the passed-in path:
 // Result is /home/joe
 Paths.get("foo").resolve("/home/joe");
 */
public class ResolvingPathDemo1 {

    public static void main(String[] args) {
        Path absolute = Paths.get("/home/java");
        Path relative = Paths.get("dir");
        Path file = Paths.get("model.pdf");

        System.out.println("1 : " + absolute.resolve(relative));
        // --> 1 : \home\java\dir
        System.out.println("2 : " + absolute.resolve(file));
        // --> 2 : \home\java\model.pdf
        System.out.println("3 : " + relative.resolve(file));
        // --> 3 : dir\model.pdf
        System.out.println("4 : " + relative.resolve(absolute)); // bad
        // --> 4 : \home\java
        System.out.println("5 : " + file.resolve(absolute));    // bad
        // --> 5 : \home\java
        System.out.println("6 : " + file.resolve(relative));    // bad
        // --> 6 : model.pdf\dir

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
        // --> 10 : c:\.
        System.out.println("11 : " + relative.resolve(absolute));
        // --> 11 : c:\

        Path p1 = Paths.get("\\personal\\readme.txt");
        Path p2 = Paths.get("\\index.txt");
        Path p3 = p1.resolve(p2);
        System.out.println("12: " + p3.toString());
        // --> 12: \index.txt

        Path p4 = Paths.get("C:\\home\\joe\\foo");
        // Result is C:\home\joe\foo\bar
        System.out.format("13: %s%n", p4.resolve("bar"));
    }

}
