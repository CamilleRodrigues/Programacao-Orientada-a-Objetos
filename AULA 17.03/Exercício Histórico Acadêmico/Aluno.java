package pkg;

public class Aluno {
	public String nome;
	public int matricula;
	public String dataNascimento;
	public int anoIngresso;
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		System.out.println("Nome: " + nome + " | Matricula: " + matricula + "\n");
	}
	
	public Aluno(String dataNascimento) {
		this.dataNascimento = dataNascimento;
		System.out.println("Data de nascimento: " + dataNascimento + "\n");
	}
	
	public Aluno(String nome, String dataNascimento, int anoIngresso) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.anoIngresso = anoIngresso;
		System.out.println("Nome: " + nome + " | Data de nascimento: " + dataNascimento + " | Ano de ingresso: " + anoIngresso);
	}
}
