package com.maggioni.Concurrent.CopyOnWrite;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * http://www.concretepage.com/java/example_copyonwritearrayset_java
 */
public class CopyOnWriteArraySetTest
{

    private final CopyOnWriteArraySet<String> cwas = new CopyOnWriteArraySet<String>();

    public static void main(String... args)
    {
        CopyOnWriteArraySetTest ob = new CopyOnWriteArraySetTest();
        ob.cwas.add("A");
        new Thread(ob.new modifyThread()).start();
        new Thread(ob.new modifyThread()).start();
    }

    class modifyThread implements Runnable
    {

        @Override
        public void run()
        {
            Iterator itr = cwas.iterator();
            String s = (String) itr.next();
            cwas.removeAll(cwas);
            cwas.add(s + "A");
            itr = cwas.iterator();
            System.out.println(itr.next());
        }

    }
}
