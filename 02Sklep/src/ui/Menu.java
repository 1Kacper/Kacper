package ui;

import java.util.Scanner;

public class Menu {
    public void wyswietl() {
        Scanner wejscie = new Scanner(System.in);

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
                    System.out.println(" Dodaj ");
                    break;
                case "2":
                    System.out.println(" Usuń ");
                    break;
                case "3":
                    System.out.println(" Wyświetl");
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

