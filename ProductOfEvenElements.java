public class ProductOfEvenElements {
    
    public static int productoElementosPares(int[] vector) {
        int producto = 1;
        for (int numero : vector) {
            if (numero % 2 == 0) { // Verifica si el número es par
                producto *= numero;
            }
        }
        return producto;
    }
    
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int resultado = productoElementosPares(vector);
        System.out.println("El producto de los números pares en el vector es: " + resultado);
    }
}
