import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveOdd {

    public static void eliminarImpares(List<Integer> lista) {
        Iterator<Integer> iterador = lista.iterator();
        while (iterador.hasNext()) {
            int numero = iterador.next();
            if (numero % 2 != 0) {
                iterador.remove();
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        
        System.out.println("Lista original: " + lista);
        
        eliminarImpares(lista);
        
        System.out.println("Lista sin elementos impares: " + lista);
    }
}
