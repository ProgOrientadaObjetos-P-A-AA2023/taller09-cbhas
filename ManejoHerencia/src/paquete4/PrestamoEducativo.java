package paquete4;

import paquete2.*;

public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualCarrera;

    public PrestamoEducativo(String nE, InstitucionEducativa cE, double vC,
            Persona p, int tM, String cP) {
        super(p, tM, cP);
        nivelEstudio = nE;
        centroEducativo = cE;
        valorCarrera = vC;
    }

    public void establecerNivelEstudio(String nE) {
        nivelEstudio = nE;
    }

    public void establecerCentroEducativo(InstitucionEducativa cE) {
        centroEducativo = cE;
    }

    public void establecerValorCarrera(double vC) {
        valorCarrera = vC;
    }

    public void establecerValorMensualCarrera() {
        valorMensualCarrera = (valorCarrera / obtenerNumeroMeses()) - (0.1
                * (valorCarrera / obtenerNumeroMeses()));
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensualCarrera() {
        return valorMensualCarrera;
    }

    @Override
    public String toString() {
        String cadena = "===============================================\n"
                + "              Prestamo Educativo\n"
                + "===============================================\n";

        cadena = String.format("%s%s"
                + "  Ciudad de Prestamo: %s\n"
                + "  Nivel de Estudio: %s\n"
                + "  Nombre del centro Educativo: %s\n"
                + "  Siglas del centro Educativo: %s\n"
                + "  Valor de Carrera: %.2f\n"
                + "  Valor mensual del Préstamo: %.2f\n",
                cadena,
                super.toString(),
                obtenerCiudadPrestamo().toUpperCase(),
                nivelEstudio,
                centroEducativo.obtenerNombre(),
                centroEducativo.obtenerSiglas(),
                valorCarrera,
                valorMensualCarrera);

        return cadena;
    }

}
