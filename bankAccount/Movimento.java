public class Movimento {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("24748", "CC - Joseph", 1000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("24749", "CP - Jocelio", 600.0);

        contaCorrente.mostrarDados();
        contaPoupanca.mostrarDados();

        contaCorrente.debitar(100);
        contaPoupanca.creditar(50);

        System.out.println("Apos debito e credito:");
        contaCorrente.mostrarDados();
        contaPoupanca.mostrarDados();

        contaCorrente.transferirPara(contaPoupanca, 100);

        System.out.println("Apos transferencia de R$ 100 da Conta Corrente para a Conta Poupanca:");
        contaCorrente.mostrarDados();
        contaPoupanca.mostrarDados();

        contaPoupanca.renderJuros(10);

        System.out.println("Apos rendimento de 10% na Conta Poupanca:");
        contaCorrente.mostrarDados();
        contaPoupanca.mostrarDados();
    }
}