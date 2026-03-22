package pkg;

public class Livro {
	public String titulo;
	public String autor;
	public int anoPublicacao;
	
	public Livro(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		System.out.println("Título: " + this.titulo + " | Autor: " + this.autor + " | Ano de publicação: " + this.anoPublicacao);
	}
}
