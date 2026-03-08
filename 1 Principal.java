package principal;

import modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

    static ArrayList<Desktop> listaDesktops = new ArrayList<>();
    static ArrayList<Laptop> listaLaptops = new ArrayList<>();
    static ArrayList<Tablet> listaTablets = new ArrayList<>();

    public static void main(String[] args) {

        int opcion = 0;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        " TODOPC \n"
                        + "1. Registrar equipo\n"
                        + "2. Ver equipos\n"
                        + "3. Salir"));

                switch (opcion) {

                    case 1:
                        registrarEquipo();
                        break;

                    case 2:
                        verEquipos();
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida.");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número válido.");
            }

        } while (opcion != 3);
    }

    public static void registrarEquipo() {

        try {
            int tipo = Integer.parseInt(JOptionPane.showInputDialog(
                    "Seleccione tipo:\n"
                    + "1. Desktop\n"
                    + "2. Laptop\n"
                    + "3. Tablet"));

            switch (tipo) {

                case 1:
                    listaDesktops.add(crearDesktop());
                    JOptionPane.showMessageDialog(null, "Desktop registrado correctamente.");
                    break;

                case 2:
                    listaLaptops.add(crearLaptop());
                    JOptionPane.showMessageDialog(null, "Laptop registrada correctamente.");
                    break;

                case 3:
                    listaTablets.add(crearTablet());
                    JOptionPane.showMessageDialog(null, "Tablet registrada correctamente.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Tipo inválido.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número válido.");
        }
    }

    public static void verEquipos() {

        try {
            int tipo = Integer.parseInt(JOptionPane.showInputDialog(
                    "Seleccione tipo a visualizar:\n"
                    + "1. Desktop\n"
                    + "2. Laptop\n"
                    + "3. Tablet"));

            String mensaje = "";

            switch (tipo) {

                case 1:
                    for (Desktop d : listaDesktops)
                        mensaje += d.mostrarDatos() + "\n\n";
                    break;

                case 2:
                    for (Laptop l : listaLaptops)
                        mensaje += l.mostrarDatos() + "\n\n";
                    break;

                case 3:
                    for (Tablet t : listaTablets)
                        mensaje += t.mostrarDatos() + "\n\n";
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Tipo inválido.");
                    return;
            }

            if (mensaje.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay registros.");
            } else {
                JOptionPane.showMessageDialog(null, mensaje);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número válido.");
        }
    }

    public static String pedirDato(String mensaje) {

        String dato;

        do {
            dato = JOptionPane.showInputDialog(mensaje);

            if (dato == null || dato.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Este campo no puede estar vacío.");
            }

        } while (dato == null || dato.trim().isEmpty());

        return dato;
    }

    public static Desktop crearDesktop() {

        return new Desktop(
                pedirDato("Fabricante:"),
                pedirDato("Modelo:"),
                pedirDato("Microprocesador:"),
                pedirDato("Memoria:"),
                pedirDato("Tarjeta gráfica:"),
                pedirDato("Tamaño de torre:"),
                pedirDato("Capacidad de disco duro:")
        );
    }

    public static Laptop crearLaptop() {

        return new Laptop(
                pedirDato("Fabricante:"),
                pedirDato("Modelo:"),
                pedirDato("Microprocesador:"),
                pedirDato("Memoria:"),
                pedirDato("Tamaño de pantalla:"),
                pedirDato("Capacidad de disco duro:")
        );
    }

    public static Tablet crearTablet() {

        return new Tablet(
                pedirDato("Fabricante:"),
                pedirDato("Modelo:"),
                pedirDato("Microprocesador:"),
                pedirDato("Tamaño diagonal de pantalla:"),
                pedirDato("¿Capacitiva/Resistiva?:"),
                pedirDato("Tamaño memoria NAND:"),
                pedirDato("Sistema Operativo:")
        );
    }
}
