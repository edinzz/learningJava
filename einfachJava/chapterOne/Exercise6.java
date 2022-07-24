public class Exercise6 {
    /*  AUFGABE 6 / Exercise 6
        Implementieren Sie eine Methode void printNumberTriangle(int row),
        die eine mehrzeilige Ausgabe bis zur übergebenen maximalen Zeilenanzahl
        wie folgt erzeugt:

        Implement a method void printNumberTriangle(int row) that produces
        multi-line output up to the maximum number of rows passed, as follows:

        1
        1 2
        1 2 3
        1 2 3 4
     */
    public static void printNumberTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printNumberTriangle(4);
    }
}