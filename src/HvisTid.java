public class HvisTid {

    public static void main(String[] args) {
    klokken();

    }

public static void klokken(){
    // Obtain the total milliseconds since midnight, Jan 1, 1970
    long toTalMiliSekunder = System.currentTimeMillis();

    // Obtain the total seconds since midnight, Jan 1, 1970
    long totalSekunder = toTalMiliSekunder / 1000;

    // Compute the current second in the minute in the hour
    long NuværendeSekunder = totalSekunder % 60;

    // Obtain the total minutes
    long totalMinutes = totalSekunder / 60;

    // Compute the current minute in the hour
    long nuværendeSekunder = totalMinutes % 60;

    // Obtain the total hours
    long totalAntalTimer = totalMinutes / 60;

    // Compute the current hour
    long nuværendeTimer = totalAntalTimer % 24;

    // Display results
    System.out.println("Nuværende tid er " + nuværendeTimer + ":"
            + nuværendeSekunder + ":" + NuværendeSekunder + " GMT");
}





}




























