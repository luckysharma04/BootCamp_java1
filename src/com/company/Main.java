package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("Enter the substring");
        String s1=sc.nextLine();
        System.out.println("Enter the string to replace");
        String s2=sc.nextLine();
        System.out.println("The String before replace "+str);
        str = str.replace(s1,s2);
        System.out.println("The String After replace  "+str);
    }
}


