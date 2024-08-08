import java.util.Scanner;
public class exc7 {
    public static void main(String[] args) {
        /* Escreva um programa em java que receba um inteiro. Realize a soma do
        número 1 até o valor informado pelo usuário. Apresente o resultado em
        tela. */

        try(Scanner scnr = new Scanner(System.in)){
            System.out.println("Choose an integer number: ");
            int number = scnr.nextInt();
            int total = 0;

            for(int i = 1; i<=number; i++){
                total = total + i;
            }
            System.out.println("The total of all numbers from 1 to the number you chose is: " + total);
        }
    }
}
