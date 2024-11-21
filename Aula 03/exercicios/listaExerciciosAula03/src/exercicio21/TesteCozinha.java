package exercicio21;

public class TesteCozinha {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Gastronomia", 4, "Branca");

        System.out.println(cozinha.toString());
        cozinha.cozinhar();
        cozinha.limpar();
    }
}
