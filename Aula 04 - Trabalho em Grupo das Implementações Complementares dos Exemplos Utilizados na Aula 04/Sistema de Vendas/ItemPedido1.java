public class ItemPedido1 {
    private Produto1 produto;
    private int quantidade;

    public ItemPedido1(Produto1 produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto1 getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
