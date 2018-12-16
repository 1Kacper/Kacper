package _2_typy;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Szkolenie {

    BigDecimal cena;
    int liczbaUczestnikow;
    String nazwa;
    LocalDate data;
    double wynik;

    // 1. tworzenie nowego obiektu.
    // budowa konstruktora = (public/private) (nazwa) (lista_parametrow)
    // nazwa - taka sama jak nazwa klasy
    // konstruktor  bezparametryczny

    public Szkolenie() {
        System.out.println("Wykonal sie konstruktor bezparametryczny");
    }


    // konstruktor parametryczny

    public Szkolenie(String nazwa, int liczbaUczestnikow, BigDecimal cena) {

        System.out.println("Wykonał sie konstruktor parametryczny");
        this.nazwa = nazwa;
        this.liczbaUczestnikow = liczbaUczestnikow;
        this.cena = cena;
        this.data = data;

    }


// 2. wypisanie informacji o obiekcie.
//tworzenie metody
//[public/private] [typ_zwracany] [nazwa] [lista_parametrow]

    public void wyswietl() {

        System.out.println("Nazwa grupy = " + this.nazwa);
        System.out.println("Cena = " + this.cena);
        System.out.println("Liczba uczestnikow = " + this.liczbaUczestnikow);

    }
    public BigDecimal obliczPrzychodBrutto(){


                return cena.multiply(BigDecimal.valueOf(liczbaUczestnikow));

    }

    public BigDecimal obliczPrzychodNetto(){

        BigDecimal vat = BigDecimal.ONE.add(StaleAplikacji.STAWKA_VAT);

        return obliczPrzychodBrutto() .divide(vat,2, RoundingMode.HALF_UP);







    }



}