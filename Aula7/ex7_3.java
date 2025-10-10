import java.io.File;
import java.util.Scanner;

public class ex7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o caminho do arquivo ou diretório: ");
        String caminho = sc.nextLine();
        sc.close();
        File f = new File(caminho);

        if (f.exists()) {
            System.out.println("Existe: " + f.getName());
            if (f.isFile()) {
                System.out.println("É um arquivo");
                System.out.println("Tamanho: " + f.length() + " bytes");
            } else if (f.isDirectory()) {
                System.out.println("É um diretório");
                System.out.println("Conteúdo:");
                String[] arquivos = f.list();
                if (arquivos != null) {
                    for (String nome : arquivos) {
                        System.out.println(" - " + nome);
                    }
                }
            }
            System.out.println("Caminho absoluto: " + f.getAbsolutePath());
        } else {
            System.out.println("O caminho não existe.");
        }
    }
}