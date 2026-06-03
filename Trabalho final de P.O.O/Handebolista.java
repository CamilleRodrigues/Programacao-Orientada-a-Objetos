//Classe que representa uma atleta da modalidade Handebol.
//Herda os atributos e métodos da classe Atleta.
public class Handebolista extends Atleta implements Avaliavel {
    //Posição em que a atleta joga dentro de quadra.
    private String posicao;

    //Construtor padrão.
    public Handebolista() {
        super(); //Chama o construtor padrão da classe Atleta.
    }

    //Construtor que recebe os dados da atleta e da modalidade.
    public Handebolista(String nome, int idade, double altura, String posicao) {
        super(nome, idade, altura);
        this.posicao = posicao;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    //Implementação obrigatória do método abstrato da classe Atleta.
    @Override
    public void exibirDadosEspecificos() {
        System.out.println("Posição em quadra: " + posicao);
    }

    @Override
    public void adicionarAvaliacao(AvaliacaoFisica avaliacao) {
        historicoAvaliacoes.add(avaliacao);
    }

    @Override
    public void exibirHistorico() {
        for (AvaliacaoFisica avaliacao : historicoAvaliacoes) {
            avaliacao.exibirAvaliacao();
            System.out.println("---------------------");
        }
    }
}
