package _8_Funkcje;

public class KonwersjaJednostek {

    public static double Mile_Kilometry(double a){
        return a*1.6;
    }
    public static double Kilometry_Mile(double b){
        return b* 0.6;
    }

    public static  double Far_Cel(double c ){
        return 5.0/9.0 * (c - 32);

    }
    public static double Cel_Fer(double d){
        return  9.0/5.0 * d + 32;
    }
}
