package registroequipo;

public class Laptop extends Equipo {
    private String tamanioPantalla;
    private String capacidadDiscoDuro;

    public Laptop(String fabricante, String modelo, String microprocesador, String tamanioPantalla, String capacidadDiscoDuro, String memoria) {
        super(fabricante, modelo, microprocesador, memoria);
        this.tamanioPantalla = tamanioPantalla;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    @Override
    public String mostrarDetalles() {
        return "Fabricante: " + fabricante +
                "\nModelo: " + modelo +
                "\nMicroprocesador: " + microprocesador +
                "\nMemoria: " + memoria +
                "\nTamaño pantalla: " + tamanioPantalla +
                "\nCapacidad de disco duro: " + capacidadDiscoDuro;
    }

    // Getters y setters para los nuevos atributos
    public String getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(String tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public String getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    public void setCapacidadDiscoDuro(String capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }
}
