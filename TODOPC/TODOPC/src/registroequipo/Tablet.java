package registroequipo;

public class Tablet extends Equipo {
    private String tamanioDiagonalPantalla;
    private String tipoPantalla;
    private String tamanioMemoriaNAND;
    private String sistemaOperativo;

    public Tablet(String fabricante, String modelo, String microprocesador, String tamanioDiagonalPantalla, String tipoPantalla, String tamanioMemoriaNAND, String sistemaOperativo) {
        super(fabricante, modelo, microprocesador, "No especificado"); // Valor por defecto para memoria
        this.tamanioDiagonalPantalla = tamanioDiagonalPantalla;
        this.tipoPantalla = tipoPantalla;
        this.tamanioMemoriaNAND = tamanioMemoriaNAND;
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String mostrarDetalles() {
        return "Fabricante: " + fabricante +
                "\nModelo: " + modelo +
                "\nMicroprocesador: " + microprocesador +
                "\nTamaño diagonal de pantalla: " + tamanioDiagonalPantalla +
                "\nTipo de pantalla: " + tipoPantalla +
                "\nTamaño memoria NAND: " + tamanioMemoriaNAND +
                "\nSistema operativo: " + sistemaOperativo;
    }

    // Getters y setters para los nuevos atributos
    public String getTamanioDiagonalPantalla() {
        return tamanioDiagonalPantalla;
    }

    public void setTamanioDiagonalPantalla(String tamanioDiagonalPantalla) {
        this.tamanioDiagonalPantalla = tamanioDiagonalPantalla;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public String getTamanioMemoriaNAND() {
        return tamanioMemoriaNAND;
    }

    public void setTamanioMemoriaNAND(String tamanioMemoriaNAND) {
        this.tamanioMemoriaNAND = tamanioMemoriaNAND;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
}
