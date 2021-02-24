package com.company;

import java.util.Scanner;
public class Ques3 {
    private int charOccurrence(String s,char char_to_find,int count){
        if(s.length()==0)
            return count;
        else
        {
            if(s.charAt(0)==char_to_find){
                count++;
                return charOccurrence(s.substring(1),char_to_find,count);
            }
            else
                return charOccurrence(s.substring(1),char_to_find,count);
        }
    }
    public static void main(String[] args) {
        Ques3 ob = new Ques3();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        System.out.println("Enter the character that you want to check occurrence");
        char ch = sc.next().charAt(0);
        System.out.println(ob.charOccurrence(s,ch,0));
    }
}
