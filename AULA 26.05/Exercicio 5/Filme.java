class Filme extends Midia implements Baixavel {
    public Filme(String titulo, double duracaoSegundos) {
        super(titulo, duracaoSegundos);
    }

    @Override
    public void reproduzir() {
        System.out.println("\nO filme " + getTitulo() + " está sendo reproduzido!");
    }

    @Override
    public void realizarDownload(boolean conexaoEstavel) throws FalhaNoDownloadException {
       if(!conexaoEstavel) {
            throw new FalhaNoDownloadException("\nErro de rede: Não foi possível baixar " + getTitulo());
        }
        System.out.println("\nDownload realizado com sucesso: " + getTitulo());
    }
}
