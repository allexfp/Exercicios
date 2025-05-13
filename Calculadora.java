package Estruturas;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        boolean operationIsValid = true;

        System.out.print("Digite o primeiro número: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, digite um número válido!");
            scanner.next();
        }
        double firstNumber = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, digite um número válido!");
            scanner.next();
        }
        double secondNumber = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        if (operation == '+') {
            result = firstNumber + secondNumber;
        } else if (operation == '-') {
            result = firstNumber - secondNumber;
        } else if (operation == '*') {
            result = firstNumber * secondNumber;
        } else if (operation == '/') {
            if (secondNumber != 0){
                result = firstNumber / secondNumber;
            } else {
                System.out.println("Erro: divisão por zero!");
            }
        }else {
            System.out.println("Operação inválida!");
        }

        if (operationIsValid){
            System.out.printf("Resultado: %.2f%n", result);
        }
        scanner.close();
    }
}
