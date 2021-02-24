package com.company;

public class Ques7 {
    private static String fn="Lucky";
    private static String ln="Sharma";
    private static int age=21;
    static {
        System.out.println("My first name is "+fn);
    }
    static void getLn(){
        System.out.println("My last name is "+ln);
    }
    public static void main(String[] args) {
        Ques7.getLn();
        System.out.println("My age is "+age);
    }
}


