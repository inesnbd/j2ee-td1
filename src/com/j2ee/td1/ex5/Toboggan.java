package com.j2ee.td1.ex5;

import java.util.Scanner;

public class Toboggan {

    public static void main(String[] args) {

        String line;
        System.out.println("Entrez les ages : ");
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()){

            line = sc.nextLine();
            int nombreEnfants = 0;

            String ages[] = line.split(" ");

            for (int i = 0; i < ages.length; i++) {

                if (Integer.parseInt(ages[i]) >= 5 && Integer.parseInt(ages[i]) <= 9){

                    nombreEnfants++;

                }

            }

            System.out.println("Nombre d'enfants pouvant faire du toboggan : " + nombreEnfants);

        }

    }

}
