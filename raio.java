import java.util.Scanner;
 
class Circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Informe o raio do circulo: ");
        double raio = scanner.nextDouble();
 
        double diametro = 2 * raio;
        double circunferencia = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
 
        System.out.println("Diametro do circulo: " + diametro);
        System.out.println("Circunferencia do circulo: " + circunferencia);
        System.out.println("Area do circulo: " + area);
 
        scanner.close();
	}
}