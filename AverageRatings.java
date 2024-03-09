import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageRatings {
//hola profeffff
    public static Map<String, Double> calcularPromedio(HashMap<String, List<Double>> calificacionesPorEstudiante) {
        Map<String, Double> promedios = new HashMap<>();
        for (Map.Entry<String, List<Double>> entry : calificacionesPorEstudiante.entrySet()) {
            String estudiante = entry.getKey();
            List<Double> calificaciones = entry.getValue();
            double suma = 0;
            for (Double calificacion : calificaciones) {
                suma += calificacion;
            }
            double promedio = suma / calificaciones.size();
            promedios.put(estudiante, promedio);
        }
        return promedios;
    }

    public static void main(String[] args) {
        HashMap<String, List<Double>> calificacionesPorEstudiante = new HashMap<>();
        
        // Agregar calificaciones de ejemplo
        calificacionesPorEstudiante.put("Estudiante1", List.of(85.0, 90.0, 88.0));
        calificacionesPorEstudiante.put("Estudiante2", List.of(78.0, 85.0, 90.0));
        calificacionesPorEstudiante.put("Estudiante3", List.of(92.0, 88.0, 95.0));
        
        // Calcular promedio de calificaciones
        Map<String, Double> promedios = calcularPromedio(calificacionesPorEstudiante);
        
        // Imprimir resultados
        for (Map.Entry<String, Double> entry : promedios.entrySet()) {
            System.out.println("El promedio de calificaciones para " + entry.getKey() + " es: " + entry.getValue());
        }
    }
}
