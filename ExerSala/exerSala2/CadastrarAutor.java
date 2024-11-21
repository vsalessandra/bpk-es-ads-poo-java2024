package exerSala2;

public class CadastrarAutor {
    public static void main(String[] args) {
        Autor autor = new Autor("Paulo de Andrade", "Brasileiro");

        Livro livro = new Livro("A branca de neve", "40334");
        Livro livro1 = new Livro("Luan de Andrade", "40234");


        autor.escreverLivro(livro);
        autor.escreverLivro(livro1);

        System.out.println(autor);
    }
}
