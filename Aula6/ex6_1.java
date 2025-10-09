import java.util.ArrayList;
import java.util.Scanner;

public class ex6_1 {   
    public static class array_numeros {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int soma = 0;
        double media = 0.0;

        public void adicionarNumero(int numero) {
            numeros.add(numero);
        }

        public void exibirNumeros() {
            for (int numero : numeros) {
                System.out.printf(numero + " ");
            }
            System.out.println();
        }

        public void calcularSomaEMedia() {
            soma = 0;
            for (int numero : numeros) {
                soma += numero;
            }
            media = (double) soma / numeros.size();
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
        }

        public void removerPares() {
            numeros.removeIf(numero -> numero % 2 == 0);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        array_numeros listaNumeros = new array_numeros();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            listaNumeros.adicionarNumero(numero);
        }

        System.out.println("Números inseridos:");
        listaNumeros.exibirNumeros();

        listaNumeros.calcularSomaEMedia();

        listaNumeros.removerPares();
        System.out.println("Lista após remoção dos pares:");
        listaNumeros.exibirNumeros();

        scanner.close();
    }

}



