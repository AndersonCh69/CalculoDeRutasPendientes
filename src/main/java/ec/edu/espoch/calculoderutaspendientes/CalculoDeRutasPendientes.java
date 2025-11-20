    package ec.edu.espoch.calculoderutaspendientes;

    import java.util.Scanner;

    public class CalculoDeRutasPendientes {

        public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

        System.out.println(" ANALISIS DE PENDIENTES ");

        // --- Ingreso de datos ---
        System.out.print("Latitud inicial: ");
        double latIni = sc.nextDouble();

        System.out.print("Longitud inicial: ");
        double lonIni = sc.nextDouble();

        System.out.print("Latitud final: ");
        double latFin = sc.nextDouble();

        System.out.print("Longitud final: ");
        double lonFin = sc.nextDouble();

        System.out.print("Distancia en km entre los puntos: ");
        double distanciaKm = sc.nextDouble();

        System.out.print("Elevacion inicial (m): ");
        double elevIni = sc.nextDouble();

        System.out.print("Elevacio n final (m): ");
        double elevFin = sc.nextDouble();

        // --- Cálculo de pendiente (derivada numérica) ---
        double pendiente = (elevFin - elevIni) / distanciaKm;

        // --- Mostrar resultado ---
        System.out.println(" RESULTADOS ");
        System.out.println("Pendiente calculada: " + pendiente);

        // Pendiente mínima = el valor más bajo  
        // Pendiente máxima = el valor más alto  
        // Como solo hay un tramo, la pendiente es a la vez mínima y máxima
        double pendienteMinima = pendiente;
        double pendienteMaxima = pendiente;

        System.out.println("Pendiente minima: " + pendienteMinima);
        System.out.println("Pendiente maxima: " + pendienteMaxima);
    
        }
}
