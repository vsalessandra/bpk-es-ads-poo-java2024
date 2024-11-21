public class Main {
    public static void main(String[] args) {

        Motor motor = new Motor(1200, "2jz", TipoCombustivel.GASOLINA, 9000, 700);

        Carro carro = new Carro("BMW M4 2023", motor);

        carro.ligarCarro();
        carro.acionarAcelerador(2000);
        carro.trocarMarcha();
        carro.turboBoost();
        carro.acionarFreio(1500);
        carro.reduzirPotencia(1000);
        carro.desligar();

    }
}
