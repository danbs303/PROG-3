import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ex7_2 {
        public static void main(String[] args) {
            try (
                Scanner sc = new Scanner(System.in);
                PrintStream ps = new PrintStream("saida.txt");
            ) {
                System.out.println("Digite o texto (FIM para encerrar):");
                while (true) {
                    String linha = sc.nextLine();
                    if (linha.equalsIgnoreCase("FIM")) {
                        break;
                    }
                    ps.println(linha);
                }
                System.out.println("Arquivo 'saida.txt' foi criado");
            } catch (FileNotFoundException e) {
                System.out.println("Erro ao criar o arquivo: " + e.getMessage());
            }
        }
}
    


