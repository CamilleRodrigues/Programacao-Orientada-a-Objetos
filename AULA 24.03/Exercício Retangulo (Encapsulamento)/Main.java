package pkg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a largura da área: ");
        double largura = teclado.nextDouble();
        System.out.print("Digite a altura da área: ");
        double altura = teclado.nextDouble();
        Retangulo area = new Retangulo(largura, altura);
        
        System.out.println("A área calculada é: " + area.getArea());
        
        teclado.close();
    }
}
