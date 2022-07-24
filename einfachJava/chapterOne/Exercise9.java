public class Exercise9 {
    /*  AUFGABE 9 / Exercise 9
        Basierend auf den Ideen aus der vorherigen Aufgabe und mit den
        dort entwickelten Grundfunktionalitäten kann man auch eine
        Buchstabenkombination erzeugen, die die Form eines Ks besitzt:

        Based on the ideas from the previous task and with the basic
        functionalities developed there, you can also create a letter
        combination that has the form of a K:

        A B C D E F
        A B C D E
        A B C D
        A B C
        A B
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
     */
    public static void kShape(int width) {
        for (int i = width - 1; i >= 0; i--) {
            int letter = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (letter + j) + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < width; i++) {
            int letter = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (letter + j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        kShape(6);
    }
}