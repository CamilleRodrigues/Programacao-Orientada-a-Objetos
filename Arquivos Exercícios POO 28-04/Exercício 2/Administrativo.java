public class Administrativo extends FuncionarioHospital {
    private String departamento;
    private boolean cargoDeGestao;

    public Administrativo(String nome, String matricula, double salarioBase, boolean cargoDeGestao) {
        super(nome, matricula, salarioBase);
        this.cargoDeGestao = cargoDeGestao;
    }

    @Override
    public double calcularSalarioFinal() {
        double salario = getSalarioBase();
        if (cargoDeGestao) salario += 1500.0; 
        return salario;
    }
}
