package Estruturas;

import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();


        if(numero < 0){
            System.out.println("O número digitado é negativo.");
        } else if (numero == 0) {
            System.out.println("O número digitado é igual a zero.");
        }else {
            System.out.println("O número digitado é positivo.");
        }

        scanner.close();
    }
}