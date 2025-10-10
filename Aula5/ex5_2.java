import java.util.Scanner;
public class ex5_2 {
    public double calcularRaiz(double numero) {
        if(numero < 0) {
            throw new IllegalArgumentException("Número negativo não possui raiz real.");
        }
        return Math.sqrt(numero);
    }

    public static void main(String[] args) {
        ex5_2 calculadora = new ex5_2();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        scanner.close();
        try {
            double resultado = calculadora.calcularRaiz(numero);
            System.out.println("Resultado: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}