import java.util.InputMismatchException;
import java.util.Scanner;
public class ex5_3 {
    public String to_string(int valor)  {
        return Integer.toString(valor);
    }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um numero inteiro: ");
    try {
            int entrada = scanner.nextInt();
            ex5_3 conversor = new ex5_3();
            String resultado = conversor.to_string(entrada);
            System.out.println("Numero convertido: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Erro formato errado parcero");
        } finally {
            scanner.close();
            System.out.println("Encerrando programa...");
        }
    }
}

