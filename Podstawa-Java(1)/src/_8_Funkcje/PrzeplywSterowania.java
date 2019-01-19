package _8_Funkcje;

public class PrzeplywSterowania {

    static void metoda0(){
        System.out.println("to jest metoda 0 ");
    }

    static void metoda1(){
        System.out.println("metoda 1");
    }

    public static void main(String[] args) {
        System.out.println("Poczatek Programu");
        metoda1();
        System.out.println("A znowu jestem w main");
        metoda1();
        System.out.println("B znowu jetem w main");
        System.out.println();
        metoda2("Ala ma kota");
        System.out.println();

        metoda2("Katowice to fajne miasto");
        System.out.println();
        System.out.println("Koniec programu");
        System.out.println();
    }

    static void metoda2(String napis){
        System.out.println("metoda2 otrzymala parament: " + napis);
        System.out.println("Ten napis ma liter: " + napis.length());
        System.out.println("A Napis wielkimi literami: " + napis.toUpperCase());
    }

    static int powtorz(String napis, int ileRazy){
        for (int i = 0; i < ileRazy; i++){
            System.out.println(napis);
        }
        return napis.length() * ileRazy;
    }
}
