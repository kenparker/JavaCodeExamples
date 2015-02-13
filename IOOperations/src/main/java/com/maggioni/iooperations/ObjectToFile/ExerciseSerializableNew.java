package com.maggioni.iooperations.ObjectToFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * http://www.javapractices.com/topic/TopicAction.do?Id=57
 * http://www.mkyong.com/java/how-to-write-an-object-to-file-in-java/
 */
/**
 * Uses buffering, and abstract base classes. JDK 7+.
 */
public class ExerciseSerializableNew {

    public static void main(String... aArguments) {
        //create a Serializable List
        List<String> quarks = Arrays.asList(
                "up", "down", "strange", "charm", "top", "bottom"
        );

        //serialize the List
        try (
                OutputStream file = new FileOutputStream("quarks.ser");
                OutputStream buffer = new BufferedOutputStream(file);
                ObjectOutput output = new ObjectOutputStream(buffer);) {
            output.writeObject(quarks);
        } catch (IOException ex) {
            fLogger.log(Level.SEVERE, "Cannot perform output.", ex);
        }

        //deserialize the quarks.ser file
        try (
                InputStream file = new FileInputStream("quarks.ser");
                InputStream buffer = new BufferedInputStream(file);
                ObjectInput input = new ObjectInputStream(buffer);) {
            //deserialize the List
            List<String> recoveredQuarks = (List<String>) input.readObject();
            //display its data
            for (String quark : recoveredQuarks) {
                System.out.println("Recovered Quark: " + quark);
            }
        } catch (ClassNotFoundException ex) {
            fLogger.log(Level.SEVERE, "Cannot perform input. Class not found.", ex);
        } catch (IOException ex) {
            fLogger.log(Level.SEVERE, "Cannot perform input.", ex);
        }
    }

  // PRIVATE
    private static final Logger fLogger
            = Logger.getLogger(ExerciseSerializableNew.class.getPackage().getName());
}
