public class Recursos {
    private String codigoERP; 
    private String contaContabil; 
    private String descricao;
    private double saldo2024;
    private double saldo2025;

    public Recursos(String codigoERP, String contaContabil, String descricao, double saldo2024, double saldo2025) {
        this.codigoERP = codigoERP;
        this.contaContabil = contaContabil;
        this.descricao = descricao;
        this.saldo2024 = saldo2024;
        this.saldo2025 = saldo2025;
    }

    public String getCodigoERP() { 
        return codigoERP; 
    }

    public String getContaContabil() { 
        return contaContabil; 
    }

    public String getDescricao() { 
        return descricao; 
    }

    public double getSaldo2024() { 
        return saldo2024; 
    }

    public double getSaldo2025() { 
        return saldo2025; 
    }

}