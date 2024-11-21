package exercicio15;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        long fatorialIterativo = calcularFatorialIterativo(numero);
        System.out.println("Fatorial de " + numero + " (iterativo) é: " + fatorialIterativo);

        long fatorialRecursivo = calcularFatorialRecursivo(numero);
        System.out.println("Fatorial de " + numero + " (recursivo) é: " + fatorialRecursivo);

        scanner.close();


    }

    public static long calcularFatorialIterativo(int num){

        long fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static long calcularFatorialRecursivo(int num){
        if (num <= 1) {
            return 1;
        } else {
            return num * calcularFatorialRecursivo(num - 1);
        }
    }
}

