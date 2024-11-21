package exercicio10;

public class Veiculo {
    private String tipo;
    private String placa;
    private String cor;
    private int quantCombust;
    private String estado;

    public Veiculo(String tipo, String placa, String cor, int quantCombust, String estado) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
        this.quantCombust = quantCombust;
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public int getQuantCombust() {
        return quantCombust;
    }

    public String getEstado() {
        return estado;
    }

    void abastecerCarro(int incrementarCombustivel) {
        System.out.println("Abastecendo...");
        quantCombust += incrementarCombustivel;
    }

    void lavarCarro() {
        System.out.println("Lavando...");
        estado = "Carro limpo";
    }

    @Override
    public String toString() {
        return
                "tipo='" + tipo + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", quantCombust=" + quantCombust +
                ", estado='" + estado + '\'';
    }
}
