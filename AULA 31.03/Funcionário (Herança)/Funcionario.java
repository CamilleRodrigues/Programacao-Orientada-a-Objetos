package pkg;

public class Funcionario {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        Vendedor v = new Vendedor();

        System.out.println("Salário do Gerente: R$ " + g.calcularSalario());
        System.out.println("Salário do Vendedor: R$ " + v.calcularSalario());
    }
}

class Funcionario {
    double calcularSalario() {
        return 1000.0; 
    }
}

class Gerente extends Funcionario {
    @Override
    double calcularSalario() {
        return 5000.0; 
    }
}

class Vendedor extends Funcionario {
    @Override
    double calcularSalario() {
        return 2000.0; 
    }
}
