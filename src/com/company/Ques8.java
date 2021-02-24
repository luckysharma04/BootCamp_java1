package com.company;
import java.util.Scanner;
public class Ques8 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        System.out.println("original string :\n"+sb);
        sb = sb.reverse();
        System.out.println("after reverse :\n"+sb);
        sb.replace(4,9,"");
        System.out.println("Output: \n"+ sb);
    }
}

