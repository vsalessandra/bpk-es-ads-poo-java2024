package exercicio17;

public class Animal {
    private String especie;
    private int idade;
    private String peso;

    public Animal(String especie, int idade, String peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public String getPeso() {
        return peso;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void alimentar() {
        System.out.println("Alimentando...");
    }

    public void dormir() {
        System.out.println("Dormir...");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", idade=" + idade +
                ", peso='" + peso + '\'' +
                '}';
    }
}
