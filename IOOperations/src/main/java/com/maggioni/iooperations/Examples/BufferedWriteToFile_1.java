package com.maggioni.iooperations.Examples;

import java.io.*;

/**
 *
 * @author maggioni
 */
public class BufferedWriteToFile_1
{

  public static void br2bw(BufferedReader r, BufferedWriter w) throws IOException
  {
    String z;

    while ((z = r.readLine()) != null)
    {
//System.out.println(z);
      if (!z.equals("quit"))
      {
        w.write(z);
        w.newLine();
      } else
      {
        break;
      }
    }

    r.close();
    w.close();
  }

  public static void main(String[] args) throws IOException
  {

    main2();
  }

  public static void main1() throws IOException
  {
    String xFile = "Test_WriterToFile.txt";
    File fileName = new File(xFile);
    BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter wb = new BufferedWriter(new FileWriter(fileName));

    System.out.println("gib was rein");
    System.out.println();

    br2bw(rb, wb);
  }
  
  
  public static void main2() throws IOException
  {
    String xFile = "Test_WriterToFile.txt";
    File fileName = new File(xFile);
    BufferedReader rb = new BufferedReader(new FileReader(fileName));
    BufferedWriter wb = new BufferedWriter(new OutputStreamWriter(System.out));

    System.out.println("output");
    System.out.println();

    br2bw(rb, wb);
  }
}
