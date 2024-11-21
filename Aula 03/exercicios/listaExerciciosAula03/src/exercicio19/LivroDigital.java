package exercicio19;

public class LivroDigital {
    private String titulo;
    private String autor;
    private String tamanhoArquivo;
    private boolean aberto;

    public LivroDigital(String titulo, String autor, String tamanhoArquivo, boolean aberto) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
        this.aberto = aberto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTamanhoArquivo(String tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void abrirLivro() {
        System.out.println("Livro aberto");
        aberto = true;
    }

    public void fecharLivro() {
        System.out.println("Livro fechado");
        aberto = false;
    }

    @Override
    public String toString() {
        return "LivroDigital{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tamanhoArquivo='" + tamanhoArquivo + '\'' +
                ", aberto=" + aberto +
                '}';
    }
}
