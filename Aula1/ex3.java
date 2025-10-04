public class ex3 {
    public static void main(String[] args) {
        int[] notas = {7, 8, 6, 9, 5, 10, 4, 3, 2, 1};
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        double media = soma / (double) notas.length;
        System.out.println("Média: " + media);

        int acima = 0, abaixo = 0;
        for (int nota : notas) {
            if (nota > media) {
                acima++;
            } else if (nota < media) {
                abaixo++;
            }
        }
        System.out.println("Notas acima da média: " + acima);
        System.out.println("Notas abaixo da média: " + abaixo);
    }
}
