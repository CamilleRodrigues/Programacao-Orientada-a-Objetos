package pkg;

public class Computador {
	public String marca;
	public String modelo;
	public String tipo;
	public float preco;
	
	public Carro(String marca, String modelo, String tipo, Float preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.preco = preco;
		System.out.println("Marca: " + this.marca + " | Modelo: " + this.modelo + " | Tipo: " + this.tipo + " | Preço: " + this.preco + "\n");
	}
}
