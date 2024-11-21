package exercicio07;

public class TesteAluno {
    public static void main(String[] args) {
        double[] notas = {7.0,7.1,6.9};
        Aluno aluno = new Aluno("paulo", 001, "Matemática", notas);
        System.out.println(aluno.toString());
    }
}
