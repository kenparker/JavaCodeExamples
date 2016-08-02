package com.maggioni.MostMissed.PracticeTestII;

import java.nio.file.FileSystems;
import java.nio.file.PathMatcher;

public class MatcherDemo1 {

    public static void main(String[] args) {
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("\\d");
        pathMatcher.matches(null);
    }

}
