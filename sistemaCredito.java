import java.util.Scanner;
 
class VerificarLimiteCredito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Numero da conta: ");
        int numeroConta = scanner.nextInt();
 
        System.out.print("Nome do Cliente: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();
 
        System.out.print("Saldo do inicio do mes: ");
        double saldoInicial = scanner.nextDouble();
 
        System.out.print("Total de todos os itens cobrados no mes: ");
        double cobrancas = scanner.nextDouble();
 
        System.out.print("Total de pagamentos efetuados pelo cliente no mes: ");
        double pagamentos = scanner.nextDouble();
 
        System.out.print("Limite autorizado de credito: ");
        double limiteCredito = scanner.nextDouble();
 
        double novoSaldo = saldoInicial + cobrancas - pagamentos;
 
        if (novoSaldo > limiteCredito) {
            double limiteExcedido = novoSaldo - limiteCredito;
            System.out.println("Limite de credito excedido em R$ " + limiteExcedido + " reais");
        } else {
            double limiteDisponivel = limiteCredito - novoSaldo;
            System.out.println("Ainda pode comprar R$ " + limiteDisponivel + " reais");
        }
    }
}    