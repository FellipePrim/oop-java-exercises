import java.util.Scanner;
public class exc4 {
    public static void main(String[] args) {
        /* Escreva um programa em java que receba dois textos. Verifique se os dois
        textos são iguais e apresente o resultado em tela. Observe e analise os
        resultados. */
        // Criando o Scanner para leitura do input do usuário
        try(Scanner scnr = new Scanner(System.in)){
            System.out.println("Write a word: ");
            String txt1 = scnr.nextLine();

            System.out.println("Write another word: ");
            String txt2 = scnr.nextLine();

            if(txt1.equals(txt2)){
                System.out.println("The word are equal");
            }else{
                System.out.println("The word aren't equal");
            }
        }
    }
}
