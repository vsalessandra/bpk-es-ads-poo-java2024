package exercicio15;

public class Jogo {
    private String nome;
    private String genero;
    private String preco;
    private boolean jogando = false;

    public Jogo(String nome, String genero, String preco, boolean jogando) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.jogando = jogando;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getPreco() {
        return preco;
    }

    public boolean isJogando() {
        return jogando;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public void setJogando(boolean jogando) {
        this.jogando = jogando;
    }

    public void iniciarJogo() {
        System.out.println("Iniciando Jogo");
        jogando = true;
    }

    public void pausarJogo() {
        System.out.println("Pausando Jogo");
        jogando = false;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", preco='" + preco + '\'' +
                ", jogando=" + jogando +
                '}';
    }
}
