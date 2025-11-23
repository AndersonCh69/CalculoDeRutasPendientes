package ec.edu.espoch.calculoderutaspendientes;

import ec.edu.espoch.calculoderutaspendientes.clases.Datos;
import ec.edu.espoch.calculoderutaspendientes.clases.LecturaDatos;
import ec.edu.espoch.calculoderutaspendientes.clases.MuestraDatos;
import ec.edu.espoch.calculoderutaspendientes.calculo.Calculadora;

public class CalculoDeRutasPendientes {

    public static void main(String[] args) {
        System.out.println("ANALISIS DE PENDIENTES");
        
        LecturaDatos lectura = new LecturaDatos();
        
        System.out.print("Cuantos puntos tiene la ruta?: ");
        int numPuntos = lectura.leerEntero();

        if (numPuntos < 2) {
            System.out.println("Necesitas al menos 2 puntos");
            lectura.cerrar();
            return;
        }

        // Crear datos
        Datos datos = new Datos(numPuntos);
        MuestraDatos muestra = new MuestraDatos();

        // Ingresar datos
        lectura.ingresarElevaciones(datos, numPuntos);
        lectura.ingresarDistancias(datos, numPuntos);

        // Calcular pendientes
        Calculadora.calcularPendientes(datos);

        // Mostrar resultados
        muestra.mostrarResultados(datos);
        lectura.cerrar();
    }
}