import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] opciones = {"piedra", "papel", "tijeras"};

        System.out.println("Elija piedra, papel o tijeras:");
        String eleccionUsuario = scanner.nextLine();

        int indice = (int) (Math.random() * opciones.length);
        String eleccionComputadora = opciones[indice];

        System.out.println("Tu elección: " + eleccionUsuario);
        System.out.println("Elección de la computadora: " + eleccionComputadora);

        if (eleccionUsuario.equals(eleccionComputadora)) {
            System.out.println("Empate");
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijeras")) ||
                   (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                   (eleccionUsuario.equals("tijeras") && eleccionComputadora.equals("papel"))) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
        }

        scanner.close();
    }
}