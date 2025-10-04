public class ex4 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        while (true) {
            int num = new java.util.Scanner(System.in).nextInt();
            if (num < 0) {
                break;
            }
            sum += num;
            count++;
        }
        if (count > 0) {
            double average = sum / (double) count;
            System.out.println("Quantidade de números digitados: " + count);
            System.out.println("Média dos números digitados: " + average);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }
    }
}

