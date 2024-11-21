package exercicio21;

public class Cozinha {
    private String tipo;
    private int quantidadePessoas;
    private String cor;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void cozinhar() {
        System.out.println("Cozinhando macarrão");
    }

    public void limpar() {
        System.out.println("Limpando a cozinha");
    }

    @Override
    public String toString() {
        return "Cozinha{" +
                "tipo='" + tipo + '\'' +
                ", quantidadePessoas=" + quantidadePessoas +
                ", cor='" + cor + '\'' +
                '}';
    }
}
