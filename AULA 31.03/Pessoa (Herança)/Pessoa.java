package pkg;

public class Pessoa {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao Silva", 19, "2024001ABC");
        System.out.println(aluno1.toString());
    }
}

class Pessoa {
    String nome;
    int idade;

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

    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade + " | Matrícula: " + matricula;
    }
}
