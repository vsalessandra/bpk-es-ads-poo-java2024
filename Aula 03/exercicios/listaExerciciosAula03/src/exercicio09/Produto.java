package exercicio09;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    void aumentarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }

    void diminuirEstoque(int quantidade) {
        this.quantidadeEstoque -= quantidade;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEstoque=" + quantidadeEstoque;
    }
}
