package com.company;

abstract class Bank{
    String bankName;
    double rateOfInterest;
    abstract void getDetail();
}
class SBI extends Bank{
    SBI(){
        this.bankName="SBI";
        this.rateOfInterest=9.50;
    }

    @Override
    void getDetail() {
        System.out.println("Bank name is "+bankName);
        System.out.println("Rate of interest is "+rateOfInterest);
    }
}
class BOI extends Bank{
    BOI(){
        this.bankName="BOI";
        this.rateOfInterest=8.25;
    }
    @Override
    void getDetail() {
        System.out.println("Bank name is "+bankName);
        System.out.println("Rate of interest is "+rateOfInterest);
    }
}
class ICICI extends Bank{
    ICICI(){
        this.bankName="ICICI";
        this.rateOfInterest=11.50;
    }
    @Override
    void getDetail() {
        System.out.println("Bank name is "+bankName);
        System.out.println("Rate of interest is "+rateOfInterest);
    }
}
public class Ques11 {
    public static void main(String[] args) {
        Bank b = new SBI();
        b.getDetail();
        b = new BOI();
        b.getDetail();
        b = new ICICI();
        b.getDetail();
    }
}
