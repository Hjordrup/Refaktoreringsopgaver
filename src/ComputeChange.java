
import java.util.Scanner;

public class ComputeChange {

        public static void main(String[] args) {
   beloebUdregner();
        }

public static void beloebUdregner(){
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive the beloeb
    System.out.print(
            "Indtast et komma tal: ");
    double beloeb = input.nextDouble();

    int overskydendebeloeb = (int)(beloeb * 100);

    // Find the number of one dollars
    int antalEtDollerSedler = overskydendebeloeb / 100;
    overskydendebeloeb = overskydendebeloeb % 100;

    // Find the number of quarters in the remaining beloeb
    int antalQurters = overskydendebeloeb / 25;
    overskydendebeloeb = overskydendebeloeb % 25;

    // Find the number of dimes in the remaining beloeb
    int antalDimes = overskydendebeloeb / 10;
    overskydendebeloeb = overskydendebeloeb % 10;

    // Find the number of nickels in the remaining beloeb
    int antalNickels = overskydendebeloeb / 5;
    overskydendebeloeb = overskydendebeloeb % 5;

    // Find the number of pennies in the remaining beloeb
    int antalPennies = overskydendebeloeb;

    // Display results
    System.out.println("Dit beløb " + beloeb + " består af ");
    System.out.println("    " + antalEtDollerSedler + " dollars");
    System.out.println("    " + antalQurters + " quarters ");
    System.out.println("    " + antalDimes + " dimes");
    System.out.println("    " + antalNickels + " nickels");
    System.out.println("    " + antalPennies + " pennies");
}



}
