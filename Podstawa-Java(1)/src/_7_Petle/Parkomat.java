package _7_Petle;

import java.util.Scanner;

public class Parkomat {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);

        System.out.println("Ile godzin bedziesz stał");
        int kwota = 0 ;

        int godzina = wejscie.nextInt();

        int wynik = godzina *3 ;

        while (kwota < wynik){
            System.out.println("Wrzuc monete");
            int wrzuc = wejscie.nextInt();
            kwota=kwota + wrzuc;

            if (kwota>wynik){
                System.out.println("Reszta " + (kwota - wynik));
            }

        }
        System.out.println("Milego pobytu");
    }
}
