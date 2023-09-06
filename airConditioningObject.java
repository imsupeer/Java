public class ArCondicionado {
    private String marca;
    private int capacidadeBTU;
    private boolean ligado;

    public ArCondicionado(String marca, int capacidadeBTU) {
        this.marca = marca;
        this.capacidadeBTU = capacidadeBTU;
        this.ligado = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadeBTU() {
        return capacidadeBTU;
    }

    public void setCapacidadeBTU(int capacidadeBTU) {
        this.capacidadeBTU = capacidadeBTU;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }
}
