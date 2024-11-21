package exercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Celcius para Fahrenheit / 2. Fahrenheit para Celsius:");
        int escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Digite o valor em Celsius:");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius*1.8)+32;
                System.out.println(celsius+" Graus celcius em fahrenheit: "+fahrenheit);
                break;
            case 2:
                System.out.println("Digite o valor em Fahrenheit: ");
                double fahrenheit1 = scanner.nextDouble();
                double celsius1 = (fahrenheit1-32)/1.8;
                System.out.println(fahrenheit1+" Graus fahrenheit em celsius: "+celsius1);
                break;
            default:
                System.out.println("Digite uma opção válida!");
                break;
        }


    }
}

