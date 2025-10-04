public class ex2 {
    
    public static class Contador {
        private static int totalObjetos = 0;

        public Contador() {
            totalObjetos++;
        }

        public static int getTotalObjetos() {
            return totalObjetos;
        }

        public static void main(String[] args) {
            Contador c1 = new Contador();
            Contador c2 = new Contador();
            Contador c3 = new Contador();
            Contador c4 = new Contador();
            System.out.println("Total de objetos: " + Contador.getTotalObjetos());
        }
    }   
}
