package pkg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Estudante aluno = new Estudante(0.0);
        System.out.print("Digite a nova nota do aluno: ");
        double notaDigitada = teclado.nextDouble();
        aluno.setNota(notaDigitada);
        
        System.out.println("Nota final: " + aluno.getNota());
        
        teclado.close();
    }
}
