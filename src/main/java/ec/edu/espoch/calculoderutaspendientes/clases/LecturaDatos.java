package ec.edu.espoch.calculoderutaspendientes.clases;

import java.util.Scanner;

public class LecturaDatos {
    private Scanner sc;

    public LecturaDatos() {
        this.sc = new Scanner(System.in);
        this.sc.useLocale(java.util.Locale.US);
    }

    public void ingresarElevaciones(Datos datos, int numPuntos) {
        for (int i = 0; i < numPuntos; i++) {
            System.out.print("Elevacion en punto " + (i + 1) + " (m): ");
            datos.elevaciones[i] = sc.nextDouble();
        }
    }

    public void ingresarDistancias(Datos datos, int numPuntos) {
        for (int i = 0; i < numPuntos - 1; i++) {
            System.out.print("Distancia entre punto " + (i + 1) + " y " + (i + 2) + " (km): ");
            double distancia = sc.nextDouble();
            
            if (distancia <= 0) {
                System.out.println("La distancia debe ser mayor a 0");
                datos.distancias[i] = 0;
                return;
            }
            datos.distancias[i] = distancia;
        }
    }

    public void cerrar() {
        sc.close();
    }
}