import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Placa do caminhão: ");
        String placaCaminhao = teclado.nextLine();

        System.out.print("Capacidade de carga do caminhão: ");
        double capacidadeCargaCaminhao = teclado.nextDouble();
        teclado.nextLine();

        CaminhaoPadrao caminhao = new CaminhaoPadrao(placaCaminhao, capacidadeCargaCaminhao);

        System.out.print("Localização do caminhão: ");
        String localizacaoCaminhao = teclado.nextLine();

        caminhao.setLocalizacao(localizacaoCaminhao);

        System.out.println();

        System.out.print("Placa da van: ");
        String placaVan = teclado.nextLine();

        System.out.print("Capacidade de carga da van: ");
        double capacidadeCargaVan = teclado.nextDouble();
        teclado.nextLine();

        VanRefrigerada van = new VanRefrigerada(placaVan, capacidadeCargaVan);

        System.out.print("Localização da van: ");
        String localizacaoVan = teclado.nextLine();

        van.setLocalizacao(localizacaoVan);

        System.out.println();

        caminhao.iniciarViagem();

        System.out.println("Localização do caminhão: " + caminhao.obterLocalizacao());

        van.iniciarViagem();

        System.out.println("Localização da van: "+ van.obterLocalizacao());


        boolean temperaturaValida = false;

        while (!temperaturaValida) {
            try {
                System.out.print("\nDigite a temperatura da van: ");
                double temperatura = teclado.nextDouble();
                van.ajustarTemperatura(temperatura);
                temperaturaValida = true;
            } catch (TemperaturaCriticaException e) {
                System.out.println(e.getMessage());
                System.out.println("Digite uma temperatura válida.");
            }
        }

        teclado.close();
    }
}
