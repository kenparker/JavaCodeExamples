package com.maggioni.Whizlab.Pretest;

public class ExceptionsDemo1 {

    public static void main(String[] args) {
        try {
            Integer x = Integer.valueOf("two");
        } catch (NumberFormatException e) {      // The NumberFormatException need to be caught before IllegalArgumentException
        } catch (IllegalArgumentException e) {
        } catch (Exception e) {
        }
    }

}
