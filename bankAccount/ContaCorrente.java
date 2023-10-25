class ContaCorrente extends Conta {
    private static final double CPMF = 0.0038;

    public ContaCorrente(String numeroConta, String nomeCliente) {
        super(numeroConta, nomeCliente);
    }

    public ContaCorrente(String numeroConta, String nomeCliente, double saldo) {
        super(numeroConta, nomeCliente, saldo);
    }

	//override
    public void debitar(double valor) {
        super.debitar(valor * (1 + CPMF));
    }
}