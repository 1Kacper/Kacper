package model;

import java.math.BigDecimal;

public class  Produkt {
    private static int generator = 1;

   protected int id;
    protected String nazwa;
    protected BigDecimal cena;

    public Produkt(String nazwa, BigDecimal cena){
        this.id = generator++;
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public int getId() {
        return id;

    }
    public String getTyp(){
        return "alko";
    }

    @Override
    public String toString(){
        return this.id + "\t" + getTyp() + "\t"
                + this.nazwa + "\t" + this.cena + "\t";
    }
}




