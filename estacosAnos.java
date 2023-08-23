import java.util.Scanner;
 
class EstacaoAno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite o mes (1 a 12): ");
        short mes = scanner.nextShort();
 
        String estacao;
 
        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacao = "Verao";
                break;
            case 3:
            case 4:
            case 5:
                estacao = "Outono";
                break;
            case 6:
            case 7:
            case 8:
                estacao = "Inverno";
                break;
            case 9:
            case 10:
            case 11:
                estacao = "Primavera";
                break;
            default:
                estacao = "Mes invalido";
        }
 
        System.out.println("A estacao do ano para o mes " + mes + " eh " + estacao);
    }
}