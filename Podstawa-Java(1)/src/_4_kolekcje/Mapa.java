package _4_kolekcje;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<String, Integer> inwentarz = new HashMap<>();

        inwentarz.put("Mysz", 5);
        inwentarz.put("Głosniki",4);
        inwentarz.put("Monitor", 7);
        System.out.println(inwentarz);


        System.out.println("Stan Głośnikow:  "+ inwentarz.get("Głosniki"));
        System.out.println(inwentarz.values());

        int suma = 0;

        for(String klucz : inwentarz.keySet()) {
            suma = suma + inwentarz.get(klucz);
        }
            System.out.println("Suma produktow:  "+suma);
        }
    }

