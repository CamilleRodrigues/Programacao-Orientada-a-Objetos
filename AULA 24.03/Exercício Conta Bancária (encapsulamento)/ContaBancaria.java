package pkg;

public class ContaBancaria {
	private double saldo;
	private double limite;

	public ContaBancaria(double saldoInicial, double limiteInicial) {
		this.saldo = saldoInicial;
		this.limite = limiteInicial;
		System.out.println("Saldo Inicial: " + this.saldo + " | Limite Inicial: " + this.limite + "\n");
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		if (limite >= 0) {
			this.limite = limite;
		} else {
			System.out.println("Limite não aceita valores negativos!");
		}
	}

	public void sacar(double valor) {
		if (valor <= (saldo + limite)) {
			saldo = (saldo + limite) - valor;
			System.out.println("Saque realizado com sucesso! Saldo final da conta após o saque: " + saldo);
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
}
