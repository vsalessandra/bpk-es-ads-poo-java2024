package exercicio14;

public class Time {
    private String nome;
    private String tecnico;
    private int numeroJogadores;

    public Time(String nome, String tecnico, int numeroJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroJogadores = numeroJogadores;
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public int getNumeroJogadores() {
        return numeroJogadores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public void setNumeroJogadores(int numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }

    public void adicionarJogador() {
        System.out.println("Novo Jogador Contratado.");
        this.numeroJogadores += 1;
    }

    public void removerJogador() {
        System.out.println("Jogador Demitido");
        this.numeroJogadores -= 1;

    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", numeroJogadores=" + numeroJogadores +
                '}';
    }
}
