package _2_typy;

import java.math.BigDecimal;

public class ObslugaSzkolen {
    public static void main(String[] args) {
        Szkolenie szkolenieJava = new Szkolenie("Szkolenie Java", 10, new BigDecimal("1000"));

        szkolenieJava.wyswietl();

    BigDecimal przychodBrutto = szkolenieJava.obliczPrzychodBrutto();

        System.out.println("Przychod ze szkolenia Brutto: "+ przychodBrutto);

        BigDecimal przychodNetto = szkolenieJava.obliczPrzychodNetto();
        System.out.println("Przychod ze szkolenia Netto: "+ przychodNetto);
    }

}







