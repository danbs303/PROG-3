public class ex4 {
    public static class Animal{
        public void emitirSom(){}
    }

    public static class Cachorro extends Animal{
        @Override
        public void emitirSom(){
            System.out.println("Au Au");
        }
    }

    public static class Gato extends Animal{
        @Override
        public void emitirSom(){
            System.out.println("Miau Miau");
        }
    }

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.emitirSom(); 
        gato.emitirSom();     
    }
}
