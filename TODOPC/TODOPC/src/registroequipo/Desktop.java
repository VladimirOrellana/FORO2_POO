package registroequipo;

public class Desktop extends Equipo {
    private String tarjetaGrafica;
    private String tamanioTorre;
    private String capacidadDiscoDuro;

    public Desktop(String fabricante, String modelo, String microprocesador, String tarjetaGrafica, String tamanioTorre, String capacidadDiscoDuro, String memoria) {
        super(fabricante, modelo, microprocesador, memoria);
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamanioTorre = tamanioTorre;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    @Override
    public String mostrarDetalles() {
        return "Fabricante: " + fabricante +
                "\nModelo: " + modelo +
                "\nMicroprocesador: " + microprocesador +
                "\nMemoria: " + memoria +
                "\nTarjeta gráfica: " + tarjetaGrafica +
                "\nTamaño de torre: " + tamanioTorre +
                "\nCapacidad de disco duro: " + capacidadDiscoDuro;
    }

    // Getters y setters para los nuevos atributos
    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public String getTamanioTorre() {
        return tamanioTorre;
    }

    public void setTamanioTorre(String tamanioTorre) {
        this.tamanioTorre = tamanioTorre;
    }

    public String getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    public void setCapacidadDiscoDuro(String capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }
}
