class CaminhaoPadrao extends Veiculo implements Rastreador {
    public CaminhaoPadrao(String placa, double capacidadeCarga) {
        super(placa, capacidadeCarga);
    }

    @Override
    public void iniciarViagem() {
        System.out.println("Caminhão iniciando viagem.");
    }

    @Override
    public String obterLocalizacao() {
        return getLocalizacao();
    }
}
