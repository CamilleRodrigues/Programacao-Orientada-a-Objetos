package pkg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do usuário: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a senha do usuário: ");
        String senha = teclado.nextLine();
        new Usuario(nome, senha);
        
        teclado.close();
    }
}
