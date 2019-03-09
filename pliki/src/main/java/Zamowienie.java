import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

public class Zamowienie implements Serializable {
   private static final long serialVersionUID = 100L;

        private String id;
        private String klient;
        private BigDecimal cena;

        public Zamowienie(){

    }

    public String getId() {
        return id;
    }

    public String getKlient() {
        return klient;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public Zamowienie(String klient, BigDecimal cena) {
            this.id = UUID.randomUUID().toString();
            this.klient = klient;
            this.cena = cena;
        }

    public void setId(String id) {
        this.id = id;
    }

    public void setKlient(String klient) {
        this.klient = klient;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    public String toString(){
            return this.id + "\t" + this.klient + "\t" + this.cena;
        }
}



