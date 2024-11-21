import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private List<ContaCorrente> contas;

    public Cliente(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaCorrente conta) {
        contas.add(conta);
        System.out.println("Conta adicionada ao cliente.");
    }

    public void removerConta(ContaCorrente conta) {
        if (contas.remove(conta)) {
            System.out.println("Conta removida do cliente.");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void consultarContas() {
        System.out.println("Contas do cliente:");
        for (ContaCorrente conta : contas) {
            System.out.println("- Conta: " + conta.consultarSaldo());
        }
    }
}
