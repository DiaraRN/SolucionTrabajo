import java.util.Scanner;

public class RepeatedDigitsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número entero positivo
        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt();

        // Verificar que el número sea positivo
        if (numero < 0) {
            System.out.println("El número ingresado no es positivo.");
            return;
        }

        // Solicitar al usuario que ingrese el dígito a contar
        System.out.print("Ingresa un dígito para contar: ");
        int digito = scanner.nextInt();

        // Contar y mostrar cuántas veces aparece el dígito en el número
        int contador = contarDigitos(numero, digito);
        System.out.println("El dígito " + digito + " aparece " + contador + " veces en el número " + numero + ".");
    }

    // Método para contar cuántas veces aparece un dígito en un número
    public static int contarDigitos(int numero, int digito) {
        int contador = 0;
        while (numero > 0) {
            int ultimoDigito = numero % 10;
            if (ultimoDigito == digito) {
                contador++;
            }
            numero /= 10;
        }
        return contador;
    }
}
