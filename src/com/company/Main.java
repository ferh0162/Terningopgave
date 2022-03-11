package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Dice terningekast = new Dice();
        for (int i = 0; i < 10; i++) {
            terningekast.rollMethod();
            System.out.print(terningekast.getFaceValue()+"\t");
            for (int a = 0; a < 10; a++){
                terningekast.rollMethod();
                System.out.print(terningekast.getFaceValue()+"\t");
            }
            System.out.println();
        }
    }
}
