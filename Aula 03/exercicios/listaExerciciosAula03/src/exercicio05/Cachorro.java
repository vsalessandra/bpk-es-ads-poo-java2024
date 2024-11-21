package exercicio05;

public class Cachorro {
    private String nome;
    private int idade;
    private String raca;
    private Boolean latindo = false;
    private Boolean correndo =  false;

    public Cachorro(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public void Latir(){
        this.latindo = true;
        System.out.println("AU AU AU");
    }

    public void Correr(){
        this.correndo = true;
    }

    @Override
    public String toString() {
        return "Cachorro:" +
                "Nome: '"+ nome+
                "Raca: '"+ raca+
                "Idade: '"+ idade;
    }
}
