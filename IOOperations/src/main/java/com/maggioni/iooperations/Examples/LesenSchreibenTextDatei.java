package com.maggioni.iooperations.Examples;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author maggioni
 */
public class LesenSchreibenTextDatei {

    public static void main(String[] args) throws IOException {
        final String[] KEYS = {"user.name", "user.language", "user.home",
            "os.name", "java.version"};
        Vector vec = new Vector();
        String s;

        // Lies Textzeilen aus der Datei in einen Vector:
        BufferedReader in = null;
        try {
             in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("MeineTextDatei.txt")));
            while (null != (s = in.readLine())) {
                vec.add(s);
            }
        } catch (FileNotFoundException ex) {
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            if (in != null) {
                in.close();
            }
        }

        // Falls es keine Datei gab, erzeuge Einträge im Vector:
        if (0 >= vec.size()) {
            for (int i = 0; i < KEYS.length; i++) {
                vec.add(KEYS[i] + " = " + System.getProperty(KEYS[i]));
            }
        }

        // Füge weiteren Eintrag hinzu:
        vec.add("Zeitstempel = " + new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss,SSS").format(new Date()));

        // Schreibe alle Elemente als Textzeilen in die Datei:
        BufferedWriter out = null;
        try {
             out = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("MeineTextDatei.txt")));
            for (int i = 0; i < vec.size(); i++) {
                s = vec.get(i).toString();
                System.out.println(s);
                out.write(s, 0, s.length());
                out.newLine();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
