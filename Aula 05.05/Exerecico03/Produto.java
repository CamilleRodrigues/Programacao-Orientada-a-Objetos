//Exercício 3: Uma loja de departamentos vende diferentes categorias de produtos, cada uma com sua própria regra de tributação e descontos.

//2. Crie uma classe abstrata Produto com atributos descricao e valorOriginal. 
public abstract class Produto {
    private String descricao;
    private double valorOriginal;

    public Produto(String descricao, double valorOriginal) { // Método construtor que recebe os atributos das subclasses
        this.descricao = descricao;
        this.valorOriginal = valorOriginal; 
    }

    //Como os atributos estão private, as subclasses não conseguem acessá-los diretamente. Para isso utilizamos getters e setters 
    public String getDescricao() {
        return descricao;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorOriginal(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    //Defina uma interface Tributavel que contenha o método calcularImposto().
    public abstract double calcularImposto(); // A classe que herdar este métodoabstrato terá que utilizar

    //5. método aplicarDesconto(double porcentagem) herdado da classe Produto
    public abstract void aplicarDesconto(double porcentagem);
}
