package ec.edu.espoch.calculoderutaspendientes.clases;

public class Datos {
    public double[] elevaciones;
    public double[] distancias;
    public double[] pendientes;

    public Datos(int numPuntos) {
        this.elevaciones = new double[numPuntos];
        this.distancias = new double[numPuntos - 1];
        this.pendientes = new double[numPuntos - 1];
    }
}