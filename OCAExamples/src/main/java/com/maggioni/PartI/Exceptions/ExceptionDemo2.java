package com.maggioni.PartI.Exceptions;

public class ExceptionDemo2 {

    public static void main(String[] args) throws Exception{
        try {
            try {
                throw new RuntimeException("Run Time Exception text");
            } catch (Exception e) {
                throw new Exception("Exception", e);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
            System.out.println(e.getCause().getLocalizedMessage());
            System.out.println(e.getCause().getMessage());
        }
    }

}
