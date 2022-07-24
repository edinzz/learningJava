public class Exercise4 {
    /*  AUFGABE 4 / Exercise 4
        Schreiben Sie eine Schleife, die die Werte von 1 bis 9
        (inklusive) quadriert und die Quadratzahlen ausgibt.

        Write a loop that squares the values 1 through 9
        (inclusive) and prints the squared numbers.
     */
    public static void main(String[] args) {
       // Using a while loop:
        int i = 1;
        while (i < 10) {
           System.out.println(i * i);
           i++;
       }
        // Using a do-while loop:
        int j = 1;
        do {
            System.out.println(j * j);
            j++;
        }
        while (j < 10);
        // Using a for loop:
        for (int k = 1; k < 10; k++) {
            System.out.println(k * k);
        }
    }
}