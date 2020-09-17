import java.util.Scanner;
import java.lang.Math;

public class Udregnlån {

        public static void main(String[] args) {


           Udregnlaan();
        }

        public static void Udregnlaan(){

            // Create a Scanner
            Scanner input = new Scanner(System.in);

            // Enter yearly interest rate
            System.out.print("indtast den årelige rente: ");
            double aareligerente = input.nextDouble();

            // Obtain monthly interest rate
            double maaendeligerente = aareligerente / 1200;

            // Enter number of years
            System.out.print(
                    "indtast antal år som et heltal: ");
            int antalaar = input.nextInt();

            // Enter loan amount
            System.out.print("indtast det lånte beløb: ");
            double laan = input.nextDouble();

            // Calculate payment
            double maaendeligydelse = laan * maaendeligerente / (1
                    - 1 / Math.pow(1 + maaendeligerente, antalaar * 12));
            double totaltilbagebetaling = maaendeligydelse * antalaar * 12;

            // Display results
            System.out.println("Den måendelige ydelse er $" +
                    (int)(maaendeligydelse * 100) / 100.0);
            System.out.println("Den total tilbage betaling er $" +
                    (int)(totaltilbagebetaling * 100) / 100.0);

        }
    }

































