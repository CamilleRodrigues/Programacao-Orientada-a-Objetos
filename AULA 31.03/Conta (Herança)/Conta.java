package pkg;

public class Conta {
    public static void main(String[] args) {
        ContaPoupanca minhaPoupanca = new ContaPoupanca();
        minhaPoupanca.saldo = 1000.00; 
        
        System.out.println("Saldo inicial: R$ " + minhaPoupanca.saldo);
        
        minhaPoupanca.render();
        
        System.out.println("Saldo após rendimento: R$ " + minhaPoupanca.saldo);
    }
}

class Conta {
    double saldo;
    void render() {
    }
}

class ContaPoupanca extends Conta {
    @Override
    void render() {
        this.saldo = this.saldo * 1.01;
    }
}
