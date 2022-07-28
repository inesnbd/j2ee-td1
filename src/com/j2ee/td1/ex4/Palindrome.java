package com.j2ee.td1.ex4;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("Entrez un mot ou une phrase : ");
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()){

            String line = sc.nextLine();
            boolean palindrome = true;

            int i=0, longueur=line.length()-1;
            boolean egale=true;

            while(i<longueur/2 && egale){

                if(line.charAt(i)==line.charAt(longueur-i))

                    palindrome = true;

                else

                    palindrome = false;

                i++;

            }

            if (palindrome){

                System.out.println("C'est un palindrome.");

            }else {

                System.out.println("Non, ce n'est pas un palindrome.");

            }

        }

    }

}
