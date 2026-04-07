package pkg;

public class ItemMenu {
    public static void main(String[] args) {
        Sobremesa s = new Sobremesa();
        s.nome = "Mousse de Chocolate";
        s.preco = 15.00;
        s.contemAcucar = true;

        System.out.println("Sobremesa: " + s.nome);
        System.out.println("Preço: R$ " + s.preco);
        System.out.println("Contém açúcar? " + (s.contemAcucar ? "Sim" : "Não"));
    }
}

class ItemMenu {
    String nome;
    double preco;
}

class Sobremesa extends ItemMenu {
    boolean contemAcucar;
}
