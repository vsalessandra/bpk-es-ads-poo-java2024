package exercicio10;

import java.util.Scanner;

public class Main {

    public static boolean verificar(int numeros){
        if (numeros <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numeros); i++) {
            if (numeros % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        if (verificar(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }


    }
}
