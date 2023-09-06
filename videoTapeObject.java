public class VideoCassete {
    private String marca;
    private String modelo;
    private boolean tocando;

    public VideoCassete(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tocando = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void reproduzir() {
        this.tocando = true;
    }

    public void parar() {
        this.tocando = false;
    }
}
