//3. Crie três classes concretas que estendem Produto: Eletronico

public class Eletronico extends Produto {

    public Eletronico(String descricao, double valorOriginal) { // Método construtor
        super(descricao, valorOriginal); // Específicos da classe Produto (constrtor da classe mãe)
    }

    //4. Faça com que apenas Eletronico e Vestuario implementem a interface Tributavel. A regra de imposto para eletrônicos é de 15% sobre o valor
    @Override // "Escreve por cima" do método calcularImposto da classe Produto
    public double calcularImposto() {
        return getValorOriginal() * 1.15; // Adiciona 15%
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
