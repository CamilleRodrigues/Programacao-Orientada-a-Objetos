package pkg;

public class Pessoa {
	public String nome;
	public int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		System.out.println("Nome: " + this.nome + " e idade: " + this.idade);
	}
	
	public Pessoa(int idade) {
		this.idade = idade;
		System.out.println("Idade: " + this.idade);
	}
	
}
