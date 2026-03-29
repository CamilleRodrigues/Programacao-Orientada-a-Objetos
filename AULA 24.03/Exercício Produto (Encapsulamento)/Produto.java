package pkg;

public class Produto {
	private int quantidadeEmEstoque;
	
	public Produto(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
		System.out.println("Quantidade em estoque: " + this.quantidadeEmEstoque);
	}
	
	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	
	public int setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		return this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
	public void adicionarEstoque(int qtd) {
		quantidadeEmEstoque = quantidadeEmEstoque + qtd;
		System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
	}
	
	public void removerEstoque(int qtd) {
		if(quantidadeEmEstoque >= qtd) {
			quantidadeEmEstoque = quantidadeEmEstoque - qtd;
			System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
		} else {
			System.out.println("A conta não pode ser realizada. O estoque não pode ser negativo!");
		}
	}
}
