package _2_typy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TypPieniezny {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("7.38");
        BigDecimal b = new BigDecimal("3.99");

        BigDecimal suma = a.add(b);
        BigDecimal roznica = a.subtract(b);
        BigDecimal iloczyn = a.multiply(b).setScale(2, RoundingMode.HALF_UP); // lepiej jakby rounding byl ale nie musi byc.
        BigDecimal iloraz = a.divide(b, 2, RoundingMode.HALF_UP); // rounding przy dzielenu obowiazkowo gdyz aplikacja moze sie wysypac.

        System.out.println(suma);
        System.out.println(roznica);
        System.out.println(iloczyn);
        System.out.println(iloraz);

    }

}
