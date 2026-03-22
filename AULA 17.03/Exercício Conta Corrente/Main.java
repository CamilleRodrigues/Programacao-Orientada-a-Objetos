package pkg;

public class Main {

	public static void main(String[] args) {
		ContaCorrente novaConta = new ContaCorrente();
		novaConta.definirSaldoInicial(1000);
		novaConta.sacar(500);
		novaConta.depositar(50);
		novaConta.sacar1(600);
	}

}
