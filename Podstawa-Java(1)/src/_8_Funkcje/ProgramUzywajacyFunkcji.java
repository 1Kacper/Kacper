package _8_Funkcje;

import java.util.Locale;
import java.util.Scanner;

public class ProgramUzywajacyFunkcji {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US);

        System.out.println("Podaj liczbę:  ");
        double x = wejscie.nextDouble();

        double poleKwadratu = FunkcjeGeometryczne.poleKwadratu(x);
        System.out.println("Pole Kwadratu: " + poleKwadratu);
        double poleKola = FunkcjeGeometryczne.poleKola(x);

        System.out.println("Pole kola: " + poleKola);
        System.out.println("Wylosuje Liczbe");
        double losowa = Math.random() * 100;  // wartosc od 0 do 100;


        System.out.println("Pole Kwadratu losowej: " + FunkcjeGeometryczne.poleKwadratu(losowa));

        System.out.println("Pole Kola wynosi: " + FunkcjeGeometryczne.poleKola(losowa));
        }
     }

