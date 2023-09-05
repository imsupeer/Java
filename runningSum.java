import java.util.Scanner;

class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int somaTotal = 0; //total sum
        int numeroDigitado; //digited number
        int contador = 0; //count
        
        System.out.println("Informe numeros para somar (0 para parar):");
        
        do {
            numeroDigitado = scanner.nextInt(); //scan an integer digited
            
            if (numeroDigitado != 0) {
                somaTotal += numeroDigitado;
                contador++;
                double media = (double) somaTotal / contador;
                System.out.println("Soma parcial: " + somaTotal);
                System.out.println("Quantidade de numeros inseridos: " + contador);
                System.out.println("Media aritmetica: " + media);
            }
        } while (numeroDigitado != 0);
        
        System.out.println("A soma dos " + contador + " numeros eh " + somaTotal);
        
        scanner.close();
    }
}
