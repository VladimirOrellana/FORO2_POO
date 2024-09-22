package registroequipo;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Equipo> equipos = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    "Menú:\n" +
                            "1. Registrar equipo\n" +
                            "2. Ver equipos\n" +
                            "3. Salir");

            if (opcion == null) {
                break; // Cerrar el programa si se cancela el diálogo
            }

            switch (opcion) {
                case "1":
                    registrarEquipo();
                    break;
                case "2":
                    verEquipos();
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
            }
        }
    }

    private static void registrarEquipo() {
        String tipoEquipo = JOptionPane.showInputDialog(
                "¿Qué tipo de equipo desea registrar?\n" +
                        "1. Desktop\n" +
                        "2. Laptop\n" +
                        "3. Tablet");

        if (tipoEquipo == null) {
            return; // Cerrar el diálogo si se cancela
        }

        switch (tipoEquipo) {
            case "1":
                registrarDesktop();
                break;
            case "2":
                registrarLaptop();
                break;
            case "3":
                registrarTablet();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de equipo no válido.");
        }
    }

    private static void registrarDesktop() {
        String fabricante = JOptionPane.showInputDialog("Fabricante:");
        String modelo = JOptionPane.showInputDialog("Modelo:");
        String microprocesador = JOptionPane.showInputDialog("Microprocesador:");
        String memoria = JOptionPane.showInputDialog("Memoria:");
        String tarjetaGrafica = JOptionPane.showInputDialog("Tarjeta gráfica:");
        String tamanioTorre = JOptionPane.showInputDialog("Tamaño de torre:");
        String capacidadDiscoDuro = JOptionPane.showInputDialog("Capacidad de disco duro:");

        if (validarDatos(fabricante, modelo, microprocesador, memoria, tarjetaGrafica, tamanioTorre, capacidadDiscoDuro)) {
            equipos.add(new Desktop(fabricante, modelo, microprocesador, tarjetaGrafica, tamanioTorre, capacidadDiscoDuro, memoria));
        }
    }

    private static void registrarLaptop() {
        String fabricante = JOptionPane.showInputDialog("Fabricante:");
        String modelo = JOptionPane.showInputDialog("Modelo:");
        String microprocesador = JOptionPane.showInputDialog("Microprocesador:");
        String memoria = JOptionPane.showInputDialog("Memoria:");
        String tamanioPantalla = JOptionPane.showInputDialog("Tamaño pantalla:");
        String capacidadDiscoDuro = JOptionPane.showInputDialog("Capacidad de disco duro:");

        if (validarDatos(fabricante, modelo, microprocesador, memoria, tamanioPantalla, capacidadDiscoDuro)) {
            equipos.add(new Laptop(fabricante, modelo, microprocesador, tamanioPantalla, capacidadDiscoDuro, memoria));
        }
    }

    private static void registrarTablet() {
        String fabricante = JOptionPane.showInputDialog("Fabricante:");
        String modelo = JOptionPane.showInputDialog("Modelo:");
        String microprocesador = JOptionPane.showInputDialog("Microprocesador:");
        String tamanioDiagonalPantalla = JOptionPane.showInputDialog("Tamaño diagonal de pantalla:");
        String tipoPantalla = JOptionPane.showInputDialog("Tipo de pantalla (capacitiva o resistiva):");
        String tamanioMemoriaNAND = JOptionPane.showInputDialog("Tamaño memoria NAND:");
        String sistemaOperativo = JOptionPane.showInputDialog("Sistema operativo:");

        if (validarDatos(fabricante, modelo, microprocesador, tamanioDiagonalPantalla, tipoPantalla, tamanioMemoriaNAND, sistemaOperativo)) {
            equipos.add(new Tablet(fabricante, modelo, microprocesador, tamanioDiagonalPantalla, tipoPantalla, tamanioMemoriaNAND, sistemaOperativo));
        }
    }

    private static boolean validarDatos(String... datos) {
        for (String dato : datos) {
            if (dato == null || dato.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos los campos deben ser completados.");
                return false;
            }
        }
        return true;
    }

    private static void verEquipos() {
        String tipoEquipo = JOptionPane.showInputDialog(
                "¿Qué tipo de equipo desea ver?\n" +
                        "1. Desktop\n" +
                        "2. Laptop\n" +
                        "3. Tablet\n" +
                        "4. Ver todos");

        StringBuilder sb = new StringBuilder();

        switch (tipoEquipo) {
            case "1":
                sb.append("Desktops registrados:\n");
                for (Equipo equipo : equipos) {
                    if (equipo instanceof Desktop) {
                        sb.append(equipo.mostrarDetalles()).append("\n\n");
                    }
                }
                break;
            case "2":
                sb.append("Laptops registradas:\n");
                for (Equipo equipo : equipos) {
                    if (equipo instanceof Laptop) {
                        sb.append(equipo.mostrarDetalles()).append("\n\n");
                    }
                }
                break;
            case "3":
                sb.append("Tablets registradas:\n");
                for (Equipo equipo : equipos) {
                    if (equipo instanceof Tablet) {
                        sb.append(equipo.mostrarDetalles()).append("\n\n");
                    }
                }
                break;
            case "4":
                sb.append("Equipos registrados:\n");
                for (Equipo equipo : equipos) {
                    sb.append(equipo.mostrarDetalles()).append("\n\n");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de equipo no válido.");
                return; // Salir si la opción no es válida
        }

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }
}
