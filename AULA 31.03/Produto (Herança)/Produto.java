package pkg;

public class Produto {
    public static void main(String[] args) {
        ProdutoEletronico tv = new ProdutoEletronico();
        tv.nome = "Televisão 50 Polegadas";
        tv.preco = 2500.00;
        tv.garantia = 12; 

        System.out.println("Produto: " + tv.nome);
        System.out.println("Preço: R$ " + tv.preco);
        System.out.println("Garantia: " + tv.garantia + " meses");
    }
}

class Produto {
    String nome;
    double preco;
}

class ProdutoEletronico extends Produto {
    int garantia; 
}
