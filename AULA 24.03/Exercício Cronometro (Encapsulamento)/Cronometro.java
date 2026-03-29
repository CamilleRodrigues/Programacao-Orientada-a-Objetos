package pkg;

public class Cronometro {
	private int segundos;
	
	public Cronometro(int segundos) {
		this.segundos = 0;
		System.out.println("Segundos: " + this.segundos);
	}
	
	public int getSegundos(int segundos) {
		return segundos; 
	}
	
	public void passarTempo() {
		segundos = segundos + 1;
		System.out.println("Tempo atual: " + this.segundos + "s");
	}
}
