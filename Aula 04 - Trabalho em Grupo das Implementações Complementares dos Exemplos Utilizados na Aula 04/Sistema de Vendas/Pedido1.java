import java.util.ArrayList;
import java.util.List;

public class Pedido1 {
    private int numeroPedido;
    private Cliente1 cliente;
    private List<ItemPedido1> itens;
    private String data;

    public Pedido1(Cliente1 cliente, String data) {
        this.numeroPedido = gerarNumeroPedido();
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.data = data;
    }
//
    public void adicionarItem(ItemPedido1 item) {
        if (item.getProduto().verificarEstoque(item.getQuantidade())) {
            itens.add(item);
        } else {
            System.out.println("Estoque insuficiente para o produto: " + item.getProduto().consultarInformacoes());
        }
    }

    public void removerItem(ItemPedido1 item) {
        itens.remove(item);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido1 item : itens) {
            total += item.getQuantidade() * item.getProduto().getPreco(); // Usando o preço do produto
        }
        return total;
    }

    public void exibirDetalhesPedido() {
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("Data: " + data);
        System.out.println("Cliente: " + cliente.getNome() + " (CPF: " + cliente.getCpf() + ")");
        System.out.println("Itens do Pedido:");
        for (ItemPedido1 item : itens) {
            System.out.println(" - Produto: " + item.getProduto().consultarInformacoes());
            System.out.println("   Quantidade: " + item.getQuantidade());
        }
        System.out.println("Total: R$" + calcularTotal());
        System.out.println("-----------------------------------");
    }

    private int gerarNumeroPedido() {
        return (int) (Math.random() * 10000);
    }
}
