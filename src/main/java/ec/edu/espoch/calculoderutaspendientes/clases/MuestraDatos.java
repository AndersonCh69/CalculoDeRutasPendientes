package ec.edu.espoch.calculoderutaspendientes.clases;

import java.util.Arrays;

public class MuestraDatos {
    
    public void mostrarResultados(Datos datos) {
        System.out.println("\nRESULTADOS");
        System.out.println("Pendientes por tramo:");
        
        for (int i = 0; i < datos.pendientes.length; i++) {
            System.out.println("Tramo " + (i + 1) + ": " + String.format("%.2f", datos.pendientes[i]) + " m/km");
        }

        double max = Arrays.stream(datos.pendientes).max().getAsDouble();
        double min = Arrays.stream(datos.pendientes).min().getAsDouble();
        double promedio = Arrays.stream(datos.pendientes).average().getAsDouble();

        System.out.println("\nPendiente maxima: " + String.format("%.2f", max) + " m/km");
        System.out.println("Pendiente minima: " + String.format("%.2f", min) + " m/km");
        System.out.println("Pendiente promedio: " + String.format("%.2f", promedio) + " m/km");
    }
}