package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sklep implements Serializable {

    private  String nazwa;
    private List<Produkt> produkty;

    public String getNazwa() {
        return nazwa;
    }

    public List<Produkt> getProdukty() {
        return produkty;
    }

    public Sklep(String nazwa){
        this.nazwa = nazwa;
        this.produkty = new ArrayList<Produkt>();
    }

    public void dodajAlkohol(Alkohol alkohol){
        produkty.add(alkohol);

    }

    public Sklep() {
    }

    public Sklep(String nazwa, List<Produkt> produkty) {
        this.nazwa = nazwa;
        this.produkty = produkty;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setProdukty(List<Produkt> produkty) {
        this.produkty = produkty;
    }

    public void usun(int id) {
        Iterator<Produkt> iterator = produkty.iterator();
        while (iterator.hasNext()) {
            Produkt produkt = iterator.next();
            if (produkt.getId() == id) {
                iterator.remove();
            }
        }
    }
        public String toString(){
            String rezultat = "id\ttyp\tnazwa\tcena\tinne\n";
            for (Produkt produkt : produkty) {
                rezultat += produkt + "\n";

            }
            return rezultat;
        }



}
