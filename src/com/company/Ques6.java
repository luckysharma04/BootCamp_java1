package com.company;
import java.util.Scanner;
public class Ques6 {

    static void search(int arr[], int n)
    {
        int c = 0;
        for (int i = 0; i < n; i++) {
            c = c ^ arr[i];
        }
        System.out.println("The non repeated element is "+ c);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int a=sc.nextInt();
        System.out.println("Enter Array :");
        int[] arr = new int[5];
        for(int i = 0; i< a; i++) {
            arr[i] = sc.nextInt();
        }
        search(arr, a);
    }
}

