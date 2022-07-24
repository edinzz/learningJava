public class Exercise7 {
    /*  AUFGABE 7 / Exercise 7
        Implementieren Sie eine Methode void printNumberTriangle(int row),
        die eine mehrzeilige Ausgabe bis zur übergebenen maximalen Zeilenanzahl
        wie folgt erzeugt:

        Implement a method void printNumberTriangle(int row) that produces
        multi-line output up to the maximum number of rows passed, as follows:

        1
        1 2
        1 2 3
        1 2 3 4

        Als Kür soll eine Methode geschrieben werden, deren Ausgabe wie folgt aussieht:

        As a freestyle, a method should be written whose output looks like this:

        1
        2 3
        4 5 6
        7 8 9 10
     */
    public static void printNumberTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void printKurNumberTriangle(int rowss) {
        int num = 1;
        for (int i = 1; i <= rowss; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printNumberTriangle(4);
        printKurNumberTriangle(4);
    }
}