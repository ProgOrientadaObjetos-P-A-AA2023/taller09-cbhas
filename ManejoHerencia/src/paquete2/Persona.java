package paquete2;

public class Persona {

    private String nombre;
    private String apellido;
    private String username;

    public Persona(String n, String a, String u) {
        nombre = n;
        apellido = a;
        username = u;
    }

    public Persona(String nGarante, String aGarante) {
        nombre = nGarante;
        apellido = aGarante;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerUsername(String u) {
        username = u;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUsername() {
        return username;
    }

}

// @cbhas
