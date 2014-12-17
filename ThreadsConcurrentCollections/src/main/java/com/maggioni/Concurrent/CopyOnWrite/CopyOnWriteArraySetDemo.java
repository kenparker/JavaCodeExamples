package com.maggioni.Concurrent.CopyOnWrite;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * http://javarevisited.blogspot.de/2014/06/how-to-use-copyonwritearrayset-in-java-example-tutorial.html
 * http://www.angelikalanger.com/Articles/EffectiveJava/48.JMM-CopyOnWriteArrayList/48.JMM-CopyOnWriteArrayList.html
 */
public class CopyOnWriteArraySetDemo
{

    public static void main(String args[])
    {
        Publisher cricNext = new Publisher();
        SubScriber raj = new SubScriber("RAJ");
        SubScriber adom = new SubScriber("ADOM");
        cricNext.addSubscriber(raj);
        cricNext.addSubscriber(adom);
        cricNext.notifySubs("FOUR");
        cricNext.notifySubs("SIX");
    }

}

class Publisher
{

    private CopyOnWriteArraySet setOfSubs = new CopyOnWriteArraySet();

    public void addSubscriber(SubScriber sub)
    {
        setOfSubs.add(sub);
    }

    public void notifySubs(String score)
    {
        Iterator itr = setOfSubs.iterator();
        while (itr.hasNext()) {
            SubScriber sub = (SubScriber) itr.next();
            sub.receive(score);
        //itr.remove(); 
        // not allowed, throws UnsupportedOperationException 
        }
    }
}

class SubScriber
{

    private String _name;

    public SubScriber(String name)
    {
        this._name = name;
    }

    public void receive(String score)
    {
        System.out.printf("[%s] Event received : %s %n", _name, score);
    }
}
