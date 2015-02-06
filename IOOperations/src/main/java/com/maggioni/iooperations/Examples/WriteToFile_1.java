package com.maggioni.iooperations.Examples;

import java.io.*;

/**
 *
 * @author maggioni
 */
public class WriteToFile_1
{

  public static void r2w(Reader r, Writer w) throws IOException
  {
    int c;
    while ((c = r.read()) != 97)
    {
      w.write(c);
      // System.out.println("Input :" + c);
    }

    r.close();
    w.close();
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    // TODO code application logic here

    main1();
    main2();




  }

  public static void main1()
  {
    // TODO code application logic here
    try
    {
      String xFile = "Test_WriterToFile.txt";
      File fileName = new File(xFile);
      Reader in = new InputStreamReader(System.in);
      Writer out = new FileWriter(fileName,false);

      System.out.println("Geben Sie jetzt den Text ein.");
      System.out.print(" ende mit Ctrl-Z bzw. Str-Z");
      System.out.println("");
      r2w(in, out);

    } catch (ArrayIndexOutOfBoundsException ex)
    {
      System.out.println("Array exception");
    } catch (IOException ex)
    {
      System.out.println("IO exception");
    }


  }

  public static void main2() 
  {
    // TODO code application logic here
    try
    {
      String xFile = "Test_WriterToFile.txt";
      File fileName = new File(xFile);


      Reader in = new FileReader(fileName);
      Writer out = new OutputStreamWriter(System.out);

      System.out.println("und jetzt wird der Datei ausgegeben");
      System.out.println("");

      r2w(in, out);

    } catch (ArrayIndexOutOfBoundsException ex)
    {
      System.out.println("Array exception");
    } catch (IOException ex)
    {
      System.out.println("IO exception");
    }



  }
}
