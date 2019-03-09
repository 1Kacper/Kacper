import java.io.*;
//import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
        // odczyt z pliku binarnego

      Zamowienie zamowienie = null;
      try {

           FileInputStream fileInputStream = new FileInputStream("zamowienie.bin");
           ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
           zamowienie = (Zamowienie) objectInputStream.readObject();

           objectInputStream.close();
           fileInputStream.close();

           }catch (IOException e) {
           System.out.println("nie mozna odtworzyc pliku");
           e.printStackTrace();
           } catch (ClassNotFoundException e) {
           System.out.println("Brak klasy zamowienia");
           e.printStackTrace();
           }
           System.out.println(zamowienie);

           // Zamowienie zamowienie = new Zamowienie("Kacper Szweda", new BigDecimal("199.99"));
           // zapisanie zamowienia do pliku  binsrnego

           try {
               FileOutputStream fileOutputStream = new FileOutputStream("Zamowienie.bin");
               ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
               objectOutputStream.writeObject(zamowienie);

               objectOutputStream.close();
               fileOutputStream.close();

               } catch (IOException e) {
               System.out.println("brak dostepu do pliku zamowienie.bin");
               e.printStackTrace();
        }
    }
}