package exercicio06;

public class TesteComputador {
    public static void main(String[] args) {
        Computador computador = new Computador("Ryzen 5 5500", "Husky 8gb 3200Mhz", 100);

        System.out.println(computador.toString());
        computador.ligarPC();
        System.out.println(computador.toString());
        computador.desligarPC();
        System.out.println(computador.toString());

    }
}
