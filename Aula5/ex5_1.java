import java.util.Scanner;
public class ex5_1 {
        public static void main(String[] args) {
            int a;
            int b;
            double resultado;
            Scanner scanner = new Scanner(System.in);
            try {
                a = scanner.nextInt();
                b = scanner.nextInt();
                resultado = a / b;
                System.out.println("Resultado: " + resultado);
                scanner.close();
            } catch (ArithmeticException e) {
                System.out.println("Erro: Divisao por zero n e permitida.");
            }
        }
    }