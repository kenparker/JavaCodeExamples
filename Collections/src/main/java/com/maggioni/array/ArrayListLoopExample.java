
package com.maggioni.array;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * http://java67.blogspot.sg/2012/08/how-to-traverse-iterate-or-loop-ArrayList-in-java-example-tutorial.html
 */
public class ArrayListLoopExample
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       //Creating ArrayList to demonstrate How to loop and iterate over ArrayList
        ArrayList<String> games = new ArrayList<String>(10);
        games.add("Cricket");
        games.add("Soccer");
        games.add("Hockey");
        games.add("Chess");
      
        System.out.println("original Size of ArrayList : " + games.size());
      
        //Looping over ArrayList in Java using advanced for loop
        System.out.println("Looping over ArrayList in Java using advanced for loop");
        for(String game: games){
            //print each element from ArrayList
            System.out.println(game);
        }
      
        //You can also Loop over ArrayList using traditional for loop
        System.out.println("Looping ArrayList in Java using simple for loop");
        for(int i =0; i<games.size(); i++){
            String game = games.get(i);
        }
      
        //Iterating over ArrayList in Java
        Iterator<String> itr = games.iterator();
        System.out.println("Iterating  over ArrayList in Java using Iterator");
        while(itr.hasNext()){
            System.out.println("removing " + itr.next() + " from ArrayList in Java");
            itr.remove();
        }
      
         System.out.println("final Size of ArrayList : " + games.size());
    
    }
   
    
}
