package exercicio11;

public class TesteCidade {
    public static void main(String[] args) {

        Cidade cidade = new Cidade("São Paulo", 500000, "São paulo");

        System.out.println(cidade.toString());
        cidade.aumentarPopulacao();
        System.out.println(cidade.toString());
        cidade.diminuirPopulacao();
        System.out.println(cidade.toString());
    }
}
