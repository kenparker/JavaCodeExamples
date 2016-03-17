package com.maggioni.NIOExamples.Basics;

import java.nio.file.Path;
import java.nio.file.Paths;

/*
Creating a Path Between Two Paths
https://docs.oracle.com/javase/tutorial/essential/io/pathOps.html#relativize

A common requirement when you are writing file I/O code is the capability to construct a path from one location in the file system to another location. 
You can meet this using the relativize method. 
This method constructs a path originating from the original path and ending at the location specified by the passed-in path. The new path is relative to the original path.

For example, consider two relative paths defined as joe and sally:

Path p1 = Paths.get("joe");
Path p2 = Paths.get("sally");
In the absence of any other information, it is assumed that joe and sally are siblings, 
meaning nodes that reside at the same level in the tree structure. 
To navigate from joe to sally, you would expect to first navigate one level up to the parent node and then down to sally:

// Result is ../sally
Path p1_to_p2 = p1.relativize(p2);
// Result is ../joe
Path p2_to_p1 = p2.relativize(p1);
Consider a slightly more complicated example:

Path p1 = Paths.get("home");
Path p3 = Paths.get("home/sally/bar");
// Result is sally/bar
Path p1_to_p3 = p1.relativize(p3);
// Result is ../..
Path p3_to_p1 = p3.relativize(p1);
In this example, the two paths share the same node, home. 
To navigate from home to bar, you first navigate one level down to sally and then one more level down to bar. 
Navigating from bar to home requires moving up two levels.

A relative path cannot be constructed if only one of the paths includes a root element. 
If both paths include a root element, the capability to construct a relative path is system dependent.
*/

public class RelativizeDemo1 {

    public static void main(String[] args) {
        Path p1 = Paths.get("\\personal\\readme.txt");
        Path p2 = Paths.get("\\index.txt");
        Path p3 = Paths.get("index.txt");
        /*
        public Path relativize(Path other)
        Constructs a relative path between this path and a given path. Relativization is the inverse of resolution.
        
        To construct a path between two Path objects, use method relativize(). 
        It can be used to construct a path between two relative or absolute Path objects.
        You can’t create a path from a relative path to an absolute path and vice versa using method relativize(). 
        If you do so, you’ll get a runtime exception (IllegalArgumentException).
        Method relativize() doesn’t check the actual file system to verify if the file (or directory) the resulting path is referring to actually exists.
        */
        System.out.println("12: "+p1.relativize(p2)); // ..\..\index.txt
        System.out.println("13: "+p2.relativize(p1)); // ..\personal\readme.txt
        System.out.println("14: "+p1.relativize(p2)); // ..\..\index.txt
        System.out.println("15: "+p2.relativize(p1)); // ..\personal\readme.txt
        
        p1 = Paths.get("c:\\personal\\readme.txt");
        p2 = Paths.get("c:\\index.txt");
        System.out.println("16: "+p1.relativize(p2)); // ..\..\index.txt
        System.out.println("17: "+p2.relativize(p1)); // ..\personal\readme.txt
        p2 = Paths.get("index.txt");
        //System.out.println("18: "+p2.relativize(p1)); // RunTimeError -> IllegalArgumentException
    }

}
