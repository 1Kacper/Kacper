package _4_kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        List<String> imiona = new ArrayList();

        imiona.add("Kacper");
        imiona.add("Nikol");
        imiona.add("Madison");

        System.out.println(imiona);
        System.out.println("   Rozmiar:  "+ imiona.size());
        System.out.println("  Pozycja 1:  " + imiona.get(2));

        for(String imie : imiona){
            if (imie.endsWith("a")){
                System.out.println(imie);
            }
        }
          imiona.remove("ola");
        System.out.println(imiona);

        if(imiona.contains("Kacper")) {
            System.out.println("tak");
        }else{
            System.out.println("nie");
        }

        Collections.sort(imiona);
        System.out.println(imiona);
    }
}
