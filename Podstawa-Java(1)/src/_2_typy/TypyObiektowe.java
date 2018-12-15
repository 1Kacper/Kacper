package _2_typy;

import java.util.Scanner;

public class TypyObiektowe {

    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);

        System.out.print("Podaj swoje imie ");

        String imie = wejscie.nextLine();


        int iloscZnakow = imie.length();

        System.out.println("Słowo " + imie + " ma " + iloscZnakow + " znakow");

        if (iloscZnakow <= 6) {
            System.out.println("Krótkie słowo ");
        } else {
            System.out.println("Długie Słowow");
        }

        boolean czyKonczySieNaA = imie.toLowerCase().endsWith("a");

        if (czyKonczySieNaA && !imie.equalsIgnoreCase("Kuba")) {
            System.out.println("damskie");
        } else {
            System.out.println("meskie");
        }

       /* if (imie.equalsIgnoreCase("Kuba")) {
            System.out.println("Meskie");
        } else {
            System.out.println("Bład");
        } */
    }
    }

