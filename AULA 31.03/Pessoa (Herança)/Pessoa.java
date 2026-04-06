package pkg;

public class Exercicio02 {
    public static void main(String[] args) {
        Aluno a = new Aluno("Joao", 20, "MT-12345");
        
        System.out.println("Nome: " + a.nome);
        System.out.println("Idade: " + a.idade);
        System.out.println("Matrícula: " + a.matricula);
    }
}

class Pessoa {
    String nome;
    int idade;

    // Construtor da Pessoa
    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

class Aluno extends Pessoa {
    String matricula;

    Aluno(String nome, int idade, String matricula) {
        super(nome, idade); 
        this.matricula = matricula;
    }
}
