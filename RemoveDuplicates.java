import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static List<Integer> eliminarDuplicados(List<Integer> lista) {
        // Utilizamos un HashSet para almacenar los elementos únicos
        Set<Integer> conjunto = new HashSet<>(lista);
        // Creamos una nueva lista con los elementos únicos
        List<Integer> listaSinDuplicados = new ArrayList<>(conjunto);
        return listaSinDuplicados;
    }

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(1);
        lista.add(4);
        lista.add(2);
        
        System.out.println("Lista original: " + lista);
        
        List<Integer> listaSinDuplicados = eliminarDuplicados(lista);
        
        System.out.println("Lista sin duplicados: " + listaSinDuplicados);
    }
}
