package exercicio08;

public class Professor {
    private String nome;
    private String disciplina;
    private double salario;
    private boolean emAula = false;
    private boolean corrigindoProva = false;


    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
        this.emAula = emAula;
        this.corrigindoProva = corrigindoProva;

    }

    public void darAula () {
        System.out.println("Dando aula...");
        emAula = true;
    }

    public void corrigirProva() {
        System.out.println("Corrigendo prova...");
        corrigindoProva = true;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", disciplina='" + disciplina + '\'' +
                ", salario=" + salario +
                ", emAula=" + emAula +
                ", corrigindoProva=" + corrigindoProva;
    }
}
