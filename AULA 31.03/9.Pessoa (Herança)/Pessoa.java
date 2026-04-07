package pkg;

public class Pessoa {
    public static void main(String[] args) {
        Aluno a = new Aluno("Marcos", 22, "ABC-987");
        
        System.out.println(a.toString());
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
        return "Aluno [Nome: " + nome + ", Idade: " + idade + ", Matricula: " + matricula + "]";
    }
}
