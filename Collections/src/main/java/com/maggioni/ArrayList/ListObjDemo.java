
package com.maggioni.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author magang
 */
class Demo {
    String demo;

    public Demo(String demo) {
        this.demo = demo;
    }
    
    @Override
    public String toString() {
        return demo;
    }
    
}
public class ListObjDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("This is a String");
        list.add(new String("This is a String Object"));
        list.add(new Demo("Demo object 1"));
        list.add(new Demo("Demo object 2"));
        
        for (Object list1 : list) {
            System.out.println(list1);
        }
        
    }
    
}
