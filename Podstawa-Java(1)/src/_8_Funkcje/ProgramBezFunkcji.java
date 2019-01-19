package _8_Funkcje;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBezFunkcji {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US);

        System.out.println("Podaj liczbę:  ");
        double x = wejscie.nextDouble();

        double poleKwadratu = x * x;
        System.out.println("Pole Kwadratu: " + poleKwadratu);
        double poleKola = Math.PI * x * x;

        System.out.println("Pole kola: " + poleKola);
        System.out.println("Wylosuje Liczbe");
        double losowa = Math.random() * 100;  // wartosc od 0 do 100;

        double poleKwadratu2 = losowa * losowa;
        System.out.println("Pole Kwadratu: " + poleKwadratu2);

        double poleKola2= Math.PI * losowa;
        System.out.println("Pole Kola wynosi: " + poleKola2);
        }
     }

