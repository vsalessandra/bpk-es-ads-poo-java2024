package exercicio09;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Pão", 2.5, 4);

        System.out.println(produto.toString());
        produto.aumentarEstoque(2);
        System.out.println(produto.toString());
        produto.diminuirEstoque(3);
        System.out.println(produto.toString());
    }
}
