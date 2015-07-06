package com.maggioni.PartI.Whizlab.Pretest;

public class StringBuilderDemo1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Whizlabs");
        char[] c = {' ', 'O', 'C', 'A', 'J'};
        sb.append(c);
        System.out.println(sb);
        sb.replace(0, 4, "OCAJP");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.setCharAt(3, 'W');
        System.out.println(sb);

        char[] charArray = {' ', 'O', 'C', 'A', 'J'};
    }

}
