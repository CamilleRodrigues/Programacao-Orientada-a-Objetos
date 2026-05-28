import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Midia> playlist = new ArrayList<>();

        System.out.println("CADASTRO DA MÚSICA:");
        System.out.print("Nome da música: ");
        String tituloMusica = teclado.nextLine();
        System.out.print("Duração da música em segundos: ");
        double duracaoMusica = teclado.nextDouble();
        teclado.nextLine();
        Musica musica = new Musica(tituloMusica, duracaoMusica);
        playlist.add(musica);

        System.out.println("\nCADASTRO DO FILME:");
        System.out.print("Nome do filme: ");
        String tituloFilme = teclado.nextLine();
        System.out.print("Duração do filme em segundos: ");
        double duracaoFilme = teclado.nextDouble();
        teclado.nextLine();
        Filme filme = new Filme(tituloFilme, duracaoFilme);
        playlist.add(filme);

        System.out.println("\nCADASTRO DO PODCAST:");
        System.out.print("Nome do podcast: ");
        String tituloPodcast = teclado.nextLine();
        System.out.print("Duração do podcast em segundos: ");
        double duracaoPodcast = teclado.nextDouble();
        teclado.nextLine();
        Podcast podcast = new Podcast(tituloPodcast, duracaoPodcast);
        playlist.add(podcast);

        System.out.println("\nPLAYLIST:");

        for (Midia midia : playlist) {
            midia.reproduzir();
            if (midia instanceof Baixavel) {
                try {
                    System.out.print("\nA conexão está estável? (true/false): ");
                    boolean conexaoEstavel = teclado.nextBoolean();
                    teclado.nextLine();

                    Baixavel baixavel = (Baixavel) midia;
                    baixavel.realizarDownload(conexaoEstavel);
                } catch (FalhaNoDownloadException e) {
                    System.out.println(e.getMessage());
                }
            }

            if (midia instanceof Compartilhavel) {
                Compartilhavel compartilhavel = (Compartilhavel) midia;
                System.out.println("Link gerado: " + compartilhavel.gerarLink());
            }
        }
        teclado.close();
    }
}