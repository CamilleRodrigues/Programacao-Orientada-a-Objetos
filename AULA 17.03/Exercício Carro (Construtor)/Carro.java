package pkg;

public class Carro {
	public String marca;
	public String modelo;
	public int anoFabricacao;
	
	public Carro(String marca, String modelo, int anoFabricacao) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		System.out.println("Marca: " + this.marca + " | Modelo: " + this.modelo + " | Ano de fabricação: " + anoFabricacao + "\n");
	}
}
