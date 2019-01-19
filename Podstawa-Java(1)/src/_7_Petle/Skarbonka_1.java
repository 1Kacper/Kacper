package _7_Petle;

import java.util.Scanner;

public class Skarbonka_1 {
    public static void main(String[] args) {


        Scanner wejscie = new Scanner(System.in);

        int skarbonka = 0;

        while(skarbonka < 100){
            System.out.println("Bieżaca wartosc w skarbonce: " + skarbonka);
            System.out.println("Wrzuć monete...");
            int wrzutka = wejscie.nextInt();
            skarbonka += wrzutka;
        }
        System.out.println("Udało sie zebrać: " + skarbonka);

    }
}
