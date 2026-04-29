public class Recursos {
    private String nome; // Nessa etapa iremos nomear o recurso 
    private String classificacao; // Nessa etapa iremos classificar o recurso como ATIVO ou PASSIVO
    private double valor; // Nessa etapa iremos indicar o valor do recurso 

    public Recursos(String nome, String classificacao, double valor) {
        this.nome = nome;
        this.classificacao = classificacao;
        this.valor = valor;
    }

    public String getClassificacao() { 
        return classificacao; 
    }

    public double getValor() { 
        return valor; 
    }

    public String getNome() {
        return nome; 
    }
}
