import java.util.Scanner;

class Candidato {
    int numero;
    String nome;
    int votos;

    public Candidato(int numero, String nome, int votos) {
        this.numero = numero;
        this.nome = nome;
        this.votos = votos;
    }

    public boolean classificado(int votosMinimos) {
        return votos >= votosMinimos;
    }

    public boolean classificado() {
        return votos >= 10;
    }

    public void mostrarDados() {
        System.out.printf("Item | Numero |           Nome           | Votos |       Classificado%n");
        System.out.printf("%4d | %6d | %-25s | %5d | %s%n", numero, numero, nome, votos,
                (classificado() ? "Sim, Excedeu " + (votos - 10) + " voto(s)" : "Nao, Faltou " + (10 - votos) + " voto(s)"));
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos candidatos deseja cadastrar?");
        int numCandidatos = sc.nextInt();
        Candidato[] candidatos = new Candidato[numCandidatos];

        int somaVotos = 0;
        int maisVotos = 0;
        String nomeMaisVotado = "";

        for (int i = 0; i < numCandidatos; i++) {
            System.out.println("Digite o numero do candidato:");
            int numero = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o nome do candidato:");
            String nome = sc.nextLine();
            System.out.println("Digite a quantidade de votos:");
            int votos = sc.nextInt();

            candidatos[i] = new Candidato(numero, nome, votos);
            somaVotos += votos;

            if (votos > maisVotos) {
                maisVotos = votos;
                nomeMaisVotado = nome;
            }
        }

        System.out.println("\nTabela de Candidatos:\n");
        for (int i = 0; i < numCandidatos; i++) {
            candidatos[i].mostrarDados();
        }

        double mediaVotos = (double) somaVotos / numCandidatos;

        System.out.println("\nInformar no final:");
        System.out.println("A soma dos votos = " + somaVotos);
        System.out.println("Media dos Votos = " + mediaVotos);
        System.out.println("Mais votado " + nomeMaisVotado + " com " + maisVotos + " votos.");
    }
}
