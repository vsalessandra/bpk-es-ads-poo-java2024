package exercicio16;

public class TesteLoja {
    public static void main(String[] args) {
        Loja loja = new Loja("Papyrus", "Rua Cabral", "999323434", false);

        System.out.println(loja.toString());
        loja.abrirLoja();
        System.out.println(loja.toString());
        loja.fecharLoja();
        System.out.println(loja.toString());
    }
}
