package io;

import model.Sklep;

import java.io.*;

public class PlikiBinarne implements OperacjePlikowe{

    Sklep sklep = null;

    public PlikiBinarne(){
    }

    public Sklep odczyt() throws Exception{


        FileInputStream fileInputStream = new FileInputStream("Sklep.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        sklep = (Sklep) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();

        return sklep;

    }
    public void zapis(Sklep sklep) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Sklep.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(sklep);

            objectOutputStream.close();
            fileOutputStream.close();

            } catch (IOException e) {
            System.out.println("brak dostepu do pliku zamowienie.bin");
            e.printStackTrace();

        }
    }
}