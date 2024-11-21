package exercicio22;

public class Empresa {
    private String nome;
    private String CNPJ;
    private int numeroFuncionarios = 2;

    public Empresa(String nome, String CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void contratar() {
        System.out.println("Funcionario Contratado");
        numeroFuncionarios += 1;
    }

    public void demitir() {
        System.out.println("Funcionario Demitido");
        numeroFuncionarios -= 1;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", numeroFuncionarios=" + numeroFuncionarios +
                '}';
    }
}
