package exercicio14;

public class TesteTime {
    public static void main(String[] args) {
        Time time = new Time("Palmeiras", "Renato", 32);

        System.out.println(time.toString());
        time.adicionarJogador();
        System.out.println(time.toString());
        time.removerJogador();
        System.out.println(time.toString());
    }
}
