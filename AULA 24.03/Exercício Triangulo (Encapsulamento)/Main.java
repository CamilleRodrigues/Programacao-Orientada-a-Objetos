package pkg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do Lado 1: ");
        double lado1 = teclado.nextDouble();
        
        System.out.print("Digite o valor do Lado 2: ");
        double lado2 = teclado.nextDouble();
        
        System.out.print("Digite o valor do Lado 3: ");
        double lado3 = teclado.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        System.out.print("\nDigite um outro valor para o Lado 1: ");
        double novoLado1 = teclado.nextDouble();
        
        triangulo.setLado1(novoLado1);

        System.out.println("Lado 1: " + triangulo.getLado1());
        System.out.println("Lado 2: " + triangulo.getLado2());
        System.out.println("Lado 3: " + triangulo.getLado3());

        teclado.close();
    }
}
