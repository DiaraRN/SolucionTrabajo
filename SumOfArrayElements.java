public class SumOfArrayElements {
    public static void main(String[] args) {
        // Definir un vector de enteros
        int[] vector = {10, 20, 30, 40, 50};

        // Calcular la suma de los elementos del vector
        int suma = calcularSuma(vector);

        // Mostrar la suma de los elementos del vector
        System.out.println("La suma de los elementos del vector es: " + suma);
    }

    // Método para calcular la suma de los elementos de un vector de enteros
    public static int calcularSuma(int[] vector) {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        return suma;
    }
}
