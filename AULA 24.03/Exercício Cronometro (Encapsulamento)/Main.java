package pkg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cronometro meuCronometro = new Cronometro(0);

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o tempo: ");
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            meuCronometro.passarTempo();
        }
        System.out.println("\nTempo total decorrido: " + meuCronometro.getSegundos(n) + " segundos.");
        
        teclado.close();
    }
}
