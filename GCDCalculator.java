import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números enteros positivos
        System.out.println("Ingrese el primer número entero positivo:");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número entero positivo:");
        int numero2 = scanner.nextInt();

        // Calcular el MCD utilizando el algoritmo de Euclides
        int mcd = calcularMCD(numero1, numero2);

        // Mostrar el resultado
        System.out.println("El máximo común divisor (MCD) de " + numero1 + " y " + numero2 + " es: " + mcd);

        scanner.close();
    }

    // Método para calcular el MCD utilizando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
