public class ex4_1 {
    public static abstract class ContaBancaria {
        public abstract boolean saca(double valor);
        public abstract void deposita(double valor);
    }

    public static class ContaCorrente extends ContaBancaria {
        private double saldo;
            public boolean saca(double valor) {
                if (valor <= saldo) {
                    saldo -= valor + 1;  //+1.0 de taxa
                    return true;
                }
                return false;
            }
        public void deposita(double valor) {
            saldo += valor;
        }

    public static class ContaPoupanca extends ContaBancaria {
        private double saldo;
            public boolean saca(double valor) {
                if (valor <= saldo) {
                    saldo -= valor;
                    return true;
                }
                return false;
            }
        public void deposita(double valor) {
            saldo += valor;
        }
    }
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        cc.deposita(100);
        cp.deposita(100);
        System.out.println("Saldo Conta Corrente: " + cc.saldo);
        System.out.println("Saldo Conta Poupanca: " + cp.saldo);
        cc.saca(50);
        cp.saca(50);
        System.out.println("Saldo Conta Corrente apos saque: " + cc.saldo);
        System.out.println("Saldo Conta Poupanca apos saque: " + cp.saldo);
    }
}
}

