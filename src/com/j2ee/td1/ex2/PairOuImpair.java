package com.j2ee.td1.ex2;

public class PairOuImpair {

    public static void main(String[] args) {

        System.out.println("2 est impair : " + isImpair(2));
        System.out.println("2 est pair : " + isPair(2));

    }

    public static boolean isPair(long n){

       if (n % 2 == 0){

            return true;

       }else{

           return false;

       }

    }

    public static boolean isImpair(long n){

        if (n % 2 == 0){

            return false;

        }else{

            return true;

        }

    }

}
