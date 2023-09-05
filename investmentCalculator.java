import java.util.Scanner;

class CalculadoraPoupanca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do investimento (p): ");
        double p = scanner.nextDouble(); //initial investment

        System.out.print("Informe a taxa de juros anual (r em %): ");
        double r = scanner.nextDouble() / 100; //annual fees

        System.out.print("Informe o numero de anos (n): ");
        int n = scanner.nextInt(); //years of investment

        System.out.println("Ano\tQuantidade em deposito:");

        for (int ano = 1; ano <= n; ano++) {
            double a = p * Math.pow(1 + r, ano);
            System.out.println(ano + "\t" + a);
        }

        scanner.close();
    }
}
