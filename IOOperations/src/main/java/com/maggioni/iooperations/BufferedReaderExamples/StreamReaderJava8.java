package com.maggioni.IOOperations.BufferedReaderExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 *
 * http://www.javacodegeeks.com/2014/04/how-to-process-stream-and-read-text-file-in-java-8.html
 */
public class StreamReaderJava8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // Search given name in a jar
        JarFile jarFile = new JarFile(args[0]);
        final String searchName = (args.length >= 2) ? args[1] : "META-INF/MANIFEST.MF";
        Optional<JarEntry> searchResult = jarFile
                .stream()
                .filter(e -> e.getName().equals(searchName))
                .findFirst();
        if (!searchResult.isPresent())
            throw new RuntimeException(searchName + " not found!");
       
        // Print the JarEntry
        JarEntry entry = searchResult.get();
        try (InputStream instream = jarFile.getInputStream(entry)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(instream));
            reader.lines().forEach(line -> System.out.println(line));
        }
    }
    
}
