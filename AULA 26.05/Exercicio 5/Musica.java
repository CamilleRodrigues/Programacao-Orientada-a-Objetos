class Musica extends Midia implements Baixavel,Compartilhavel {
    public Musica(String titulo, double duracaoSegundos) {
        super(titulo, duracaoSegundos);
    }

    @Override
    public void reproduzir() {
        System.out.println("A Música " + getTitulo() + " está sendo reproduzida!");
    }

    @Override
    public void realizarDownload(boolean conexaoEstavel) throws FalhaNoDownloadException {
       if(!conexaoEstavel) {
            throw new FalhaNoDownloadException("\nErro de rede: Não foi possível baixar " + getTitulo());
        }
        System.out.println("\nDownload realizado com sucesso: " + getTitulo());
    }

    @Override
    public String gerarLink() {
        return "https://streaming.com/musica/" + getTitulo().replace(" ","_");
    }
}
