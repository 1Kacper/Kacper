package _8_Funkcje;

import static _8_Funkcje.KonwersjaJednostek.*;

public class TestJednostek {
    public static void main(String[] args) {
        System.out.println("100 mil: " + Mile_Kilometry(100.0) + "km");
        System.out.println("2 mile = " + Mile_Kilometry(2.0) + " km" );

        System.out.println("3 Far = " + Far_Cel(3));
        System.out.println("100 Cel = " + Cel_Fer(100));

    }
}
