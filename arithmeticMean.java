import java.util.Scanner;

class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro: ");
        int numero1 = scanner.nextInt(); //integer_input1

        System.out.print("Digite o segundo numero inteiro: ");
        int numero2 = scanner.nextInt(); //integer_input2

        scanner.close();

        double media = (double) (numero1 + numero2) / 2; //arithmetic

        System.out.println("A media dos numeros " + numero1 + " e " + numero2 + " é: " + media);
    }
}
