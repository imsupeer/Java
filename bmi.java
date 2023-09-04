import java.util.Scanner;
 
class CalculoPesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine(); //name
 
        System.out.print("Digite o seu peso (em kg): ");
        double peso = scanner.nextDouble(); //mass
 
        System.out.print("Digite a sua altura (em metros): ");
        double altura = scanner.nextDouble(); //height
 
        double pesoIdealHomem = (72.7 * altura) - 58.0; //for_man
        double pesoIdealMulher = (62.1 * altura) - 44.7; //for_woman
 
        System.out.println("Peso ideal para homem: " + pesoIdealHomem + " kg\n");
        System.out.println("Peso ideal para mulher: " + pesoIdealMulher + " kg");
 
        scanner.close();
    }
}
