import java.util.Scanner;
import java.util.Random;

public class RandomSumChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generar dos números enteros aleatorios entre 1 y 10
        int numero1 = random.nextInt(10) + 1;
        int numero2 = random.nextInt(10) + 1;

        // Calcular la suma de los números generados
        int sumaEsperada = numero1 + numero2;

        // Solicitar al usuario ingresar la suma de los números
        System.out.println("Por favor, ingrese la suma de " + numero1 + " y " + numero2 + ":");
        int sumaIngresada = scanner.nextInt();

        // Verificar si la respuesta del usuario es correcta
        if (sumaIngresada == sumaEsperada) {
            System.out.println("¡Respuesta correcta!");
        } else {
            System.out.println("Respuesta incorrecta. La suma de " + numero1 + " y " + numero2 + " es " + sumaEsperada + ".");
        }

        scanner.close();
    }
}

