package Calculo;

public class Calc {

 private static double ouroReal = 311.47;

 private static double ouroDolar = 61.66;

 private static double ouroEuro = 59.787;
 public static double conversao(double gold) {
     return ouroReal * gold;
    }
    public static double conversaoDolar(double gold) {
        return ouroDolar * gold;
    }

    public static double conversaoEuro(double gold) {
        return ouroEuro * gold;
    }


}
