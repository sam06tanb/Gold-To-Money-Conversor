import Calculo.Calc;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calc calc = new Calc();

        DecimalFormat formatacao = new DecimalFormat("#.00");

        System.out.println("How many gold/G you want to convert?");
        double gold = sc.nextDouble();
        System.out.println("Value in real: " + formatacao.format(Calc.conversao(gold)) + "R$");
        System.out.println("Value in Dolar: " + formatacao.format(Calc.conversaoDolar(gold)) + "USD");
        System.out.println("Value in Euro: " + formatacao.format(Calc.conversaoEuro(gold)) + "€");

        System.out.println();

        System.out.println("10/11/2023");

        System.out.println();

        LocalDate TempoAgora = LocalDate.now();
        DateTimeFormatter FormatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Date that you used this program: " + TempoAgora.format(FormatarData));
        }
    }
