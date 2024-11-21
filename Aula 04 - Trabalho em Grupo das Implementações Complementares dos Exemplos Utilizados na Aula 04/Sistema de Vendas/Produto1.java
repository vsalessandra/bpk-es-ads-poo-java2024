public class Produto1 {
    private String codigo;
    private String descricao;
    private double preco;
    private int quantidadeEstoque;

    public Produto1(String codigo, String descricao, double preco, int quantidadeEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String consultarInformacoes() {
        return "Código: " + codigo + ", Descrição: " + descricao + ", Preço: " + preco + ", Estoque: " + quantidadeEstoque;
    }

    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public boolean verificarEstoque(int quantidade) {
        return quantidadeEstoque >= quantidade;
    }

    public double getPreco() {
        return preco;
    }

    private double calcularDesconto(double percentual) {
        return preco - (preco * percentual / 100);
    }

    private boolean verificarDisponibilidade(int quantidade) {
        return quantidadeEstoque >= quantidade;
    }
}
