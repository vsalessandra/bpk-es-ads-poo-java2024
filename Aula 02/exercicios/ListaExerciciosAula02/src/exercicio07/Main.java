package exercicio07;

import java.util.Scanner;

public class Main {
    public static int soma(int nu,int num) {
        return nu + num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.print(numero1+ " + "+ numero2 + " = "+soma(numero1,numero2));
    }
}

