public class Exercise5 {
    /*  AUFGABE 5 / Exercise 5
        Schreiben Sie eine Schleife, die die Werte von 10 bis 40
        (inklusive) mit einer Schrittweite von 10 ausgibt.

        Write a loop that prints the values from 10 to 40
        (inclusive) with an increment of 10.
     */
    public static void main(String[] args) {
       // Using a while loop:
        int i = 10;
        while (i <= 40) {
           System.out.println(i);
           i+=10;
       }
        // Using a do-while loop:
        int j = 10;
        do {
            System.out.println(j);
            j+=10;
        }
        while (j <= 40);
        // Using a for loop:
        for (int k = 10; k <= 40; k+=10) {
            System.out.println(k);
        }
    }
}