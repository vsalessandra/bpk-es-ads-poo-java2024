public class Teste {
    public static void main(String[] args) {
        Livro livro = new Livro("Java para iniciantes","José Paulo");

        livro.adicionarPagina("Introdução ao Java");
        livro.adicionarPagina("Programação POO");

        System.out.println(livro.toString());
    }
}
