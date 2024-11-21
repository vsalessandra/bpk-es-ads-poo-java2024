package exercicio13;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroEscolhido = random.nextInt(100) + 1;
        int tentativa = 0;
        int palpite = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (palpite != numeroEscolhido) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativa++;

            if (palpite < numeroEscolhido) {
                System.out.println("O número é maior do que " + palpite + ". Tente novamente.");
            } else if (palpite > numeroEscolhido) {
                System.out.println("O número é menor do que " + palpite + ". Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativa + " tentativas.");
            }
        }

        scanner.close();
    }
}

