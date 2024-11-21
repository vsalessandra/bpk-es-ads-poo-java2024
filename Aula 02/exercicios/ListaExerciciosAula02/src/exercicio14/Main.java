package exercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String entrada = scanner.next();

        int contadorVogais = contarVogais(entrada);

        System.out.println("Número de vogais na string: " + contadorVogais);
    }

    public static int contarVogais(String entrada1){
        int contador = 0;

        entrada1 = entrada1.toLowerCase();

        for (char c : entrada1.toCharArray()) {

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
}
