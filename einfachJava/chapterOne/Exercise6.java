public class Exercise6 {
    /*  AUFGABE 6 / Exercise 6
        Nutzen Sie eine Schleife, die beim Wert 0 und mit einer Schrittweite
        von 1 startet. Bei jedem Schleifendurchlauf soll der Wert um die
        Schrittweite erhöht werden und die Schrittweite wird jeweils um eins
        erhöht. Geben Sie die beiden Werte aus, solange die Schleifenvariable
        kleiner als 60 ist.

        Use a loop that starts at a value of 0 and has an increment of 1.
        Each time the loop is run through, the value is to be increased by the
        increment and the increment is incremented by one. Output the two values
        as long as the loop variable is less than 60.
     */
    public static void main(String[] args) {
        int i = 0;
        int increment = 1;
        while (i < 60) {
            System.out.println("i: " + i + " and increasing increment: " + increment);
            i = i + increment;
            increment++;
        }
    }
}