package ui;

import model.Alkohol;
import model.Sklep;

import java.math.BigDecimal;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.M;

public class Menu {
    public void wyswietl() {
        Scanner wejscie = new Scanner(System.in);
        Sklep sklep = new Sklep("Tajny sklep z Alkoholem w akademiku");

        System.out.println("1. Dodaj alkohol");
        System.out.println("2. Usuń alkohol");
        System.out.println("3. Wyświetl");
        System.out.println("q. Wyjście");
        // TODO dodać nowe opcje

        String wybor;

        do {


            System.out.println("Podaj wybór");
            wybor = wejscie.nextLine();


            switch (wybor) {
                case "1":
                    System.out.println(" Podaj nazwe:  ");
                    String nazwa = wejscie.nextLine();

                    System.out.println("Podaj cene");
                    BigDecimal cena = wejscie.nextBigDecimal();
                    wejscie.nextLine();

                    System.out.println("Podaj litraz");
                    String litraz = wejscie.nextLine();

                    System.out.println("Podaj procent");
                    String procent = wejscie.nextLine();

                    Alkohol alkohol = new Alkohol(nazwa, cena, litraz,procent);
                    sklep.dodajAlkohol(alkohol);
                    break;
                case "2":
                    System.out.println(" Usun ");

                    break;
                case "3":
                    sklep.wyświetl();
                    break;
                case "q":
                    System.out.println(" Wyjście");
                     break;
                   default:
                       System.out.println("Zła opcja, wybierz coś innego");
            }

        } while (!wybor.equals(" q "));

    }
}

