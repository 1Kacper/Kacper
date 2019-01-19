package _7_Petle;

import java.util.Scanner;

public class Skarbonka {
    public static void main(String[] args) {

        /*
        while(Warunek){
        instrukcje; ...
        }
         Jaś dostał pusta skarbonke i chce zebac 100 zl. Program petli bedzie prosil o wrzucenie pieniazka do skarbonki
         tak dlugo, az zbierzesie 100zl */

        Scanner wejscie = new Scanner(System.in);

        int skarbonka = 0;

        while(skarbonka < 100){
            System.out.println("Bieżaca wartosc w skarbonce: " + skarbonka);
            System.out.println("Wrzuć monete...");
            int wrzutka = wejscie.nextInt();
            skarbonka = skarbonka + wrzutka;
        }
        System.out.println("Udało sie zebrać: " + skarbonka);

    }
}
