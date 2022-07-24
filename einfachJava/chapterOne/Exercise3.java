public class Exercise3 {
    /*  AUFGABE 3 / Exercise 3
        In dieser Aufgabe sollen Sie für einen Pizzalieferservice
        die Preisberechnung implementieren. Nehmen wir vereinfachend
        an, jede Pizza kostet 11€. Dabei gelten folgende Regelungen
        zum Rabatt. Wenn wir 5 oder mehr Pizzen bestellen, dann erhalten
        wir einen Rabatt von 10%. Wenn wir die Pizzen selbst abholen,
        dann erhalten wir pro Pizza einen Nachlass von 2€. Schreiben Sie
        eine Methode, die den Rechnungsbetrag ermittelt.

        In this task you are to implement the price calculation for a
        pizza delivery service. For the sake of simplicity, let's assume
        each pizza costs €11. The following discount regulations apply.
        If we order 5 or more pizzas then we get a 10% discount. If we
        pick up the pizzas ourselves, we get a discount of 2€ per pizza.
        Write a method that calculates the invoice amount.
     */
    public static double calcPrice(int orderAmount, boolean pickup) {
        int pricePerPizza = 11;
        double total = orderAmount * pricePerPizza;
        if (orderAmount >= 5) {
            total *= 0.9;
        }
        if (pickup) {
            total -= orderAmount * 2;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(calcPrice(8, false));
        System.out.println(calcPrice(8, true));
        System.out.println(calcPrice(4, false));
        System.out.println(calcPrice(4, true));
    }
}