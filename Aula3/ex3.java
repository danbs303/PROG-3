public class ex3 {

    public static class Pessoa {
        private String nome;
        private int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() { return nome; }
        public int getIdade() { return idade; }
    }

    public static class Aluno extends Pessoa {
        private String matricula;

        public Aluno(String nome, int idade, String matricula) {
            super(nome, idade);
            this.matricula = matricula;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 20, "12345");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula());
    }
}
