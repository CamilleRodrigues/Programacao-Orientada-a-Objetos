//Exercício 05: Plataforma de Streaming de Mídia (Simulação de Rede)

public abstract class Midia {
    private String titulo;
    private double duracaoSegundos;

    public Midia(String titulo, double duracaoSegundos) { 
        this.titulo = titulo;
        setDuracaoSegundos(duracaoSegundos);
    }
    
    public String getTitulo() { 
        return titulo; 
    }

    public void setTitulo(String titulo) { 
        this.titulo = titulo; 
    }

    public double getDuracaoSegundos() { 
        return duracaoSegundos; 
    }

    public void setDuracaoSegundos(double duracaoSegundos) {
        if(duracaoSegundos <= 0) {
            throw new IllegalArgumentException("A duração deve ser maior que zero.");
        }
        this.duracaoSegundos = duracaoSegundos;
    }
    
    public abstract void reproduzir();

}