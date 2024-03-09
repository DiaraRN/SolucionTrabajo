import java.util.Scanner;

public class CompoundInterestCalculator {
    private double principal; // Capital inicial
    private double interestRate; // Tasa de interés anual
    private int years; // Número de años

    // Constructor para inicializar los datos
    public CompoundInterestCalculator(double principal, double interestRate, int years) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.years = years;
    }

    // Método para calcular el monto final con intereses compuestos
    public double calculateCompoundInterest() {
        double amount = principal * Math.pow(1 + (interestRate / 100), years);
        return amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el capital inicial
        System.out.print("Ingrese el capital inicial: ");
        double principal = scanner.nextDouble();

        // Pedir al usuario que ingrese la tasa de interés
        System.out.print("Ingrese la tasa de interés anual (%): ");
        double interestRate = scanner.nextDouble();

        // Pedir al usuario que ingrese el número de años
        System.out.print("Ingrese el número de años: ");
        int years = scanner.nextInt();

        // Crear una instancia del calculador de intereses compuestos
        CompoundInterestCalculator calculator = new CompoundInterestCalculator(principal, interestRate, years);

        // Calcular el monto final
        double finalAmount = calculator.calculateCompoundInterest();

        // Mostrar el resultado
        System.out.println("El monto final después de " + years + " años es: $" + finalAmount);
        
        // Cerrar el scanner
        scanner.close();
    }
}
