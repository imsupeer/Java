abstract class Conta {
    private String numeroConta;
    private String nomeCliente;
    private double saldo;

    public Conta(String numeroConta, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0;
    }

    public Conta(String numeroConta, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void creditar(double valor) {
        saldo += valor;
    }

    public void debitar(double valor) {
        saldo -= valor;
    }

    public void mostrarDados() {
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);
    }

    public void transferirPara(Conta destino, double valor) {
        debitar(valor);
        destino.creditar(valor);
    }
}