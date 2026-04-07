package pkg;

public class Livro {
    public static void main(String[] args) {
        Ebook meuLivroDigital = new Ebook();
        meuLivroDigital.titulo = "Dom Casmurro";
        meuLivroDigital.autor = "Machado de Assis";
        meuLivroDigital.tamanhoArquivoMB = 2.4;

        System.out.println("Título: " + meuLivroDigital.titulo);
        System.out.println("Autor: " + meuLivroDigital.autor);
        System.out.println("Tamanho: " + meuLivroDigital.tamanhoArquivoMB + " MB");
    }
}

class Livro {
    String titulo;
    String autor;
}

class Ebook extends Livro {
    double tamanhoArquivoMB;
}
