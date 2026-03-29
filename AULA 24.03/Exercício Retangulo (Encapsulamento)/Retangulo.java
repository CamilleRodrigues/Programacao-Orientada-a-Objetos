package pkg;

public class Retangulo {
	private double largura;
	private double altura;
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
		System.out.println("Largura: " + this.largura + " || Altura: " + this.altura);
	}
	
	public double getLargura() {
		return largura;
	}
	
	public double setLargura(double largura) {
		return this.largura = largura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double setAltura(double altura) {
		return this.altura = altura;
	}
	
	public double getArea() {
		return this.largura * this.altura;
	}
}
