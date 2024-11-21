package exercicio08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua idade: ");
        String idade = scanner.nextLine();

        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);


    }
}

