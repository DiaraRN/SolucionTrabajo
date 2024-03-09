import java.util.Scanner;

public class PatronAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println("Patrón de asteriscos:");
            // Imprimir patrón de asteriscos
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            System.out.println("El número ingresado no es válido. Debe ser un entero positivo.");
        }

        scanner.close();
    }
}
