import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Pessoa cliente;
    private List<ItemPedido> itens;

    public Pedido(Pessoa cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        itens.add(new ItemPedido(produto,quantidade));
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido itemPedido : itens) {
            total += ItemPedido.getSubtotal();
        }
        return total;
    }

    public void gerarComanda() {
        System.out.println("cliente: " + this.cliente.getNome());
        System.out.println("itens: " + this.itens);
        System.out.println("total: " + this.calcularTotal());

    }
}
