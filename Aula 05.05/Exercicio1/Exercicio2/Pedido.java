//3. Crie uma classe Pedido que contenha uma lista (ou array) de objetos do tipo:
//ItemCardapio. 
//Implemente um método adicionarItem(ItemCardapio item)
//Implemente um método fecharConta().
//O método fecharConta() deve iterar sobre a lista de itens, invocando o método calcularPrecoFinal() de cada um para somar o valor total da conta.

import java.util.ArrayList; //serve para criar listas dinâmicas em Java

public class Pedido { //Cria a classe chamada Pedido e pode ser acessada por outras classes

   private ArrayList<ItemCardapio> itens; //Cria um atributo do tipo lista chamado itens que guarda objetos do tipo ItemCardapio

   public Pedido() { // Construtor
      itens = new ArrayList<>(); //Chama o atributo criado anteriormente e cria a lista vazia
   }

   public void adicionarItem(ItemCardapio item) { //Método responsável por adicionar itens na lista que recebe um objeto chamado item.
      itens.add(item); //Adiciona o item dentro da lista.
   }

   public double fecharConta() { //Soma todos os itens
      double total = 0; //Começa em 0 porque ainda não somamos nada.
      for (ItemCardapio item : itens) { //Para cada item dentro da lista itens, acontece o polimorfismo
         total = total + item.calcularPrecoFinal();
      }
      return total; //Retorna o valor final da conta.
   }
}
