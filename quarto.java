public class Quarto {
    private int numero;
    private String tipo;
    private boolean ocupado;

    public Quarto(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.ocupado = false;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
