package com.maggioni.NIOExamples.Whitzlab.PathMatcher;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class PathMatcherDemo1 {

    public static void main(String[] args) {
        Path p1 = Paths.get("/whitzlab/web/imp/logo.jpg");
        Path p2 = Paths.get("/whitzlab/web/imp/logo.pdf");
        Path p3 = Paths.get("/whitzlab/web/imp/logo.pdff");
        
        String s1 = "glob:*.{pdf,jpg}";
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(s1);
        System.out.println(s1 + " | " + p1 + " | " + pathMatcher.matches(p1.getFileName()));    // true
        s1 = "glob:**.{pdf,jpg}";
        pathMatcher = FileSystems.getDefault().getPathMatcher(s1);
        System.out.println(s1 + " | " + p1 + " | " + pathMatcher.matches(p1.getFileName()));    // true
        System.out.println(s1 + " | " + p2 + " | " + pathMatcher.matches(p2.getFileName()));    // true
        System.out.println(s1 + " | " + p3 + " | " + pathMatcher.matches(p3.getFileName()));    // false
        
        s1 = "regex:\\D*.[pdf|jpgg]";
        pathMatcher = FileSystems.getDefault().getPathMatcher(s1);
        System.out.println(s1 + " | " + p1 + " | " + pathMatcher.matches(p1.getFileName()));    // true
        System.out.println(s1 + " | " + p2 + " | " + pathMatcher.matches(p2.getFileName()));    // true
        System.out.println(s1 + " | " + p3 + " | " + pathMatcher.matches(p3.getFileName()));    // true
        
        Pattern pa1 = Pattern.compile("\\D*.[pdf|jpg]");
        pathMatcher = FileSystems.getDefault().getPathMatcher("regex:"+pa1);
        System.out.println(pa1 + " | " + p1 + " | " + pathMatcher.matches(p1.getFileName()));    // true
    }

}
