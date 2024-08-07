
public class exc6 {
    public static void main(String[] args) {
         /* Escreva um programa em java que realize a soma dos números entre 1 e
        1000. Utilize uma estrutura de repetição e apresente o resultado em tela. */
        int j = 0;
        for (int i = 0; i <= 1000; i++){
            j = i+j;
            System.out.println(j);
        }
        System.out.println("The total is: "+j);
    }
}
   
