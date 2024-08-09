import java.util.Scanner;
public class exc8 {
    public static void main(String[] args) {
        /* Escreva um programa em java que receba um número. O programa deve
        encerrar quando o usuário informar -1. Caso contrário o programa deverá
        pedir novamente um número. */
        try(Scanner scnr = new Scanner (System.in)){
            System.out.println("Choose an integer number: ");
            int number = scnr.nextInt();
            int i = 1;

            while (number != -1) { 
                System.out.println("Choose an integer number: ");
                number = scnr.nextInt();
                i++;
            }
            System.out.println("You entered -1 after " + i + " inputs!");
        }     
    }
}
