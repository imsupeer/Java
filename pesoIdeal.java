import java.util.Scanner;
 
class CalculoPesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
 
        System.out.print("Digite o seu peso (em kg): ");
        double peso = scanner.nextDouble();
 
        System.out.print("Digite a sua altura (em metros): ");
        double altura = scanner.nextDouble();
 
        double pesoIdealHomem = (72.7 * altura) - 58.0;
        double pesoIdealMulher = (62.1 * altura) - 44.7;
 
        System.out.println("Peso ideal para homem: " + pesoIdealHomem + " kg\n");
        System.out.println("Peso ideal para mulher: " + pesoIdealMulher + " kg");
 
        scanner.close();
    }
}