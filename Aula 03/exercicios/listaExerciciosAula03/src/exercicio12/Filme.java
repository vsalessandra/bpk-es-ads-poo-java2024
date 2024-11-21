package exercicio12;

public class Filme {
    private String titulo;
    private String diretor;
    private String duracao;
    private boolean rodando;

    public Filme(String titulo, String diretor, String duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.rodando = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void iniciarFilme() {
        System.out.println("Filme iniciado...");
        rodando = true;
    }

    public void pausarFilme() {
        System.out.println("Filme pausado...");
        rodando = false;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", diretor='" + diretor + '\'' +
                ", duracao='" + duracao + '\'' +
                ", rodando=" + rodando +
                '}';
    }
}
