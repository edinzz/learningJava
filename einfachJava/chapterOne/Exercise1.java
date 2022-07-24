public class Exercise1 {
    public static void main(String[] args) {
        /* AUFGABE 1 / Exercise 1
        Nehmen wir an, wir hätten eine Spedition. Wir bekommen nun einen
        Großauftrag und müssen 1.000 Kisten ausliefern. In unseren Lkw
        passen pro Fahrt jedoch nur 75 Kisten. Berechnen Siem wir oft wir
        fahren müssen und wie viele Kisten in der letzten Fahrt transportiert
        werden. Verwenden Sie sprechende Variablennamen.

        Let's say we have a trucking company. We now get a large order and
        have to deliver 1,000 boxes. However, only 75 boxes fit in our trucks
        per trip. Calculate how often we have to drive and how many boxes are
        transported in the last trip. Use meaningful variable names.
         */
        int orderAmount = 1000;
        int truckCapacity = 75;
        int numberOfTrips = orderAmount / truckCapacity;
        int amountLastTrip = orderAmount % truckCapacity;
        if (amountLastTrip != 0) {
            numberOfTrips++;
        }
        System.out.println("Number of trips to deliver all 1000 boxes: " + numberOfTrips);
        System.out.println("Number of boxes transported in the last trip: " + amountLastTrip);
    }
}