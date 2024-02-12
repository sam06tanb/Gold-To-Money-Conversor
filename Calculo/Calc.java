package Calculo;

/**
 * La clase Calc realiza conversiones de unidades relacionadas con el oro.
 *
 * @author sam06tanb
 * @version 2.0
 * @since 1.0
 */
public class Calc {

    // Factores de conversión para el oro
    private static double ouroReal = 311.47;
    private static double ouroDolar = 61.66;
    private static double ouroEuro = 59.787;

    /**
     * Convierte una cantidad de oro a su equivalente en moneda brasileña (Real).
     *
     * @param gold Cantidad de oro a convertir.
     * @return Valor equivalente en Real.
     * @since 1.0
     */
    public static double conversao(double gold) {
        return ouroReal * gold;
    }

    /**
     * Convierte una cantidad de oro a su equivalente en dólares estadounidenses.
     *
     * @param gold Cantidad de oro a convertir.
     * @return Valor equivalente en Dólares.
     * @since 1.0
     */
    public static double conversaoDolar(double gold) {
        return ouroDolar * gold;
    }

    /**
     * Convierte una cantidad de oro a su equivalente en euros.
     *
     * @param gold Cantidad de oro a convertir.
     * @return Valor equivalente en Euros.
     * @since 1.0
     */
    public static double conversaoEuro(double gold) {
        return ouroEuro * gold;
    }
}

