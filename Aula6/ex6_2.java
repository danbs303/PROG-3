import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex6_2 {
    public static void main(String[] args) {
        Set<String> palavras = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite palavras (digite 'fim' para encerrar):");
        while (true) {
            String entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }
            palavras.add(entrada);
        }

        System.out.println("\nPalavras unicas digitadas:");
        for (String p : palavras) {
            System.out.println("- " + p);
        }

        if (palavras.contains("java")) {      
            System.out.println("\njava foi digitado!");
        } else {
            System.out.println("\njava não foi digitado.");
        }

        sc.close();
    }
}
