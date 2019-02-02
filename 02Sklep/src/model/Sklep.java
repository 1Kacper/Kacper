package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sklep {

    private  String nazwa;
    private List<Alkohol> alkohole;

    public Sklep(String nazwa){
        this.nazwa = nazwa;
        this.alkohole = new ArrayList<>();
    }

    public void dodajAlkohol(Alkohol alkohol){
        alkohole.add(alkohol);

    }
    public void usunAlkohol(int id){
        Iterator<Alkohol> iterator = alkohole.iterator();
        while (iterator.hasNext()){
            Alkohol alkohol = iterator.next();
            if (alkohol.getId() == id){
                iterator.remove();
            }
        }

    }
    public void wyświetl(){
        System.out.println(alkohole);

    }


}
