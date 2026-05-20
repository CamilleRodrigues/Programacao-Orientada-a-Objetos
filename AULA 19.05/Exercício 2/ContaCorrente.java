// Classe filha
class ContaCorrente extends ContaBancaria implements Tributavel, TransacaoOnline {

    // Construtor
    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        double total = valor + 5.0;
        if (total > getSaldo()) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque.");
        }
        debitar(total);
    }

    @Override
    public void calcularImpostos() { //Devemos chamar o método da interface Tributavel
        System.out.println("Calculando impostos...");
    }

    @Override
    public void fazerPix(String chavePix, double valor) { //Devemos chamar o método da interface TransacaoOnline
        System.out.println("Fazendo pix...");
    }
}
