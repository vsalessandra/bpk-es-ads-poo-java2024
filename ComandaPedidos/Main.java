public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Tocantins", 873, "MCR");

        Pessoa pessoa = new Pessoa("Lian", 12, endereco);

        Produto produto = new Produto("Pão", 4.5, 60);

        Pedido pedido = new Pedido(pessoa);

        pedido.adicionarItem(produto, 3);

        pedido.gerarComanda();
    }
}
