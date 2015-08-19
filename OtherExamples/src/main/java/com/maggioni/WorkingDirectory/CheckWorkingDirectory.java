
package com.maggioni.WorkingDirectory;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author maggioni
 * 
 * http://stackoverflow.com/questions/4871051/getting-the-current-working-directory-in-java
 */
public class CheckWorkingDirectory {
    
    public static void main(String args[]) {
        
        userDirHome();
        currentPath();
        
    }
    
    public static void userDirHome() {
        // This will print a complete absolute path from where your application has initialized.
        String currentDir = System.getProperty("user.dir");
        System.out.println("The current Dir using user.dir is: " + currentDir);
        System.out.println("Separator is: " + File.separator);
        String currentHome = System.getProperty("user.home");
        System.out.println("The current Home using user.home is: " + currentHome);
            }
  
    public static void currentPath() {
        // In Java 7 you have two notions of current directory.
        // See: http://docs.oracle.com/javase/tutorial/essential/io/pathOps.html
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current relative path is:" + s);
    }
}
