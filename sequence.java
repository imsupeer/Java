import java.util.Scanner;

class NumerosSequencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para iniciar a sequencia: ");
        int n = scanner.nextInt(); //integer to start the sequence
        int count = 1;
        int lineCount = 0;

        while (count <= n) {
            if (lineCount == 0) {
                System.out.print("[");
            }
        
            System.out.print(count);

            if (lineCount < 4 && count < n) {
                System.out.print(",");
            } else {
                System.out.println("]");

                lineCount = -1;

                if (count % 10 == 0) {
                    System.out.println("Digite um numero para iniciar a sequencia: ");
                }
            }

            count++;
            lineCount++;
        }
        
        scanner.close();
    }
}
