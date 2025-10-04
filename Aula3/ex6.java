public class ex6 {
    public static class ContaBancaria {
        private int numeroConta;

        public ContaBancaria(int numeroConta) {
            this.numeroConta = numeroConta;
        }

        public int getNumeroConta() {
            return numeroConta;
        }

        @Override
        public String toString() {
            return "ContaBancaria{" +
                    "numeroConta=" + numeroConta +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if(o == null) {
                return false;
            } else if (o.getClass() != this.getClass()) {
                return false;
            } else if (((ContaBancaria) o).getNumeroConta() == this.getNumeroConta()) {
                return true;
            } else {
                return false;
            }
            
        }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(123);
        ContaBancaria conta2 = new ContaBancaria(123);
        ContaBancaria conta3 = new ContaBancaria(456);

        System.out.println(conta1.equals(conta2)); 
        System.out.println(conta1.equals(conta3)); 

        System.out.println(conta1.toString());
        System.out.println(conta3.toString());
    }
    }
}

