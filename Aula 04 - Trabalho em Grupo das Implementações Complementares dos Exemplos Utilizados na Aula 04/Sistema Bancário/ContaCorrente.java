public class ContaCorrente {
    private int numeroConta;
    private String titular;
    private double saldo;
    private double limiteSaque;

    public ContaCorrente(int numeroConta, String titular, double saldo, double limiteSaque) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public void sacar(double valor) {
        if (valor <= saldo && valor <= limiteSaque) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo ou limite de saque insuficiente.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void transferir(ContaCorrente contaDestino, double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    private boolean verificarLimite(double valor) {
        return valor <= limiteSaque;
    }

    private void calcularJuros() {
        // Implementação fictícia de cálculo de juros
        saldo += saldo * 0.01;
    }
}
