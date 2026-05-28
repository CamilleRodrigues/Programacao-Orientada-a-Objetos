class Podcast extends Midia implements Compartilhavel {
    public Podcast(String titulo, double duracaoSegundos) {
        super(titulo, duracaoSegundos);
    }

    @Override
    public void reproduzir() {
        System.out.println("\nO Podcast " + getTitulo() + " está sendo reproduzido!");
    }

    @Override
    public String gerarLink() {
        return "https://streaming.com/podcast/" + getTitulo().replace(" ","_");
    }
}
