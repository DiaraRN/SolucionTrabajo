public class MaximumElement {
    
    public static int encontrarMaximo(int[] vector) {
        int maximo = Integer.MIN_VALUE;
        for (int numero : vector) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }
    
    public static void main(String[] args) {
        int[] vector = {3, 7, 2, 9, 5, 1, 8, 4, 6, 10};
        int maximo = encontrarMaximo(vector);
        System.out.println("El elemento máximo en el vector es: " + maximo);
    }
}