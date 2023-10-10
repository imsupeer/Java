import java.util.Scanner;

class Aluno {
    int codigo;
    String nome;
    double nota1;
    double nota2;
    double nota3;

    public Aluno(int codigo, String nome, double nota1, double nota2, double nota3) {
        this.codigo = codigo;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public double calcularMedia(double peso1, double peso2, double peso3) {
        return (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
    }

    public String toString() {
        return String.format("%4d\t%-8s\t%.1f\t%.1f\t%.1f\t%.1f", codigo, nome, nota1, nota2, nota3, calcularMedia());
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos deseja cadastrar: ");
        int numAlunos = sc.nextInt();
        Aluno[] alunos = new Aluno[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Digite o codigo do aluno: ");
            int codigo = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o nome do aluno: ");
            String nome = sc.nextLine();
            System.out.println("Digite a nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.println("Digite a nota 2: ");
            double nota2 = sc.nextDouble();
            System.out.println("Digite a nota 3: ");
            double nota3 = sc.nextDouble();

            alunos[i] = new Aluno(codigo, nome, nota1, nota2, nota3);
        }

        double somaMedias = 0;
        double menorMedia = Double.MAX_VALUE;
        double maiorMedia = Double.MIN_VALUE;
        String nomeMenorMedia = "";
        String nomeMaiorMedia = "";

        System.out.println("\nTabela de Alunos:\n");
        System.out.println("Codigo\tNome\tNota1\tNota2\tNota3\tMedia");

        for (int i = 0; i < numAlunos; i++) {
            Aluno aluno = alunos[i];
            double media = aluno.calcularMedia();
            somaMedias += media;

            if (media < menorMedia) {
                menorMedia = media;
                nomeMenorMedia = aluno.nome;
            }

            if (media > maiorMedia) {
                maiorMedia = media;
                nomeMaiorMedia = aluno.nome;
            }

            System.out.println(aluno);
        }

        double mediaDasMedias = somaMedias / numAlunos;

        System.out.println("\nMedia das medias = " + mediaDasMedias);
        System.out.println("O aluno com menor media foi " + nomeMenorMedia + " com " + menorMedia + ".");
        System.out.println("O aluno com maior media foi " + nomeMaiorMedia + " com " + maiorMedia + ".");
    }
}
