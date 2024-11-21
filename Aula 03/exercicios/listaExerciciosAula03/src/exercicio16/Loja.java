package exercicio16;

public class Loja {
    private String nome;
    private String endereco;
    private String telefone;
    private boolean aberta = false;

    public Loja(String nome, String endereco, String telefone, boolean aberta) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.aberta = aberta;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public void abrirLoja() {
        System.out.println("\nLoja aberta com sucesso!\n");
        aberta = true;
    }

    public void fecharLoja() {
        System.out.println("\nLoja fechado com sucesso!\n");
        aberta = false;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", aberta=" + aberta +
                '}';
    }
}
