import java.util.Scanner;
public class HvisKlokken {


        public static void main(String[] args) {

            // Prompt the user for input
            System.out.print("Indtast et hel tal for sekunder: ");
            findtid();
        }

        public static void findtid() {
            Scanner input = new Scanner(System.in);
            int Sekunder = input.nextInt();

            int minuter = Sekunder / 60; // Find Minuter in Sekunder
            int overskydenSekunder = Sekunder % 60; // Seconds remaining
            System.out.println(Sekunder + " Sekunder er " + minuter +
                    " Minnuter og " + overskydenSekunder + " Sekunder");



        }







}
