package pkg;

public class dadosPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();

		p1.nome = "Camille da Silva Rodrigues";
		p1.idade = 23;
		p1.genero = "Heterossexual";
		System.out.println("Nome: " + p1.nome);
		System.out.println("Idade: " + p1.idade);
		System.out.println("Gênero: " + p1.genero);
	}

}
