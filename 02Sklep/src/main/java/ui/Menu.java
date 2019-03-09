package ui;

import io.OperacjePlikowe;
import io.PlikiBinarne;
import io.PlikiJson;
import model.Alkohol;
import model.Sklep;

import java.math.BigDecimal;
import java.util.Scanner;



public class Menu {
    public void wyswietl() {
        Scanner wejscie = new Scanner(System.in);
        OperacjePlikowe pliki;
        System.out.println("Podaj format zapisu");
        String wyborFormat = wejscie.nextLine();
        if (wyborFormat.equalsIgnoreCase("1")){
            pliki = new PlikiJson();
        }else {
            pliki = new PlikiBinarne();
        }




        Sklep sklep;
        try{
         sklep = pliki.odczyt();
        }
        catch (Exception e) {

            System.out.println("nie udalo sie");
            sklep = new Sklep("Tajny sklep z CZYMŚ w akademiku");
        }




        System.out.println("1. Dodaj produkt");
        System.out.println("2. Usuń produkt");
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
                    System.out.println(" Podaj id do usuniecia ");
                    int id = wejscie.nextInt();
                     sklep.usun(id);
                    System.out.println("Usun Produkt z id: " + id);

                    break;
                case "3":
                    System.out.println(sklep);
                case "q":
                    pliki.zapis(sklep);
                    System.out.println(" Wyjście");
                     break;
                   default:
                       System.out.println("Zła opcja, wybierz coś innego");
            }

        } while (!wybor.equals(" q "));

    }
}

