package paquete2;

public class Prestamo {

    protected Persona beneficiario;
    protected int numMeses;
    protected String ciudadPrestamo;

    public Prestamo(Persona p, int nM, String cP) {
        beneficiario = p;
        numMeses = nM;
        ciudadPrestamo = cP;
    }

    public void establecerBeneficiario(Persona p) {
        beneficiario = p;
    }

    public void establecerNumeroMeses(int nM) {
        numMeses = nM;
    }

    public void establecerCiudadPrestamo(String cP) {
        ciudadPrestamo = cP;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerNumeroMeses() {
        return numMeses;
    }

    public String obtenerCiudadPrestamo() {
        return ciudadPrestamo;
    }

    @Override
    public String toString() {
        String cadena = "";

        cadena = String.format("%s"
                + "  Nombre: %s\n"
                + "  Apellido: %s\n"
                + "  Username: %s\n"
                + "  Número de Meses: %d\n",
                cadena,
                beneficiario.obtenerNombre(),
                beneficiario.obtenerApellido(),
                beneficiario.obtenerUsername(),
                numMeses);

        return cadena;
    }

}
