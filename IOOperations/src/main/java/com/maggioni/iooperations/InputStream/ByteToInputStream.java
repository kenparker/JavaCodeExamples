package com.maggioni.iooperations.InputStream;

import com.google.common.io.ByteSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Test;

/*
 http://www.baeldung.com/convert-byte-array-to-input-stream#java
 */
public class ByteToInputStream {

    public static void main(String[] args) throws IOException {
        new ByteToInputStream().givenUsingGuava_whenConvertingByteArrayToInputStream_thenCorrect();
        new ByteToInputStream().givenUsingPlainJava_whenConvertingByteArrayToInputStream_thenCorrect();
    }
    
    @Test
    public void givenUsingPlainJava_whenConvertingByteArrayToInputStream_thenCorrect()
            throws IOException {
        byte[] initialArray = {0, 1, 2};
        InputStream targetStream = new ByteArrayInputStream(initialArray);
        targetStream.close();
    }

    @Test
    public void givenUsingGuava_whenConvertingByteArrayToInputStream_thenCorrect()
            throws IOException {
        byte[] initialArray = {0, 1, 2};
        InputStream targetStream = ByteSource.wrap(initialArray).openStream();
        targetStream.close();
    }

}
