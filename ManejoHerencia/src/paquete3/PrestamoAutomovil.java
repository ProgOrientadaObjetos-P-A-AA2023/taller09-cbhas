package paquete3;

import paquete2.*;

public class PrestamoAutomovil extends Prestamo {

    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensualAutomovil;

    public PrestamoAutomovil(String tA, String mA, Persona g1, double vA,
            double vMA, Persona p, int tM, String cP) {
        super(p, tM, cP);
        tipoAutomovil = tA;
        marcaAutomovil = mA;
        garante1 = g1;
        valorAutomovil = vA;
        valorMensualAutomovil = vMA;
    }

    public void establecerTipoAutomovil(String tA) {
        tipoAutomovil = tA;
    }

    public void establecerMarcaAutomovil(String mA) {
        marcaAutomovil = mA;
    }

    public void establecerGarante1(Persona g1) {
        garante1 = g1;
    }

    public void establecerValorAutomovil(double vA) {
        valorAutomovil = vA;
    }

    public void establecerValorMensualAutomovil() {
        valorMensualAutomovil = valorAutomovil / obtenerNumeroMeses();
    }

    public String obtenerTipoAutomovil() {
        return tipoAutomovil;
    }

    public String obtenerMarcaAutomovil() {
        return marcaAutomovil;
    }

    public Persona obtenerGarante1() {
        return garante1;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMensualAutomovil() {
        return valorMensualAutomovil;
    }

    @Override
    public String toString() {
        String cadena = "===============================================\n"
                + "              Prestamo Automovil\n"
                + "===============================================\n";

        cadena = String.format("%s%s"
                + "  Ciudad de Prestamo: %s\n"
                + "  Tipo de Automovil: %s\n"
                + "  Marca de Automovil: %s\n"
                + "  Garante:\n"
                + "\tNombre: %s\n"
                + "\tApellido: %s\n"
                + "  Valor del Automovil: %.2f\n"
                + "  Valor Mensual del Préstamo: %.2f\n",
                cadena,
                super.toString(),
                obtenerCiudadPrestamo().toLowerCase(),
                tipoAutomovil,
                marcaAutomovil,
                garante1.obtenerNombre(),
                garante1.obtenerApellido(),
                valorAutomovil,
                valorMensualAutomovil);

        return cadena;
    }

}

// @cbhas
