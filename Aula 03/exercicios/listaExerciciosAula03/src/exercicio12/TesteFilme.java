package exercicio12;

public class TesteFilme {
    public static void main(String[] args) {
        Filme filme = new Filme("Os Vingadores", "Irmãos Russos", "2h e 30min");

        System.out.println(filme.toString());
        filme.iniciarFilme();
        System.out.println(filme.toString());
        filme.pausarFilme();
        System.out.println(filme.toString());
    }
}
