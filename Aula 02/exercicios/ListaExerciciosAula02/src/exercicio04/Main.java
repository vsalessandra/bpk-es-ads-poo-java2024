package exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero1 = scanner.nextInt();

        if (numero1 % 2 == 0){
            System.out.println("O numero "+numero1+" é PAR!");
        }else {
            System.out.println("O numero "+numero1+" é IMPAR!");
        }
    }
}

