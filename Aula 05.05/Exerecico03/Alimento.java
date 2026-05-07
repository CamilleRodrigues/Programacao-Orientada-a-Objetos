//3. Crie três classes concretas que estendem Produto: Vestuario

public class Alimento extends Produto {

    public Alimento(String descricao, double valorOriginal) { // Método construtor
        super(descricao, valorOriginal); // Específicos da classe Produto (constrtor da classe mãe)
    }

    @Override // "Escreve por cima" do método calcularImposto da classe Produto
    public double calcularImposto() {
        return getValorOriginal(); //Alimentos são isentos e não devem implementar a interface
    }

    //5. Caso o valor da porcentagem de desconto seja negativo ou superior a 50%, lance uma exceção indicando que a operação é inválida.
    @Override
    public void aplicarDesconto(double porcentagem) {
        if (porcentagem < 0 || porcentagem > 50) {
            throw new IllegalArgumentException("Desconto inválido!");
        }
        double desconto = getValorOriginal() * (porcentagem / 100);
        setValorOriginal(getValorOriginal() - desconto);
    }
}
