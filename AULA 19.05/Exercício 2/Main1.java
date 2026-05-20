import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ContaCorrente conta = new ContaCorrente("João");

        System.out.print("Digite o valor do depósito: ");
        double deposito = teclado.nextDouble();

        try {
            conta.depositar(deposito);
            System.out.println("Depósito realizado! Saldo: " + conta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.print("Digite o valor do saque: ");
        double saque = teclado.nextDouble();

        try {
            conta.sacar(saque);
            System.out.println("Saque realizado! Saldo: " + conta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        teclado.close();
    }
}
