import java.util.Scanner;

public class SumOfDigits {
    // Método para calcular la suma de los dígitos de un número
    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // Sumar el último dígito
            number /= 10; // Eliminar el último dígito
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Ingrese un número entero positivo: ");
        int number = scanner.nextInt();

        // Calcular la suma de los dígitos
        int sum = sumDigits(number);

        // Mostrar el resultado
        System.out.println("La suma de los dígitos de " + number + " es: " + sum);
        
        // Cerrar el scanner
        scanner.close();
    }
}
