import java.util.Scanner;

public class OrdenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los tres números enteros
        System.out.println("Ingrese el primer número entero:");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número entero:");
        int numero2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número entero:");
        int numero3 = scanner.nextInt();

        // Determinar el número mayor
        int mayor = numero1;
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }

        // Determinar el número menor
        int menor = numero1;
        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor) {
            menor = numero3;
        }

        // Determinar el número intermedio
        int intermedio = numero1;
        if ((numero2 < mayor && numero2 > menor) || (numero2 > mayor && numero2 < menor)) {
            intermedio = numero2;
        }
        if ((numero3 < mayor && numero3 > menor) || (numero3 > mayor && numero3 < menor)) {
            intermedio = numero3;
        }

        // Mostrar los números en orden ascendente
        System.out.println("Los números en orden ascendente son: " + menor + ", " + intermedio + ", " + mayor);

        scanner.close();
    }
}
