package model;

import java.math.BigDecimal;

public class Alkohol extends Produkt {


    private String litraz;
    private String procentAlkoholu;

    public void setLitraz(String litraz) {
        this.litraz = litraz;
    }

    public void setProcentAlkoholu(String procentAlkoholu) {
        this.procentAlkoholu = procentAlkoholu;
    }

    public String getLitraz() {
        return litraz;
    }

    public String getProcentAlkoholu() {
        return procentAlkoholu;
    }

    public Alkohol(String nazwa, BigDecimal cena) {
        super(nazwa, cena);
    }

    public Alkohol(String nazwa, BigDecimal cena, String litraz, String procentAlkoholu) {

        super(nazwa,cena);
        this.litraz = litraz;
        this.procentAlkoholu = procentAlkoholu;
    }
    @Override
    public String getTyp(){
        return "alko";
    }
    @Override
    public String toString(){
        return super.toString() + "\t" + this.litraz+ " \t " + this.procentAlkoholu + "\t";
    }
}
