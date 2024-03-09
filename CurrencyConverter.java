import java.util.Scanner;

public class CurrencyConverter {
    // Método para convertir una cantidad de una moneda a otra
    public static double convert(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la moneda de origen
        System.out.print("Ingrese la moneda de origen (por ejemplo, USD): ");
        String fromCurrency = scanner.nextLine();

        // Pedir al usuario que ingrese la moneda de destino
        System.out.print("Ingrese la moneda de destino (por ejemplo, EUR): ");
        String toCurrency = scanner.nextLine();

        // Pedir al usuario que ingrese la tasa de cambio
        System.out.print("Ingrese la tasa de cambio: ");
        double exchangeRate = scanner.nextDouble();

        // Pedir al usuario que ingrese la cantidad a convertir
        System.out.print("Ingrese la cantidad a convertir: ");
        double amountToConvert = scanner.nextDouble();

        // Realizar la conversión
        double convertedAmount = convert(amountToConvert, exchangeRate);

        // Mostrar el resultado
        System.out.printf("%.2f %s son equivalentes a %.2f %s%n", amountToConvert, fromCurrency, convertedAmount, toCurrency);
        
        // Cerrar el scanner
        scanner.close();
    }
}
