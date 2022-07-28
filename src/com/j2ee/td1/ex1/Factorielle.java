package com.j2ee.td1.ex1;

public class Factorielle {

    public static void main(String[] args) {

        System.out.println(factorielle(3));


    }

    public static long factorielle(long n){

        int i,fact=1;

        for(i = 1; i <= n; i++){

            fact = fact * i;

        }
        return fact;

    }

}
