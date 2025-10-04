public class ex2 {
    
    public static class Pessoa {    
        String nome;
        int idade;
        public Pessoa(String nome, int idade) {
            this.idade = idade;
            this.nome = nome;
        }
    }


    public static class Aluno extends Pessoa{
        String matricula;
        public Aluno(String nome, int idade, String matricula) {
            super(nome, idade);
            this.matricula = matricula;
        }
    }

    
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 20, "12345");
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("Matrícula: " + aluno.matricula);
    }
}

