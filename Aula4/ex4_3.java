public class ex4_3 {
    public interface Corredor {
        void correr();
    }
    public interface Nadador {
        void nadar();
    }
    public interface Ciclista {
        void pedalar();
    }
    public static class Triatleta implements Corredor, Nadador, Ciclista {
        public void correr() {
            System.out.println("O triatleta está correndo.");
        }
        public void nadar() {
            System.out.println("O triatleta está nadando.");
        }
        public void pedalar() {
            System.out.println("O triatleta está pedalando.");
        }
    }
    public static void main(String[] args) {
        Triatleta atleta = new Triatleta();
        atleta.correr();
        atleta.nadar();
        atleta.pedalar();
    }
}