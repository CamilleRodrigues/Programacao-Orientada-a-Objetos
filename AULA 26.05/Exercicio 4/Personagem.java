//Exercício 04: Jogo de RPG - Sistema de Batalha Seguro

public abstract class Personagem {
    private String nome;
    private int pontosVida;

    public Personagem(String nome, int pontosVida) { 
        this.nome = nome;
        setPontosVida(pontosVida);
    }
    
    public String getNome() { 
        return nome; 
    }

    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public int getPontosVida() { 
        return pontosVida; 
    }

    public void setPontosVida(int pontosVida) {
        if(pontosVida < 0) {
            this.pontosVida = 0;
        } else {
            this.pontosVida = pontosVida; 
        }

    }
    
    public abstract void atacar(Personagem alvo, int dano) throws AlvoInvalidoException;

}