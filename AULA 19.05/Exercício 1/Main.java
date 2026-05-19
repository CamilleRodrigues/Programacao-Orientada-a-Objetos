// Classe principal para testar o código
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Criando o Scanner

        System.out.print("Digite a marca do smartwatch: "); // Pedindo a marca, que vem da classe Dispositivo
        String marca = teclado.nextLine();

        // Instanciando o smartwatch com o valor digitado e chamando os métodos
        Smartwatch relogio = new Smartwatch(marca); 
        relogio.exibirMarca(); 
        relogio.ligar();
        relogio.conectarBluetooth();
        relogio.medirBatimentos();

        teclado.close(); // Fechando o Scanner
    }
}
