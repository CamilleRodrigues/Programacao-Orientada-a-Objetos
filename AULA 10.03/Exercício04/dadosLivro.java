package pkg;

public class dadosLivro {

	public static void main(String[] args) {
		Livro l1 = new Livro();

		l1.titulo = "O menino do pijama listrado";
		l1.autor = "John Boyne";
		l1.anoPublicacao = 2006;
		System.out.println("Título: " + l1.titulo);
		System.out.println("Autor: " + l1.autor);
		System.out.println("Ano de publicaçãoo: " + l1.anoPublicacao);

	}

}
