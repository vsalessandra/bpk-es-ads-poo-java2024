package exercicio20;

public class Bicicleta {
    private String marca;
    private String modelo;
    private String tamanhoRoda;


    public Bicicleta(String marca, String modelo, String tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTamanhoRoda(String tamanhoRoda) {
        this.tamanhoRoda = tamanhoRoda;
    }

    public void pedalar() {
        System.out.println("Pedalando...");
    }

    public void frear() {
        System.out.println("Freando...");
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamanhoRoda='" + tamanhoRoda + '\'' +
                '}';
    }
}
