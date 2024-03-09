import java.util.Scanner;

public class Master {
 
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int anio = solicitarAnio(scanner);
            boolean esBisiesto = esAnioBisiesto(anio);
            
            if (esBisiesto) {
                System.out.println(anio + " es un año bisiesto.");
            } else {
                System.out.println(anio + " no es un año bisiesto.");
            }
            
            scanner.close();
        }
    
        public static int solicitarAnio(Scanner scanner) {
            System.out.print("Por favor, ingresa un año: ");
            int anio = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner
            return anio;
        }
    
        public static boolean esAnioBisiesto(int anio) {
            return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        }
    }
   