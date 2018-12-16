package _3_tablice;

public class Tablice1 {
    public static void main(String[] args) {
        int[] tablice = new int[8];
        System.out.println("Dlugosc tablicy: " + tablice.length);
        System.out.println("Element trzeci tablicy:  " + tablice[2]);
        //  System.out.println("Element nieistniejacy: "+tablice[8]);  Za daleko majac tablice 8 elementowa masz od 0 do 7.
        tablice[2] = 179;
        System.out.println("Element to: " + tablice[2]);
        int[] tablicaWypelniona = {179, 186, 165, 190, 185, 174, 138};

        for (int i = 6; i < tablicaWypelniona.length; i--) {
            System.out.println(i + 1 + ": " + tablicaWypelniona[i]);


        }
    }
}


