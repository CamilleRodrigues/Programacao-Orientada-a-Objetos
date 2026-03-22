package pkg;

public class Pessoa {
	public String nome;
	public int idade;
	public String genero;
	
	public Pessoa(String nome, int idade, String genero) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		System.out.println("Nome: " + this.nome + " | Idade: " + this.idade + " | Gênero: " + this.genero + "\n");
	}
}
