import java.util.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> rates = new HashMap<>();
        rates.put("USD", 0.012);
        rates.put("EUR", 0.011);
        rates.put("JPY", 1.75);
        rates.put("INR", 1.0); 

        System.out.println("Available Currencies: INR, USD, EUR, JPY");

        System.out.print("Enter base currency: ");
        String from = sc.next().toUpperCase();

        System.out.print("Enter target currency: ");
        String to = sc.next().toUpperCase();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        if (rates.containsKey(from) && rates.containsKey(to)) {
            double inINR = amount / rates.get(from);
            double converted = inINR * rates.get(to);
            System.out.printf("Converted Amount: %.2f %s\n", converted, to);
        } else {
            System.out.println("Invalid currency input.");
        }
        sc.close();
    }
}