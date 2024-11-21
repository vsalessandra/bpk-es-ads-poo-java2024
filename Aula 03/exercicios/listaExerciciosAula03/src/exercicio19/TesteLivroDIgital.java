package exercicio19;

public class TesteLivroDIgital {
    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("Diario de um banana", "Jose", "76MB", false);

        System.out.println(livro.toString());
        livro.abrirLivro();
        System.out.println(livro.toString());
        livro.fecharLivro();
        System.out.println(livro.toString());
    }
}
