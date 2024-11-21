public class Teste {
    public static void main(String[] args) {

        Produto1 produto1 = new Produto1("001", "Notebook", 3000.0, 10);
        Produto1 produto2 = new Produto1("002", "Mouse", 50.0, 100);

        Cliente1 cliente1 = new Cliente1("João Silva", "123.456.789-00");

        Pedido1 pedido1 = new Pedido1(cliente1, "18/11/2024");

        ItemPedido1 item1 = new ItemPedido1(produto1, 2);
        ItemPedido1 item2 = new ItemPedido1(produto2, 5);

        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);

        pedido1.exibirDetalhesPedido();
    }
}
