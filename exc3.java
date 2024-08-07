import java.util.Scanner;
public class exc3 {
        public static void main(String[] args) {
        /*Escreva um programa em Java que receba dois inteiros. 
        Realize a divisão entre os números e apresente o resultado em tela. Observe o que acontece quando se divide um número por zero. */
        // Criando o Scanner para leitura do input do usuário
        try(Scanner scnr = new Scanner(System.in)){ 
            System.out.print("Enter the first integer: ");
            int number1 = scnr.nextInt();
            
            System.out.print("Enter the second integer: ");
            int number2 = scnr.nextInt();
            
            if (number2 != 0) {
                System.out.println("The total of " + number1 + " divided by " + number2 + " is " + (number1 / number2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        }    
    }
}
