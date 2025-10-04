public class ex2_1 {
    public static class Carro {
        private String marca;
        private String modelo;
        private int ano;

        public Carro(String marca, String modelo, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
        }

        public void exibirInfo() {
            System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
        }

        public static void main(String[] args) {
            Carro carro1 = new Carro("Toyota", "Corolla", 2020);
            Carro carro2 = new Carro("Chevrolet", "Opala", 2019);
            carro1.exibirInfo();
            carro2.exibirInfo();
        }
    }
}


