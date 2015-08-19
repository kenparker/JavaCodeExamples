package com.maggioni.NIOExamples.Basics;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileDemo2 {

    public static void main(String[] args) {
        String filePath = ".\\src\\main\\java\\Resources\\fileinres3.txt";
        File file = new File(filePath);
        System.err.println(" file " + filePath + " exists : " + file.exists());

        try {
            boolean createNewFile = file.createNewFile();
            System.out.println(" file " + createNewFile + " created");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println(" ----> Java 7 NIO Example");
        Path path = Paths.get(System.getProperty("user.dir"), "src", "main", "java", "Resources", "fileinres.txt");
        createFile(path);
        path = Paths.get("src", "main", "java", "Resources", "fileinres4.txt");
        createFile(path);

    }

    private static void createFile(Path path) {
        boolean exists = Files.exists(path);
        System.out.println(" file exists :" + exists);

        try {
            Path createFile = Files.createFile(path);
            System.out.println(" file created : " + createFile);
        } catch (FileAlreadyExistsException ex) {
            System.out.println("file already exist");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
