package pkg;

public class Estudante {
	private double nota;
	
	public Estudante(double nota) {
		this.nota = nota;
		System.out.println("Nota Inicial: " + this.nota);
	} 
	
	public double getNota() {
		return nota;
	}

	public double setNota(double nota) {
		if (nota >= 0 && nota <= 10) {
			this.nota = nota;
			System.out.println("Nota atualizada com sucesso!");
		} else {
			System.out.println("Nota inválida!");
		}
		return nota;
	}

}
