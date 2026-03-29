package pkg;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public void setLado1(double lado1) {
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            this.lado1 = lado1;
            System.out.println("Lado 1 atualizado para: " + lado1);
        } else {
            System.out.println("O valor " + lado1 + " invalida a Desigualdade Triangular!");
        }
    }

    public void setLado2(double lado2) {
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            this.lado2 = lado2;
            System.out.println("Lado 2 atualizado para: " + lado2);
        } else {
            System.out.println("O valor " + lado2 + " invalida o triângulo!");
        }
    }

    public void setLado3(double lado3) {
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            this.lado3 = lado3;
            System.out.println("Lado 3 atualizado para: " + lado3);
        } else {
            System.out.println("Erro: O valor " + lado3 + " invalida o triângulo!");
        }
    }

    public double getLado1() { 
    	return lado1; 
    
    }
    public double getLado2() { 
    	return lado2; 
    }
    
    public double getLado3() { 
    	return lado3; 
    }
}
