import java.util.Scanner;

class Automovel {
    private String chassi;
    private String marca;
    private String modelo;
    private double capacidadeTanque;
    private double quantidadeAtualLitros;
    private double consumo;

    public Automovel(String chassi, String marca, String modelo, double capacidadeTanque, double consumo) {
        this.chassi = chassi;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
        this.quantidadeAtualLitros = capacidadeTanque;
        this.consumo = consumo;
    }

    public void andar(double distanciaPercorrida) {
        double litrosConsumidos = distanciaPercorrida / consumo;
        if (litrosConsumidos <= quantidadeAtualLitros) {
            quantidadeAtualLitros -= litrosConsumidos;
        } else {
            System.out.println("O automovel nao tem combustivel suficiente para percorrer essa distancia.");
        }
    }

    public void abastecer(double quantidadeAbastecida) {
        if (quantidadeAbastecida + quantidadeAtualLitros <= capacidadeTanque) {
            quantidadeAtualLitros += quantidadeAbastecida;
            System.out.println("Abastecimento concluido. Nova quantidade de litros no tanque: " + quantidadeAtualLitros);
        } else {
            System.out.println("O tanque nao comporta essa quantidade de combustivel.");
        }
    }

    public void mostrarQuantidadeInicial() {
        System.out.println("Quantidade inicial de litros no tanque: " + capacidadeTanque);
    }

    public void mostrarQuantidadeAtual() {
        System.out.println("Quantidade atual de litros no tanque: " + quantidadeAtualLitros);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o chassi do automovel:");
        String chassi = scanner.nextLine();

        System.out.println("Informe a marca do automovel:");
        String marca = scanner.nextLine();

        System.out.println("Informe o modelo do automovel:");
        String modelo = scanner.nextLine();

        System.out.println("Informe a capacidade do tanque (em litros):");
        double capacidadeTanque = scanner.nextDouble();

        System.out.println("Informe o consumo (em km/litro):");
        double consumo = scanner.nextDouble();

        Automovel automovel = new Automovel(chassi, marca, modelo, capacidadeTanque, consumo);

        automovel.mostrarQuantidadeInicial();

        System.out.println("Informe quantos quilometros o automovel percorreu:");
        double distanciaPercorrida = scanner.nextDouble();

        automovel.andar(distanciaPercorrida);

        automovel.mostrarQuantidadeAtual();

        System.out.println("Informe a quantidade de litros para abastecer:");
        double quantidadeAbastecida = scanner.nextDouble();

        automovel.abastecer(quantidadeAbastecida);

        automovel.mostrarQuantidadeAtual();

        scanner.close();
    }
}
