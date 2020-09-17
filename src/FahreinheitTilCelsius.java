import java.util.Scanner;

public class FahreinheitTilCelsius {

    public static void main(String[] args) {


        System.out.print("Intast en temperatur i Fahrenheit: ");
ConverterTemp();
    }

public static void ConverterTemp(){
    Scanner input = new Scanner(System.in);


    double fahrenheit = input.nextDouble();

    // Convert Fahrenheit to Celsius
    double celsius = (5.0 / 9) * (fahrenheit - 32);
    System.out.println("Fahrenheit " + fahrenheit + " er " +
            celsius + " i Celsius");



}








}



