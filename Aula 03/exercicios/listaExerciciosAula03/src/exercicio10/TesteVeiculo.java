package exercicio10;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Carro", "45P32-3","Azul", 0, "Sujo");

        System.out.println(veiculo.toString());
        veiculo.abastecerCarro(50);
        System.out.println(veiculo.toString());
        veiculo.lavarCarro();
        System.out.println(veiculo.toString());

    }
}
