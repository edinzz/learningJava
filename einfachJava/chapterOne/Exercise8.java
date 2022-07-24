public class Exercise8 {
    /*  AUFGABE 8 / Exercise 8
        Implementieren Sie eine Funktionalität, um Buchstaben in folgendem Muster auszugeben:

        Implement a functionality to output letters in the following pattern:

        A
        B B
        C C C
        D D D D
     */
    public static void alphabetTriangle(int rows) {
        char firstLetter = 'A';
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(firstLetter + " ");
            }
            firstLetter++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        alphabetTriangle(4);
    }
}