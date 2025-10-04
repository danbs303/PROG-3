public class ex4_2 {
    enum NivelAcesso {
        BASICO,
        INTERMEDIARIO,
        ADMIN
    }
    public static class Usuario {
        private String nome;
        private NivelAcesso nivelAcesso;
        
        public Usuario(String nome, NivelAcesso nivelAcesso) {
            this.nome = nome;
            this.nivelAcesso = nivelAcesso;
        }

        public void exibirMensagem() {
            switch (nivelAcesso) {
                case BASICO:
                    System.out.println("Olá " + nome + ", você tem acesso básico.");
                    break;
                case INTERMEDIARIO:
                    System.out.println("Olá " + nome + ", você tem acesso intermediário.");
                    break;
                case ADMIN:
                    System.out.println("Olá " + nome + ", você tem acesso administrativo.");
                    break;
            }
        }

        public static void main(String[] args) {
            Usuario user1 = new Usuario("Alice", NivelAcesso.BASICO);
            Usuario user2 = new Usuario("Bob", NivelAcesso.INTERMEDIARIO);
            Usuario user3 = new Usuario("Carol", NivelAcesso.ADMIN);
            user1.exibirMensagem();
            user2.exibirMensagem();
            user3.exibirMensagem();
        }
    }
}


