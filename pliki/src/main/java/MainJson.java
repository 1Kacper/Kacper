import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
//import java.math.BigDecimal;

public class MainJson {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

       Zamowienie zamowienie =  mapper.readValue(new File("zamowienie.json"),Zamowienie.class);

        System.out.println(zamowienie);

       // Zamowienie zamowienie = new Zamowienie("Kacper Szweda", new BigDecimal("199.99"));


        try{
            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(new File("zamowienie.json"), zamowienie);
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("blad");
        }
        }
}
