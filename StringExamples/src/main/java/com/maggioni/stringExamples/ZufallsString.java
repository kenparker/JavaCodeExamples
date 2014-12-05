package com.maggioni.stringExamples;

import java.util.Random;

/**
 *
 * javabeginners.de
 */
public class ZufallsString {

    public static void main(String[] args) {

         // word count
        final int sentenceLength = new Random().nextInt(20) + 1;
        //System.out.println("word count :" + sentenceLength);
        
        // word
        char[] cArr;

        // word length
        int wordLenght;

        for (int i = 0; i < sentenceLength; i++) {
            // word length beween 2 and 11 chars
            wordLenght = new Random().nextInt(10) + 2;
            //System.out.println("word length :" + wordLenght);

            cArr = new char[wordLenght];
            for (int j = 0; j < cArr.length; j++) {
                int n = new Random().nextInt(3);
                switch (n) {
                    case 0: // capital letters
                        cArr[j] = (char) (new Random().nextInt(26) + 97);
                        break;
                    case 1: //lower-case letters
                        cArr[j] = (char) (new Random().nextInt(26) + 65);
                        break;
                    case 2: //digits
                        cArr[j] = (char) (new Random().nextInt(26) + 48);
                        break;
                }

            }
            System.out.println("" + new String(cArr));
        }
    }

}
