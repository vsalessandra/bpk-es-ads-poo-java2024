package exercicio09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        for (int i = 0; i == 0; ) {
            System.out.println("Operação: somar = + | subtrair = - | multiplicar = * | dividir = /");
            String operacao = scanner.next();

            switch (operacao) {
                case "+":
                    System.out.println(numero1+ " + "+ numero2 + " = " + (numero1 + numero2));
                    i = 1;
                    break;
                case "-":
                    System.out.println(numero1+ " - "+ numero2 + " = " + (numero1 - numero2));
                    i = 1;
                    break;
                case "*":
                    System.out.println(numero1+ " * "+ numero2 + " = " + (numero1 * numero2));
                    i = 1;
                    break;
                case "/":
                    System.out.println(numero1+ " / "+ numero2 + " = " + (numero1 / numero2));
                    i = 1;
                    break;
                default:
                    System.out.println("Digite uma opção valida!");
                    break;

            }
        }
    }
}
