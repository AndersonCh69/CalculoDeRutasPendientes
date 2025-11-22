package ec.edu.espoch.calculoderutaspendientes;

import ec.edu.espoch.calculoderutaspendientes.clases.Datos;
import ec.edu.espoch.calculoderutaspendientes.clases.LecturaDatos;
import ec.edu.espoch.calculoderutaspendientes.clases.MuestraDatos;
import ec.edu.espoch.calculoderutaspendientes.calculo.Calculadora;
import java.util.Scanner;

public class CalculoDeRutasPendientes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        
        System.out.println("ANALISIS DE PENDIENTES");
        System.out.print("¿Cuantos puntos tiene la ruta?: ");
        int numPuntos = sc.nextInt();
        sc.close();

        if (numPuntos < 2) {
            System.out.println("Necesitas al menos 2 puntos");
            return;
        }

        // Crear datos
        Datos datos = new Datos(numPuntos);
        LecturaDatos lectura = new LecturaDatos();
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