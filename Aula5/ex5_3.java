import java.util.Scanner;
public class ex5_3 {
    public String to_string(int valor) 
    {
        throw new NumberFormatException("Entrada Invalida");
    }
        return Integer.toString(valor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int entrada = scanner.nextInt();
        try {
            ex5_3 conversor = new ex5_3();
            String resultado = conversor.to_string(entrada);
            System.out.println("Numero convertido: " + resultado);
            
        } catch (NumberFormatException e) {
            e.getMessage();
        } finally {
            System.out.println("Encerrando programa...");
        }
    }


