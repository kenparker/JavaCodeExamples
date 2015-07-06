package com.maggioni.PartI.Whizlab.Pretest;

public class WorkingWithDataTypesDemo1 {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Java");
        System.out.println(" s.lenth() and s.capacity() :"+ s.length() +" "+ s.capacity());
        s.append(" SE 6");
        System.out.println(" s.lenth() and s.capacity() :"+ s.length() +" "+ s.capacity());
        s.delete(8, 9);
        System.out.println("s =:"+s+" s.lenth() ="+ s.length()+" s.capacity()="+ s.capacity());
        s.trimToSize();
        System.out.println("after s.trimToSize() s =:"+s+" s.lenth() ="+ s.length()+" s.capacity()="+ s.capacity());
        s.setLength(25);
        System.out.println("after s.setLength(25) s =:"+s+" s.lenth() ="+ s.length()+" s.capacity()="+ s.capacity());
        s.trimToSize();
        System.out.println("after s.trimToSize() s =:"+s+" s.lenth() ="+ s.length()+" s.capacity()="+ s.capacity());
        s.reverse();
        System.out.println("after s.reverse() s =:"+s+" s.lenth() ="+ s.length()+" s.capacity()="+ s.capacity());
        s.reverse();
        System.out.println("after s.reverse() s =:"+s+" s.lenth() ="+ s.length()+" s.capacity()="+ s.capacity());
        StringBuilder s2 = s.delete(7, 99);
        System.out.println("after s.delete(7, 99) s =:"+s+" s.lenth() ="+ s.length()+" s.capacity()="+ s.capacity());
        System.out.println(" s2 =:"+s2+" s2.lenth() ="+ s2.length()+" s2.capacity()="+ s2.capacity());
        s2.append(" appended to s2");
        System.out.println("s = " + s + " s2 = " +  s2);
        String snull = null;
        s2.append(snull);
        System.out.println("null String added : s = " + s + " s2 = " +  s2);
        String string = s2.toString().replace("null", "");
        s2.delete(0, s2.length()).append(string);
        System.out.println("null String removed : s = " + s + " s2 = " +  s2);
        
    }

}
