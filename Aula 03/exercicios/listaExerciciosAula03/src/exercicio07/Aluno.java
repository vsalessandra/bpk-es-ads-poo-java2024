package exercicio07;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private double[] notas;

    public Aluno(String nome, int matricula, String curso, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", curso='" + curso + '\'' +
                ", nota=" + calcularMedia() +
                '}';
    }
}
