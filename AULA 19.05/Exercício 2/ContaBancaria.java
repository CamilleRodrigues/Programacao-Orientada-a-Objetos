// Classe abstrata base
abstract class ContaBancaria {
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getTitular() { 
        return titular; 
    }

    public double getSaldo() { 
        return saldo; 
    }

    // Método concreto
    public void depositar(double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito inválido!");
        }
        saldo = saldo + valor;
    }

    // Método abstrato
    public abstract void sacar(double valor) throws SaldoInsuficienteException;

    // Método protegido
    protected void debitar(double valor) {
        saldo = saldo - valor;
    }
}
