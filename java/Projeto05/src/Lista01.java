import java.util.Arrays;
import java.util.Scanner;

public class Lista01 {
    public static void main(String[] args) {
        
        int[] valores = {9, 7, 4, 1, 3, 2, 6, 5, 8};
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 9: ");

        System.out.println(Arrays.toString(valores)); //para printar uma lista

        try {
            int numero = scan.nextInt();
            for(int posicao = 0; posicao < valores.length; posicao++){
                if(valores[posicao] == numero){
                    System.out.printf("O número %d está na %dª posição\n", numero,  (posicao+1));
                }
            }
        } catch (Exception e) {
            System.out.println("Você não digitou um número entre 1 e 9");
        }

        Arrays.sort(valores); //para ordenar a lista em ordem crescente
        System.out.printf("Lista ordenada: ");
        System.out.println(Arrays.toString(valores));
        scan.close();
    }
    
}