package ec.edu.espoch.calculoderutaspendientes.calculo;

import ec.edu.espoch.calculoderutaspendientes.clases.Datos;

public class Calculadora {
    
    public static void calcularPendientes(Datos datos) {
        for (int i = 0; i < datos.pendientes.length; i++) {
            double deltaElevacion = datos.elevaciones[i + 1] - datos.elevaciones[i];
            datos.pendientes[i] = deltaElevacion / datos.distancias[i];
        }
    }
}