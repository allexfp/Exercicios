package Estruturas;
import java.util.Scanner;

public class VerificadorVotacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        while (!scanner.hasNextInt()){
            System.out.println("Por favor, digite uma idade válida!");
            scanner.next();
        }
        int idade = scanner.nextInt();

        if (idade < 0){
            System.out.println("Idade inválida!");
        } else if (idade < 16) {
            System.out.println("Você não pode votar ainda.");
        } else if (idade < 18 || idade > 70) {
            System.out.println("Seu voto é facultativo.");
        }else {
            System.out.println("Seu voto é obrigatório.");
        }
        scanner.close();
    }
}
