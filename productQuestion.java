import java.util.Scanner;

class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private String unidade;
    private double valorUnitario;

    public Produto(int codigo, String nome, int quantidade, String unidade, double valorUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.valorUnitario = valorUnitario;
    }

    public double calcularValorTotal() {
        return quantidade * valorUnitario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos produtos voce deseja cadastrar? ");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine();

        Produto[] produtos = new Produto[quantidadeProdutos];
        String produtoMaisValiosoNome = "";
        double produtoMaisValiosoValor = 0;
        double somaValoresTotais = 0;

        System.out.println("Codigo   Nome   Quantidade   Unidade   Valor   Total");

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("\nProduto " + (i + 1) + ":");

            System.out.print("Codigo: ");
            int codigo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Unidade: ");
            String unidade = scanner.nextLine();

            System.out.print("Valor Unitario: ");
            double valorUnitario = scanner.nextDouble();
            scanner.nextLine();

            Produto produto = new Produto(codigo, nome, quantidade, unidade, valorUnitario);
            produtos[i] = produto;

            double valorTotal = produto.calcularValorTotal();
            somaValoresTotais += valorTotal;

            if (valorTotal > produtoMaisValiosoValor) {
                produtoMaisValiosoNome = nome;
                produtoMaisValiosoValor = valorTotal;
            }

            System.out.printf("%d   %s   %d   %s   R$%.2f   R$%.2f%n",
                    codigo, nome, quantidade, unidade, valorUnitario, valorTotal);
        }

        System.out.println("\nSoma dos valores totais: R$" + somaValoresTotais);
        System.out.printf("O produto mais valioso eh %s com R$%.2f%n", produtoMaisValiosoNome, produtoMaisValiosoValor);

        scanner.close();
    }
}
