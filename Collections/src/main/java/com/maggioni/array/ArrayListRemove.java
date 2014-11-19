package com.maggioni.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * http://java67.blogspot.de/2014/03/2-ways-to-remove-elementsobjects-from-ArrayList-java.html
 */
public class ArrayListRemove
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(101);
        numbers.add(200);
        numbers.add(301);
        numbers.add(400);

        System.out.println("ArrayList Before : " + numbers);

        Iterator<Integer> itr = numbers.iterator();

        // remove all even numbers
        while (itr.hasNext()) {
            Integer number = itr.next();

            if (number % 2 == 0) {
                numbers.remove(number);
            }
        }

        System.out.println("ArrayList After : " + numbers);
    }

}
