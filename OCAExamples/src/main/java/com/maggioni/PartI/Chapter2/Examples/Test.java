package com.maggioni.PartI.Chapter2.Examples;

public class Test {

    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }
    void start() {
        String s1 = "one";
        s1 = s1 + "one";
        StringBuilder sb = new StringBuilder(); // sb is changed in alter()
        sb.append("aa");
        int i = 10;
        String s2 = alter(s1,sb,i);
        System.out.println(s1 + " " + s2);
        System.out.println(sb + ""+  i);    // the output for sb is aabb because bb is appended in alter()
                                            // the output for i is still 10 because in alter() a new object is created
    }
    String alter(String s1, StringBuilder s3, int i) {
        s1 = s1 + " two";
        s3.append("bb");
        i= i+1;
        System.out.print(s1 + " " + i);
        return "three";
    }
    
}
