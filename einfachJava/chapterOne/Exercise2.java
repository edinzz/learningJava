public class Exercise2 {
    /*  AUFGABE 2 / Exercise 2
        Schreiben Sie eine Methode, die einen Punktestand daraufhin prüft,
        ob dieser einen neuen Highscore ist. Das trifft dann zu, wenn die
        aktuelle Punktzahl größer als der momentane Highscore ist. In dem
        Fall soll eine Meldung auf der Konsole ausgegeben werden. Als
        Ausgangsbasis dienen folgende Anweisungen:

        Write a method that checks a score to see if it is a new high score.
        This applies when the current score is greater than the current high
        score. In this case, a message should be displayed on the console.
        The following instructions serve as a starting point:

            int poínts = 1234;
            int highscore = 1000;
            if (poínts > highscore) {
                System.out.println("Congratulations, this is a new highscore");
            }
    */
    public static String checkForHighscore(int score, int highscore) {
        if (score > highscore) {
            return "Congratulations, this is a new highscore!";
        }   return "Try again...";
    }

    public static void main(String[] args) {
        System.out.println(checkForHighscore(1000, 2000));
        System.out.println(checkForHighscore(3000, 2000));
    }
}