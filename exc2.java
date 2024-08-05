import java.util.Scanner;

public class exc2 {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o Scanner seja fechado automaticamente
        // Criando o Scanner para leitura do input do usuário
        try (Scanner scnr = new Scanner(System.in)) {
            // Solicita ao usuário que insira um número inteiro
            System.out.print("Choose an integer number: ");
            int number = scnr.nextInt();
            
            // Verifica se o número é par ou ímpar
            if (number % 2 == 0) {
                System.out.println("The number " + number + " is even.");
            } else {
                System.out.println("The number " + number + " is odd.");
            }
        } // O Scanner é fechado automaticamente aqui
    }
}

