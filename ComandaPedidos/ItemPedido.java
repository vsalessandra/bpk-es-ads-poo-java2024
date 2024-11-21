public class ItemPedido {
    private static int quantidade;
    private static Produto produto;

    public ItemPedido(Produto produto, int quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public static double getSubtotal() {
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "quantidade=" + quantidade +
                ", item=" + produto +
                '}';
    }
}
