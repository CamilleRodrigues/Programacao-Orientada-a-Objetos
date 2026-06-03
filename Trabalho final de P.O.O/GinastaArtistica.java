//Classe que representa uma atleta da modalidade Ginástica Artística.
//Herda os atributos e métodos da classe Atleta.
public class GinastaArtistica extends Atleta implements Avaliavel {
    //Aparelho em que a atleta possui maior destaque.
    private String aparelhoPrincipal;

    //Construtor padrão.
    public GinastaArtistica() {
        super(); //Chama o construtor padrão da classe Atleta.
    }

    //Construtor que recebe os dados da atleta e da modalidade.
    public GinastaArtistica(String nome, int idade, double altura, String aparelhoPrincipal) {
        super(nome, idade, altura);
        this.aparelhoPrincipal = aparelhoPrincipal;
    }

    public String getAparelhoPrincipal() {
        return aparelhoPrincipal;
    }

    public void setAparelhoPrincipal(String aparelhoPrincipal) {
        this.aparelhoPrincipal = aparelhoPrincipal;
    }

    //Implementação obrigatória do método abstrato da classe Atleta.
    @Override
    public void exibirDadosEspecificos() {
        System.out.println("Aparelho Principal: " + aparelhoPrincipal);
    }

    @Override
    public void adicionarAvaliacao(AvaliacaoFisica avaliacao) {
        historicoAvaliacoes.add(avaliacao);
    }

    @Override
    public void exibirHistorico() {
        //Para cada avaliação presente na lista de avaliações da atleta faça avaliacao.exibirAvaliacao();
        for (AvaliacaoFisica avaliacao : historicoAvaliacoes) { 
            avaliacao.exibirAvaliacao();
            System.out.println("---------------------");
        }
    }
}
