package _2_typy;

public class Dane {

    String miejscowosc;
    String ulica;
    String poczta;

public Dane(){   //konstrutor bezparametrowy
     System.out.println("Witam");
}
 public Dane(String miejscowosc, String ulica){   // konstruktor parametrowy
     System.out.println("Witam w danych");
     this.miejscowosc = miejscowosc;
     this.ulica = ulica;
     this.poczta = poczta;
 }

 public void wyswietl(){
     System.out.println("Miejscowosc  =  "+ this.miejscowosc);
     System.out.println("Ulica =  "+ this.ulica);
     System.out.println("Kod pocztowy = "+this.poczta);
 }
}