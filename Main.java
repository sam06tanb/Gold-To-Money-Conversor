// Importa las clases necesarias
import Calculo.Calc;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
/**
 * @author sam06tanb
 */

/**
 * Clase principal que realiza conversiones de unidades y muestra la fecha actual.
 * @version 2.0
 * @since 2.0
 */
public class Main {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {

        // Configura el formato para los números decimales
        Locale.setDefault(Locale.US);
        DecimalFormat formatacao = new DecimalFormat("#.00");

        // Crea un objeto Scanner para la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Crea un objeto Calc para realizar cálculos
        Calc calc = new Calc();

        // Pide al usuario la cantidad de oro a convertir
        System.out.println("How many gold/G you want to convert?");
        double gold = sc.nextDouble();

        // Realiza las conversiones y muestra los resultados formateados
        System.out.println("Value in real: " + formatacao.format(Calc.conversao(gold)) + "R$");
        System.out.println("Value in Dolar: " + formatacao.format(Calc.conversaoDolar(gold)) + "USD");
        System.out.println("Value in Euro: " + formatacao.format(Calc.conversaoEuro(gold)) + "€");

        System.out.println();  // Línea en blanco para separar las secciones

        // Muestra una fecha específica
        System.out.println("10/11/2023");

        System.out.println();  // Línea en blanco para separar las secciones

        // Obtiene la fecha actual y la muestra en un formato específico
        LocalDate TempoAgora = LocalDate.now();
        DateTimeFormatter FormatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Date that you used this program: " + TempoAgora.format(FormatarData));
    }
}