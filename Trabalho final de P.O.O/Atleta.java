//Sistema de Acompanhamento de Avaliação Física de Atletas

//Importa a classe ArrayList da biblioteca Java.
//Ela será utilizada para armazenar várias avaliações físicas da atleta.
import java.util.ArrayList;

//Classe abstrata que representa uma atleta.
//Serve como base para as modalidades de Ginástica Artística e Handebol.
//Implementa a interface Avaliavel, obrigando a existência dos métodos
//relacionados ao gerenciamento das avaliações físicas.
public abstract class Atleta implements Avaliavel {

    private String nome;
    private int idade;
    private double altura;

    //Cada atleta possui sua própria lista de avaliações.
    //A lista armazenará objetos da classe AvaliacaoFisica.
    private ArrayList<AvaliacaoFisica> historicoAvaliacoes;

    //Construtor padrão.
    //Inicializa a lista de avaliações da atleta.
    public Atleta() {
        historicoAvaliacoes = new ArrayList<>();
    }

    //Construtor que recebe os dados básicos da atleta.
    public Atleta(String nome, int idade, double altura) throws DadosAtletaInvalidosException {
         if(nome == null || nome.trim().isEmpty()) {
            throw new DadosAtletaInvalidosException("O nome da atleta não pode estar vazio.");
        }

        if(idade <= 0) {
            throw new DadosAtletaInvalidosException("A idade deve ser maior que zero.");
        }

        if(altura <= 0) {
            throw new DadosAtletaInvalidosException("A altura deve ser maior que zero.");
        }

        this.nome = nome;
        this.idade = idade;
        this.altura = altura;

        //Cria uma lista vazia para armazenar as avaliações da atleta.
        this.historicoAvaliacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Retorna a lista completa de avaliações da atleta.
    public ArrayList<AvaliacaoFisica> getHistoricoAvaliacoes() {
        return historicoAvaliacoes;
    }

    //Implementação do método da interface Avaliavel.
    //Adiciona uma nova avaliação física ao histórico da atleta.
    @Override
    public void adicionarAvaliacao(AvaliacaoFisica avaliacao) {
        historicoAvaliacoes.add(avaliacao);
    }

    //A classe Atleta sabe que cada modalidade possui informações próprias.
    //Porém ela não sabe quais são essas informações.
    //Por isso obriga as subclasses a implementarem este método.
    public abstract void exibirDadosEspecificos();

    //Implementação do método da interface Avaliavel.
    //Percorre todas as avaliações armazenadas no histórico
    //e exibe seus dados na tela.
    @Override
    public void exibirHistorico() {

        if(historicoAvaliacoes.isEmpty()) {
            System.out.println("Nenhuma avaliação cadastrada.");
            return;
        }

        for(AvaliacaoFisica avaliacao : historicoAvaliacoes) {
            avaliacao.exibirAvaliacao();
            System.out.println("---------------------");
        }
    }
}
