package exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = 0;

        if (numero1 != 0){
            divisao= numero1 / numero2;
        } else {
            System.out.println("Divisao por 0 nao é permitido!");
        }

        System.out.println("Soma: "+soma);
        System.out.println("Subtração: "+ subtracao);
        System.out.println("Multiplicação: "+multiplicacao);
        System.out.println("Divisão: "+divisao);
    }
}