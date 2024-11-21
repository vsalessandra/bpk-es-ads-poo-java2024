package exercicio15;

public class TesteJogo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("Minecraft", "Aventura", "150 R$", false);

        System.out.println(jogo.toString());
        jogo.iniciarJogo();
        System.out.println(jogo.toString());
        jogo.pausarJogo();
        System.out.println(jogo.toString());
    }
}
