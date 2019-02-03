import com.fasterxml.jackson.databind.ObjectMapper;
import io.OperacjePlikowe;
import model.Produkt;
import model.Sklep;

import java.io.File;
import java.io.IOException;
//import java.math.BigDecimal;

public class MainJson implements OperacjePlikowe {


    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        Produkt zamowienie =  mapper.readValue(new File("Produkt.json"), Produkt.class);

        System.out.println(zamowienie);

        // Zamowienie zamowienie = new Zamowienie("Kacper Szweda", new BigDecimal("199.99"));


         try{
         mapper.writerWithDefaultPrettyPrinter()
         .writeValue(new File("Produkt.json"), zamowienie);
         }catch (IOException e){
         e.printStackTrace();
         System.out.println("blad");
         }
         }

@Override
public Sklep odczyt() throws Exception {
        return null;
        }

@Override
public void zapis(Sklep sklep) {

        }
        }

