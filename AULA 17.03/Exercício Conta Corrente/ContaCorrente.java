package pkg;

public class ContaCorrente {
	float saldo;
	float sacar;
	float depositar;
	float sacar1;
	
	public void definirSaldoInicial(float saldoInicial) {
		saldo = saldoInicial;
		System.out.println("Saldo inicial: " + saldo);
	}
	
	public void sacar(float sacar) {
		this.sacar = sacar;
		System.out.println("Saque efetuado de: " + sacar);
		
		saldo = saldo - sacar;
		System.out.println("Saldo após o saque: " + saldo);
	}
	
	public void depositar(float depositar) {
		this.depositar = depositar;
		System.out.println("Deposito efetuado de: " + depositar);
		
		saldo = saldo + depositar;
		System.out.println("Saldo após o deposito: " + saldo);
	}
	
	public void sacar1(float sacar1) {
		this.sacar1 = sacar1;
		System.out.println("Saque efetuado de: " + sacar1);
		
		saldo = saldo - sacar1;
		System.out.println("Saldo final após o saque: " + saldo);
	}
}
