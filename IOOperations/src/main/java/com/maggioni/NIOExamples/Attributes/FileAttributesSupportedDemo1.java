package com.maggioni.NIOExamples.Attributes;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.Set;

/*
http://andreinc.net/2013/12/05/java-7-nio-2-tutorial-file-attributes/
*/

public class FileAttributesSupportedDemo1 {

    public static void main(String[] args) {
        
        FileSystem aDefault = FileSystems.getDefault();
        Iterable<FileStore> fileStores = aDefault.getFileStores();
        for (FileStore fileStore : fileStores) {
            System.out.println("file system :"+fileStore);
        }
        Set<String> supportedFileAttributeViews = aDefault.supportedFileAttributeViews();
        for (String supportedFileAttributeView : supportedFileAttributeViews) {
            System.out.println("attribute view :"+supportedFileAttributeView);
        }
    }

}
