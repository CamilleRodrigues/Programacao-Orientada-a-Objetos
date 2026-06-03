//Sistema de Acompanhamento de Avaliação Física de Atletas

//Importa a classe ArrayList da biblioteca do Java.
//Ela será utilizada para armazenar várias avaliações físicas da atleta.
import java.util.ArrayList; 

//Classe abstrata que representa uma atleta.
//Serve como base para as modalidades de Ginástica Artística e Handebol.
public abstract class Atleta {
    private String nome;
    private int idade;
    private double altura;
    //Cada atleta possui sua própria lista de avaliações.
    //A lista armazenará objetos da classe AvaliacaoFisica.
    public ArrayList<AvaliacaoFisica> historicoAvaliacoes; 

    //Construtor padrão.
    //Inicializa a lista de avaliações da atleta.
    public Atleta() {
        historicoAvaliacoes = new ArrayList<>(); 
    }

    //Construtor que recebe os dados básicos da atleta.
    public Atleta(String nome, int idade, double altura) { 
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.historicoAvaliacoes = new ArrayList<>(); //Cria a lista vazia.
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

    //Retorna a lista completa.
    public ArrayList<AvaliacaoFisica> getHistoricoAvaliacoes() {
        return historicoAvaliacoes;
    }

    //Adiciona uma nova avaliação física ao histórico da atleta.
    public void adicionarAvaliacao(AvaliacaoFisica avaliacao) {
        historicoAvaliacoes.add(avaliacao);
    }

    //A classe Atleta sabe que cada modalidade possui informações próprias.
    //Porém ela não sabe quais.
    //Por isso ela obriga as subclasses a implementarem o método.
    public abstract void exibirDadosEspecificos();
}
