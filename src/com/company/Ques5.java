package com.company;
import java.util.Scanner;
import java.util.*;
public class Ques5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for(int i = 0; i< arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for(int j = 0; j< arr2.length; j++) {
            arr2[j] = sc.nextInt();
        }
        System.out.println("Array1 : "+Arrays.toString(arr1));
        System.out.println("Array2 : "+Arrays.toString(arr2));
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.println("Common element is : "+(arr1[i]));
                }
            }
        }

    }
}
