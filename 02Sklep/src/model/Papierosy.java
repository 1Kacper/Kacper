package model;

import java.math.BigDecimal;

public class Papierosy  extends Produkt{

    private static int generator = 1;


    int ilość;
    String rodzaj;

    public Papierosy(int id, String nazwa, BigDecimal cena, int ilość, String rodzaj) {

        super(nazwa, cena);
        this.ilość = ilość;
        this.rodzaj = rodzaj;

    }
    @Override
    public String toString(){
        return super.toString() + "\t" + this.rodzaj + " \t " + this.ilość + "\t";
    }
}