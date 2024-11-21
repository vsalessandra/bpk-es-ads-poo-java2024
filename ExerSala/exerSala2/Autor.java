package exerSala2;

import java.util.ArrayList;

public class Autor {
    private String nome;
    private String nacionalidade;
    private ArrayList<Livro> livros;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }


    public ArrayList<Livro> escreverLivro(Livro livro) {
        livros.add(livro);
        return livros;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", livros=" + livros +
                '}';
    }
}
