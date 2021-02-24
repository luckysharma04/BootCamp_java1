package com.company;

public class Ques9 {
    public enum Houses {
        FLAT(100),
        BUNGALOW(250),
        PENTHOUSE(500);

        private final int price;

        Houses(int price) {

            this.price = price;
        }
        int getPrice() {
            return price;

        }
        public static void main(String[] args) {
            for(Houses h :Houses.values()){
                System.out.println(h + " has a price of "+h.getPrice()+" Lakhs");
            }
        }
    }
}

