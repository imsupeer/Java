import java.util.Scanner;
 
class Circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Informe o raio do circulo: ");
        double raio = scanner.nextDouble(); //ray_circunference
 
        double diametro = 2 * raio; //diamenter
        double circunferencia = 2 * Math.PI * raio; //circunference
        double area = Math.PI * Math.pow(raio, 2); //total_area
 
        System.out.println("Diametro do circulo: " + diametro);
        System.out.println("Circunferencia do circulo: " + circunferencia);
        System.out.println("Area do circulo: " + area);
 
        scanner.close();
	}
}
