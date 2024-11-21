public class TesteConta {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "Rua das Flores, 123");

        ContaCorrente conta1 = new ContaCorrente(1, "João Silva", 1000.00, 500.00);
        ContaCorrente conta2 = new ContaCorrente(2, "João Silva", 500.00, 300.00);

        cliente1.adicionarConta(conta1);
        cliente1.adicionarConta(conta2);

        cliente1.consultarContas();

        conta1.sacar(200.00);
        conta2.sacar(400.00);

        conta1.depositar(500.00);
        conta2.depositar(-50.00);

        conta1.transferir(conta2, 300.00);
        conta1.transferir(conta2, 1000.00);

        System.out.println("Saldo final da conta 1: " + conta1.consultarSaldo());
        System.out.println("Saldo final da conta 2: " + conta2.consultarSaldo());

        cliente1.removerConta(conta1);
        cliente1.consultarContas();
    }
}
