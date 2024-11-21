package exercicio20;

public class TesteBicicleta {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("vikingX", "A23", "Aro 22");

        System.out.println(bicicleta.toString());
        bicicleta.pedalar();
        bicicleta.frear();

    }
}
