package com.maggioni.PartI.Whizlab.Pretest.Package1;

public class ClassUsingRelatable {

    public static void main(String[] args) {
        ClassUsingRelatable a = new ClassUsingRelatable();
        System.out.println(a.findLargest(new RectanglePlus(1, 2), new RectanglePlus(10, 20)));
        System.out.println(a.findLargest(new Object(), new Object()));      // RuntimeError as Object do not implement Relatable
    }

    public Object findLargest(Object object1, Object object2) {
        Relatable obj1 = (Relatable) object1;
        Relatable obj2 = (Relatable) object2;
        if ((obj1).isLargerThan(obj2) > 0) {
            return object1;
        } else {
            return object2;
        }
    }
}
