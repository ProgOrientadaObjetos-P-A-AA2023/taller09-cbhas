package paquete1;

import java.util.*;
import paquete2.*;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        String mensaje = "";
        String opcion;
        boolean bandera = true;

        System.out.print(
                "===============================================\n"
                + "              CENTRO DE PRÉSTAMOS\n");

        while (bandera) {
            System.out.print("===============================================\n"
                    + "  Ingrese '1' PrestamoAutomovil...\n"
                    + "  Ingrese '2' PrestamoEducativo...\n"
                    + "  > ");
            opcion = entrada.nextLine();

            if ("1".equals(opcion)) {
                System.out.print("===============================================\n");
                System.out.print("  Ingrese su nombre:\n  > ");
                String nombre = entrada.nextLine();
                System.out.print("  Intgrese su apellido:\n  > ");
                String apellido = entrada.nextLine();
                System.out.print("  Intgrese su username:\n  > ");
                String username = entrada.nextLine();
                System.out.print("  Ingrese el tipo de Automovil:\n  > ");
                String tipoAutomovil = entrada.nextLine();
                System.out.print("  Ingrese la marca del Automovil:\n  > ");
                String marcaAutomovil = entrada.nextLine();
                System.out.print("  Ingrese el nombre del Garante:\n  > ");
                String nombreGarante = entrada.nextLine();
                System.out.print("  Ingrese el apellido del Garante:\n  > ");
                String apellidoGarante = entrada.nextLine();
                System.out.print("  Ingrese el valor del Automovil:\n  > ");
                double valorAutomovil = entrada.nextDouble();
                System.out.print("  Ingrese el valor mensual del pago del Automovil:\n  > ");
                double valorMensualAutomovil = entrada.nextDouble();
                System.out.print("  Ingrese el tiempo de Préstamo en meses:\n  > ");
                int numMeses = entrada.nextInt();
                entrada.nextLine();
                System.out.print("  Ingrese la ciudad del Préstamo:\n  > ");
                String ciudad = entrada.nextLine();

                Persona p1 = new Persona(nombre, apellido, username);

                Persona p2 = new Persona(nombreGarante,
                        apellidoGarante);

                PrestamoAutomovil pA = new PrestamoAutomovil(tipoAutomovil,
                        marcaAutomovil, p2, valorAutomovil,
                        valorMensualAutomovil, p1, numMeses, ciudad);
                pA.establecerValorMensualAutomovil();

                mensaje = String.format("%s%s", mensaje, pA);

            } else if ("2".equals(opcion)) {
                System.out.print("===============================================\n");
                System.out.print("  Ingrese su nombre:\n  > ");
                String nombre = entrada.nextLine();
                System.out.print("  Ingrese su apellido:\n  > ");
                String apellido = entrada.nextLine();
                System.out.print("  Ingrese su username:\n  > ");
                String username = entrada.nextLine();
                System.out.print("  Ingrese el nivel de Estudio:\n  > ");
                String nivelEstudio = entrada.nextLine();
                System.out.print("  Ingrese el nombre del centro Educativo:\n  > ");
                String centroEducativo = entrada.nextLine();
                System.out.print("  Ingrese las siglas del centro Educativo:\n  > ");
                String siglasEducativo = entrada.nextLine();
                System.out.print("  Ingrese el valor de la Carrera:\n  > ");
                double valorMensualCarrera = entrada.nextDouble();
                System.out.print("  Ingrese el tiempo de Préstamo en meses:\n  > ");
                int numMeses = entrada.nextInt();
                entrada.nextLine();
                System.out.print("  Ingrese la ciudad del Préstamo:\n  > ");
                String ciudad = entrada.nextLine();

                Persona p = new Persona(nombre, apellido, username);

                InstitucionEducativa iE = new InstitucionEducativa(
                        centroEducativo, siglasEducativo);

                PrestamoEducativo pE = new PrestamoEducativo(nivelEstudio,
                        iE, valorMensualCarrera, p, numMeses,
                        ciudad);
                pE.establecerValorMensualCarrera();

                mensaje = String.format("%s%s", mensaje, pE);

            } else {
                System.out.println("Opción Incorrecta!!");
                return;
            }

            System.out.print("===============================================\n");
            System.out.print("  Digite 'si' para salir de programa:\n  > ");
            opcion = entrada.nextLine();

            if ("si".equals(opcion)) {
                System.out.print(mensaje);
                System.out.print("===============================================\n");
                bandera = false;
            }
        }

    }

}

// @cbhas
