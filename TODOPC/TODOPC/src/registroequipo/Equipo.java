package registroequipo;

/**
 * Clase base
 */
public abstract class Equipo {
    protected String fabricante;
    protected String modelo;
    protected String microprocesador;
    protected String memoria; // Agregado: memoria del equipo

    /**
     * Constructor para inicializar los atributos de un equipo.
     */
    public Equipo(String fabricante, String modelo, String microprocesador, String memoria) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
        this.memoria = memoria;
    }

    /**
     * Método abstracto para mostrar los detalles del equipo.
     */
    public abstract String mostrarDetalles();

    // Getters y setters para los atributos
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMicroprocesador() {
        return microprocesador;
    }

    public void setMicroprocesador(String microprocesador) {
        this.microprocesador = microprocesador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
}
