import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex6_3 {
    public static void main(String[] args) {
        Map<String, Integer> pessoas = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro de 5 pessoas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine(); 
            pessoas.put(nome, idade);
        }

        System.out.println("\nPessoas cadastradas: " + pessoas);

        System.out.print("\nDigite um nome para consultar a idade: ");
        String nomeConsulta = sc.nextLine();

        if (pessoas.containsKey(nomeConsulta)) {
            System.out.println(nomeConsulta + " tem " + pessoas.get(nomeConsulta) + " anos.");
        } else {
            System.out.println("Nome não encontrado.");
        }

        System.out.print("\nDigite um nome para remover: ");
        String nomeRemover = sc.nextLine();
        pessoas.remove(nomeRemover);

        System.out.println("\nMapa atualizado: " + pessoas);

        sc.close();
    }
}
