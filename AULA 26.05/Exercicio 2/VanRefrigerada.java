class VanRefrigerada extends Veiculo implements Rastreador,Refrigerador {
    public VanRefrigerada(String placa, double capacidadeCarga) {
        super(placa, capacidadeCarga);
    }

     @Override
    public void iniciarViagem() {
        System.out.println("Van refrigerada iniciando viagem.");
    }

    @Override
    public String obterLocalizacao() {
        return getLocalizacao();
    }

    @Override
    public void ajustarTemperatura(double graus) throws TemperaturaCriticaException {
        if(graus > 10 || graus < -20) {
            throw new TemperaturaCriticaException("A carga pode ser comprometida!");
        }
        System.out.println("Temperatura ajustada para: " + graus + "°C");
    }
}
