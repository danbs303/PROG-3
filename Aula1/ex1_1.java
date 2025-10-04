public class ex1_1 {
    public static void main(String[] args) {
        int idade = 70;

        if (idade < 16) {
            System.out.println("Não pode votar");
        } else if ((idade >= 16 && idade < 18) || (idade > 65)) {
            System.out.println("Voto facultativo");
        } else {
            System.out.println("Voto obrigatório");
        }
    }
}


