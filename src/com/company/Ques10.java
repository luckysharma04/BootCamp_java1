package com.company;
public class Ques10 {
    int operations(int a , int b){
        return a+b;
    }
    double operations(double a , double b){
        return a+b;
    }
    float operations(float a, float b){
        return a*b;
    }
    int operations(int a){
        return a*10;
    }
    String operations(String a, String b){
        return a+b;
    }
    String operations(String a,String b,String c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Ques10 ob=new Ques10();
        System.out.println(ob.operations(10,20));
        System.out.println(ob.operations(10.10,20.20));
        System.out.println(ob.operations(10.10f,20.20f));
        System.out.println(ob.operations(50));
        System.out.println(ob.operations("Lucky ","Sharma"));
        System.out.println(ob.operations("Hello ","Hey ","World"));
    }
}


