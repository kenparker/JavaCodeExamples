package com.maggioni.NIOExamples.Basics;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class GlobDemo1 {

    public static void main(String[] args) {
        PathMatcher pathMatcher;
        Path a = Paths.get("c:/temp/dir/a.txt");
        Path b = Paths.get("c:/temp/dir/subdir/b.txt");
        
        String glob1 = "*/*.txt";
        checkGlob(1,glob1, a, b);
        glob1 = "?*/*/*/*.txt";
        checkGlob(2,glob1, a, b);
        glob1 = "**.txt";
        checkGlob(3,glob1, a, b);
        
        a = Paths.get("/temp/dir/angelo.txt");
        glob1 = "?*/*/*/*.txt";
        checkGlob(4,glob1, a, b);
        a = Paths.get("/temp/dir/angelo.txt");
        glob1 = "*/*/*/[a]*[o].txt";
        checkGlob(5,glob1, a, b);
        glob1 = "*/*/*/[a][a-z]*[o].txt";
        a = Paths.get("/temp/dir/aagelo.txt");
        checkGlob(6,glob1, a, b);
        
    }

    private static void checkGlob(int seq, String glob1, Path a, Path b) {
        PathMatcher pathMatcher;
        pathMatcher = FileSystems.getDefault().getPathMatcher("glob:"+glob1);
        System.out.println(seq+". glob=" + glob1  + " "+ a + "=" + pathMatcher.matches(a) + " " + b + "=" + pathMatcher.matches(b));
    }

}
