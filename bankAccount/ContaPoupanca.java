class ContaPoupanca extends Conta {
    public ContaPoupanca(String numeroConta, String nomeCliente) {
        super(numeroConta, nomeCliente);
    }

    public ContaPoupanca(String numeroConta, String nomeCliente, double saldo) {
        super(numeroConta, nomeCliente, saldo);
    }

    public void renderJuros(double taxa) {
        double juros = getSaldo() * (taxa / 100);
        creditar(juros);
    }
}