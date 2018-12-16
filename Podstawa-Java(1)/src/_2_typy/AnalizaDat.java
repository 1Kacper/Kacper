package _2_typy;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AnalizaDat {

    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);

        System.out.println("Podaj rok, miesiac , dzien urodzenia");

        String data = wejscie.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dataUrodzenia = LocalDate.parse(data, formatter);
        LocalDate dzisiaj = LocalDate.now();
        Period roznica = Period.between(dataUrodzenia, dzisiaj);

        int wiek = roznica.getYears();
        if(wiek<18){
            System.out.println("Niepełnoletni");
        }else if(wiek < 65){
            System.out.println("wiek produktywny");
        }else {
            System.out.println("Wiek emerytalny"); // Test
        }
    }
}




