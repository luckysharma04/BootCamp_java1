package com.company;

import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = sc.nextLine(); ;
        int count;
        string = string.toLowerCase();
        String words[] = string.split(" ");

        System.out.println("Duplicate occurrences of words in a string : ");
        for(int i = 0; i < words.length; i++) {
            count = 1;
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if(count > 1 && words[i] != "0")
                System.out.println(words[i] +" "+ count);
        }
    }
}
