public class ex1 {

    public static class Pessoa {
        String titulo;
        String autor;

        public Pessoa() {
            this.autor = "Autor Padrão";
            this.titulo = "Titulo Padrão";
        }

        public Pessoa(String autor, String titulo) {
            this.autor = autor;
            this.titulo = titulo;
        }
        
        public void exibirDados() {
            System.out.println("Autor: " + this.autor);
            System.out.println("Titulo: " + this.titulo);
        }

        public static void main(String[] args) {
            Pessoa l1 = new Pessoa();
            Pessoa l2 = new Pessoa("Napoleon Hill","Mais Esperto que o Diabo");
            l1.exibirDados();
            l2.exibirDados();
        }
    }
}


